class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String sorteds=new String(arr);
            map.putIfAbsent(sorteds,new ArrayList<>());
            map.get(sorteds).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

optimised 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            int arr[]=new int[26];
            for(char ch:s.toCharArray())
            {
             arr[ch-'a']++;
            }
            String key=Arrays.toString(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

