import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Phonebook {
    static Contacts contacts = new Contacts();
   public static void main(String[] args) {
    displayMenu();
   }
   
   public static void displayMenu(){
    int choice = '0';
    
    Scanner in = new Scanner(System.in);
    while(choice!=5){

    //Command to clear Terminal and bring back to phonebook Main
    System.out.print("\033\143");
    System.out.println("       _____________________________________________________________________ ");
    System.out.println("      /  \\==================================================================\\");
    System.out.println("     | ~~ |==================================================================|");
    System.out.println("     \\\\__/__________________________________________________________________/");
    System.out.println("     /\\__||+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++||");
    System.out.println("    / ___||Welcome to The KGN Book!  Please select an option number.      ||");
    System.out.println("    `----||+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++||");
    System.out.println("         ||1. Add New Contact                                             ||");
    System.out.println("         ||---------------------------------------------------------------||");
    System.out.println("         ||2. Delete A Contact                                            ||");
    System.out.println("         ||---------------------------------------------------------------||");
    System.out.println("         ||3. Update A Contact                                            ||");
    System.out.println("         ||---------------------------------------------------------------||");
    System.out.println("         ||4. Search For Contact                                          ||");
    System.out.println("         ||---------------------------------------------------------------||");
    System.out.println("         ||5. Exit Phonebook                                              ||");
    System.out.println("         ||+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++||");
    System.out.println("         ||                                                               ||");
    System.out.println("         ||                                                               ||");
    System.out.println("         ||                                                               ||");
    System.out.println("         ||  K   K   GGGGGG   NN    N      BBBBB   OOOOOO  OOOOOO  K   K  ||");
    System.out.println("         ||  K  K    G        N N   N      B    B  O    O  O    O  K  K   ||");
    System.out.println("         ||  KKK     G  GGG   N  N  N      BBBBB   O    O  O    O  KKK    ||");
    System.out.println("         ||  K  K    G    G   N   N N      B    b  O    O  O    O  K  K   ||");
    System.out.println("         ||  K   K   GGGGGG   N    NN      BBBBB   OOOOOO  OOOOOO  K   K  ||");
    System.out.println("         ||                                                               ||");
    System.out.println("         ||                                                               ||");
    System.out.println("         ||                                                               ||");
    System.out.println("         ||+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++||");
    System.out.println("         ||Designed and Developed by Kagen Obert                          ||");
    System.out.println("       ,-||===============================================================||");
    System.out.println("      //_||                                                               ||");  
    System.out.println("     |/\\_||===============================================================|| "); 
    System.out.println("     \\\\__//______________________________________________________________//"); 
    System.out.println("      `````                                                                     "); 
    System.out.println("                                                                            "); 


    choice = in.nextInt();
    in.nextLine();

    //Command to clear Terminal and bring back to phonebook Main
    System.out.print("\033\143");
    
    
    switch(choice){
        case 1:
        String input = "f";
        System.out.println("\nNOTE: If pasting multiple contacts from outside source 'IN PROPER FORMAT'");
        System.out.println("Disregard Terminal Display. Press Enter Once to save all content pasted.");
        do{
            System.out.println("\nPlease Enter Contact Information you would like to add. (q to quit)");
            System.out.println("Format: Name Sirname, Adress, City, State, Zipcode, Phone 1231234567");

            System.out.println("");                        //add for space for visual appeal
            String whole = in.nextLine();
            //System.out.println(whole);
            input = whole;

            
            if(input.equals("q")){
                System.out.print("\033\143");
            break;
            }
            else if(!input.equals("q")){
            //Getting all of the input and seperating them by comma    
            ArrayList<String> wholeList = new ArrayList<>(Arrays.asList(whole.split(",")));
            String unformatName = wholeList.get(0);
            String unformatAdress = wholeList.get(1);
            String unformatCity = wholeList.get(2);
            String unformatState = wholeList.get(3);
            String unformatZipcode = wholeList.get(4);
            String unformatPhone = wholeList.get(5);

            //removing unwanted commas and formating phone number to propper layout
            String newName = unformatName.replace(",", "");    
            String newAdress = unformatAdress.replace(",", ""); 
            String newCity = unformatCity.replace(",", ""); 
            String newState = unformatState.replace(",", ""); 
            String newZipcode = unformatZipcode.replace(",", ""); 
            String newPhone = unformatPhone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
            
            //System.out.println("Name: "+newPerson);
            //System.out.println("Adress: "+newAdress);
            //System.out.println("Phone: "+newPhone);

            Person person = new Person(newName, newAdress, newCity, newState, newZipcode, newPhone);
            person.setName(newName);
            person.setAddress(newAdress);
            person.setCity(newCity);
            person.setState(newState);
            person.setZipcode(newZipcode);
            person.setPhone(newPhone);
           
            contacts.getContactList().add(person);
            //System.out.println(contacts);
            }    
                
            
        }while(!input.equals("q")); 
        
            //Command to clear Terminal and bring back to phonebook Main
            System.out.print("\033\143");
        break;


        case 2:
            System.out.println("\nPlease Enter Phone Number of Contact you would like to remove in this format (123) 123-1234");
            String delete = in.nextLine();
            System.out.println();//blank space added for visual appeal

            for(int i = 0; i < contacts.getContactList().size(); i++){
            if(contacts.getContactList().get(i).toString().toLowerCase().contains(delete)){
                System.out.println("\n!!The Contact "+contacts.getContactList().get(i).toString()+" will be removed from KGN book Permanently!!  (To Confirm enter y)");
                String confirm = in.nextLine(); 
                
                if(confirm.equals("y")){
                contacts.getContactList().remove(i); 
                System.out.println("\nContact Deleted");   
                }
                break;
            }
            }
            
            System.out.println("\nPress Enter to return to Main");
            in.nextLine();
            //Command to clear Terminal and bring back to phonebook Main
            System.out.print("\033\143");
        break;
    
       
        case 3:
            System.out.println("\nPlease Enter Phone Number of Contact you would like to update in this format (123) 123-1234.");
            String oldContact = in.nextLine();
            
            for(int i = 0; i < contacts.getContactList().size(); i++){
                if(contacts.getContactList().get(i).toString().toLowerCase().contains(oldContact)){
                    System.out.println("\nThe Contact "+contacts.getContactList().get(i).toString()+" Is being updated.");
                    System.out.println("Please enter updated contact information");
                    System.out.println("\nFormat: Name Sirname, Adress, City, State, Zipcode, Phone 1231234567");
                    String updated = in.nextLine();
                    
                    System.out.println("\n"+contacts.getContactList().get(i).toString());
                    System.out.println("");
                    System.out.println("                   |                        | ");
                    System.out.println("                   |   Will Be Updated To   | ");
                    System.out.println("                   V                        V ");
                    System.out.println("");
                    System.out.println(updated);
                    System.out.println("\nEnter y if this is correct");
                    String confirm2 = in.nextLine();    
                    
                    if(confirm2.equals("y")){
                        //removing Original contact from list
                        contacts.getContactList().remove(i);

                        //reproducing add contact switch now that contact is deleted and adding a new contact as entered by the user
                        ArrayList<String> updatedList = new ArrayList<>(Arrays.asList(updated.split(",")));
                        String updateName = updatedList.get(0);
                        String updateAdress = updatedList.get(1);
                        String updateCity = updatedList.get(2);
                        String updateState = updatedList.get(3);
                        String updateZipcode = updatedList.get(4);
                        String updatePhone = updatedList.get(5);

                        String newName1 = updateName.replace(",", "");    
                        String newAdress1 = updateAdress.replace(",", ""); 
                        String newCity1 = updateCity.replace(",", ""); 
                        String newState1 = updateState.replace(",", ""); 
                        String newZipcode1 = updateZipcode.replace(",", ""); 
                        String newPhone1 = updatePhone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

                        Person updatePerson = new Person(newName1, newAdress1, newCity1, newState1, newZipcode1, newPhone1);
                        updatePerson.setName(newName1);
                        updatePerson.setAddress(newAdress1);
                        updatePerson.setCity(newCity1);
                        updatePerson.setState(newState1);
                        updatePerson.setZipcode(newZipcode1);
                        updatePerson.setPhone(newPhone1);
           
            
                        contacts.getContactList().add(updatePerson);

                        System.out.println("\nContact Succefully updated!");
                    }    
                    break;
                }
                
            }     
            System.out.println("\nPress Enter to return to Main");
            in.nextLine();
            
            //Command to clear Terminal and bring back to phonebook Main
            System.out.print("\033\143");
            
            
           
            
        break;

        
        case 4:
            System.out.println("NOTE: Searching for phone must be in (123) 123-1234 Format");
            System.out.println("Pressing Enter with no Search criteria will return all contacts ");
            System.out.println("\nPlease Enter Information you would like to Search (Ex. First and or Last, City, State, Zipcode, Phone)");

            String search = in.nextLine().toLowerCase();
            System.out.println();//blank line to add space for visual appeal
            

            for (int i = 0; i < contacts.getContactList().size(); i++){
               if(contacts.getContactList().get(i).toString().toLowerCase().contains(search)){
               System.out.println(contacts.getContactList().get(i).toString()); 
               } 
            }
            System.out.println("\nPress enter to return to menu");
            in.nextLine();
            System.out.print("\033\143");
            break;
    
    
        case 5:
            System.out.println("\n                  Thank You for using The KGN Book... The Dopest Phonebook that ever was!            ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");             
            System.out.println("                  GGGGGGGGGGGGG         OOOOOOOOOOOOOOO      OOOOOOOOOOOOOOO     DDDDDDDDDDDDD         ");
            System.out.println("                 GGGGGGGGGGGGGGG       OOOOOOOOOOOOOOOOO    OOOOOOOOOOOOOOOOO    DDDDDDDDDDDDDDD       ");
            System.out.println("                GGGG                   OO             OO    OO             OO    DD           DDD      ");
            System.out.println("               GGGG   GGGGGGGGGGGG     OO             OO    OO             OO    DD            DDD     ");
            System.out.println("               GGGG   GGGGGGGGGGGGG    OO             OO    OO             OO    DD             DDD    ");
            System.out.println("               GGGG           GGGGG    OO             OO    OO             OO    DD             DDD    ");
            System.out.println("                GGGG           GGGG    OO             OO    OO             OO    DD            DDD     ");
            System.out.println("                 GGGG         GGGG     OO             OO    OO             OO    DD           DDD      ");
            System.out.println("                  GGGGGGGGGGGGGGGG     OOOOOOOOOOOOOOOOO    OOOOOOOOOOOOOOOOO    DDDDDDDDDDDDDDD       ");
            System.out.println("                   GGGGGGGGGGGGGG       OOOOOOOOOOOOOOO      OOOOOOOOOOOOOOO     DDDDDDDDDDDDDD        ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                             BBBBBBBBBBBBB     YYYYY            YYYY   EEEEEEEEEEEEE                   ");
            System.out.println("                            BBBBBBBBBBBBBBB      YYYY         YYYY     EEEEEEEEEEEEE                   ");
            System.out.println("                            BB            BBB      YYYY     YYYY       EE                              ");
            System.out.println("                            BB           BBB         YYYYYYYY          EE                              ");
            System.out.println("                            BB  BBBBBBBBB              YYYY            EEEEEEEEE                       ");
            System.out.println("                            BB  BBBBBBBBB              YYYY            EEEEEEEEE                       ");
            System.out.println("                            BB           BBB           YYYY            EE                              ");
            System.out.println("                            BB            BBB          YYYY            EE                              ");
            System.out.println("                            BBBBBBBBBBBBBBB            YYYY            EEEEEEEEEEEEE                   ");
            System.out.println("                             BBBBBBBBBBBBB             YYYY            EEEEEEEEEEEEE                   ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                                                                                                       ");
            System.out.println("                    ~Kagen                                                                             ");
            System.out.println("                                                                                                       ");
        break;
    
    }

    }
    in.close();
}


}

