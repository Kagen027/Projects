package abstractLab;

public class Employee extends Person implements Bills{
    
    
    public Employee(String username) {
        super(username);
        //TODO Auto-generated constructor stub
    }
    @Override
    public double taxes(double amount) {
        // TODO Auto-generated method stub
        return amount * .20;
    }
    @Override
    public void gasBill() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void carInsurance() {
        // TODO Auto-generated method stub
        
    }



}

