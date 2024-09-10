package phonebook;

public class Contact {
    
    String name;
    String number;
    String email;
    
    Contact(String name, String number, String email){
        
        this.name = name;
        this.number = number;
        this.email = email;
  
    }
    
    public String getName() {
            return name;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String getEmail(){
        return email;
    }
    
    //methods to edit
    public void editName(String n){
        name = n;
    }
    
    public void editNumber(String n){
        number = n;
    }
    
    public void editEmail(String n){
        email = n;
    }
    
}
