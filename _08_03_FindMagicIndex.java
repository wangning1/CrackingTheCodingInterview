public class _08_03_FindMagicIndex {
    public int findMagicIndex(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == i){
                res = i;
                break;
            }
        }
        return res;
    }
}
