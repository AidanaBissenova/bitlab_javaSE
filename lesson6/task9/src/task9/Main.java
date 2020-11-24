package task9;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]nums = new int[n][m];

        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int k = in.nextInt();

        for (int i=0;i<m;i++){

            int cnt = 0;
            for (int j=0;j<n;j++){
                if (nums[j][i]<0 && cnt<k){
                    System.out.print(nums[j][i] + " ");
                    cnt++;
                }
            }

            for (int p=0;p<k-cnt;p++){
                System.out.print("x ");
            }

            System.out.println();
        }
    }
}
