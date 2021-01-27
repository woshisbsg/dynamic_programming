import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leastCoinsForChanges {
    public static void main(String[] args) {
        int[] data = new int[]{5,2,3};
        int target = 20;
        leastCoinsForChanges a = new leastCoinsForChanges();
        int result = a.minMoney(data, target);
        System.out.println(result);

    }
    public int minMoney (int[] arr, int aim) {
        // write code here
        int[] count = new int[aim +1];
        Arrays.fill(count, aim + 1);
        //初始化数组
        count[0] = 0;
        for (int i =1;i<=aim;i++){
            for (int j = 0 ; j < arr.length ; j++){
                if (i >=arr[j]){
                    //当前的钱数-当前面值，为之前换过的钱数，如果能够兑换只需要在加+1即可，如果不能就取aim+1;
                    count[i] = Math.min(count[i-arr[j]] +1 , count[i]);
                }
            }
        }
        //对应的总数是否能够兑换取决于是否等于aim+1
        return count[aim] != aim+1 ? count[aim] :-1;
        // write code here
    }
}
