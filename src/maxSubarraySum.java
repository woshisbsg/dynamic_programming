import java.util.*;


public class maxSubarraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 5, -2, 6, -1};
        maxSubarraySum a = new maxSubarraySum();
        int result = a.maxsumofSubarray(arr);
        System.out.println(result);
    }
    /*
    public int maxsumofSubarray (int[] arr) {
        // write code here
        ArrayList<ArrayList<Integer>> subArrayAll = new ArrayList<>();
        ArrayList<Integer> subArraySumArraylist = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                subArraySumArraylist.add(subArraySum(arr, i,j));
            }
        }

        //System.out.println(subArraySumArraylist);
        return Collections.max(subArraySumArraylist);


    }

    public int subArraySum(int[] data, int startingIndex, int endingIndex){
        int sum = 0;
        for(int i = startingIndex; i <= endingIndex; i++){
            sum = sum + data[i];
        }
        return sum;
    }

     */

    public int maxsumofSubarray (int[] arr) {
        // write code here
        int[] sum = new int[arr.length];
        int finalmax = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(i ==0){
                finalmax = arr[0];
                continue;
            }
            int current = arr[i];
            finalmax = Math.max(current,finalmax + current);
            //sum[i] = max;
            if(finalmax > max){
                max = finalmax;
            }
        }
        //Arrays.sort(sum);
        return max;

    }


}