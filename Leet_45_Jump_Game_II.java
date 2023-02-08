public class Leet_45_Jump_Game_II {
    public static void main(String[] args) {
        int[] nums = {10,9,8,7,6,5,4,3,2,1,1,0};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums){
        int answer = 0, n = nums.length;
        int curEnd = 0, curFar = 0;

        for (int i = 0; i < n - 1; ++i) {
            curFar = Math.max(curFar, i + nums[i]);
            if (i == curEnd) {
                answer++;
                curEnd = curFar;
            }
        }

        return answer;
    }
}
