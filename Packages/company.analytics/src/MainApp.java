import company.analytics.sales.SalesReport;
import company.analytics.hr.EmployeeReport;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Company Analytics Report ===\n");

        SalesReport sales = new SalesReport();
        sales.showSalesData();

        EmployeeReport hr = new EmployeeReport();
        hr.showEmployeeData();

        System.out.println("Combined report generated successfully!");
    }
}
