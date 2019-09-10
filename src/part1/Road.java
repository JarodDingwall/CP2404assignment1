package part1;

public class Road {
    private int roadLength; // Number of segments that make up the road
    private int roadNumber; // Current road car is on

    public Road(int roadLength, int roadNumber){
    }
    public void setRoadLength(int value){ roadLength = value;
    }
    public int getRoadLength()  { return roadLength;
    }
    public void setRoadNumber(int value){ roadNumber = value;
    }
    public int getRoadNumber()  {
        return roadNumber;
    }
}
