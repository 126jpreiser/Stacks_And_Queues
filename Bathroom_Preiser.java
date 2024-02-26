import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;
public class Bathroom_Preiser<E> {
    private int maximumIn;
    List<Student_Preiser> inBathroom = new ArrayList<>();
    List<Student_Preiser> outBathroom = new ArrayList<>();
    private LinkedTransferQueue<Student_Preiser> line = new LinkedTransferQueue<>();



    public Bathroom_Preiser(int maximumIn, LinkedTransferQueue<Student_Preiser> line) {
        this.line = line;
        this.maximumIn = maximumIn;
    }
    public LinkedTransferQueue<Student_Preiser> getLine()
    {
        return line;
    }
    public void clearData() {
        inBathroom.clear();
        outBathroom.clear();
        line.clear();
    }

    public void setMaximumIn(int x) {
        maximumIn = x;
    }

    public String addStudent(Student_Preiser student) {//adds to line
        if (outBathroom.contains(student))
            return "Student has recently been to the bathroom, they are unable to join the line";

        line.add(student);
        return "Student successfully added the the line.";
    }

    public String removeStudent(Student_Preiser student)//removes from the line and adds to bathroom(v)
    {
        if (inBathroom.size() == maximumIn)
            return "Maximum people inside of the bathroom has been reached. Student cannot go into the bathroom."
                    ;
        line.poll();
        inBathroom.add(student);
        return "Student added the bathroom successfully.";
    }

    public String leaveBathroom(Student_Preiser student)
    {
        inBathroom.remove(student);
        outBathroom.add(student);
        return student.getFirstName() + " " + student.getLastName() + " hsa left the bathroom. Student ID: " + student.getStudentId() + "." ;
    }

    public String studentSearch(Student_Preiser student)//a way to search for a student (vii)
    {
        if(line.contains(student))
        {
            return student.getFirstName() + " " + student.getLastName() + " is currently in the bathroom LINE";
        }
        else if (inBathroom.contains(student))
            return  student.getFirstName() + " " + student.getLastName() +  " is currently in the bathroom";
        else if (outBathroom.contains(student))
            return student.getFirstName() + " " + student.getLastName() + " has been in the bathroom, but has since left";
        else return   student.getFirstName() + " " + student.getLastName() +   " has no bathroom or bathroom line records";
    }
    public int lineSize(LinkedTransferQueue<Student_Preiser> line)//size of the bathroom line (viii)
    {
        return line.size();
    }
    public String getInBathroom() //fetch who is currently in the bathroom(vi)
    {
        String in = "Currently in bathroom: ";
                for (Student_Preiser x: inBathroom)
                    in += x.getFirstName() + " " + x.getLastName() + ", ";
        return in;
    }
    public E test()
    {
        return null;
    }


}
