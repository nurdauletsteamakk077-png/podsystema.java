import java.util.*;

class Department extends OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (OrganizationComponent c : components) {
            total += c.getBudget();
        }
        return total;
    }

    @Override
    public int getEmployeeCount() {
        int total = 0;
        for (OrganizationComponent c : components) {
            total += c.getEmployeeCount();
        }
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Отдел: " + name);
        for (OrganizationComponent c : components) {
            c.showDetails();
        }
    }

    public Employee findEmployee(String name) {
        for (OrganizationComponent c : components) {
            if (c instanceof Employee) {
                Employee e = (Employee) c;
                if (e.getName().equals(name)) return e;
            } else if (c instanceof Department) {
                Employee found = ((Department) c).findEmployee(name);
                if (found != null) return found;
            }
        }
        return null;
    }
}
