package recursion;

public class GroupSumClump {
    static boolean groupSumClump(int start, int[] nums, int target) {
        return helper2(start, nums, target, 0, false);
    }

    private static boolean helper2(int start, int[] nums, int target, int previous, boolean wasTaken) {
        return (target == 0 || (start != nums.length
                && ((previous != nums[start] || wasTaken)
                && helper2(start + 1, nums, target - nums[start], nums[start], true)
                || ((previous != nums[start] || !wasTaken) && helper2(start + 1, nums, target, nums[start], false)))));
    }
}
