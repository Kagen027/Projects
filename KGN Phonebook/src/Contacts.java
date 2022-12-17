import java.util.List;
import java.util.ArrayList;

public class Contacts {
    
    private List<Person> contactList = new ArrayList<Person>();

    public Contacts(){
        
    }

    public Contacts(List<Person> contactList) {
        this.contactList = contactList;
    }

    public List<Person> getContactList() {
        return contactList;
    }

    public void setContactList(List<Person> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Contacts [contactList=" + contactList + "]";
    }


    
}

