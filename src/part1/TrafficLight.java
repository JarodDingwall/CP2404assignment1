package part1;

import java.util.Random;

public class TrafficLight {
    //TrafficLight class dictates whether the car moves to the next section of road.
    private int rateOfChange; //Represents the frequency that the light changes out.
    private String lightColour; //

    public TrafficLight() {
        int rateOfChange = 30;
    }

    public void setLightColour(String value) {
        lightColour = value;
    }

    public String getLightColour() {
        return lightColour;
    }

    public void setRateOfChange(int value) {
        rateOfChange = value;
    }

    public double getRateOfChange() {
        return rateOfChange;
    }

    int rangeMin = 0;
    int rangeMax = 99;

    void operateTrafficLight() {
        Random r = new Random();
        int randomValue = rangeMin + (rangeMax - rangeMin) * r.nextInt();
        if (randomValue < rateOfChange) {
            setLightColour("red");
        } else {
            setLightColour("green");
        }
    }
}
