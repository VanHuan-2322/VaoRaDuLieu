import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class ReadFile {
        public static void main(String args[]) throws IOException {
            FileInputStream fin = null;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập tên file cần đọc: ");
                String fileName = scanner.nextLine();
                fin = new FileInputStream(fileName);
                int i = 0;
                while ((i = fin.read())!=-1){
                System.out.print((char) i);

               } fin.close();
            } catch (Exception e) {
                System.out.println("Lỗi file");
            }
                fin.close();
    }
}
