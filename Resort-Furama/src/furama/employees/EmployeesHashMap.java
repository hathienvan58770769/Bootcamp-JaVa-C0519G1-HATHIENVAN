package furama.employees;

import java.util.HashMap;
import java.util.Map;

public class EmployeesHashMap {
    public static void main(String[] args) {
        Map<Employees, String> mapEmployees = new HashMap<Employees, String>();

        Employees employees1 = new Employees("Le thi a", 25, "14 nguyen chanh");
        mapEmployees.put(employees1, " E098");

        Employees employees2 = new Employees("Le thi b", 22, "99 QL1");
        mapEmployees.put(employees2, " E198");

        Employees employees3 = new Employees("Le thi c", 18, "k23/10 pham ngu lao");
        mapEmployees.put(employees3, " H08");

        Employees employees4 = new Employees("Le thi d", 27, "89 30/4");
        mapEmployees.put(employees4, " A101");

        Employees employees5 = new Employees("Le thi e", 30, "450 nguyen trai");
        mapEmployees.put(employees5, " H105");

        Employees employees6 = new Employees("Le thi f", 40, "45 ton duc thang");
        mapEmployees.put(employees6, " L029");

        Employees employees7 = new Employees("Le thi g", 33, "k1/h10 le do");
        mapEmployees.put(employees7, " D09");

        Employees employees8 = new Employees("Le thi h", 22, "230 nguyen luong bang");
        mapEmployees.put(employees8, " EH98");

        Employees employees9 = new Employees("Le thi s", 28, "230 hai phong");
        mapEmployees.put(employees9, " C058");

        Employees employees10 = new Employees("Le thi k", 20, "10 truong chinh");
        mapEmployees.put(employees10, " F800");

        System.out.println(mapEmployees);
    }
}
