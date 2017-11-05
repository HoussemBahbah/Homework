



import java.text.SimpleDateFormat;
import java.util.Date;



public class Gift {
    String name;
    String description;
    Date dateGift;

    public Gift(String name, String description, Date dateGift) {
        this.name = name;
        this.description = description;
        this.dateGift = dateGift;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateGift() {
        return dateGift;
    }

   
    @Override
     public String toString() {
        SimpleDateFormat theFormat= new SimpleDateFormat("E MMM dd HH:mm:ss zzz yyyy");
        SimpleDateFormat myFormat= new SimpleDateFormat("dd-MM-yyyy HH:mm");
       Date date=null;
        try {
            date=theFormat.parse(this.dateGift.toString());
       } catch (Exception ex) {
           
       }
      return  "Gift{" + "name=" + name + ", description=" + description + ", dateGift=" +  myFormat.format(date) + '}';
         
         
    }
    
    
}
