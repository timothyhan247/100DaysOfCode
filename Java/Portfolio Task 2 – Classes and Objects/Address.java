import javax.swing.*;
/**
 * This class represents for Address Model
 * This class should have fields for : suburb and postcode only.
 * This class should also have two Constructors.
 * A default constructor with the default values of "Melbourne", "3000" and 
   second Constructor that value as Parameters.
 * 
 * @author Hyun Hak Han
 */
public class Address {
    
    private String suburb;
    private String postCode;
    
    public Address() {
        this.suburb = "Melbourne";
        this.postCode = "3000";
    }
    
    private Address inputAddress() {
        String suburb = JOptionPane.showInputDialog("Enter suburb");
        String postCode = JOptionPane.showInputDialog("Enter post code");
        
        Address address = new Address();
        if(!suburb.isEmpty())address.setSuburb(suburb);
        if(!postCode.isEmpty())address.setPostCode(postCode);
        
        return address;
    }
    
    public String getSuburb(){
        return suburb;
    }
    
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
    
    public String getPostCode() {
        return postCode;
    }
    
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}


