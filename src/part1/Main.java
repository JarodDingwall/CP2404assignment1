package part1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Road road = new Road();
        TrafficLight trafficLight = new TrafficLight();

        while (car.getPosition() < road.getRoadLength()) {
            System.out.println("Car Position: " + car.getPosition() + " " + "Road Number: " + road.getRoadNumber());
            car.carMove();
            trafficLight.operateTrafficLight();
        }
        car.setPosition(0);
        road.newRoad();
        while (car.getPosition() < road.getRoadLength()) {
            System.out.println("Car Position: " + car.getPosition() + " " + "Road Number: " + road.getRoadNumber());
            car.carMove();

        }
    }
}

