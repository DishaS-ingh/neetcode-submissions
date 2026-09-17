class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[n];

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            if (freq[i] != -1) {
                freq[i] = 1;

                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        freq[i]++;
                        freq[j] = -1;
                    }
                }
            }
        }

        int[] result = new int[k];

        // Find k highest frequencies
        for (int x = 0; x < k; x++) {
            int max = -1;
            int index = -1;

            for (int i = 0; i < n; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }

            result[x] = nums[index];
            freq[index] = -1;
        }

        return result;
    }
}