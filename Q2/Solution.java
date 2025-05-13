public class SignedText{
    String lName;
    String fName;
    public SignedText(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }
    public String getSignature(){
        String result = "";
        if(fName.length()>0){
            result+=fName.charAt(0);
            result+="-"
        }
        return result+lName;
    }
    public String addSignature(String Text){
        String result = Text;
        if(result.indexOf(this.getSignature)==0){
            result=result.substring(this.getSignature.length());
            result+=this.getSignature;
        }
        return result;
    }

}
