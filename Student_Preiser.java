import java.util.List;
import java.util.ArrayList;
public class Student_Preiser {
    private String firstName;
    private String lastName;
    private int studentId;
    static List<Student_Preiser> roster = new ArrayList<>();
    public Student_Preiser(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getStudentId()
    {
        return studentId;
    }

    public boolean check(Student_Preiser x, Student_Preiser y) //takes the param of two students and compares them
    {
        return x.equals(y);
    }









}
