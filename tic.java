//toplama ile win checkle + draw?
//ayrı method ile toplayip ona gore bosluk ve wincon hesaplama
// itctactoe by uzi & melso


import java.util.Scanner;

public class tic {
    
    public static void malcem(int[][]board, boolean win){
        if(win){
        if(board[2][2]!=1 || board[2][2]!=0){
            if(board[0][2]!=1 || board[0][2]!=0){
                if(board[2][0]!=1 || board[2][0]!=0){
                    for(int i=0;i<10;i++){
            
        }
            }
            }
            
        }else{board[2][2]=1;}
        }
    }

    public static void main(String[] args) {
    int[][] board = new int[3][3];
    for(int z=0;z<3;z++){
        for(int x=0;x<3;x++){
            board[z][x]=5;
        }
    }
    Scanner sc = new Scanner(System.in);

    boolean tr = true;
    boolean win = true;
    board[0][0] = 1;

    while(win){
        int row = sc.nextInt();
        int col = sc.nextInt();
        while(tr){
            row = sc.nextInt();
            col = sc.nextInt();
            if(row >= 0 || row < 3){
                if(col >= 0 || col < 3){
                    tr = false;
                }
            }
        }
        board[row][col]=0;
        tr = true;
    
    }


    sc.close();
    }
}
