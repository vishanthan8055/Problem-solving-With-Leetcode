public class Leet461HammingDistance {
    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        System.out.println(hammingDistance(x,y));
    }

    private static int hammingDistance(int x, int y) {
        int diff = x ^ y;
        int count = 0;
        while(diff>0){
            count++;
            diff = diff & (diff - 1);
        }
        return count;
    }
}
