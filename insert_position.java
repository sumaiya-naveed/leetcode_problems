class Solution {
public:

    static int binarySearch(vector<int>&nums,int target,int low, int high){
        if(high>=low){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[mid]>target){
                return binarySearch(nums,target,low,mid-1);
            }
            
            return binarySearch(nums,target, mid+1,high);
        }

        return low;
    }
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        int result = binarySearch(nums,target,0,n-1);
        return result;
    }
};