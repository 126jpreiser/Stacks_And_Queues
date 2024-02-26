import java.util.concurrent.LinkedTransferQueue;

public class BathroomChallenge_Preiser {
    public static void main(String[] args) {
        LinkedTransferQueue<Student_Preiser> line1 = new LinkedTransferQueue<>();
        LinkedTransferQueue<Student_Preiser> line2 = new LinkedTransferQueue<>();


        Bathroom_Preiser bathroom1 = new Bathroom_Preiser(3, line1);
        Bathroom_Preiser bathroom2 = new Bathroom_Preiser(2, line2);

        Student_Preiser James = new Student_Preiser("James", "Washington", 1);
        Student_Preiser David = new Student_Preiser("David", "Monte", 2);
        Student_Preiser Charlie = new Student_Preiser("Charlie", "Jackson", 3);
        Student_Preiser Johnny = new Student_Preiser("Johnny", "Johnson", 4);
        Student_Preiser Davis = new Student_Preiser("Davis", "Davidson", 5);
        Student_Preiser Rachel = new Student_Preiser("Rachel", "Bobson", 6);
        Student_Preiser Chuck = new Student_Preiser("Chuck", "Gary", 7);
        Student_Preiser John = new Student_Preiser("John", "Smith", 8);
        Student_Preiser JohnD = new Student_Preiser("John", "Doe", 9);
        Student_Preiser Jane = new Student_Preiser("Jane", "Doe", 10);
        Student_Preiser Janette = new Student_Preiser("Janette", "Reed", 11);
        Student_Preiser Michele = new Student_Preiser("Michele", "Mickey", 12);

        bathroom1.addStudent(James);
        bathroom1.removeStudent(James);
        bathroom1.addStudent(David);
        bathroom1.removeStudent(David);
        bathroom1.addStudent(JohnD);
        bathroom1.removeStudent(JohnD);
        bathroom1.addStudent(John);
        bathroom1.removeStudent(John);
        bathroom1.addStudent(Chuck);
        bathroom1.removeStudent(Chuck);

        bathroom2.addStudent(Janette);
        bathroom2.addStudent(Jane);
        bathroom2.addStudent(Rachel);
        bathroom2.addStudent(Michele);

        System.out.println(bathroom1.getInBathroom());
        System.out.println(bathroom2.getInBathroom());
        System.out.println(bathroom1.studentSearch(James));
        System.out.println(bathroom1.studentSearch(Chuck));
        System.out.println(bathroom2.studentSearch(James));
        System.out.println(bathroom1.studentSearch(Davis));

        bathroom1.leaveBathroom(James);
        bathroom2.leaveBathroom(Jane);

        bathroom1.test();
        bathroom2.test();
        bathroom1.clearData();
        bathroom1.test();

        bathroom1.setMaximumIn(15);


    }
        }
