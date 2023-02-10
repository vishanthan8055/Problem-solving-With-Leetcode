public class Leet762 {
    public static void main(String[] args) {
        int left = 10;
        int right = 15;
//        System.out.println(isPrime(6));
        System.out.println(countPrimeSetBits(left,right));
    }
    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right;i++){
            int c = count(i);
            if(isPrime(c)){
                count++;
            }
        }
        return count;
    }
    static int count(int n){
        int c = 0;
        while(n>0){
            c++;
            n = n & (n-1);
        }
        return c;
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
