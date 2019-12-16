package day15.practise.review.day;

public class Practise02 {
    public static void main(String[] args) {
        int target =9;
        int[] nums = {2,7,11,15};
        for(int i = 0 ;i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    System.out.println("[" + i + "," +  j + "]" );
                }
            }
        }
    }

}
