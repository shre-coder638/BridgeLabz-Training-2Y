public class ZaraBonusCalculator {
    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] salaryBonusData = calculateBonusAndNewSalary(employeeData);

        displayEmployeeTable(employeeData, salaryBonusData);

        calculateAndDisplayTotals(employeeData, salaryBonusData);
    }

    // Method to generate random salary and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            // 5-digit salary between 10000 and 99999
            int salary = 10000 + (int)(Math.random() * 90000);
            // Years of service between 1 and 15
            int years = 1 + (int)(Math.random() * 15);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] result = new double[numEmployees][2]; // [newSalary, bonus]
        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to display employee data in tabular format
    public static void displayEmployeeTable(int[][] employeeData, double[][] salaryBonusData) {
        System.out.printf("%-10s %-12s %-15s %-15s %-15s\n", "Emp No", "Old Salary", "Years of Service", "Bonus", "New Salary");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%-10d %-12d %-15d %-15.2f %-15.2f\n",
                (i + 1),
                employeeData[i][0],
                employeeData[i][1],
                salaryBonusData[i][1],
                salaryBonusData[i][0]);
        }
    }

    // Method to calculate and display totals
    public static void calculateAndDisplayTotals(int[][] employeeData, double[][] salaryBonusData) {
        int totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += salaryBonusData[i][0];
            totalBonus += salaryBonusData[i][1];
        }
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-22s: %d\n", "Total Old Salary", totalOldSalary);
        System.out.printf("%-22s: %.2f\n", "Total New Salary", totalNewSalary);
        System.out.printf("%-22s: %.2f\n", "Total Bonus Amount", totalBonus);
    }
}