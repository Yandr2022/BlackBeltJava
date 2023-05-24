package Part4_NestedClasses.lesson2_StaticNestedClass;

public class Car {

    String color;
    int doorCount;
    Engine engine;
    private static int a = 1024;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void showCountOfEngines(){
        System.out.println(Engine.count);
    }
    void showPowerEngine(){
        System.out.println(engine.horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
         int horsePower;
        private static int count = 0;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            count++;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 4, engine);
        System.out.println(car);
        Car car1 = new Car("black", 2, new Car.Engine(400));
        System.out.println(car1);
        car1.showCountOfEngines();
        car1.showPowerEngine();
    }
}