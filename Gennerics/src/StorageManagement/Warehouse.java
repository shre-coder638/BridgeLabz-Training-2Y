package StorageManagement;

import java.util.List;

public class Warehouse {

   public static void displayItems(List<? extends WarehouseItem> list) {
        System.out.println("Displaying Warehouse Items:");
        for (WarehouseItem item : list) {
            System.out.println(" - " + item);
        }
    }
}