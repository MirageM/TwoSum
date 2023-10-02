import java.util.HashMap;
import java.util.Map;

public class twoSum2{
	public static int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> nMap = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			nMap.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if(nMap.containsKey(complement) && nMap.get(complement) != i){
				return new int[]{i, nMap.get(complement)};
			}
		}
		return new int[]{};
	}
}