
package psa;
import java.util.*;
import static psa.PSA.performRegistration;

public class BirthCertificate extends BirthCertificateStorage{
   private String registrationNumber;
    private static  String firstName; 
    private String middleName;
    private String lastName;
    private char sex;
    private int dateOfBirth;
    private String placeOfBirthName;
    private String placeOfBirthCity;
    private String placeOfBirthProvince;

    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;
    private String motherCitizenship;
    private String motherReligion;
    private String motherOccupation;
    private int motherAgeAtBirth;
    private String motherResidence;
    private String motherCity;
    private String motherProvince;

    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherLastName;
    private String fatherCitizenship;
    private String fatherReligion;
    private String fatherOccupation;
    private int fatherAgeAtBirth;
    private String fatherResidence;
    private String fatherCity;
    private String fatherProvince;
 
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirthName() {
        return placeOfBirthName;
    }

    public void setPlaceOfBirthName(String placeOfBirthName) {
        this.placeOfBirthName = placeOfBirthName;
    }

    public String getPlaceOfBirthCity() {
        return placeOfBirthCity;
    }

    public void setPlaceOfBirthCity(String placeOfBirthCity) {
        this.placeOfBirthCity = placeOfBirthCity;
    }

    public String getPlaceOfBirthProvince() {
        return placeOfBirthProvince;
    }

