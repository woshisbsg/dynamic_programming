import java.util.Scanner;

public class LcsWithDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[][] lcs = new int[a.length() + 1][b.length() + 1];

        for(int i = 0; i < a.length(); i++){
            lcs[i][0] = 0;
        }
        for(int i = 0; i < b.length(); i++){
            lcs[0][i] = 0;
        }

        for(int i = 1; i < a.length() + 1; i++){
            for(int j = 1; j < b.length() + 1; j++){
                if(a.charAt(i - 1) == b.charAt(j - 1)){
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                }
                else{
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }


        for(int i = 0; i < lcs.length; i++){
            for(int j = 0; j < lcs[0].length; j++){
                System.out.print(lcs[i][j] + " ");
            }
            System.out.println();
        }


        int max = 0;

        for(int i = 0; i < lcs.length; i++){
            for(int j = 0; j < lcs[0].length; j++){
                if(lcs[i][j] > max){
                    max = lcs[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
