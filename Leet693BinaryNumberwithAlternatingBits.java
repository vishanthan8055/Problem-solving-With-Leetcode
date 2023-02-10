public class Leet693BinaryNumberwithAlternatingBits {
    public static void main(String[] args) {
        int n = 5;
        int prev = (n&1)^1;
        while(n>0){
            int ld = n & 1;
            n = n >> 1;
            if(ld == prev){
                System.out.println("false");
            }
            prev = ld;
        }
        System.out.println("true");
    }
}
