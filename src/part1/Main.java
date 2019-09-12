package part1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Road road = new Road();
        TrafficLight trafficLight = new TrafficLight();

        while (car.getPosition() < road.getRoadLength()) {
            car.carMove();
            trafficLight.operateTrafficLight();
            System.out.println("Car Position: " + car.getPosition() + " " + "Road Number: " + road.getRoadNumber() + " "
                    + "Light Colour: " + trafficLight.getLightColour());
        }
        while (trafficLight.getLightColour().equals("red")) {
            trafficLight.operateTrafficLight();
            System.out.println("Car Position: " + car.getPosition() + " " + "Road Number: " + road.getRoadNumber() + " "
                    + "Light Colour: " + trafficLight.getLightColour());
        }
            car.setPosition(0);
            road.newRoad();
            while (car.getPosition() < road.getRoadLength()) {
                car.carMove();
                trafficLight.operateTrafficLight();
                System.out.println("Car Position: " + car.getPosition() + " " + "Road Number: " + road.getRoadNumber() + " "
                        + "Light Colour: " + trafficLight.getLightColour());
            }
        }
    }
