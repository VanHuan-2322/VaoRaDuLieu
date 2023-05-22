import java.io.*;

public class ProductProcess {
    protected  Product [] products;
    protected  int count;
    public ProductProcess(){
        products = new Product[5];
        count = 0;
    }
    public  boolean writeSProcess(Product objProcess, String fileName) {
        try {
            products [count++]= objProcess;
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(products);
            objectOut.close();
            fileOut.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public  Product[] readProduct(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Product[] products1 = (Product[]) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return products1;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
