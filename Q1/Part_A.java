public int walkDogs(int hour){
  int result;
  if(DogWalkCompany.numAvailableDogs()>=this.maxDogs){
    result = this.maxDogs;
  } else {
    result = DogWalkCompany.numAvailableDogs();
  }

  updateDogs(hour, result);
  return result;
}
