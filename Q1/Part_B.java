public int dogWalkShift(int startHour, int endHour){
  int result = 0;
  
  for(int x = startHour; x<=endHour; x++){
    int numWalk = walkDogs(x);
    result += 5*3
    if(numWalk=this.maxDogs){
      result+=3;
    }
  }
  return result;
}
