import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringManipulator {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            reversed.append(str.charAt(index));
        }

        return reversed.toString();
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }
            }
        }

        return duplicates;
    }

    public static int countVowels(String inputString) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int index = 0; index < inputString.length(); index++) {
            if (vowels.contains(String.valueOf(inputString.charAt(index)))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Shivam Singh";
        String reversedString = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);

        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 1};
        List<Integer> duplicateNumbers = findDuplicates(numbers);
        System.out.println("Duplicate Numbers: " + duplicateNumbers);


        int noOfVowel = countVowels(input);
        System.out.println("Number of vowel in this string : " + noOfVowel);
    }
}

