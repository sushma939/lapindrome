public class Lapindrome {
    static final int MAX_CHAR = 26;

    static boolean CheckCorrectOrNot(String s) {
        int[] count = new int[MAX_CHAR];
        int n = s.length();
        if (n == 1)
            return true;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            count[s.charAt(i) - 'a']++;
            count[s.charAt(j) - 'a']--;
        }
        for (int i = 0; i < MAX_CHAR; i++)
            if (count[i] != 0)
                return false;
        return true;
    }

    public static void main(String args[]) {
        String s = "gaga";
        if (CheckCorrectOrNot(s))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

