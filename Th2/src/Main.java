import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dữ liệu: ");
        String data = scanner.nextLine();
        String fileName = "data.dat";

        try {
            boolean result = writeData(data, fileName);
            if (result) {
                System.out.println("Ghi dữ liệu vào file thành công.");
            }
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static boolean writeData(String data, String fileName) throws IOException {
        // Thực hiện ghi dữ liệu vào file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            throw new IOException("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
        }
        return true;
    }
}
