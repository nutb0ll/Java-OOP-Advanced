package open_close_liskov_principles_lab.a_extends_list.P04_DetailPrinter;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }


    private String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee";
    }
}
