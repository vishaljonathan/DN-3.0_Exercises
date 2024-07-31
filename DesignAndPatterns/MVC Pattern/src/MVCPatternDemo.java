public class MVCPatternDemo
{
    public static void main(String[] args)
    {
        // Create a model
        Student model = new Student("John Doe", "S12345", "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        // Update the view
        controller.updateView();

        // Change student details
        controller.setStudentName("Jane Doe");
        controller.setStudentId("S67890");
        controller.setStudentGrade("B");

        // Update the view again
        controller.updateView();
    }
}
