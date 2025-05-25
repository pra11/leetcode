package LeetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Contiguous_Array525 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        Contiguous_Array525 c = new Contiguous_Array525();
        System.out.println(c.findMaxLength(nums));

    }

    public int findMaxLength(int[] nums) {

        int zero = 0;
        int one = 0;
        int res = 0;

        Map<Integer,Integer> myMap = new HashMap<>();
        int i = 0 ;
        for(int num : nums){
            if(num == 0) zero++;
            else    one++;

            int diff = one - zero;
            if(!myMap.containsKey(diff)){
                myMap.put(diff, i);

            }
            if(one == zero) res = one + zero;
            else {
                int idx = myMap.get(diff);
                res = Math.max(res, i  - idx);
            }
            i++;
        }

        return res;
    }
}
