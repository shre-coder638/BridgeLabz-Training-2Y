package StorageManagement;

public class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

   public String getCategory() {
        return "Electronics";
    }
}