public class Check_if_vowels_present_in_String {
    public static void main(String[] args) {
        String s= "nnbb";
        boolean vowelPresent = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowelPresent = true;
                System.out.println("String contains vowel '" + s.charAt(i) + "' at index " + i);
            }
        }

        if (!vowelPresent) {
            System.out.println("String does not contain any vowels.");
        }
    }
}