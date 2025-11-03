import company.analytics.sales.SalesReport;
import company.analytics.hr.EmployeeReport;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Company Analytics Report\n");
        
        System.out.println("Sales Report\n");
        
        SalesReport sales = new SalesReport();
        sales.showData();
        
        System.out.println("Employee Report\n");
        EmployeeReport hr = new EmployeeReport();
        hr.showData();

        }
}
