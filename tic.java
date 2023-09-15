//toplama ile win checkle + draw?
//ayrı method ile toplayip ona gore bosluk ve wincon hesaplama
// itctactoe by uzi & melso


import java.util.Scanner;

public class tic {

    public static void placecheck(int[][] board, boolean win){
        if(board[0][0]+board[0][1]+board[0][2]==5||board[0][0]+board[0][1]+board[0][2]==7){
            for(int i=0;i<3;i++){
                if(board[0][i]==5){
                    board[0][i]=1;
                    i=5;
                }
            }
        }else if(board[1][0]+board[1][1]+board[1][2]==5||board[1][0]+board[1][1]+board[1][2]==7){
            for(int i=0;i<3;i++){
                if(board[1][i]==5){
                    board[1][i]=1;
                    i=5;
                }
            }
        }else if(board[2][0]+board[2][1]+board[2][2]==5||board[2][0]+board[2][1]+board[2][2]==7){
            for(int i=0;i<3;i++){
                if(board[2][i]==5){
                    board[2][i]=1;
                    i=5;
                }
            }
        }else if(board[0][0]+board[1][0]+board[2][0]==5||board[0][0]+board[1][0]+board[2][0]==7){
            for(int i=0;i<3;i++){
                if(board[i][0]==5){
                    board[i][0]=1;
                    i=5;
                }
            }
        }else if(board[0][1]+board[1][1]+board[2][1]==5||board[0][1]+board[1][1]+board[2][1]==7){
            for(int i=0;i<3;i++){
                if(board[i][1]==5){
                    board[i][1]=1;
                    i=5;
                }
            }
        }else if(board[0][2]+board[1][2]+board[2][2]==3||board[0][2]+board[1][2]+board[2][2]==0){
            for(int i=0;i<3;i++){
                if(board[i][2]==5){
                    board[i][2]=1;
                    i=5;
                }
            }
        }else if(board[0][0]+board[1][1]+board[2][2]==3||board[0][0]+board[1][1]+board[2][2]==0){
            for(int i=0;i<3;i++){
                if(board[i][i]==5){
                    board[i][i]=1;
                    i=5;
                }
            }
        }else if(board[0][2]+board[1][1]+board[2][0]==3||board[0][2]+board[1][1]+board[2][0]==0){
            for(int i=0;i<3;i++){
                if(board[i][2-i]==5){
                    board[i][2-i]=1;
                    i=5;
                }
            }
        }else if(board[2][2]==5){
            board[2][2]=1;
        }else if(board[2][0]==5){
            board[2][0]=1;
        }else if(board[0][2]==5){
            board[0][2]=1;
        }else{
            for(int i=0;i<3;i++){
                 for(int z=0;z<3;z++){
                    if(board[i][z]==5){
                        board[i][z]=1;
                        z=3;
                        i=3;
                    }
                 }
                }
        }
    }

    public static void wincheck(int[][] board, boolean win){
        if(board[0][0]+board[0][1]+board[0][2]==3||board[0][0]+board[0][1]+board[0][2]==0){
            win = false;
        }else if(board[1][0]+board[1][1]+board[1][2]==3||board[1][0]+board[1][1]+board[1][2]==0){
            win = false;
        }else if(board[2][0]+board[2][1]+board[2][2]==3||board[2][0]+board[2][1]+board[2][2]==0){
            win = false;
        }else if(board[0][0]+board[1][0]+board[2][0]==3||board[0][0]+board[1][0]+board[2][0]==0){
            win = false;
        }else if(board[0][1]+board[1][1]+board[2][1]==3||board[0][1]+board[1][1]+board[2][1]==0){
            win = false;
        }else if(board[0][2]+board[1][2]+board[2][2]==3||board[0][2]+board[1][2]+board[2][2]==0){
            win = false;
        }else if(board[0][0]+board[1][1]+board[2][2]==3||board[0][0]+board[1][1]+board[2][2]==0){
            win = false;
        }else if(board[0][2]+board[1][1]+board[2][0]==3||board[0][2]+board[1][1]+board[2][0]==0){
            win = false;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] board = new int[3][3];
    for(int z=0;z<3;z++){
        for(int x=0;x<3;x++){
            board[z][x]=5;
        }
    }
    int count = 0;
    boolean tr = true;
    boolean win = true;
    board[0][0] = 1;

    while(win){
        count++;
        if(count == 9){
            System.out.println("Draw");
            System.exit(0);
        }
        int row = sc.nextInt();
        int col = sc.nextInt();
        while(tr){
            row = sc.nextInt();
            col = sc.nextInt();
            if(row >= 0 && row < 3){
                if(col >= 0 && col < 3){
                    if(board[row][col]==5){
                        tr = false;
                        board[row][col]=0;
                        System.out.println("placed");
                    }
                }
            }
        }
        tr = true;
        wincheck(board, win);
        if(!win){
            System.out.println("game over!");
            System.exit(1);
        }
        placecheck(board, win);
    }


    sc.close();
    }
}
