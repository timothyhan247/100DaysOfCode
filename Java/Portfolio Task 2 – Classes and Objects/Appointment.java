import javax.swing.*;

public class Appointment {

    /**
     * Main Method for run this Appointments Java application
     *
     * @param args
     */

    public static void main(String[] args) {

        // Create Java app object
        Appointment appoint = new Appointment();

        // Create patients
        Patient patient1 = appoint.inputPatientDetails();
        Patient patient2 = appoint.inputPatientDetails();
        Patient patient3 = appoint.inputPatientDetails();

        // Show patients
        appoint.printPatientList(patient1, patient2, patient3);
    }

    /**
     * This method will create and "return" a Patient object back to main().
     * The inputPatientDetails method will call an inputAddress() method that will provide the Address object for each patient object.
     *
     * @return
     */


    public static void inputPatientDetails() {

        String medicareNumber = JOptionPane.showInputDialog("Enter medicare Number");
        String lastName = JOptionPane.showInputDialog("Enter patients last Name");
        Integer age = Integer.parseInt(JOptionPane.showInputDialog("Enter Patients age"));

        // Get patient's Address object
        Address patientAddress = this.inputAddress();

        // Set a patient object with patient's Address object
        Patient patient = new Patient(medicareNumber, lastName, age, patientAddress);
        return patient;
    }

    /**
     * This method build the patient's address object.
     *
     * @rutrn
     */

    public Address inputAddress() {

        String suburb = JOptionPane.showInputDialog("Enter suburb");
        String postCode = JOptionPane.showInputDialog("Enter post code");

        Address address = new Address();
        if(suburb != null && suburb !="") address.setSuburb(suburb);
        if(postCode != null && postCode != "")address.setPostCode(postCode);

        return address;
    }

    /**
     * Show up 3 patients that registered by adult and children
     *
     */
    public void printPatientList(Patient patient1, Patient patient2, Patient patient3) {

        StringBuffer adultMessage = new StringBuffer("");
        StringBuffer childrenMessage = new StringBuffer("");

        StringBuffer message = new StringBuffer("APPOINTMENTS \n\n");

        // Grouping the result by adult and children
        if (patient1.getAge() >=18) {
            adultMessage.append(patient1);
        } else {
            childrenMessage.append(patient1);
        }

        if (patient2.getAge() >= 18) {
            adultMessage.append(patient2);
        } else {
            childrenMessage.append(patient2);
        }

        if(patient3.getAge() >=18) {
            adultMessage.append(patient3);
        } else {
            childrenMessage.append(patient3);
        }

        // Formatting  result to show the registered patients
        message.append("Adults\n");
        message.append(adultMessage.toString());

        message.append("Children\n");
        message.append(childrenMessage.toString());

        JOptionPane.showMessageDialog(null, message.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}


