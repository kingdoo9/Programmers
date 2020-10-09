package Level1;

import java.util.Arrays;

public class Sum_Array {
   public static void main(String[] args) {
      int[][] arr1 = {{1,2},{2,3}};
      int[][] arr2 = {{3,4},{4,5}};
      
      int[][] ans = solution(arr1, arr2);
      for(int i=0; i<ans[0].length; i++)
         System.out.println(Arrays.toString(ans[i]));
   }

   private static int[][] solution(int[][] arr1, int[][] arr2) {
      int[][] answer = arr1;
      
      for(int i=0; i<arr1.length; i++) {
         for(int j=0; j<arr1[i].length; j++) {
            answer[i][j] = arr1[i][j] + arr2[i][j];
         }
      }
      
      return answer;
   }
}
