package part1;

public class Car {
    private int position; // Segment of road that car is at
    private int carLength;
    private int roadNumber; // Current road car is on

    Car(){
        carLength = 1;
        position = 0;
    }
    public void setRoadNumber(int value) { roadNumber = value;
    }
    public int getRoadNumber()  { return roadNumber;
    }
    public void setPosition(int newPosition)  { position = newPosition;
    }
    public int getPosition()    { return position;
    }
    public void setCarLength(int value) { carLength = value;
    }
    public int getCarLength()   {
        return carLength;
    }
}
