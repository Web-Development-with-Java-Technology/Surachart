import java.util.Scanner;
public class StudentGrade {
    
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Enter your GPA :");
        int point = sc.nextInt();
        char grade = 0;
        if (point < 50) {
            grade = 'F';
        }else if (point<60){
            grade = 'D';
        }else if (point<70){
            grade = 'C';
        }else if (point<80){
            grade = 'B';
        }else{
            grade = 'A';
        }

        System.out.println("---------------------------------");
        System.out.println("Nakhon Pathom Vocational College");
        System.out.println("Name : Surachart Limrattanaphun");
        System.out.println("Nickname : Tle");
        System.out.println("Student ID : 65309010008");
        System.out.println("---------------------------------");
        System.out.println("Result GPA :"+point);
        System.out.println("Grade :"+grade);
        System.out.println("-----------THANK-YOU-------------");




    }
}
