package abstractLab;

public abstract class Person {
   

  
    public abstract double taxes(double amount);
    private String username;
 
 
    public Person(String username) {
       this.username = username;
    }
 
 
    public double calculateTelePhoneBill(double amount){
         return this.taxes(amount) + amount;
      }
     
      
      public double calculateAllOtherBills(double amount){
         return this.taxes(amount) + amount;
      }
 
 
     @Override
     public String toString() {
         return "Person []";
     }
 
 
    public String getUsername() {
       return username;
    }
 
 
    public void setUsername(String username) {
       this.username = username;
    }
 
 
 
 }
 