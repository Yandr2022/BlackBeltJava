package Part2_Generics.lesson4_ExampleWithGenerics.entity;

import Part2_Generics.lesson4_ExampleWithGenerics.entity.abstraction.Participant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {

    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        System.out.println(name + " command of was added");
    }

    public String getName() {
        return name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println(String.format("A new participant %s has been added to the %s team"
                , participant.getName(), name));
    }

    public void playWith(Team<T> team) {
        Random random = new Random();
        System.out.println("Winner: command " + (random.nextInt(2) == 0 ? this.name : team.getName()));
    }

}
