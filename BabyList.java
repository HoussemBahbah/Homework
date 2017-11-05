


import java.util.ArrayList;


public class BabyList {
    private ArrayList <Baby> babyList;

    public ArrayList<Baby> getBabyList() {
        return babyList;
    }

    public void setBabyList(ArrayList<Baby> babyList) {
        this.babyList = babyList;
    }

    public BabyList() {
        babyList = new ArrayList<Baby>();
       
    }
    
    
    public void addBabyList(Baby baby){
        babyList.add(baby);
    }
    
    public int howManyBabyList(){
        return babyList.size();
    }
     
    
    
    public ArrayList<Baby> sortByName(){	
		for(int i=0; i<babyList.size()-1; i++){
			for(int j=i+1; j<babyList.size(); j++){
				Baby s1 = babyList.get(i);
				Baby s2 = babyList.get(j);
				if(s1.getName().compareTo(s2.getName())>0){
					Baby aux = s1;
					babyList.set(j,aux);
					babyList.set(i, s2);
				}
				
			}
		}
return babyList;	
    }
    
    
    
    
    
     public ArrayList<Baby> sortByAge(){	
		for(int i=0; i<babyList.size()-1; i++){
			for(int j=i+1; j<babyList.size(); j++){
				Baby s1 = babyList.get(i);
				Baby s2 = babyList.get(j);
				if(s1.howOld(s1)<(s2.howOld(s2))){
					Baby aux = s1;
					babyList.set(j,aux);
					babyList.set(i, s2);
				}
				
			}
		}
return babyList;	
    }
    
    
    
    
    
}
