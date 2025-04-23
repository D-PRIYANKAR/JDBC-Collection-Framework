public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Insert a new student
        Student s1 = new Student(0, "Rahul", 22, "CS");
        dao.insertStudent(s1);

        // Fetch and display all students
        for (Student s : dao.fetchAllStudents()) {
            System.out.println(s);
        }
    }
}
