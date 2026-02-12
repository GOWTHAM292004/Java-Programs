public class Binary_search_Array {
    public static void main(String[] args) {
        Binary_search_Array obj =new Binary_search_Array();
        int[] nums={1,2,3,4,5};
        System.out.println(obj.search(nums, 2));
    }
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
