package StorageManagement;

public class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

   public String getCategory() {
        return "Groceries";
    }
}