package Level1;

public class Seoul_Kim {
    public static void main(String[] args) {
      String[] seoul = {"Jane", "Kim"};
      String ans = solution(seoul);
      
      System.out.println(ans);
   }

   private static String solution(String[] seoul) {
        int i;
        for(i=0; i<seoul.length; i++) {
           if(seoul[i].equals("Kim")) break;
        }
        
        String answer = "�輭���� "+i+"�� �ִ�";
        return answer;
   }
}
