public class Reversestring {
    public static void main(String[] args) {
        String orginalstring="Helootheir";
        String reversestring="";
        for(int i=0;i<orginalstring.length();i++){
            reversestring=orginalstring.charAt(i)+reversestring;
        }
        System.out.println(" Reversed string "+reversestring);        
    }

}
