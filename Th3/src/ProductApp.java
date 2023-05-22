public class ProductApp {
    public static void main(String[] args) {
        Product objProduct1 = new Product();
        objProduct1.setProID(1);
        objProduct1.setProName("Product 1");
        objProduct1.setPrice(9.99);
        System.out.println( objProduct1.toString());
        System.out.println("__________________");
        Product objProduct2 = new Product(2, "Product 2", 20);
        // Tạo mảng đối tượng Product
        Product[] listProduct = new Product[2];

        // Tạo các đối tượng Product
        Product objProduct = new Product();
        objProduct1.setProName("Product 1");
        objProduct1.setPrice(10.0);

        Product objProduct12 = new Product();
        objProduct2.setProName("Product 2");
        objProduct2.setPrice(20.0);

        // Thêm các đối tượng vào mảng
        listProduct[0] = objProduct1;
        listProduct[1] = objProduct2;

        // Ghi dữ liệu vào file
        ProductProcess.writeObjectData(listProduct, "object.dat");

        // Đọc dữ liệu từ file và lưu vào mảng
        Product[] readProducts = ProductProcess.readObjectData("object.dat");

        // Hiển thị mảng đối tượng
        for (Product product : readProducts) {
            System.out.println("Tên sản phẩm: " + product.getProName());
            System.out.println("Giá sản phẩm: " + product.getPrice());
            System.out.println("-------------------------");
            System.out.println(product);
        }
    }
}
