package easy.october2021;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        Map<Integer, Integer> pair = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (pair.containsKey(target - nums[i])) {
                return new int[]{pair.get(target - nums[i]), i};
            }
            pair.put(nums[i], i);
        }
        return new int[0];
    }
}
