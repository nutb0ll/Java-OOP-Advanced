package interface_seggreg_dependency_inversion_lab.src.p03_employee_info;

public class ConsoleFormatter implements Formatter {

    @Override
    public String format(Iterable<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
