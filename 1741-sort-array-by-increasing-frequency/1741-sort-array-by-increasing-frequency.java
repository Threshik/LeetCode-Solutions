class Solution {
    public int[] frequencySort(int[] nums) {
        int[] arr = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Counting the frequency of each element
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Adding all elements to the list
        for (int n : nums) {
            list.add(n);
        }

        // Sorting the list based on frequency and then by value
        Collections.sort(list, (n1, n2) -> {
            int f1 = map.get(n1);
            int f2 = map.get(n2);
            if (f1 != f2) {
                // Sort by frequency in ascending order
                return f1 - f2;
            }
            // If frequencies are the same, sort by value in descending order
            return n2 - n1;
        });

        // Converting the sorted list back to an array
        int k = 0;
        for (int n : list) {
            arr[k++] = n;
        }

        return arr;
    }
}