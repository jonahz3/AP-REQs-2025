public ArrayList<Match> buildMatches(){
    ArrayList<Match> result = new ArrayList();
    ArrayList<Competitor> newList = competitorList;
    if(newList.size()%2!=0){
        newList.remove(0);
    }
    for(int x = 0; x>newList.size()/2;x++){
        Match obj1 = new Match(newList.get(x), newList.get((newList.size()-x));
        result.add(obj1);
    }
    return result;
}
