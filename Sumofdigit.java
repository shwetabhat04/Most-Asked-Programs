import java.util.Scanner;
public class Sumofdigit {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int m, sum = 0;
        while (n > 0) {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        System.out.println("Sum of the number is " + sum);
    }
}
