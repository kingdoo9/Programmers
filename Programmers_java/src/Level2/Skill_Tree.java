package Level2;

import java.util.HashMap;

public class Skill_Tree {
   public static void main(String[] args) {
      String skill = "CBD";
      String[] Skill_trees = { "BACDE", "CBADF", "AECB", "BDA"};
      
      int ans = solution(skill, Skill_trees);
      System.out.println(ans);
   }

   private static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int count;
        HashMap<Character, Integer> skillt = new HashMap<>(); //선행 skill을 담고있는 hashMap
        
        for(int i=0; i<skill_trees.length; i++) {
           count = 0;
           
            skillt.put(skill.charAt(0), 0);
            for(int k=1; k<skill.length(); k++) skillt.put(skill.charAt(k), 1);
           
           for(int j=0; j<skill_trees[i].length(); j++) {
              if(skillt.getOrDefault((skill_trees[i].charAt(j)),0) != 0) break;
              else if(skill_trees[i].charAt(j) == skill.charAt(count)) {
                 if(count < skill.length()-1) count++;
                 skillt.put(skill.charAt(count), 0);
              }
              if(j == skill_trees[i].length()-1) answer++;
           }
        }
        return answer;
   }
}
