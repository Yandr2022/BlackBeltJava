package Part4_NestedClasses.lesson3_InnerClasses;

public class Car {

    private String color;
    private int doorCount;
    Engine engine;


    public Car(String color, int doorCount ) {
        this.color = color;
        this.doorCount = doorCount;
        Engine engine = new Engine(200);
        System.out.println(engine.horsePower);
    }

    public Car() {
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;


        public Engine(int horsePower) {
            System.out.println(doorCount);
            this.horsePower = horsePower;
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

        Car car =new Car("black", 4);
        System.out.println(car);
        Car.Engine engine = car.new Engine(300);
        car.setEngine(engine);
        System.out.println(car);

        Car.Engine engine1 = new Car().new Engine(100);
        System.out.println(engine1);


    }
}