/*
Jemma Tiongson
Section #16031
App: CheckerArray (2DArray)
Purpose: Demonstrate ability to program and use nested for loops.
-------------------------------------------------------------------------

Terminal:
   Compile: javac CheckerArray.java
   Run: java CheckerArray
_________________________________________________________________________
*/

class CheckerArray{
   public static void main (String [] args){
      final int BLANK = 0;
      final int WHITE = 1;
      final int BLUE = 2;
      
      int [][] checkerArr = new int [8][8];
      
      //filling in blank spaces
      for(int i =0; i<checkerArr.length; i++) {
         for (int j = 0; j < checkerArr.length; j++) {
            checkerArr[i][j] = BLANK;
            if(i%2 == 0 && j%2 ==0){
               checkerArr[i][j] = WHITE;
            }
            if(i%2 != 0 && j%2 != 0){
               checkerArr[i][j] = WHITE;
            }
            if(i > 2 && i < 5){
               checkerArr[i][j] = BLANK;
            }
            if(i > 4){
               if(i%2 == 0 && j%2 ==0){
                  checkerArr[i][j] = BLUE;
               }
               if(i%2 != 0 && j%2 != 0){
                  checkerArr[i][j] = BLUE;
               }
            }
            System.out.print(checkerArr[i][j]+ " ");
            if(j == checkerArr.length-1){
               System.out.println();
            }
         }
      }
   }
}