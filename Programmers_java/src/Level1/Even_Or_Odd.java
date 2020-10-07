package Level1; // https://programmers.co.kr/learn/courses/30/lessons/12937

public class Even_Or_Odd {
   public static void main(String[] args) {
      int num = -3;
      String ans = solution(num);
      System.out.println(ans);
   }

   private static String solution(int num) {
        return num%2==0? "Even" : "Odd";
   }
}
