package hot100.Hash;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {



    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(target - nums[i])) {
                return new int[]{hash.get(target - nums[i]),i};
            }else{
                hash.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
