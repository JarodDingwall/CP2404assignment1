package part1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Road road = new Road();

        int position = car.getPosition();
        int length = road.getRoadLength();

        while (position < length) {
            position++;
            car.setPosition(position);
            System.out.println(car.getPosition());
        }
        position = 0;
        while (position < length) {
            position++;
            car.setPosition(position);
            System.out.println(car.getPosition());
        }
    }
}

