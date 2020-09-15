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
        
        for(int i=0; i<moves.length; i++) { //moves �� �ִ� ���ҵ��� �ϳ��� ����.
        	for(int j=0; j < board.length; j++) {
        		if(board[j][moves[i]-1] == 0) continue;  //moves���� board�� ������ ������ ���� Ž���Ѵ�.
        		else {
        			if(!basket.isEmpty()) { //���ÿ� ���� ����ִٸ�
        				peek = basket.peek(); //���� ������ ������
        				if(peek == board[j][moves[i]-1]) { // �´´ٸ�
        					answer += 2;
        					basket.pop();
                			board[j][moves[i]-1] = 0;
            				break;
        				}else { // ���� ������
            				basket.push(board[j][moves[i]-1]);
                			board[j][moves[i]-1] = 0;
            				break;
        				}
        			}else { // ���ÿ� ���� ������� ������
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


