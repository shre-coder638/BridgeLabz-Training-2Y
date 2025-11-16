package StorageManagement;

public class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    public String getCategory() {
        return "Furniture";
    }
}