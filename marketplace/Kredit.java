public class Kredit {
    private String number;
    private String type;
    private String expDate;

    public Kredit(String number,String type,String expDate){
        this.number = number;
        this.type = type;
        this.expDate = expDate;
    }

public void autorized(String number,String type,String expDate){
    this.number= number;
   this.type = type;
   this.expDate = expDate;
}
}
