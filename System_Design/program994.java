import java.util.*;

interface ParkingObserver
{
    void update(int availableSpots);
}

class DisplayBoard implements ParkingObserver
{
    public void update(int availableSpots)
    {
        System.out.println("Display board" + availableSpots);
    }
}

class MobileApplication implements ParkingObserver
{
    public void update(int availableSpots)
    {
        System.out.println("Mobile Application" + availableSpots);
    }
}

class ParkingFloor
{
    private int availableSpots;

    public ParkingFloor(int availableSpots)
    {
        this.availableSpots = availableSpots;
    }

}
class program994 
{
    public static void main(String[] args) 
    {
        ParkingFloor floor = new ParkingFloor(5);
    }
}
