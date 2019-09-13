package part1;

public class Main {
//Main simulator class.
    public static void main(String[] args) {
        Car car = new Car();
        Road road = new Road();
        TrafficLight trafficLight = new TrafficLight();
    //First loop runs carMove() and operateTrafficLight() classes until end of road section.
        while (car.getPosition() < road.getRoadLength()) {
            car.carMove();
            trafficLight.operateTrafficLight();
            System.out.println("Car Position: " + car.getPosition() + " " + "Road Number: " + road.getRoadNumber() + " "
                    + "Light Colour: " + trafficLight.getLightColour());
        }
    //Second loop runs the same methods for the second road section.
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
