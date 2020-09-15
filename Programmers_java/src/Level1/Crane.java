package Level1;

import java.util.Stack;

public class Crane {
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = Solution(board, moves);
		
		System.out.println(answer);
	}

	private static int Solution(int[][] board, int[] moves) {
        int peek;
		int answer = 0;
        Stack<Integer> basket = new Stack<Integer>();
        
        for(int i=0; i<moves.length; i++) { //moves 에 있는 원소들을 하나씩 뺐다.
        	for(int j=0; j < board.length; j++) {
        		if(board[j][moves[i]-1] == 0) continue;  //moves행의 board의 값들을 위에서 부터 탐색한다.
        		else {
        			if(!basket.isEmpty()) { //스택에 값이 들어있다면
        				peek = basket.peek(); //제일 윗것을 빼보고
        				if(peek == board[j][moves[i]-1]) { // 맞는다면
        					answer += 2;
        					basket.pop();
                			board[j][moves[i]-1] = 0;
            				break;
        				}else { // 맞지 않으면
            				basket.push(board[j][moves[i]-1]);
                			board[j][moves[i]-1] = 0;
            				break;
        				}
        			}else { // 스택에 값이 들어있지 않으면
        				basket.push(board[j][moves[i]-1]);
            			board[j][moves[i]-1] = 0;
        				break;
        			}
        		}

        	}
        }
        return answer;
	}
}


