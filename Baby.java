



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Baby {
   
   String name;
   String birthday;
   char gender;
   GiftList babyGifts;

   
    
    
    public void addBabyList(Gift gift){
        babyGifts.addGift(gift);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Baby(String name, Date birthday, char gender) {
        this.name = name;
        this.birthday = birthday.toString();
        this.gender = gender;
        this.babyGifts = new GiftList();
    }
  
     public Baby(String name, String birthday, char gender) {
       
         this.name = name;
         this.birthday=birthday;
        
        this.gender = gender;
        this.babyGifts = new GiftList();
    }
    
     
     
     boolean isOlder(Baby baby){
         return this.birthday.compareTo(baby.birthday)>0;
     }
     
     long howOld(Baby baby){
       SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss zzz yyyy");
        
Date date = new Date();
Date dateToday=new Date();
dateToday.toInstant();
try{
      
     date = formatter.parse(this.getBirthday());
    

		}catch(ParseException pe){
			System.out.println(pe.toString());
		}catch(Exception e){}
long diff = Math.abs(dateToday.getTime() - date.getTime());
long diffDays = diff / (24 * 60 * 60 * 1000);
return(diffDays); 
     
     
     
     
     }

    @Override
    public String toString() {
        SimpleDateFormat theFormat= new SimpleDateFormat("E MMM dd HH:mm:ss zzz yyyy");
        SimpleDateFormat myFormat= new SimpleDateFormat("dd-MM-yyyy HH:mm");
       Date date=null;
        try {
            date=theFormat.parse(this.birthday);
       } catch (ParseException ex) {
           Logger.getLogger(Baby.class.getName()).log(Level.SEVERE, null, ex);
       }
        return "Baby{" + "name=" + name + ", birthday=" + myFormat.format(date) + ", gender=" + gender + '}';
         
    }
     }