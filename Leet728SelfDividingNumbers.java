import java.util.ArrayList;
import java.util.List;

public class Leet728SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1;
        int rigth = 22;
        System.out.println(selfDividingNumbers(left,rigth));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = left; i <=right ; i++) {
            if(isDivide(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean isDivide(int n){
        int temp = n;
        while (n>0){
            int ld = n%10;
            if(ld == 0 || temp%ld != 0){
                return false;
            }
            n = n/10;
        }
        return true;
    }
}
