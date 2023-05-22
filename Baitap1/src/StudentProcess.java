import java.io.*;

public class StudentProcess {
    protected  Student [] students;
    protected  int count;
    public StudentProcess(){
        students = new Student[5];
        count = 0;
    }
    public  boolean writeStudent(Student objStudent, String fileName) {
        try {
            students [count++]= objStudent;
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(students);
            objectOut.close();
            fileOut.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public  Student[] readStudent(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Student[] students1 = (Student[]) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return students1;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
