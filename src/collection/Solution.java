package collection;

public class Solution {


    public int[] twoSum(int[] nums, int target){
        int[] array = new int[2];
        for (int i = 0; i< nums.length;i++){
            for(int j = i +1; j < nums.length; j++ ){
               int count = nums[i] + nums[j];
               if(count == target){
                   array[0] = i;
                   array[1] = j;
               }
            }
        }

        return  array;
                   }
        }
