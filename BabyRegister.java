


import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class BabyRegister {
    public static void main(String[] args) throws ParseException {
	 SimpleDateFormat myFormat= new SimpleDateFormat("dd-MM-yyyy HH:mm"); 
        Scanner sc = new Scanner(System.in);
         Date day = null;
         String birthday = null;
         String userCommand;
          BabyList babyList=new BabyList();
          GiftList giftList=new GiftList();
          Baby baby3=new Baby("Ivan",myFormat.parse("08-10-2000 12:30").toString(),'M');
          babyList.addBabyList(baby3);
          Baby baby2=new Baby("Alexander",myFormat.parse("08-10-2002 12:30").toString(),'M');
          babyList.addBabyList(baby2);
          Baby baby1=new Baby("Paul",myFormat.parse("04-12-1999 80:30").toString(),'M');
          babyList.addBabyList(baby1);
          
          Gift gift1=new Gift("Paul Dybala","T-shirt",myFormat.parse("08-10-2017 12:30"));
          baby1.babyGifts.addGift(gift1);
          
          
           Gift gift2=new Gift("Edin dzeko","Toy",myFormat.parse("09-10-2017 12:30"));
          baby2.babyGifts.addGift(gift2);
           
          Gift gift3=new Gift("Claudio Marchisio","Tablet",myFormat.parse("15-01-2017 00:00"));
          baby3.babyGifts.addGift(gift3);
        do{
			System.out.println("Say 'exit' 'add', 'listname'  'listage' 'addgift' 'listgift' ");
			 userCommand = sc.nextLine();

			switch(userCommand){
				case "add":
                                {
					System.out.println("enter the name of the baby");
					String name = sc.nextLine();

					System.out.println("enter the birthday of the Baby(DD-MM-YY mm:ss) example 15-01-2017 00:00");
					try{
			 birthday=sc.nextLine();
                                            
                            day = myFormat.parse(birthday);
			birthday=day.toString();
		}catch(ParseException pe){
			System.out.println(pe.toString());
		} 
                                        System.out.println("Say gender of the baby M/F");
					String gender = sc.nextLine();
                                        
                                       Baby  baby=new Baby(name,birthday,gender.charAt(0));
                                        babyList.addBabyList(baby);
                                        System.out.println("Baby added successfuly !");
                                        System.out.println(babyList.getBabyList().toString());
	}break;
               case "listgift":{ 
                    for(Baby baby : babyList.getBabyList()){
                                    System.out.println(baby.getName());
                                    System.out.println(baby.babyGifts.getGifts().toString());
                                    
   }break;
                           
                                
                                }
                case "listname":{ 
                    ArrayList <Baby> sortedBabyList;
                            sortedBabyList=babyList.sortByName();
                            sortedBabyList=sortedBabyList;
                           System.out.println(sortedBabyList.toString());     
                                
                                }break;
                                
                                 case "listage":{ 
                    ArrayList <Baby> sortedBabyList;
                            sortedBabyList=babyList.sortByAge();
                           System.out.println(sortedBabyList.toString());     
                                
                                }break;
               
                case "addgift":{ 
                    
                    { 
					System.out.println("enter the name of the person");
					String name = sc.nextLine();
                                        
                                        
                                        
					System.out.println("enter the name of the baby");
					String babyName = sc.nextLine();

					System.out.println("enter the date of the gift(DD-MM-YY mm:ss) example 15-01-2017 00:00");
					try{
			 String d=sc.nextLine();
                                            
                            day = myFormat.parse(d);
			d=day.toString();
		}catch(ParseException pe){
			System.out.println(pe.toString());
		} 
                                        System.out.println("enter the description of the gift");
					String description = sc.nextLine();
                                        

                                     
                               Gift gift = new Gift(name,description,day);
                               boolean found=false; 
                               for(Baby baby : babyList.getBabyList()){     
                                    if(baby.getName().compareTo(babyName)==0){
                                    baby.babyGifts.addGift(gift);
                                    found =true;
                                    System.out.println("Gift added successfuly !");
                                    }
                              }
                              if (found==false) System.out.println("baby not found");
                                      
                                      
	}
                               
                                
                                }break;
                                
                                case "exit": {break; }
                        
        }
                        }while(userCommand.compareTo("exit")!=0);
        }
}