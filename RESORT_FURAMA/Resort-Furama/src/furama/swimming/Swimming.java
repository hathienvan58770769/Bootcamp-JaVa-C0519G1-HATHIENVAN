package furama.swimming;

public class Swimming {
    private final long OPEN_THE_DOOR_TIME = 10;

    public Swimming() {
    }

    public long getOPEN_THE_DOOR_TIME() {
        return OPEN_THE_DOOR_TIME;
    }

    public void swimmingPool(long comingHours) {
        if (comingHours < OPEN_THE_DOOR_TIME)
            System.out.println("Swimming Pool not open the door, Please wait until 10 o'clock !!! ");
        else
            System.out.println("Welcome to Furama swimming pool ! ");
    }

    @Override
    public String toString() {
        return "At " + getOPEN_THE_DOOR_TIME() + " o'clock Swimming Pool will open the door !";
    }
}
