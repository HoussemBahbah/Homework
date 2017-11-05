


import java.util.ArrayList;


public class GiftList {
    private ArrayList <Gift> gifts;

    public ArrayList<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(ArrayList<Gift> gifts) {
        this.gifts = gifts;
    }

    public GiftList() {
        gifts = new ArrayList<Gift>();
       
    }
    
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int howManyGifts(){
        return gifts.size();
    }
    
    
}