    public void setPlaceOfBirthProvince(String placeOfBirthProvince) {
        this.placeOfBirthProvince = placeOfBirthProvince;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getMotherCitizenship() {
        return motherCitizenship;
    }

    public void setMotherCitizenship(String motherCitizenship) {
        this.motherCitizenship = motherCitizenship;
    }

    public String getMotherReligion() {
        return motherReligion;
    }

    public void setMotherReligion(String motherReligion) {
        this.motherReligion = motherReligion;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public int getMotherAgeAtBirth() {
        return motherAgeAtBirth;
    }

    public void setMotherAgeAtBirth(int motherAgeAtBirth) {
        this.motherAgeAtBirth = motherAgeAtBirth;
    }

    public String getMotherResidence() {
        return motherResidence;
    }

    public void setMotherResidence(String motherResidence) {
        this.motherResidence = motherResidence;
    }

    public String getMotherCity() {
        return motherCity;
    }

    public void setMotherCity(String motherCity) {
        this.motherCity = motherCity;
    }

    public String getMotherProvince() {
        return motherProvince;
    }

    public void setMotherProvince(String motherProvince) {
        this.motherProvince = motherProvince;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getFatherCitizenship() {
        return fatherCitizenship;
    }

    public void setFatherCitizenship(String fatherCitizenship) {
        this.fatherCitizenship = fatherCitizenship;
    }

    public String getFatherReligion() {
        return fatherReligion;
    }

    public void setFatherReligion(String fatherReligion) {
        this.fatherReligion = fatherReligion;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public int getFatherAgeAtBirth() {
        return fatherAgeAtBirth;
    }

    public void setFatherAgeAtBirth(int fatherAgeAtBirth) {
        this.fatherAgeAtBirth = fatherAgeAtBirth;
    }

    public String getFatherResidence() {
        return fatherResidence;
    }

    public void setFatherResidence(String fatherResidence) {
        this.fatherResidence = fatherResidence;
    }

    public String getFatherCity() {
        return fatherCity;
    }

    public void setFatherCity(String fatherCity) {
        this.fatherCity = fatherCity;
    }

    public String getFatherProvince() {
        return fatherProvince;
    }

    public void setFatherProvince(String fatherProvince) {
        this.fatherProvince = fatherProvince;
    }
    public void displayInformation() {
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Child's Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1a. First Name: " + getFirstName());
        System.out.println("1b. Middle Name: " + getMiddleName());
        System.out.println("1c. Last Name: " + getLastName());
        System.out.println("2. Sex: " + getSex());
        System.out.println("3. Date of Birth: " + getDateOfBirth());
        System.out.println("4a. Place of Birth (Name of Hospital/Clinic/Institution): " + getPlaceOfBirthName());
        System.out.println("4b. Place of Birth (City/Municipality): " + getPlaceOfBirthCity());
        System.out.println("4c. Place of Birth (Province): " + getPlaceOfBirthProvince());

         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Mother's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nMother's Information:");
        System.out.println("4l. Mother's First Name: " + getMotherFirstName());
        System.out.println("4m. Mother's Middle Name: " + getMotherMiddleName());
        System.out.println("4q. Mother's Last Name: " + getMotherLastName());
        System.out.println("5a. Mother's Citizenship: " + getMotherCitizenship());
        System.out.println("5b. Mother's Religion: " + getMotherReligion());
        System.out.println("5c. Mother's Occupation: " + getMotherOccupation());
        System.out.println("5d. Mother's Age at the time of this birth: " + getMotherAgeAtBirth());
        System.out.println("5e. Mother's Residence: " + getMotherResidence());
        System.out.println("5f. Mother's City: " + getMotherCity());
        System.out.println("5g. Mother's Province: " + getMotherProvince());
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Father's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nFather's Information:");
        System.out.println("5l. Father's First Name: " + getFatherFirstName());
        System.out.println("5m. Father's Middle Name: " + getFatherMiddleName());
        System.out.println("5q. Father's Last Name: " + getFatherLastName());
         System.out.println("6a. Father's Citizenship: " + getFatherCitizenship());
        System.out.println("6b. Father's Religion: " + getFatherReligion());
        System.out.println("6c. Father's Occupation: " + getFatherOccupation());
        System.out.println("6d. Father's Age at the time of this birth: " + getFatherAgeAtBirth());
        System.out.println("6e. Father's Residence: " + getFatherResidence());
        System.out.println("6f. Father's City: " + getFatherCity());
        System.out.println("6g. Father's Province: " + getFatherProvince());
    }

    public void editInformation(String rowToEdit, Scanner scanner) {
        switch (rowToEdit) {
             case "1a":
                System.out.print("1a. Enter your First Name: ");
                this.firstName = scanner.nextLine();
                break;
            case "1b":
                System.out.print("1b. Enter your Middle Name: ");
                this.middleName = scanner.nextLine();
                break;
            case "1c":
                System.out.print("1c. Enter your Last Name: ");
                this.lastName = scanner.nextLine();
                break;
            case "2":
                System.out.print("2. Enter your Sex (f/m): ");
                this.sex = scanner.nextLine().charAt(0);
                break;
            case "3":
                System.out.print("3. Enter your Date of Birth (MM/DD/YYYY): ");
                this.dateOfBirth = scanner.nextInt();
                break;
            case "4a":
                System.out.print("4a. Enter Place of Birth (Name of Hospital/Clinic/Institution): ");
                this.placeOfBirthName = scanner.nextLine();
                break;
            case "4b":
                System.out.print("4b. Enter Place of Birth (City/Municipality): ");
                this.placeOfBirthCity = scanner.nextLine();
                break;
            case "4c":
                System.out.print("4c. Enter Place of Birth (Province): ");
                this.placeOfBirthProvince = scanner.nextLine();
                break;
           
            case "4l":
                System.out.println("4l. Enter First Name of your Mother: ");
                this.motherFirstName = scanner.nextLine();
                break;
            case "4m":
                System.out.println("4m. Enter Middle Name of your Mother: ");
                this.motherMiddleName = scanner.nextLine();
                break;
            case "4q":
                System.out.println("4q. Enter Last Name of your Mother: ");
                this.motherLastName = scanner.nextLine();
                break;
            case "5a":
                System.out.print("5a. Enter Mother's Citizenship: ");
                this.motherCitizenship = scanner.nextLine();
                break;
            case "5b":
                System.out.print("5b. Enter Mother's Religion: ");
                this.motherReligion = scanner.nextLine();
                break;
            case "5c":
                System.out.print("5c. Enter Mother's Occupation: ");
                this.motherOccupation = scanner.nextLine();
                break;
            case "5d":
                System.out.print("5d. Enter Mother's Age at Birth: ");
                this.motherAgeAtBirth = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                break;
            case "5e":
                System.out.print("5e. Enter Mother's Residence: ");
                this.motherResidence = scanner.nextLine();
                break;
            case "5f":
                System.out.print("5f. Enter Mother's City: ");
                this.motherCity = scanner.nextLine();
                break;
            case "5g":
                System.out.print("5g. Enter Mother's Province: ");
                this.motherProvince = scanner.nextLine();
                break;
            case "5l" :
                System.out.println("5l. Enter First Name of your Father: ");
                this.fatherFirstName = scanner.nextLine();
                break;
            case "5m":
                System.out.println("5m. Enter Middle Name of your Father: ");
                this.fatherMiddleName = scanner.nextLine();
                break;
            case "5q":
                System.out.println("5q. Enter Last Name of your Father: ");
                this.fatherLastName = scanner.nextLine();
                break;
            case "6a":
                System.out.print("Edit 6a. Enter Father's Citizenship: ");
                this.fatherCitizenship = scanner.nextLine();
                break;
            case "6b":
                System.out.print("Edit 6b. Enter Father's Religion: ");
                this.fatherReligion = scanner.nextLine();
                break;
            case "6c":
                System.out.print("Edit 6c. Enter Father's Occupation: ");
                this.fatherOccupation = scanner.nextLine();
                break;
            case "6d":
                System.out.print("Edit 6d. Enter Father's Age at Birth: ");
                this.fatherAgeAtBirth = scanner.nextInt();
                scanner.nextLine();
                break;
            case "6e":
                System.out.print("Edit 6e. Enter Father's Residence: ");
                this.fatherResidence = scanner.nextLine();
                break;
            case "6f":
                System.out.print("Edit 6f. Enter Father's City: ");
                this.fatherCity = scanner.nextLine();
                break;
            case "6g":
                System.out.print("Edit 6g. Enter Father's Province: ");
                this.fatherProvince = scanner.nextLine();
                break;

            default:
                System.out.println("Invalid choice. No edits were made.");
        }
    }
 public void inputInformation(Scanner scanner) {
     
   System.out.print("Enter First Name: ");
        this.firstName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Middle Name: ");
        this.middleName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Last Name: ");
        this.lastName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Sex (f/m): ");
        this.sex = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Enter Date of Birth (MM/DD/YYYY): ");
        this.dateOfBirth = scanner.nextInt();

        System.out.print("Enter Place of Birth (Name of Hospital/Clinic/Institution): ");
        this.placeOfBirthName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Birth (City/Municipality): ");
        this.placeOfBirthCity =scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Birth (Province): ");
        this.placeOfBirthProvince = scanner.nextLine().toUpperCase();
   
    
}
    public void inputMotherInformation(Scanner scanner) {
        System.out.print("Enter Mother's First Name: ");
        String motherFirstName = scanner.nextLine().toUpperCase();
        setMotherFirstName(motherFirstName);

        System.out.print("Enter Mother's Middle Name: ");
        String motherMiddleName = scanner.nextLine().toUpperCase();
        setMotherMiddleName(motherFirstName);
        
        System.out.print("Enter Mother's Last Name: ");
        String motherLastName = scanner.nextLine().toUpperCase();
        setMotherLastName(motherLastName);
        
        System.out.print("Enter Mother's Citizenship: ");
        String motherCitizenship = scanner.nextLine().toUpperCase();
        setMotherCitizenship(motherCitizenship);
        
        System.out.print("Enter Mother's Religion: ");
        String motherReligion = scanner.nextLine().toUpperCase();
        setMotherReligion(motherReligion);
        
        System.out.print("Enter Mother's Occupation: ");
        String motherOccupation = scanner.nextLine().toUpperCase();
        setMotherOccupation(motherOccupation);
        
        System.out.print("Enter Mother's Age at Birth: ");
        int motherAgeAtBirth = scanner.nextInt();
        scanner.nextLine(); 
        setMotherAgeAtBirth(motherAgeAtBirth);

        System.out.print("Enter Mother's Residence: ");
        String motherResidence = scanner.nextLine().toUpperCase();
        setMotherResidence(motherResidence);
        
        System.out.print("Enter Mother's City: ");
        String motherCity =scanner.nextLine().toUpperCase();
        setMotherCity(motherCity);

        System.out.print("Enter Mother's Province: ");
        String motherProvince = scanner.nextLine().toUpperCase();
        setMotherProvince(motherProvince);
        
    }

   
    public void inputFatherInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Father's First Name: ");
        String fatherFirstName = scanner.nextLine().toUpperCase();
        setFatherFirstName(fatherFirstName);
        
        System.out.print("Enter Father's Middle Name: ");
        String fatherMiddleName = scanner.nextLine().toUpperCase();
        setFatherMiddleName(fatherMiddleName);
        
        System.out.print("Enter Father's Last Name: ");
        String fatherLastName = scanner.nextLine().toUpperCase();
        setFatherLastName(fatherLastName);
        
        System.out.print("Enter Father's Citizenship: ");
        String fatherCitizenship = scanner.nextLine().toUpperCase();
        setFatherCitizenship(fatherCitizenship);
        
        System.out.print("Enter Father's Religion: ");
        String fatherReligion = scanner.nextLine().toUpperCase();
        setFatherReligion(fatherReligion);
        
        System.out.print("Enter Father's Occupation: ");
        String fatherOccupation = scanner.nextLine().toUpperCase();
        setFatherOccupation(fatherOccupation);

        System.out.print("Enter Father's Age at Birth: ");
        int fatherAgeAtBirth = scanner.nextInt();
        scanner.nextLine();
        setFatherAgeAtBirth(fatherAgeAtBirth);

        System.out.print("Enter Father's Residence: ");
        String fatherResidence =scanner.nextLine().toUpperCase();
        setFatherResidence(fatherResidence);

        System.out.print("Enter Father's City: ");
        String fatherCity = scanner.nextLine().toUpperCase();
        setFatherCity(fatherCity);

        System.out.print("Enter Father's Province: ");
        String fatherProvince = scanner.nextLine().toUpperCase();
        setFatherProvince(fatherProvince);
    }
    
    
    
    public void CombinedInformation(){
        Receipt n = new Receipt();
        Scanner scanner = new Scanner(System.in);
        try {
      System.out.print("                                                                                                              Loading");
      Thread.sleep(1000); 
      System.out.print(".");
           Thread.sleep(1000); 
      System.out.print(".");
           Thread.sleep(1000); 
      System.out.print(".");
           Thread.sleep(1000); 
      System.out.print(".");
      Thread.sleep(1000); 
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
       System.out.println("");
        System.out.println("");
         System.out.println("");
          System.out.println("");
           System.out.println("");
            System.out.println("");
             System.out.println("");
              System.out.println("");
               System.out.println("");
                System.out.println("");
                 System.out.println("");
                  System.out.println("");
                   System.out.println("");
                    System.out.println("");
                     System.out.println("");
                      System.out.println("");
                       System.out.println("");
                        System.out.println("");
                         System.out.println("");
                          System.out.println("");
                           System.out.println("");
                            System.out.println("");
                             System.out.println("");
                             
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         
         System.out.println("                              ===================================================================================================================================================================================                                       ");
          
         System.out.println("                                                                                                    Republic Of The Philippines                                                                                                                                   ");
        
         System.out.println("                                                                                               OFFICE OF THE CIVIL REGISTRAR GENERAL                                                                                                                              ");
      
         System.out.println("                                                                                                   CERTIFICATE OF LIVE BIRTH");
       
         System.out.println("");
        
         System.out.println("                              ===================================================================================================================================================================================                                       ");
        
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
       
         System.out.println("                                                 1. NAME:                            (Last)    (Middle)    (First)                                                                                                              ");
        
         System.out.println("                                                                                        "+lastName +"      "+middleName+"      "+ firstName + " ");
         
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
   
         System.out.println("                                                 2. SEX:                                      |3.DATE OF BIRTH: (MM/DD/YYYY)                ");
      
         System.out.println("                                                         "+ sex + "                                 |                "+ dateOfBirth +"                                                                                                                        ");
      
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
       
         System.out.println("                                                 4. PLACE OF BIRTH:    Name of Hospital      City/Municipality      (Province)                                                      ");
      
         System.out.println("                                                                       "+placeOfBirthName+""+placeOfBirthCity + "" + placeOfBirthProvince);
       
        System.out.println("                              ===================================================================================================================================================================================                                       ");
                   
         System.out.println("                                                 6. MOTHER NAME:                            (Last)    (Middle)    (First)                                                                                                              ");
                  
         System.out.println("                                                                                        "+motherLastName +"      "+motherMiddleName+"      "+ motherFirstName + " ");
                 
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
                  
         System.out.println("                                                 7. CITIZENSHIP                               |8. RELIGION              ");
               
         System.out.println("                                                         "+ motherCitizenship + "                                 |                "+ motherReligion +"                                                                                                                        ");
                
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
                
         System.out.println("                                                 9. OCCUPATION                                |10. AGE AT THE TIME OF THIS BIRTH              ");  
                 
         System.out.println("                                                         "+ motherOccupation + "                                 |                "+ motherAgeAtBirth +"                                                                                                                        ");
                
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
                
         System.out.println("                                                 11. RESIDENCE         HouseNo.Street/Baranggay      City/Municipality      (Province)                                                      ");
              
         System.out.println("                                                                       "+placeOfBirthName+""+placeOfBirthCity + "" + placeOfBirthProvince);
              
         System.out.println("                              ===================================================================================================================================================================================                                       ");
                 
         System.out.println("                                                 12. FATHER NAME:                            (Last)    (Middle)    (First)                                                                                                              ");
                 
         System.out.println("                                                                                        "+lastName +"      "+middleName+"      "+ firstName + " ");
       
         System.out.println("                                                 13. CITIZENSHIP                               |14. RELIGION              ");
         
         System.out.println("                                                         "+fatherCitizenship+ "                                 |                "+ fatherReligion +"                                                                                                                        ");
        
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
       
         System.out.println("                                                 9. OCCUPATION                                |10. AGE AT THE TIME OF THIS BIRTH              ");  
      
         System.out.println("                                                         "+ fatherOccupation + "                                 |                "+ fatherAgeAtBirth +"                                                                                                                        ");
         
         System.out.println("                              ===================================================================================================================================================================================                                       ");
         
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       
         
         
       System.out.println("Do you want to register again?: ");
         String entry = scanner.nextLine().toUpperCase();
  
        switch(entry){
        
            case "YES":
               PSA.performRegistration();
               
                break;
            case "NO":
                try{
                       
                    System.out.println("System.out.print(\"[1]Pickup [2]Delivery - \");");
                    int Choose = scanner.nextInt();
                    if(Choose==1){
                        System.out.println("\"wait for the prcoess of Pickup: \" ");
                Thread.sleep(500); 
                    System.out.print(".");
                    Thread.sleep(500); 
                    System.out.print(".");
                    Thread.sleep(500); 
                    System.out.print(".");
                    Thread.sleep(500); 
                    System.out.println(".");
                    Thread.sleep(500); 
                    n.PickUpReceiptPSA();
                    
                      
                    }else{
                        System.out.println("Wrong Number:");
                    }
                    } catch(InterruptedException f){
                f.printStackTrace();
                }
                    
                    
                }
        }
                catch(InterruptedException f){
                f.printStackTrace();
                }
                
              
              
                
          
        
    }
       
  
        
}

