public SumOrSameGame(int numRows, int numCols){
  puzzle = new int[numRows][numCols];
  for(int a = 0; a<numRow; a++) {
      for(int b = 0; b<numCols; b++) {
        puzzle[a][b] = (int)(Math.random()*9+1);
      }
  }
}
