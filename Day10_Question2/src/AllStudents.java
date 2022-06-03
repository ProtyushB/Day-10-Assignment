import java.util.Scanner;

public class AllStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Details For Science Student");

        System.out.println("\n----------------------------------");

        System.out.print("Enter Name: ");
        String name=sc.next();


        System.out.print("Enter Address: ");
        String address=sc.next();

        System.out.print("Enter Marks For Phisics: ");
        int s1=sc.nextInt();

        System.out.print("Enter Marks For Chemistry: ");
        int s2=sc.nextInt();

        System.out.print("Enter Marks For Maths: ");
        int s3=sc.nextInt();

        ScienceStudent scienceStudent = new ScienceStudent(name,address,s1,s2,s3);
        System.out.println("Percentage of All Marks: "+scienceStudent.getPercentage());

        System.out.println("\n====================================\n");

        System.out.print("Enter Details For History Student");

        System.out.println("\n----------------------------------");

        System.out.print("Enter Name: ");
        name=sc.next();

        System.out.print("Enter Address: ");
        address=sc.next();

        System.out.print("Enter Marks For History: ");
        s1=sc.nextInt();

        System.out.print("Enter Marks For Civics: ");
        s2=sc.nextInt();

        HistoryStudent historyStudent = new HistoryStudent(name,address,s1,s2);
        System.out.println("Percentage of All Marks: "+historyStudent.getPercentage());
    }
}
