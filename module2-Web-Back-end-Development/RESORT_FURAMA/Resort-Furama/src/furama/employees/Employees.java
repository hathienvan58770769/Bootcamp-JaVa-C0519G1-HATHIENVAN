package furama.employees;

import java.util.HashMap;
import java.util.Map;

public class Employees<E>{
    private String nameEmployees;
    private int ageEmployees;
    private String addressEmployees;
    Map<E, String> employees = new HashMap<>();

    public Employees(){}
    public Employees(String nameEmployees,int ageEmployees, String addressEmployees ){
        this.nameEmployees = nameEmployees;
        this.ageEmployees = ageEmployees;
        this.addressEmployees = addressEmployees;
    }

    public String getNameEmployees() {
        return nameEmployees;
    }

    public void setNameEmployees(String nameEmployees) {
        this.nameEmployees = nameEmployees;
    }

    public int getAgeEmployees() {
        return ageEmployees;
    }

    public void setAgeEmployees(int ageEmployees) {
        this.ageEmployees = ageEmployees;
    }

    public String getAddressEmployees() {
        return addressEmployees;
    }

    public void setAddressEmployees(String addressEmployees) {
        this.addressEmployees = addressEmployees;
    }

    @Override
    public String toString() {
        return "\n Name of Employees is :" + getNameEmployees() +
                " , Age :" + getAgeEmployees() +
                " and Address : " + getAddressEmployees() + " , number employees ";
    }
}
