package LeetCodeMedium;

public class Increasing_Triplet_Subsequence334 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       // Increasing_Triplet_Subsequence334 i = new Increasing_Triplet_Subsequence334();
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
        // int n = nums.length;
        // if(n < 3) return false;
        // int num1,num2,num3;
        // int start = 0;
        // int end = n - 1;
        // num1 = nums[start];
        // num3 = nums[end];
        // for(int i = 1 ;i< nums.length - 1;i++){
        //     if(nums[i] < nums[start]){
        //      start = i;
        //      continue;
        //     }
        //     if(nums[i] > nums[start] && nums[i] < nums[end]
        //     && start < i && end > i) return true;
        //     else if(nums[i] > nums[end] ){
        //         end = i;
        //     }
        // }
        // return false;

        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= num1){
                num1 = num;
            }
            else if(num <= num2){
                num2 = num;
            }
            else{
                return true;
            }

        }
        return false;
    }
}
