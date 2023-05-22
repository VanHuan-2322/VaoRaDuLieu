import java.io.Serializable;
public class Product implements Serializable {
    private String Code;
    private String Name;
    private double Price;
    private String manufacturer;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Product(String Code, String Name,double Price, String manufacturer){
        this.Code=Code;
        this.Name=Name;
        this.Price=Price;
        this.manufacturer=manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}