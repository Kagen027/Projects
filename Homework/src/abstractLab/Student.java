package abstractLab;

public class Student extends Person implements Bills{
   
   
    public Student(String username) {
        super(username);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double taxes(double amount) {
        // TODO Auto-generated method stub
        return amount * .02;   
    }

    @Override
    public void gasBill() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void carInsurance() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public String toString() {
        return "Student []";
    }
}