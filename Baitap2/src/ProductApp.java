public class ProductApp {
    public static void main(String[] args) {
        String fileName = "products.dat";
        // Tạo 5 đối tượng
        Product products0 = new Product("P1", "Product 1", 10.99, "Manufacturer 1");
        Product products1 = new Product("P2", "Product 2", 20.99, "Manufacturer 2");
        Product products2 = new Product("P3", "Product 3", 30.99, "Manufacturer 3");
        Product products3 = new Product("P4", "Product 4", 40.99, "Manufacturer 4");
        Product products4 = new Product("P5", "Product 5", 50.99, "Manufacturer 5");
        ProductProcess productProcess = new ProductProcess();
        // Ghi từng đối tượng sinh viên vào file
        productProcess.writeSProcess(products0, fileName);
        productProcess.writeSProcess(products1, fileName);
        productProcess.writeSProcess(products2, fileName);
        productProcess.writeSProcess(products3, fileName);
        productProcess.writeSProcess(products4, fileName);

        // Đọc dữ liệu từ file
        Product[] products = (Product[]) productProcess.readProduct(fileName);
        for (Product product: products
        ) {
            System.out.println(product);
        }
    }
}