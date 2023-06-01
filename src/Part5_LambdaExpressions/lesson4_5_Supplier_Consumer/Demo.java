package Part5_LambdaExpressions.lesson4_5_Supplier_Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
ArrayList <Car> list = createThreeCars(()->new Car("bmw","red",2.0));
        System.out.println(list);

        changeCar(list.get(0),car -> car.color = "silver");
        changeCar(list.get(2),car -> car.engine = 1.7);
        System.out.println(list);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier){
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}