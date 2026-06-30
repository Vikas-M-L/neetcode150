class Solution {
    public boolean isAnagram(String s, String t) {
       char[] s1=s.toCharArray();
       char[] s2=t.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(s2);
       if(s1.length!=s2.length)
       {
        return false;
       }
       for(int i=0;i<s1.length;i++)
       {
        if(s1[i]!=s2[i])
        {
            return false;
        }
       }
       return true;

    }
}




class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> map1=new HashMap<>();
      HashMap<Character, Integer>map2=new HashMap<>();
      for(char ch: s.toCharArray())
      {
        map1.put(ch,map1.getOrDefault(ch,0)+1);
      }
        for(char ch: t.toCharArray())
      {
        map2.put(ch,map2.getOrDefault(ch,0)+1);
      }
      return map1.equals(map2);
    
    }
}



class Solution {
    public boolean isAnagram(String s, String t) {
        int a[] = new int[26];

        for (char ch : s.toCharArray()) {
            a[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            a[ch - 'a']--;
        }
        for (int val : a) {
            if (val != 0) {
                return false;
            }

        }
        return true;

    }
}