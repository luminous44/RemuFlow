
import java.util.ArrayList;

public class RemuFlow {

    private ArrayList<Employee> empList;

    RemuFlow() {
        empList = new ArrayList();
    }

    public void addEmployee(Employee emp) {
        empList.add(emp);
    }

    public void removeEmployee(int id) {
        Employee e = null;
        for (Employee employee : empList) {
            if (employee.getId() == id) {
                e = employee;
                break;
            }
        }
        if (e != null) {
            empList.remove(e);
        } else {
            throw new RuntimeException("No Employee Found With This Id");
        }

    }

    public void displayEmployee() {
        if (empList.size() == 0) {

            System.out.println("No Employee Found");
        } else {
            for (Employee empp : empList) {
                System.out.println(empp);
            }
        }

    }

}
