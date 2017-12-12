//CRACKING THE CODING INTERVIEW CHALLENGES: MAKING ANAGRAMS (JAVA)

import java.util.*;

public class Making_Anagrams {
    public static int numberNeeded(String first, String second) {
        int[] letterSetA = new int[26];
        int[] letterSetB = new int[26];
        int deletionCount = 0;

        for (int x = 0; x < first.length(); x++) {
            int arrValue = (int) first.charAt(x);
            letterSetA[arrValue-97]++;
        }
        for (int y = 0; y < second.length(); y++) {
            int arrValue = (int) second.charAt(y);
            letterSetB[arrValue-97]++;
        }

        for (int z = 0; z < 26; z++) {
            if (letterSetA[z] > letterSetB[z]) {
                deletionCount += (letterSetA[z] - letterSetB[z]);
            }
            if (letterSetA[z] < letterSetB[z]) {
                deletionCount += (letterSetB[z] - letterSetA[z]);
            }
        }


        return deletionCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
