public class Leet1342NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {
        int step = 0;
        while(num>0){
            if((num&1) == 0){
                num = num / 2;
                step++;
            }
            else{
                num = num - 1;
                step++;
            }
        }
        return step;
    }
}
