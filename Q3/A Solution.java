public Round(String[] name){
    for(int x = 0; x<name.length; x++){
        competitor obj1 = new competitor(name[x], x+1);
        competitorList.add(obj1);
    }
}
