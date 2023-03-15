import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Undersök om en inläst text är ett palindrom
        // Exempelvis: anna eller madam

        Scanner input = new Scanner(System.in);
        System.out.print("Ange en text: ");
        String s = input.nextLine();

        boolean isPalindrome = true;

        for (int start=0, end = s.length()-1; start < end; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Inte palindrom");
        }
    }
}