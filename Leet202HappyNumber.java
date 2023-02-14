public class Leet202HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        if(n/10 == 0){
            return false;
        }
        while (n > 0) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem * rem;
                if (sum == 1) {
                    return true;
                }
                n = n/10;
            }
            n = sum;
        }
        return false;
    }
}
