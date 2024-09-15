public class Main {
    public static void main(String[] args) throws Exception {
        StudentModel student = new StudentModel("Rohit",26);
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();
        System.out.println("\nAfter update..");
        controller.setStudentName("Rahul");
        controller.setStudentAge(25);
        controller.updateView();
    }
}
