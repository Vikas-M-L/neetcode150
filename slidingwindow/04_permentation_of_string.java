class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] str2 = s2.toCharArray();
        char[] str1 = s1.toCharArray();
        Arrays.sort(str1);
        for (int i = 0; i <= str2.length - str1.length; i++) {
            char[] t = new char[str1.length];
            for (int j = i; j < str1.length + i; j++) {
                t[j - i] = str2[j];
            }
            Arrays.sort(t);
            for (var x : str1) System.out.print(x);
            System.out.print(" ");
            for (var x : t) System.out.print(x);
            System.out.println();

            if (Arrays.equals(t, str1)) {
                return true;
            }
        }

        return false;
    }
}
