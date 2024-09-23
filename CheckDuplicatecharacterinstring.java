public class CheckDuplicatecharacterinstring {
    public static void main(String[] args) {
        String s="Beautiful soul";
        char [] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(c[i]==c[j]){
                    System.out.println("Duplicate charater present is  "+c[j]);
                }
                else{
                    System.out.println("Duplicate character not present");
                }
            }
        }
    }
}
