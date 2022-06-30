import java.util.Scanner;

public class Main {
    public static int Sum(int a,int b){
        int x = a+b;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MyNum = (int)(Math.random()*100);

        while(true) {
            int GsdNum= sc.nextInt();
            if (GsdNum > MyNum)
                System.out.println("Your No. is Greater than my no.");
            else if (GsdNum < MyNum) {
                System.out.println("Your No. is less than my no.");
            } else if (GsdNum == MyNum) {
                System.out.println("Congratulations");
                break;
            }
        }

    }
}