import java.util.Scanner;

public class StringOpr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take string input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // 2. Reverse the string using StringBuilder
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        // 3. Count vowels and consonants
        int vowels = 0, consonants = 0;
        String lowerInput = input.toLowerCase();

        for (int i = 0; i < lowerInput.length(); i++) {
            char ch = lowerInput.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // 4. Check if palindrome
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        // 5. Print all results
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Is Palindrome? " + (isPalindrome ? "Yes" : "No"));

        sc.close();
    }
}