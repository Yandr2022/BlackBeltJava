package Part7_Multithreading.lesson20_Exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Demo {

    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> firstPlayerActions = new ArrayList<>();
        firstPlayerActions.add(Action.SCISSORS);
        firstPlayerActions.add(Action.PAPER);
        firstPlayerActions.add(Action.SCISSORS);

        List<Action> secondPlayerActions = new ArrayList<>();
        secondPlayerActions.add(Action.PAPER);
        secondPlayerActions.add(Action.ROCK);
        secondPlayerActions.add(Action.ROCK);

        new Player("Vanya", firstPlayerActions, exchanger);
        new Player("Petya", secondPlayerActions, exchanger);
    }
}

enum Action {
    ROCK, PAPER, SCISSORS
}

class Player extends Thread {

    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public Player(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void decideWinner(Action myAction, Action anyPlayerAction) {
        if ((myAction == Action.ROCK && anyPlayerAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && anyPlayerAction == Action.PAPER)
                || (myAction == Action.PAPER && anyPlayerAction == Action.ROCK)) {
            System.out.println(name + " wins!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                decideWinner(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}