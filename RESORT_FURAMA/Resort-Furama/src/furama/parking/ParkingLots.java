package furama.parking;

import java.util.HashSet;
import java.util.Set;

public class ParkingLots<E> {
    Set<E> setParking = new HashSet<>();
    private String licensePlates;

    public ParkingLots(){}
    public ParkingLots(String licensePlates){
        this.licensePlates = licensePlates;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    @Override
    public String toString() {
        return "license plates : " + getLicensePlates();
    }
}
