public class Product {

    String name;
    String manufacturer;
    String description;
    int price;

    public Product(String name, String manufacturer, String description, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
