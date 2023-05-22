public class Main {
    public static void main(String[] args) {
        String fileName = "students.dat";
        // Tạo 5 đối tượng sinh viên
        Student student1 = new Student("001", "John", 20, "A");
        Student student2 = new Student("002", "Emily", 19, "B");
        Student student3 = new Student("003", "David", 21, "A");
        Student student4 = new Student("004", "Sophia", 20, "C");
        Student student5 = new Student("005", "Michael", 22, "B");
        StudentProcess studentProcess = new StudentProcess();
        // Ghi từng đối tượng sinh viên vào file
        studentProcess.writeStudent(student1, fileName);
        studentProcess.writeStudent(student2, fileName);
        studentProcess.writeStudent(student3, fileName);
        studentProcess.writeStudent(student4, fileName);
        studentProcess.writeStudent(student5, fileName);

        // Đọc dữ liệu từ file
        Student[] students = studentProcess.readStudent(fileName);
        for (Student student: students
             ) {
            System.out.println(student);
        }
    }
}