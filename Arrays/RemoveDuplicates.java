//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

//Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

//The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
//Difficuly - Easy
class Solution {
    public int removeDuplicates(int[] nums) {
      int n = nums.length;
      int i = 0;
      for(int j = 1;j<n;j++){
        if(nums[i]<nums[j]){
            int temp = nums[i+1];
            nums[i+1] = nums[j];
            nums[j] = temp;
            i++;
        }
      }
      return i+1;     
    }
}
