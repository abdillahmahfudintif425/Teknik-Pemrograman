class Employee implements Sortable {
    private String name;
    private double salary;
    private int hireDay;
    private int hireMonth;
    private int hireYear;
    
    public Employee(String name, double salary, int day, int month, int year) {
        this.name   = name;
        this.salary = salary;
        hireDay     = day;
        hireMonth   = month;
        hireYear    = year;
    }
    
    public double getSalary(){
        return salary;
    }
    
    @Override
    public int compare(Sortable b) {
        Employee other = (Employee) b;

        if (salary < other.salary) return -1;
        if (salary > other.salary) return  1;
        return 0;
    }
    
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireYear;
    }
}
