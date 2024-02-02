class Solution {
    static void swap(int nums[],int pos1,int pos2){
        int temp=nums[pos1];
        nums[pos1]=nums[pos2];
        nums[pos2]=temp;
    }
    public void sortColors(int[] nums) {
      int start=0;
      int mid=0;
      int end=nums.length-1;
      while(mid <= end){
          switch(nums[mid]){
              case 0:  // swap with start and mid ++
              swap(nums,start,mid);
              start++;
              mid++;
              break;

              case 1: // no swap mid++
              mid++;
              break;

              case 2: // swap with end --
              swap(nums,mid,end);
              end--;
              break;
          }
      }
    }
}