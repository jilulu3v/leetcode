import java.util.*;


class Solution {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextLine()) {
            String numString = scan.next();
            String targetString = scan.next();
            String[] numsString = numString.substring(1, numString.length()-1).split(",");
            int[] nums = Arrays.stream(numsString)
                       .mapToInt(Integer::parseInt)
                       .toArray();
            int target = Integer.parseInt(targetString);
            System.out.println(search(nums,target));
        }
        scan.close();
    }

    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        if(target < nums[i] || target > nums[j]){
            return -1;
        }
        if(target == nums[0]){
            return 0;
        }
        if(target == nums[j]){
            return j;
        }
        while(i<=j){
            int mid = (i+j) / 2;
            if(target == nums[mid]){
                return mid;
            } else if(target > nums[mid]){
                i = mid;
            } else{
                j = mid;
            }

        }
        if(target != nums[i]){
            return -1;
        }
        return i;
    }
}