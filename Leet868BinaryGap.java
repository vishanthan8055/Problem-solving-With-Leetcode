public class Leet868BinaryGap {
    public static void main(String[] args) {
        int n = 22;
        System.out.println(binaryGap(n));
    }
    public static int binaryGap(int n){
        int d = 0;
        int ans = 0;
        boolean flag = false;
        while(n>0){
            int ld = n & 1;
            if(ld==0){
                if(flag == true){
                    d = d + 1;
                }
            }
            else{
                if(flag == false){
                    flag = true;
                }
                else{
                    d = d + 1;
                    if(d > ans){
                        ans = d;
                    }
                    d = 0;
                }
            }
            n = n >> 1;
        }
        return ans;
    }
}
