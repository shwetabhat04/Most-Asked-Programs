public class Toremovewhitespacefromstring {
    public static void main(String[] args) {
        String whitespace=" H a s __ White__ Space";
        String removewh = whitespace.replaceAll("\\s+", "");
        System.out.println(removewh);
    }
}
