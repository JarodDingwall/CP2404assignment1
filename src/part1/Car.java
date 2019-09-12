package part1;

public class Car {
    private int position; // Segment of road that car is at
    private int carLength;

    Car() {
        carLength = 1;
        position = 0;
    }

    public void setPosition(int newPosition) {
        position = newPosition;
    }

    public int getPosition() {
        return position;
    }

    public void setCarLength(int value) {
        carLength = value;
    }

    public int getCarLength() {
        return carLength;
    }

    void carMove(){
        position++;
        setPosition(position);
    }
}
