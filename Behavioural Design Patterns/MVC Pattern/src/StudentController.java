public class StudentController {
    StudentModel student;
    StudentView view;
    void updateView() {
        view.printStudentDetails(student.getName(), student.getAge());
    }
    void setStudentName(String name) {
        student.setName(name);
    }
    void setStudentAge(int age) {
        student.setAge(age);
    }
    public StudentController(StudentModel student, StudentView view) {
        this.student = student;
        this.view = view;
    }
}
