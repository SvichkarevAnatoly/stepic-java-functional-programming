import java.util.Collection;
import java.util.List;

class Main {
//Stepik code: start

    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold   is lower edge of salary
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(department -> department.getCode().startsWith("111-"))
                //.flatMap(department -> department.getEmployees().stream())
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .filter(employee -> employee.getSalary() >= threshold)
                .count();
    }

    //Stepik code: end
    private static class Department {
        public List<Employee> getEmployees() {
            return null;
        }

        public String getName() {
            return null;
        }

        public String getCode() {
            return null;
        }
    }

    private static class Employee {
        public Long getSalary() {
            return null;
        }
    }
}