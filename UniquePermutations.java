import java.util.*;

public class UniquePermutations {
    public static ArrayList<String> find_permutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        char[] charArray = S.toCharArray();
        Arrays.sort(charArray);
        boolean[] used = new boolean[charArray.length];
        StringBuilder current = new StringBuilder();
        permute(charArray, used, current, result);
        return result;
    }

    private static void permute(char[] charArray, boolean[] used, StringBuilder current, ArrayList<String> result) {
        if (current.length() == charArray.length) {
            result.add(current.toString());
            return;
        }
        
        for (int i = 0; i < charArray.length; i++) {
            if (used[i] || (i > 0 && charArray[i] == charArray[i - 1] && !used[i - 1]))
                continue;
            used[i] = true;
            current.append(charArray[i]);
            permute(charArray, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String input1 = "ABC";
        ArrayList<String> result1 = find_permutation(input1);
        System.out.println("Example 1:");
        for (String permutation : result1) {
            System.out.print(permutation + " ");
        }
        System.out.println();
        
        String input2 = "ABSG";
        ArrayList<String> result2 = find_permutation(input2);
        System.out.println("Example 2:");
        for (String permutation : result2) {
            System.out.print(permutation + " ");
        }
        System.out.println();
    }
}