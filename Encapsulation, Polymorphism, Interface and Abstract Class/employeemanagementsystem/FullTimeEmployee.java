package employeemanagementsystem;

class FullTimeEmployee extends Employee {
 private double bonus;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
     super(employeeId, name, baseSalary);
     this.bonus = bonus;
 }

 public double getBonus() {
     return bonus;
 }

 public void setBonus(double bonus) {
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + bonus;
 }
}
