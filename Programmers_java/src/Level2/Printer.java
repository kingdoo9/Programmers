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
      
      boolean Ok; // �μⰡ ������ ���¶�� true �� ������.
      int answer = 0; // �� �� �μ� �Ͽ����� üũ�Ѵ�.
      
      while(location >= 0) { //���� ����ϰ���� �μ��� ��ȣ�̴�. -1�϶� ������ return �Ѵ�.
         Ok = true;
         for(int num : print) { // �μ� ����� �켱������ üũ�ϱ� ����.
            if(print.get(0) < num) {
               print.add(print.get(0));
               print.remove(0);
               location--;
               if(location < 0) location = print.size()-1; // ���� ��¹��� ���� �տ� ������, �� ū�� �ֱ� ������ �ڷ� �и�.
               Ok = false;
               break;
            }
         }
         
         if(Ok) { // �μⰡ ���� ���¶��, == ���� �켱������ ���� ���̶��
            print.remove(0);
            answer++;
            location--;
         }
         
      }
      
      return answer;
   }
}
