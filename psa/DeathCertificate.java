
package psa;
import java.util.*;
import static psa.PSA.performRegistration;
public class DeathCertificate extends Receipt{
   private String deceasedFirstName;
    private String deceasedMiddleName;
    private String deceasedLastName;
    private char gender;
    private String dateOfDeath;
    private String placeOfDeathName;
    private String placeOfDeathCity;
    private String placeOfDeathProvince;
 public String getDeceasedFirstName() {
        return deceasedFirstName;
    }

    public void setDeceasedFirstName(String deceasedFirstName) {
        this.deceasedFirstName = deceasedFirstName;
    }

    public String getDeceasedMiddleName() {
        return deceasedMiddleName;
    }

    public void setDeceasedMiddleName(String deceasedMiddleName) {
        this.deceasedMiddleName = deceasedMiddleName;
    }

    public String getDeceasedLastName() {
        return deceasedLastName;
    }

    public void setDeceasedLastName(String deceasedLastName) {
        this.deceasedLastName = deceasedLastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getPlaceOfDeathName() {
        return placeOfDeathName;
    }

    public void setPlaceOfDeathName(String placeOfDeathName) {
        this.placeOfDeathName = placeOfDeathName;
    }

    public String getPlaceOfDeathCity() {
        return placeOfDeathCity;
    }

    public void setPlaceOfDeathCity(String placeOfDeathCity) {
        this.placeOfDeathCity = placeOfDeathCity;
    }

    public String getPlaceOfDeathProvince() {
        return placeOfDeathProvince;
    }

    public void setPlaceOfDeathProvince(String placeOfDeathProvince) {
        this.placeOfDeathProvince = placeOfDeathProvince;
    }
    public void inputInformation(Scanner scanner) {
        
        System.out.print("Enter Deceased's First Name: ");
        String deceasedFirstName = scanner.nextLine().toUpperCase();
        setDeceasedFirstName(deceasedFirstName);
        System.out.print("Enter Deceased's Middle Name: ");
        
        String deceasedMiddleName = scanner.nextLine().toUpperCase();
        setDeceasedMiddleName(deceasedMiddleName);
        System.out.print("Enter Deceased's Last Name: ");
        String deceasedLastName = scanner.nextLine().toUpperCase();
        setDeceasedLastName (deceasedLastName);
        System.out.print("Enter Gender (f/m): ");
        char gender = scanner.nextLine().toUpperCase().charAt(0);
        setGender (gender);
        System.out.print("Enter Date of Death (MM/DD/YYYY): ");
        String dateOfDeath = scanner.nextLine().toUpperCase();
        setDateOfDeath (dateOfDeath);
        System.out.print("Enter Place of Death (Name of Hospital/Clinic/Institution): ");
        String placeOfDeathName = scanner.nextLine().toUpperCase();
        setPlaceOfDeathName (placeOfDeathName);
        System.out.print("Enter Place of Death (City/Municipality): ");
        String placeOfDeathCity = scanner.nextLine().toUpperCase();
        setPlaceOfDeathCity (placeOfDeathCity);
        System.out.print("Enter Place of Death (Province): ");
        String placeOfDeathProvince = scanner.nextLine().toUpperCase();
        setPlaceOfDeathProvince (placeOfDeathProvince);
    }

    public void displayInformation() {
        System.out.println("1a. Deceased's First Name: " + deceasedFirstName);
        System.out.println("1b. Deceased's Middle Name: " + deceasedMiddleName);
        System.out.println("1c. Deceased's Last Name: " + deceasedLastName);
        System.out.println("2. Gender: " + gender);
        System.out.println("3. Date of Death: " + dateOfDeath);
        System.out.println("4a. Place of Death (Name of Hospital/Clinic/Institution): " + placeOfDeathName);
        System.out.println("4b. Place of Death (City/Municipality): " + placeOfDeathCity);
        System.out.println("4c. Place of Death (Province): " + placeOfDeathProvince);
    }

    public void editInformation(String rowToEdit, Scanner scanner) {
        switch (rowToEdit) {
            case "1a":
                System.out.print("Edit 1a. Enter Deceased's First Name: ");
                this.deceasedFirstName = scanner.nextLine().toUpperCase();
                break;
            case "1b":
                System.out.print("Edit 1b. Enter Deceased's Middle Name: ");
                this.deceasedMiddleName = scanner.nextLine().toUpperCase();
                break;
            case "1c":
                System.out.print("Edit 1c. Enter Deceased's Last Name: ");
                this.deceasedLastName = scanner.nextLine().toUpperCase();
                break;
            case "2":
                System.out.print("Edit 2. Enter Gender (f/m): ");
                this.gender = scanner.nextLine().toUpperCase().charAt(0);
                break;
            case "3":
                System.out.print("Edit 3. Enter Date of Death (MM/DD/YYYY): ");
                this.dateOfDeath = scanner.nextLine().toUpperCase();
                break;
            case "4a":
                System.out.print("Edit 4a. Enter Place of Death (Name of Hospital/Clinic/Institution): ");
                this.placeOfDeathName = scanner.nextLine().toUpperCase();
                break;
            case "4b":
                System.out.print("Edit 4b. Enter Place of Death (City/Municipality): ");
                this.placeOfDeathCity = scanner.nextLine().toUpperCase();
                break;
            case "4c":
                System.out.print("Edit 4c. Enter Place of Death (Province): ");
                this.placeOfDeathProvince = scanner.nextLine().toUpperCase();
                break;
            default:
                System.out.println("Invalid choice. No edits were made.");
        }
    }
    public void CombinedInformation(){
         Receipt n = new Receipt();
        Scanner scanner = new Scanner(System.in);
        try {
    System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            Thread.sleep(300); 
    System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
    System.out.println("                                                                                                    Republic Of The Philippines                                                                                                                                   ");
            Thread.sleep(300); 
    System.out.println("                                                                                               OFFICE OF THE DEATH CERTIFICATE GENERAL                                                                                                                              ");
             Thread.sleep(300); 
    System.out.println("                                                                                                   CERTIFICATE OF DEATH CERTIFICATE");
           Thread.sleep(300); 
    System.out.printf("                                                       =======================================================================================================================                                       ");
             Thread.sleep(300); 
    System.out.printf("                                                         Name of Death Name                                   | %-30s ", getDeceasedFirstName() + " " + getDeceasedMiddleName() + " " + getDeceasedLastName());
             Thread.sleep(300);     
             System.out.println("       ");
    System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
            System.out.println("");
    System.out.printf("                                                         Place of Death (City/Municipality)                   | %-30s ", getPlaceOfDeathCity() + " " + "");
            Thread.sleep(300); 
            System.out.println("");
    System.out.println("                                                       =======================================================================================================================                                       ");
             Thread.sleep(300); 
             System.out.println("");
    System.out.printf("                                                         Place of Death (Province)                             | %-30s ", getPlaceOfDeathProvince() + "");
             Thread.sleep(300); 
             System.out.println("");
    System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
            System.out.println("");
    System.out.printf("                                                         Sex (Male/Female)                                     | %-30s ", getGender() +"");
             Thread.sleep(300); 
             System.out.println("");
    System.out.println("                                                       =======================================================================================================================                                       ");
           Thread.sleep(300); 
            System.out.println("");
    System.out.printf("                                                         Date of Death                                         | %-30s", getDateOfDeath() + "");
            Thread.sleep(300); 
            System.out.println("");
    System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
            System.out.println("");
    System.out.printf("                                                         Place of Death (Name of Hospital/Clinic/Institution)     | %-30s ", getPlaceOfDeathProvince() + "");
            Thread.sleep(300); 
            System.out.println("");
    System.out.println("                                                       =======================================================================================================================                                       ");
          Thread.sleep(300); 
            System.out.println("");
            
        System.out.println("Do you want to register again?: ");
        String entry = scanner.nextLine().toUpperCase();

        switch (entry) {
            case "YES":
                PSA.performRegistration();
                break;
            case "NO":
               
                    System.out.print("[1] Pickup [2] Delivery - ");
                    int choose = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character left by nextInt()

                    if (choose == 1) {
                        System.out.println("Waiting for the process of Pickup: ");
                       
                        n.PickUpReceiptPSA();
                    } else if (choose == 2) {
                        System.out.println("Waiting for the process of Delivery: ");
                  
                        n.DeliveryreceiptPSA();
                    } else {
                        System.out.println("Wrong Number:");
                    }
                default:
                System.out.println("Invalid input. Please enter either 'YES' or 'NO'.");
                }
             
         
        } catch (InterruptedException e) {
            e.printStackTrace();
    

    
               
  
             }

    }

}
