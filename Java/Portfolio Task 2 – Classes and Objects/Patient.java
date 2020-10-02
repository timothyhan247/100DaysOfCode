

/**
 * This class represents for Patient model
 * This class will have the following properties : MedicareNumber, lastName, age and Address.
 * The address field should be an object supplied by the Address class.
 * 
 * @author Hyun Hak Han
 */
public class Patient {
    
    private String medicalNumber;
    private String lastName;
    private Integer age;
    private Address address;
    
    
    public Patient(){
    }
    
    public Patient(String medicalNumber, String lastName, Integer age, Address address) {
        this.medicalNumber = medicalNumber;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(String medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MedicalNumber : " + medicalNumber 
                + ",Name : " + lastName 
                + ", Age : " + age + "\n"
                + "Address : " + address.getSuburb() + "," + address.getPostCode() + "\n";
    }
    
    
    
}
