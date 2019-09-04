package part1;

public class Car {
    private int position; // Segment of road that car is at
    private int carLength;
    private int roadID; // Current road car is on

    Car(int roadID){
        carLength = 1;
        position = 0;
    }

    public void setRoadID(int value) { roadID = value; }

    public void setPosition(int value)  {
        position = value;
    }

    public int getPosition()    {
        return position;
    }

    public void setCarLength(int value) {
        carLength = value;
    }

    public int getCarLength()   {
        return carLength;
    }


}
