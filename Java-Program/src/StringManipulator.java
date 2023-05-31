import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringManipulator {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
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

    public static void main(String[] args) {
        String input = "Shivam Singh";
        String reversedString = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);

        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 1};
        List<Integer> duplicateNumbers = findDuplicates(numbers);
        System.out.println("Duplicate Numbers: " + duplicateNumbers);
    }
}
