import com.example.Employee;
import com.example.Engineer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("Ashish",20000,5000,05032023);
        employee1.displayTotalSalary();
        employee1.displayEmployeeRole();
        Engineer engineer1=new Engineer("Rohit",20000,5000,05032023,5000);
        engineer1.displayTotalSalary();
        engineer1.displayEmployeeRole();
    }
}