public class PermutationUsingBacktracking {
    
}



LC 78
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(nums,0,res,temp);
        return res;
    }
    public static void backtrack(int nums[] , int start , List<List<Integer>> res , List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i = start ; i < nums.length  ; i++){
        //inc
        temp.add(nums[i]);
        //backtracking
        backtrack(nums,i+1,res,temp);
        //exclude
        temp.remove(temp.size()-1);
        }
        }
}

LC 46
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
         getperms(nums,0,res);
        return res;
    }
    public static void getperms(int nums[] , int idx , List<List<Integer>> res){
    //BC
    if(idx == nums.length){
    ArrayList<Integer> temp = new ArrayList<>();
    for(int num:nums){
        temp.add(num);
    }
    res.add(temp);
    return;
    }
        for(int i=idx;i<nums.length;i++){
            //swap
            swap(nums,idx,i);
            //backtracking
            getperms(nums,idx+1,res);
            //swap
            swap(nums,idx,i);
        }
    }

        public static void swap(int nums[] , int idx , int i){
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
    }
    lc 39
    class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();
    backtrack(arr, ans, comb , 0, target);
    return ans;
    }
    Set<List<Integer>> set = new HashSet<>();
    public void backtrack(int arr[] , List<List<Integer>> ans , 
    List<Integer> comb , int i, int target ){
    if(target == 0){
        if(!set.contains(comb)){
        ans.add(new ArrayList<>(comb));
        set.add(new ArrayList<>(comb));
    }
    return;
    }
    if(i==arr.length || target < 0){
        return;
    }

    comb.add(arr[i]);
    //single
    backtrack(arr, ans, comb , i+1, target - arr[i]);

    //multiple
    backtrack(arr, ans, comb , i, target - arr[i]);
    //backtrack
    comb.remove(comb.size()-1);

    //exclude
    backtrack(arr, ans, comb , i+1, target);

    }
}