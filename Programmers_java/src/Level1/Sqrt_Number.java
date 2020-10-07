package Level1; //https://programmers.co.kr/learn/courses/30/lessons/12934

public class Sqrt_Number {
   public static void main(String[] args) {
      long n = 121;
      long ans = solution(n);
      System.out.println(ans);
   }

   private static long solution(long n) {
      double ans = Math.sqrt(n);
      if((long)ans == ans) return (long)Math.pow((long)(ans+1), 2);
      return -1;
   }
}
