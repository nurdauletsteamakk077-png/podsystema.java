public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nurdaulet", "Developer", 5000);
        Employee e2 = new Employee("Aman", "Manager", 7000);

        Department itDept = new Department("IT");
        itDept.add(e1);

        Department mainDept = new Department("Head Office");
        mainDept.add(itDept);
        mainDept.add(e2);

        mainDept.showDetails();

        System.out.println("Total budget: " + mainDept.getBudget());
        System.out.println("Total employees: " + mainDept.getEmployeeCount());

        Employee found = mainDept.findEmployee("Nurdaulet");
        if (found != null) {
            System.out.println("Employee found: " + found.getName());
        }
    }
}
