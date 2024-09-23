public class NumberPalindrome {
    public static void main(String[] args) {
        int num=121,rem,rev=0;
        int org=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(org==rev){
            System.err.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
