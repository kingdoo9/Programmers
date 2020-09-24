package Level2;

import java.util.ArrayList;

public class Printer {
   public static void main(String[] args) {
      int[] priorities = {1,1,9,1,1,1};
      int location = 0;
      int ans = solution(priorities, location);
      
      System.out.println(ans);
   }

   private static int solution(int[] priorities, int location) {
      ArrayList<Integer> print = new ArrayList<>();
      
      for(int document : priorities) print.add(document);
      
      boolean Ok; // 인쇄가 가능한 상태라면 true 를 가진다.
      int answer = 0; // 몇 번 인쇄 하였는지 체크한다.
      
      while(location >= 0) { //현재 출력하고싶은 인쇄의 번호이다. -1일때 정답을 return 한다.
         Ok = true;
         for(int num : print) { // 인쇄 목록중 우선순위를 체크하기 위함.
            if(print.get(0) < num) {
               print.add(print.get(0));
               print.remove(0);
               location--;
               if(location < 0) location = print.size()-1; // 나의 출력물이 제일 앞에 있지만, 더 큰게 있기 때문에 뒤로 밀림.
               Ok = false;
               break;
            }
         }
         
         if(Ok) { // 인쇄가 가능 상태라면, == 제일 우선순위가 높은 값이라면
            print.remove(0);
            answer++;
            location--;
         }
         
      }
      
      return answer;
   }
}
