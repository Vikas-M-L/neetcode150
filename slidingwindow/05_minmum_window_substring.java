class Solution {
    boolean check(char[] s2, String ans)

    {
        char[] sol = ans.toCharArray();
        Arrays.sort(sol);
        int j = 0;
        for (int i = 0; i < sol.length && j < s2.length; i++) {
            if (sol[i] == s2[j]) {
                j++;

            } else if (sol[i] > s2[j]) {
                return false;
            }
        }

        if (j != s2.length) {
            return false;
        }

        return true;
    }
    public String minWindow(String s, String t) {
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        Arrays.sort(s2);
        if (s1.length < s2.length) {
            return "";
        }
        String result = s + t;
        int win_size = s2.length;
        for (int i = 0; i <= s1.length - s2.length;) {
            if (i + win_size <=s1.length) {
                String ans = new String(s1, i, win_size);
                if (check(s2, ans)) {
                    System.out.println(ans);
                    if (ans.length() < result.length()) {
                        result = ans;
                    }
                    i++;
                    win_size--;
                    win_size--;
                }
                win_size++;
                System.out.println(win_size);
            }else i++;
        }

        if (result.equals(s + t)) {
            return "";
        }

        return result;
    }
}
