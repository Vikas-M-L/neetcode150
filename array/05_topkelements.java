class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int s : nums) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int arr[][] = new int[map.size()][2];
        int i = 0;
        for (var entry : map.entrySet()) {
            var key = entry.getKey();
            var val = entry.getValue();
            arr[i][0] = val;
            arr[i][1] = key;
            i++;
        }
        
        for (i = 0; i < map.size() -1 ; ++i) {
            for (int j = 0; j < map.size() - 1 - i; ++j) {
                if (arr[j][0] < arr[j + 1][0]) {
                    int temp = arr[j][0];
                    arr[j][0] = arr[j+1][0];
                    arr[j + 1][0] = temp;

                    temp = arr[j][1];
                    arr[j][1] = arr[j+1][1];
                    arr[j+1][1] = temp;
                }
            }
        }

        int[] ans = new int[k];
        for (i = 0; i < k; ++i) {
            ans[i] = arr[i][1];
        }
        return ans;
    }
}