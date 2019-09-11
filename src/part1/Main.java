package part1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(1);
        Road road = new Road(1);

        int position = car.getPosition();
        int length = road.getRoadLength();

        while (position < length) {
            position++;
            car.setPosition(position);
            System.out.println(car.getPosition());
        }
    }
}


