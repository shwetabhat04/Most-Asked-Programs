public class Stringisvalidornot {
 public static void main(String[] args) {
    String s="eroiios";
    boolean flag=true;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(!(c>='a' && c<='z' ||c>='A' && c<='Z'))
        {
            flag=false;
            break;
        }
    }
    if(flag){
        System.out.println("Proper String");
    }
    else{
        System.out.println("Not a proper String");
    }
 }   
}
