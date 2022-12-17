package abstractLab;

public class Application {
    
    public static void main(String[] args) {
        School claim = new School();
         Student s1 = new Student("Jimmy");
         Employee e1 = new Employee("John");
         Person p1 = new Student("Jack");
         Person p2 = new Employee("Jeff");
     
         
     
     
         double stuTellPhoneBill = s1.calculateTelePhoneBill(120.5);
         System.out.println(stuTellPhoneBill);
     
         double empTellPhoneBill = e1.calculateTelePhoneBill(120.5);
         System.out.println(empTellPhoneBill);
     
         double p1TellPhoneBill = p1.calculateTelePhoneBill(120.5);
         System.out.println(p1TellPhoneBill);
     
         double p2TellPhoneBill = p2.calculateTelePhoneBill(120.5);
         System.out.println(p2TellPhoneBill);
     
         System.out.println(p1.getUsername());
         System.out.println(p2.getUsername());
         System.out.println(e1.getUsername());
         System.out.println(s1.getUsername());
     
        claim.getStudents().add(s1);
        claim.getEmployees().add(e1);
         
       
        } 
     }
     
