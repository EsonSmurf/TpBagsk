
package psa;

import java.util.Scanner;
import static psa.PSA.Perform;
import static psa.PSA.performRegistration;

public class Marriage {
   
    
    
    static String wifeFirstName, wifeMiddleName, wifeLastName;
    private char wifeSex;
    private int wifeAge;
    private static String wifeDateOfBirth;
    private static String wifePlaceOfBirth;
    private static String wifeCitizenship;
    private static String wifeResProvince;
    private static String wifeResCityMuni;
    private static String wifeResBarangay;
    private static String wifeResHouseNumStreet;
    private static String wifeReligion;
    private static String wifeCivilStatus;
    private static String wifeFathersName;
    private static String wifeFathersCitizenship;
    private static String wifeMothersName;
    private static String wifeMothersCitizenship;
    
    
    private static String husbandFirstName, husbandMiddleName, husbandLastName;
    private char husbandSex;
    private int husbandAge;
    private static String husbandPlaceOfBirth;
    private static String husbandDateOfBirth;
    private static String husbandCitizenship;
    private static String husbandResProvince;
    private static String husbandResCityMuni;
    private static String husbandResBarangay;
    private static String husbandResHouseNumStreet;
    private static String husbandReligion;
    private static String husbandCivilStatus;
    private static String husbandFathersName;
    private static String husbandFathersCitizenship;
    private static String husbandMothersName;
    private static String husbandMothersCitizenship;
    
    private static String placeOfMarriage;
    private static String dateOfMarriage;
   
    
    public void setWifeFirstName(String wifeFirstName){
        this.wifeFirstName = wifeFirstName;  
    }
    public String getWifeFirstName(){
        return wifeFirstName;
    }
    public void setWifeMiddleName(String wifeMiddleName){
        this.wifeMiddleName = wifeMiddleName;
    }
    public String getWifeMiddleName(){
        return wifeMiddleName;
    }
    public void setWifeLastName(String wifeLastName){
        this.wifeLastName = wifeLastName;
    }
    public String getWifeLastName(){
        return wifeLastName;
    }
    public void setWifeDateOfBirth(String wifeDateOfBirth){
        this.wifeDateOfBirth = wifeDateOfBirth;
    }
    public String getWifeDateOfBirth(){
        return wifeDateOfBirth;
    }
    public void setWifeAge(int wifeAge){
        this.wifeAge = wifeAge;
    }
    public int getWifeAge(){
        return wifeAge;
    }
    public void setWifePlaceOfBirth(String wifePlaceOfBirth){
        this.wifePlaceOfBirth = wifePlaceOfBirth;
    }
    public String getWifePlaceOfBirth(){
        return wifePlaceOfBirth;
    }
    public void setWifeSex(char wifeSex){
        this.wifeSex = wifeSex;
    }
    public char getWifeSex(){
        return wifeSex;
    }
    public void setWifeCitizenship(String wifeCitizenship){
        this.wifeCitizenship = wifeCitizenship;
    }
    public String getWifeCitizenship(){
        return wifeCitizenship;
    }
    public void setWifeResProvince(String wifeResProvince){
        this.wifeResProvince = wifeResProvince;
    }
    public String getWifeResProvince(){
        return wifeResProvince;
    }
    public void setWifeResCityMuni(String wifeResCityMuni){
        this.wifeResCityMuni = wifeResCityMuni;
    }
    public String getWifeResCityMuni(){
        return wifeResCityMuni;
    }
    public void setWifeResBarangay(String wifeResBarangay){
        this.wifeResBarangay = wifeResBarangay;
    }
    public String getWifeResBarangay(){
       return wifeResBarangay;
    }
    public void setWifeResHouseNumStreet(String wifeResHouseNumStreet){
        this.wifeResHouseNumStreet = wifeResHouseNumStreet;
    }
    public String getWifeResHouseNumStreet(){
        return wifeResHouseNumStreet;
    }
    public void setWifeReligion(String wifeReligion){
        this.wifeReligion = wifeReligion;
    }
    public String getWifeReligion(){
        return wifeReligion;
    }
    public void setWifeCivilStatus(String wifeCivilStatus){
        this.wifeCivilStatus = wifeCivilStatus;
    }
    public String getWifeCivilStatus() {
        return wifeCivilStatus;
    } 
    public void setWifeFathersName(String wifeFathersName){
        this.wifeFathersName = wifeFathersName;
    }
    public String getWifeFathersName(){
        return wifeFathersName;
    }
    public void setWifeFathersCitizenship(String wifeFathersCitizenship){
        this.wifeFathersCitizenship = wifeFathersCitizenship;
    } 
    public String getWifeFathersCitizenship(){
        return wifeFathersCitizenship;
    }
    public void setWifeMothersName(String wifeMothersName){
        this.wifeMothersName = wifeMothersName;
    }
    public String getWifeMothersName(){
        return wifeMothersName;
    }
    public void setWifeMothersCitizenship(String wifeMothersCitizenship){
        this.wifeMothersCitizenship = wifeMothersCitizenship;
    } 
    public String getWifeMothersCitizenship(){
        return wifeMothersCitizenship;
    }      
    
