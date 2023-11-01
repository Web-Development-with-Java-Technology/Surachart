import java.util.Scanner;
public class CalculateNumber {
    
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print(">> Enter your number A :");
        int num1 = sc1.nextInt();
        System.out.print(">> Enter your number B :");
        int num2 = sc2.nextInt();
        System.out.println("------------------------");
        System.out.println("** RESULT **");
        System.out.println("A+B = "+(num1+num2));
        System.out.println("A-B = "+(num1-num2));
        System.out.println("A*B = "+(num1*num2));
        System.out.println("A/B = "+(num1/num2));

        

    }
}