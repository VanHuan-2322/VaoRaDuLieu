import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
         public static void main(String[] args) {
             String filename = "preson.dat";

             // Tạo file
             createFile(filename);

             try {
                 // Tạo đối tượng FileOutputStream để ghi dữ liệu vào file person.dat
                 FileOutputStream fos = new FileOutputStream(filename);

                 // Nhập vào một chuỗi bất kỳ
                 String inputData = "Hello, world!";

                 //Ghi chuỗi nhập trên vào file
                 writeDataToFile(fos, inputData);

                 //Mở file person.dat kiểm tra dữ liệu trong file
                 FileInputStream fis = new FileInputStream(filename);

                 // Tạo đối tượng FileInputStream để đọc dữ liệu từ file person.dat
                 String fileData = readDataFromFile(fis);

                 System.out.println("Dữ liệu trong file: " + fileData);

                 // Đóng đối tượng FileInputStream/ FileOutputStream
                 closeStreams(fis, fos);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         private static void createFile(String filename) {
             try {
                 FileOutputStream fos = new FileOutputStream(filename);
                 fos.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         private static void writeDataToFile(FileOutputStream fos, String data) {
             try {
                 fos.write(data.getBytes());
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         private static String readDataFromFile(FileInputStream fis) {
             StringBuilder data = new StringBuilder();

             try {
                 int content;
                 while ((content = fis.read()) != -1) {
                     data.append((char) content);
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }

             return data.toString();
         }

         private static void closeStreams(FileInputStream fis, FileOutputStream fos) {
             try {
                 fis.close();
                 fos.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
