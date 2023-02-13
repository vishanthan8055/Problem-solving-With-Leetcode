public class Leet1486XOROperationinAnArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n,start));
    }
    public static int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n; i++) {
            int val = start+2*i;
            ans = ans ^ val;
        }
        return ans;
    }
}
