// Controller Class
public class StudentController {
    private Student model;
    private StudentView view;

    // Constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Method to set student name
    public void setStudentName(String name) {
        model.setName(name);
    }

    // Method to get student name
    public String getStudentName() {
        return model.getName();
    }

    // Method to set student ID
    public void setStudentId(String id) {
        model.setId(id);
    }

    // Method to get student ID
    public String getStudentId() {
        return model.getId();
    }

    // Method to set student grade
    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Method to get student grade
    public String getStudentGrade() {
        return model.getGrade();
    }

    // Method to update view
    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
