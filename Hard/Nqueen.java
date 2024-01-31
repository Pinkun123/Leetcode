import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char borad[][]=new char[n][n];
        // in all colmn and row store *;
        for(int i=0;i<borad.length;i++){
            for(int j=0;j<borad.length;j++){
                borad[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        nQueen(borad,0,ans);
        return ans;
    }

    static void nQueen(char borad[][],int row,List<List<String>> list){
        // base case
        if(row == borad.length){
            list.add(printBorad(borad));
            return;
        }

        for(int j=0;j<borad.length;j++){
            if(isSafe(borad,row,j)){     
            borad[row][j]='Q';
            nQueen(borad, row+1,list); // function call
            borad[row][j]='.'; // backtracking
            }
        }
    }
    // print function
    static List<String>printBorad(char borad[][]){
        List<String> internal = new ArrayList<>();
        for(int i=0;i<borad.length;i++){
            
                String row=new String(borad[i]);
                internal.add(row);
        }
        return internal;
    }

    static boolean isSafe(char borad[][],int row ,int col){
        //check verticaly up
        for(int i=row-1;i>=0;i--){
            if(borad[i][col] =='Q'){
                return false;
            }
        }

        // check left dognal
        for(int i=row-1,j=col-1; i>=0 && j>= 0 ; i--,j--){
            if(borad[i][j]=='Q'){
                return false;
            }
        }

        // check right dogonal

        for(int i=row-1,j=col+1; i>=0 && j<borad.length;i--,j++){
            if(borad [i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}