    //setter and getter for husband
    public void setHusbandFirstName(String husbandFirstName){
        this.husbandFirstName = husbandFirstName;  
    }
    public String getHusbandFirstName(){
        return husbandFirstName;
    }
    public void setHusbandMiddleName(String husbandMiddleName){
        this.husbandMiddleName = husbandMiddleName;
    }
    public String getHusbandMiddleName(){
        return husbandMiddleName;
    }
    public void setHusbandLastName(String husbandLastName){
        this.husbandLastName = husbandLastName;
    }
    public String getHusbandLastName(){
        return husbandLastName;
    }
    public void setHusbandDateOfBirth(String husbandDateOfBirth){
        this.husbandDateOfBirth = husbandDateOfBirth;
    }
    public String getHusbandDateOfBirth(){
        return husbandDateOfBirth;
    }
    public void setHusbandAge(int husbandAge){
        this.husbandAge = husbandAge;
    }
    public int getHusbandAge(){
        return husbandAge;
    }
    public void setHusbandPlaceOfBirth(String husbandPlaceOfBirth){
        this.husbandPlaceOfBirth = husbandPlaceOfBirth;
    }
    public String getHusbandPlaceOfBirth(){
        return husbandPlaceOfBirth;
    }
    public void setHusbandSex(char husbandSex){
        this.husbandSex = husbandSex;
    }
    public char getHusbandSex(){
        return husbandSex;
    }
    public void setHusbandCitizenship(String husbandCitizenship){
        this.husbandCitizenship = husbandCitizenship;
    }
    public String getHusbandCitizenship(){
        return husbandCitizenship;
    }
    public void setHusbandResProvince(String husbandResProvince){
        this.husbandResProvince = husbandResProvince;
    }
    public String getHusbandResProvince(){
        return husbandResProvince;
    }
    public void setHusbandResCityMuni(String husbandResCityMuni){
        this.husbandResCityMuni = husbandResCityMuni;
    }
    public String getHusbandResCityMuni(){
        return husbandResCityMuni;
    }
    public void setHusbandResBarangay(String husbandResBarangay){
        this.husbandResBarangay = husbandResBarangay;
    }
    public String getHusbandResBarangay(){
       return husbandResBarangay;
    }
    public void setHusbandResHouseNumStreet(String husbandResHouseNumStreet){
        this.husbandResHouseNumStreet = husbandResHouseNumStreet;
    }
    public String getHusbandResHouseNumStreet(){
        return husbandResHouseNumStreet;
    }
    public void setHusbandReligion(String husbandReligion){
        this.husbandReligion = husbandReligion;
    }
    public String getHusbandReligion(){
        return husbandReligion;
    }
    public void setHusbandCivilStatus(String husbandCivilStatus){
        this.husbandCivilStatus = husbandCivilStatus;
    }
    public String getHusbandCivilStatus() {
        return husbandCivilStatus;
    } 
    public void setHusbandFathersName(String husbandFathersName){
        this.husbandFathersName = husbandFathersName;
    }
    public String getHusbandFathersName(){
        return husbandFathersName;
    }
    public void setHusbandFathersCitizenship(String husbandFathersCitizenship){
        this.husbandFathersCitizenship = husbandFathersCitizenship;
    } 
    public String getHusbandFathersCitizenship(){
        return husbandFathersCitizenship;
    }
    public void setHusbandMothersName(String husbandMothersName){
        this.husbandMothersName = husbandMothersName;
    }
    public String getHusbandMothersName(){
        return husbandMothersName;
    }
    public void setHusbandMothersCitizenship(String husbandMothersCitizenship){
        this.husbandMothersCitizenship = husbandMothersCitizenship;
    } 
    public String getHusbandMothersCitizenship(){
        return husbandMothersCitizenship;
    }
    
    
    public void setPlaceOfMarriage(String placeOfMarriage){
        this.placeOfMarriage = placeOfMarriage;
    }
    public String getPlaceOfMarriage(){
        return placeOfMarriage;
    }
    public void setDateOfMarriage(String dateOfMarriage){
        this.dateOfMarriage = dateOfMarriage;
    }
    public String getDateOfMarriage(){
        return dateOfMarriage;
    }
           
           
    public void displayInformation() {
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Wife's Information] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1a. First Name: " + getWifeFirstName());
        System.out.println("1b. Middle Name: " + getWifeMiddleName());
        System.out.println("1c. Last Name: " + getWifeLastName());
        System.out.println("2. Date of Birth: " + getWifeDateOfBirth());
        System.out.println("3. Age: " + getWifeAge());
        System.out.println("4. Place of Birth(City, Province): " + getWifePlaceOfBirth());
        System.out.println("5. Sex(f/m): " + getWifeSex());
        System.out.println("6. Citizenship: " + getWifeCitizenship());
        System.out.println("7a. Residence(Province): " + getWifeResProvince());
        System.out.println("7b. Residence(City/Municipality): " + getWifeResCityMuni());
        System.out.println("7c. Residence(Barangay): " + getWifeResBarangay());
        System.out.println("7d. Residence(House Number/Street): " + getWifeResHouseNumStreet());
        System.out.println("8. Religion: " + getWifeReligion());
        System.out.println("9. Civil Status: " + getWifeCivilStatus());
        System.out.println("10. Fathers Full Name: " + getWifeFathersName());
        System.out.println("11. Citizenship of Father: " + getWifeFathersCitizenship());
        System.out.println("12. Mothers Full Name: " + getWifeMothersName());
        System.out.println("13. Citizenship of Mother: " + getWifeMothersCitizenship());
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Husband's Information] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("14a. Enter your First Name: " + getHusbandFirstName());
        System.out.println("14b. Enter your Middle Name: " + getHusbandMiddleName());
        System.out.println("14c. Enter your Last Name: " + getHusbandLastName());
        System.out.println("15. Enter your Date of Birth: " + getHusbandDateOfBirth());
        System.out.println("16. Enter your Age: " + getHusbandAge());
        System.out.println("17. Enter your Place of Birth(City, Province): " + getHusbandPlaceOfBirth());
        System.out.println("18. Enter your Sex(f/m): " + getHusbandSex());
        System.out.println("19. Enter your Citizenship: " + getHusbandCitizenship());
        System.out.println("20a. Enter your Residence(Province): " + getHusbandResProvince());
        System.out.println("20b. Enter your Residence(City/Municipality): " + getHusbandResCityMuni());
        System.out.println("20c. Enter your Residence(Barangay): " + getHusbandResBarangay());
        System.out.println("20d. Enter your Residence(House Number/Street): " + getHusbandResHouseNumStreet());
        System.out.println("21. Enter your Religion: " + getHusbandReligion());
        System.out.println("22. Enter your Civil Status: " + getHusbandCivilStatus());
        System.out.println("23. Enter your Full name of Father: " + getHusbandFathersName());
        System.out.println("24. Enter your Citizenship of Father: " + getHusbandFathersCitizenship());
        System.out.println("25. Enter your Full name of Mother: " + getHusbandMothersName());
        System.out.println("26. Enter your Citizenship of Mother: " + getHusbandMothersCitizenship());
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("");
         System.out.println("27. Enter your Place of Marriage: " + getPlaceOfMarriage());
         System.out.println("28. Enter your Date of Marriage: " + getDateOfMarriage());
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
   public void editInformation(String rowToEdit, Scanner scanner) {
        switch (rowToEdit) {
            
            // for wife
            case "1a":
                System.out.print("1a. Enter your First Name: ");
                this.wifeFirstName = scanner.nextLine();
                break;
            case "1b":
                System.out.print("1b. Enter your Middle Name: ");
                this.wifeMiddleName = scanner.nextLine();
                break;
            case "1c":
                System.out.print("1c. Enter your Last Name: ");
                this.wifeLastName = scanner.nextLine();
                break;
            case "2":
                System.out.println("15. Enter your Date of Birth: ");
                this.wifeDateOfBirth = scanner.nextLine();
                break;
            case "3":
                System.out.print("3. Enter your Age: ");
                this.wifeAge = scanner.nextInt();
                scanner.nextLine();
                break;
            case "4":
                System.out.print("4a. Enter Place of Birth (City, Province): ");
                this.wifePlaceOfBirth = scanner.nextLine();
                break;
            case "5":
                System.out.print("5. Enter your Sex(f/m): ");
                this.wifeSex = scanner.nextLine().charAt(0);
                break;
            case "6":
                System.out.print("6. Enter your Citizenship: ");
                this.wifeCitizenship = scanner.nextLine();
                break;
            case "7a":
                System.out.println("7a. Enter your Residence(Province): ");
                this.wifeResProvince = scanner.nextLine();
                break;
            case "7b":
                System.out.println("7b. Enter your Residence(City/Municipality): ");
                this.wifeResCityMuni = scanner.nextLine();
                break;
            case "7c":
                System.out.println("7c. Enter your Residence(Barangay): ");
                this.wifeResBarangay = scanner.nextLine();
                break;
            case "7d":
                System.out.print("7d. Enter your Residence(House Number/Street): ");
                this.wifeResHouseNumStreet = scanner.nextLine();
                break;
            case "8":
                System.out.print("8. Enter your Religion: ");
                this.wifeReligion = scanner.nextLine();
                break;
            case "9":
                System.out.print("9. Enter your Civil Status: ");
                this.wifeCivilStatus = scanner.nextLine();
                break;
            case "10":
                System.out.print("10. Full Name of your Father: ");
                this.wifeFathersName = scanner.nextLine();
                break;
            case "11":
                System.out.print("11. Citizenship of your Father:  ");
                this.wifeFathersCitizenship = scanner.nextLine();
                break;
            case "12":
                System.out.print("12. Full Name of your Mother: ");
                this.wifeMothersName = scanner.nextLine();
                break;
            case "13":
                System.out.print("13. Citizenship of your Mother: ");
                this.wifeMothersCitizenship = scanner.nextLine();
                break;
                
            case "14a":
                System.out.print("14a. Enter your First Name: ");
                this.husbandFirstName = scanner.nextLine();
                break;
            case "14b":
                System.out.print("14b. Enter your Middle Name: ");
                this.husbandMiddleName = scanner.nextLine();
                break;
            case "14c":
                System.out.print("14c. Enter your Last Name: ");
                this.husbandLastName = scanner.nextLine();
                break;
            case "15":
                System.out.print("15. Enter your Date of Birth: ");
                this.husbandDateOfBirth = scanner.nextLine();
                break;
            case "16":
                System.out.print("16. Enter your Age: ");
                this.husbandAge = scanner.nextInt();
                scanner.nextLine();
                break;
            case "17":
                System.out.print("17. Enter Place of Birth (City, Province): ");
                this.husbandPlaceOfBirth = scanner.nextLine();
                break;
            case "18":
                System.out.print("18. Enter your Sex(f/m): ");
                this.husbandSex = scanner.nextLine().charAt(0);
                break;
            case "19":
                System.out.print("19. Enter your Citizenship: ");
                this.husbandCitizenship = scanner.nextLine();
                break;
            case "20a":
                System.out.println("20a. Enter your Residence(Province): ");
                this.husbandResProvince = scanner.nextLine();
                break;
            case "20b":
                System.out.println("20b. Enter your Residence(City/Municipality): ");
                this.husbandResCityMuni = scanner.nextLine();
                break;
            case "20c":
                System.out.println("20c. Enter your Residence(Barangay): ");
                this.husbandResBarangay = scanner.nextLine();
                break;
            case "20d":
                System.out.print("20d. Enter your Residence(House Number/Street): ");
                this.husbandResHouseNumStreet = scanner.nextLine();
                break;
            case "21":
                System.out.print("21. Enter your Religion: ");
                this.husbandReligion = scanner.nextLine();
                break;
            case "22":
                System.out.print("22. Enter your Civil Status: ");
                this.husbandCivilStatus = scanner.nextLine();
                break;
            case "23":
                System.out.print("23. Full Name of your Father: ");
                this.husbandFathersName = scanner.nextLine();
                break;
            case "24":
                System.out.print("24. Citizenship of your Father:  ");
                this.husbandFathersCitizenship = scanner.nextLine();
                break;
            case "25":
                System.out.print("25. Full Name of your Mother: ");
                this.husbandMothersName = scanner.nextLine();
                break;
            case "26":
                System.out.print("26. Citizenship of your Mother: ");
                this.husbandMothersCitizenship = scanner.nextLine();
                break;
            case "27":
                System.out.println("27. Enter your Place of Marriage");
                this.placeOfMarriage = scanner.nextLine();
                break;
            case "28":
                System.out.println("27. Enter your Date of Marriage");
                this.dateOfMarriage = scanner.nextLine();
                break;

            default:
                System.out.println("Invalid choice. No edits were made.");
        
        }
    }
   
       public void wifeInformation(Scanner scanner) {

            do {
           System.out.print("1a. Enter your First Name: ");
           String wifeFirstName = scanner.nextLine().toUpperCase();
           setWifeFirstName(wifeFirstName);

           System.out.print("1b. Enter your Middle Name: ");
           String wifeMiddleName = scanner.nextLine().toUpperCase();
           setWifeMiddleName(wifeMiddleName);
           
           System.out.print("1c. Enter your Last Name: ");
           String wifeLastName = scanner.nextLine().toUpperCase();
           setWifeLastName(wifeLastName);
           
           System.out.print("2. Enter your Date of Birth: ");
           String wifeDateOfBirth = scanner.nextLine().toUpperCase();
           setWifeDateOfBirth(wifeDateOfBirth);
           
           System.out.print("3. Enter your Age: ");
           int wifeAge = scanner.nextInt();
           scanner.nextLine();
           setWifeAge(wifeAge);

           System.out.print("4a. Enter Place of Birth (City, Province): ");
           this.wifePlaceOfBirth = scanner.nextLine().toUpperCase();
           setWifePlaceOfBirth(wifePlaceOfBirth);
           
           System.out.print("5. Enter your Sex(f/m): ");
           char wifeSex = scanner.nextLine().toUpperCase().charAt(0);
           setWifeSex(wifeSex);
           
           System.out.print("6. Enter your Citizenship: ");
           String wifeCitizenship = scanner.nextLine().toUpperCase();
           setWifeCitizenship(wifeCitizenship);
           
           System.out.print("7a. Enter your Residence(Province): ");
           String wifeResProvince = scanner.nextLine().toUpperCase();
           setWifeResProvince(wifeResProvince);
           
           System.out.print("7b. Enter your Residence(City/Municipality): ");
           String wifeResCityMuni = scanner.nextLine().toUpperCase();
           setWifeResCityMuni(wifeResCityMuni);
           
           System.out.print("7c. Enter your Residence(Barangay): ");
           String wifeResBarangay = scanner.nextLine().toUpperCase();
           setWifeResBarangay(wifeResBarangay);
           
           System.out.print("7d. Enter your Residence(House Number/Street): ");
           String wifeResHouseNumStreet = scanner.nextLine().toUpperCase();
           setWifeResHouseNumStreet(wifeResHouseNumStreet);
           
           System.out.print("8. Enter your Religion: ");
           String wifeReligion = scanner.nextLine().toUpperCase();
           setWifeReligion(wifeReligion);
           
           System.out.print("9. Enter your Civil Status: ");
           String wifeCivilStatus = scanner.nextLine().toUpperCase();
           setWifeCivilStatus(wifeCivilStatus);
           
           System.out.print("10. Full Name of your Father: ");
           String wifeFathersName = scanner.nextLine().toUpperCase();
           setWifeFathersName(wifeFathersName);
           
           System.out.print("11. Citizenship of your Father: ");
           String wifeFathersCitizenship = scanner.nextLine().toUpperCase();
           setWifeFathersCitizenship(wifeFathersCitizenship);
           
           System.out.print("12. Full Name of your Mother: ");
           String wifeMothersName = scanner.nextLine().toUpperCase();
           setWifeMothersName(wifeMothersName);
           
           System.out.print("13. Citizenship of your Mother: ");
           String wifeMothersCitizenship = scanner.nextLine().toUpperCase();
           setWifeMothersCitizenship(wifeMothersCitizenship);
       } while ("yes".equalsIgnoreCase(scanner.nextLine()));
    
}
    public void husbandInformation(Scanner scanner) {
            do {
            System.out.print("14a. Enter your First Name: ");
            String husbandFirstName = scanner.nextLine().toUpperCase();
            setHusbandFirstName(husbandFirstName);
            
            System.out.print("14b. Enter your Middle Name: ");
            String husbandMiddleName = scanner.nextLine().toUpperCase();
            setHusbandMiddleName(husbandMiddleName);
            
            System.out.print("14c. Enter your Last Name: ");
            String husbandLastName = scanner.nextLine().toUpperCase();
            setHusbandLastName(husbandLastName);
            
            System.out.print("15. Enter your Date of Birth: ");
            String husbandDateOfBirth = scanner.nextLine().toUpperCase();
            setHusbandDateOfBirth(husbandDateOfBirth);
            
            System.out.print("16. Enter your Age: ");
            int husbandAge = scanner.nextInt();
            scanner.nextLine();  
            setHusbandAge(husbandAge);
            
            System.out.print("17. Enter Place of Birth (City, Province): ");
            String husbandPlaceOfBirth = scanner.nextLine().toUpperCase();
            setHusbandPlaceOfBirth(husbandPlaceOfBirth);
            
            System.out.print("18. Enter your Sex(f/m): ");
            char husbandSex = scanner.nextLine().toUpperCase().charAt(0);
            setHusbandSex(husbandSex);
            
            System.out.print("19. Enter your Citizenship: ");
            String husbandCitizenship = scanner.nextLine().toUpperCase();
            setHusbandCitizenship(husbandCitizenship);
            
            System.out.print("20a. Enter your Residence(Province): ");
            String husbandResProvince = scanner.nextLine().toUpperCase();
            setHusbandResProvince(husbandResProvince);
            
            System.out.print("20b. Enter your Residence(City/Municipality): ");
            String husbandResCityMuni = scanner.nextLine().toUpperCase();
            setHusbandResCityMuni(husbandResCityMuni);
            
            System.out.print("20c. Enter your Residence(Barangay): ");
            String husbandResBarangay = scanner.nextLine().toUpperCase();
            setHusbandResBarangay(husbandResBarangay);
            
            System.out.print("20d. Enter your Residence(House Number/Street): ");
            String husbandResHouseNumStreet = scanner.nextLine().toUpperCase();
            setHusbandResHouseNumStreet(husbandResHouseNumStreet);
            
            System.out.print("21. Enter your Religion: ");
            String husbandReligion = scanner.nextLine().toUpperCase();
            setHusbandReligion(husbandReligion);
            
            System.out.print("22. Enter your Civil Status: ");
            String husbandCivilStatus = scanner.nextLine().toUpperCase();
            setHusbandCivilStatus(husbandCivilStatus);
            
            System.out.print("23. Full Name of your Father: ");
            String husbandFathersName = scanner.nextLine().toUpperCase();
            setHusbandFathersName(husbandFathersName);
            
            System.out.print(" 4. Citizenship of your Father: ");
            String husbandFathersCitizenship = scanner.nextLine().toUpperCase();
            setHusbandFathersCitizenship(husbandFathersCitizenship);
            
            System.out.print("25. Full Name of your Mother: ");
            String husbandMothersName = scanner.nextLine().toUpperCase();
            setHusbandMothersName(husbandMothersName);
            
            System.out.print("26. Citizenship of your Mother: ");
            String husbandMothersCitizenship = scanner.nextLine().toUpperCase();
            setHusbandMothersCitizenship(husbandMothersCitizenship);
            
            System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");

            System.out.print("27. Enter your Place of Marriage: ");
            String placeOfMarriage = scanner.nextLine().toUpperCase();
            setPlaceOfMarriage(placeOfMarriage);
            
            System.out.print("28. Enter your Date of Marriage: ");
            String dateOfMarriage = scanner.nextLine().toUpperCase();
            setDateOfMarriage(dateOfMarriage);
             } while ("yes".equalsIgnoreCase(scanner.nextLine()));
}
    
    public void CombinedInformation() {
         Receipt n = new Receipt();
        Scanner scanner = new Scanner(System.in);
        try{
      
            System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
        Thread.sleep(300); 
            System.out.println("                                                                                                    Republic Of The Philippines                                                                                                                                   ");
          Thread.sleep(300); 
            System.out.println("                                                                                               OFFICE OF THE CIVIL REGISTRAR GENERAL                                                                                                                              ");
        Thread.sleep(300); 
            System.out.println("                                                                                                   CERTIFICATE OF MARRIAGE");
           Thread.sleep(300);  
            System.out.printf("                                                       =======================================================================================================================                                       %n");
           Thread.sleep(300); 
            System.out.printf("                                                                                     |       Wife's Information       |       Husband's Information                                                       %n");
            Thread.sleep(300); 
            System.out.printf("                                                       =======================================================================================================================                                       %n");
            Thread.sleep(300); 
            System.out.printf("                                                         Name of Contracting Parties | %-30s | %-30s%n", getWifeFirstName() + " " + getWifeMiddleName() + " " + getWifeLastName(), getHusbandFirstName() + " " + getHusbandMiddleName() + " " + getHusbandLastName());
           Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
           Thread.sleep(300); 
            System.out.printf("                                                         Date of Birth/Age           | %-30s | %-30s%n", getWifeDateOfBirth() + " " + getWifeAge(), getHusbandDateOfBirth() + " " + getHusbandAge());
            Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
            System.out.printf("                                                         Place of Birth              | %-30s | %-30s%n", getWifePlaceOfBirth(), getHusbandPlaceOfBirth());
           Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
            System.out.printf("                                                         Sex (Male/Female)           | %-30s | %-30s%n", getWifeSex(), getHusbandSex());
            Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
           Thread.sleep(300); 
            System.out.printf("                                                         Citizenship                 | %-30s | %-30s%n", getWifeCitizenship(), getHusbandCitizenship());
            Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
            System.out.printf("                                                         Residence                   | %-30s | %-30s%n", getWifeResProvince() + " " + getWifeResCityMuni() + " " + getWifeResBarangay() + " " + getWifeResHouseNumStreet(), getHusbandResProvince() + " " + getHusbandResCityMuni() + " " + getHusbandResBarangay() + " " + getHusbandResHouseNumStreet());
            Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
           Thread.sleep(300); 
            System.out.printf("                                                         Religion                    | %-30s | %-30s%n", getWifeReligion(), getHusbandReligion());
          Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
             Thread.sleep(300); 
            System.out.printf("                                                         Civil Status                | %-30s | %-30s%n", getWifeCivilStatus(), getHusbandCivilStatus());
             Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
             Thread.sleep(300); 
            System.out.printf("                                                         Name of Father              | %-30s | %-30s%n", getWifeFathersName(), getHusbandFathersName());
             Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
              Thread.sleep(300); 
            System.out.printf("                                                         Citizenship                 | %-30s | %-30s%n", getWifeFathersCitizenship(), getHusbandFathersCitizenship());
             Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
             Thread.sleep(300); 
            System.out.printf("                                                         Name of Mother              | %-30s | %-30s%n", getWifeMothersName(), getHusbandMothersName());
             Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
             Thread.sleep(300); 
            System.out.printf("                                                         Citizenship                 | %-30s | %-30s%n", getWifeMothersCitizenship(), getHusbandMothersCitizenship());
             Thread.sleep(300); 
            System.out.println("                                                       =======================================================================================================================                                       ");
            Thread.sleep(300); 
            System.out.println("");
             Thread.sleep(300); 
            System.out.println("                                                                Place of Marriage: " + placeOfMarriage);
              Thread.sleep(300); 
            System.out.println("                                                                Date of Marriage: " + dateOfMarriage);
            Thread.sleep(300);  
            System.out.println("");
             Thread.sleep(300); 
            System.out.println("                                                            This is to certify that I " + wifeFirstName + " " + wifeMiddleName + " " + wifeLastName + " and I " + husbandFirstName +" " + husbandMiddleName + " " + husbandLastName + " both of legal age,");
             Thread.sleep(300); 
            System.out.println("                                                            of our own free will and Accord, and in the presence of the person solemnizing this marriage ");
              Thread.sleep(300); 
            System.out.println("                                                            and of the witnesses named below, take each other as husband and wife.");
            Thread.sleep(300);  
            System.out.println("                                                       =======================================================================================================================                                       ");
        Thread.sleep(300); 
   
} catch (InterruptedException e) {
            e.printStackTrace();
             }
            
     System.out.println("Do you want to register again?: ");
         String entry = scanner.nextLine().toUpperCase();
  
        switch(entry){
        
            case "YES":
               PSA.Perform();
               
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
                    n.PickUprecieptMarraige();
                    
                       
                    } else if (Choose == 2)  {
                          System.out.println("\"\\t\\wait for the prcoess of Delivery: \" ");
                Thread.sleep(500); 
                    System.out.print(".");
                    Thread.sleep(500); 
                    System.out.print(".");
                    Thread.sleep(500); 
                    System.out.print(".");
                    Thread.sleep(500); 
                    System.out.println(".");
                    Thread.sleep(500); 
                    n.DeliveryreceiptMarraige();
                    
                      
                    }else{
                        System.out.println("Wrong Number:");
                    }
                    
                    }catch(InterruptedException f){
                f.printStackTrace();
                }
                    
                    
                }
                
                
               
           }
   } 

    
    
    
       



