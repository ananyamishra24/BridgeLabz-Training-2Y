import java.util.*;

public class ZeroSumSubarrays {
    public static void findSubarrays(int[] arr) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: sum is 0
            if (sum == 0) {
                System.out.println("Subarray: (0, " + i + ")");
            }

            // Case 2: sum seen before
            if (map.containsKey(sum)) {
                List<Integer> list = map.get(sum);
                for (int start : list) {
                    System.out.println("Subarray: (" + (start + 1) + ", " + i + ")");
                }
            }

            // Store sum in map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};
        findSubarrays(arr);
    }
}
