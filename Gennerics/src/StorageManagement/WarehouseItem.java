package StorageManagement;

abstract class WarehouseItem {
 String name;

 WarehouseItem(String name) {
     this.name = name;
 }

 public abstract String getCategory();

 public String toString() {
     return getCategory() + ": " + name;
 }
}