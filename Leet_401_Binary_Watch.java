import java.util.ArrayList;
import java.util.List;

public class Leet_401_Binary_Watch {
    public static void main(String[] args) {
        int turnedOn = 1;
//        System.out.println(withN1s(12,1));
        System.out.println(readBinaryWatch(turnedOn));
    }

    private static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                int time = i*64 + j;
                if (withN1s(time, turnedOn)) {
                    if(j<10) {
                        ans.add(i + ":0" + j);
                    }
                    else {
                        ans.add(i+":" + j);
                    }
                }
            }
        }
        return ans;
    }
    private static boolean withN1s(int t,int dc){
            int count = 0;
            while (t > 0) {
                count++;
                t = t & (t - 1);
            }
            if(count == dc){
                return true;
            }
            return false;
        }
    }

