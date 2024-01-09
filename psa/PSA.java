
package psa;
import java.util.*;

public class PSA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("                                                     _____  _    _ _____ _      _____ _____  _____ _____ _   _ ______ ");
        System.out.println("                                                    |  __ \\| |  | |_   _| |    |_   _|  __ \\|  __ \\_   _| \\ | |____|");
        System.out.println("                                                    | |__) | |__| | | | | |      | | | |__) | |__) || | |  \\| | |__   ");
        System.out.println("                                                    |  ___/|  __  | | | | |      | | |  ___/|  ___/ | | | . ` |  __|  ");
        System.out.println("                                                    | |    | |  | |_| |_| |____ _| |_| |    | |    _| |_| |\\  | |____ ");
        System.out.println("                                                    |_|    |_|  |_|_____|______|_____|_|    |_|   |_____|_| \\_|______|");
        System.out.println("                                                    / ____|__   __|/\\|__   __|_   _|/ ____|__   __|_   _/ ____|/ ____|");
        System.out.println("                                                    | (___    | |  /  \\  | |    | | | (___    | |    | || |    | (___  "); 
        System.out.println("                                                  \\___ \\   | | / /\\ \\ | |    | |  \\___ \\   | |    | || |     \\___ \\ ");
        System.out.println("                                                     ____) |  | |/ ____ \\| |   _| |_ ____) |  | |   _| || |____ ____) |");
        System.out.println("                                                   |_____/  _|_/_/ ___\\_\\_|_ |_____|_____/___|_|__|_____\\_____|_____/_");
        System.out.println("                                                       /\\  | |  | |__   __| |  | |/ __ \\|  __ \\|_   _|__   __\\ \\   / /");
        System.out.println("                                                      /  \\ | |  | |  | |  | |__| | |  | | |__) | | |    | |   \\ \\_/ / ");
        System.out.println("                                                     / /\\ \\| |  | |  | |  |  __  | |  | |  _  /  | |    | |    \\   /  ");
        System.out.println("                                                    / ____ \\ |__| |  | |  | |  | | |__| | | \\ \\ _| |_   | |     | |   ");
        System.out.println("                                                    /_/    \\_\\____/   |_|  |_|  |_|\\____/|_|  \\_\\_____|  |_|     |_|   ");
        System.out.println("");
        System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
       try {
          System.out.println("");
              Thread.sleep(500); 
         
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
          Thread.sleep(500); 
         System.out.println("");
             Thread.sleep(500); 
         System.out.println("                                                                         Republic of the Philippines");
                Thread.sleep(500); 
         System.out.println("                                                                        Philippine Statistics Authority");
            Thread.sleep(500); 
         System.out.println("                                                                       Registration and Certificate System");
            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
            
                     System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
         System.out.println("                                                                               [1] Registration");
            Thread.sleep(500); 
         System.out.println("                                                                               [2] Admin");
            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("                                                                                        ");
       
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       int Choice;
       do{
        Choice = scanner.nextInt();
       scanner.nextLine();
       if(Choice == 1){
       
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
               System.out.println("                                  Press [B] for BirthCertificate   Press [M] for Marriage  Press [D] for Death Certificate");
               System.out.println("");
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

       
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "B":
                performRegistration();
                break;
            case "M":
               Perform();
                break;
            case "D":
               PerformD();
                break;
            default:
                System.out.println("Invalid choice. Please choose B,C,M or D");
                continue;
        }
        }else if (Choice == 2){
            System.out.println("");
        } else{
           System.out.println("Invalid Number: Please only 1 and 2");
       }
       }while(Choice !=0);
       
        System.out.println("Exiting The Program");
       scanner.close();
    
       
    } 

   public static void performRegistration() {
        Scanner scanner = new Scanner(System.in);
        BirthCertificate birthCertificate = new BirthCertificate();
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Child's Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Mother's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputMotherInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Father's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputFatherInformation();
        
        while (true) {
            
          birthCertificate.displayInformation();
          
            System.out.println("\nDo you want to edit?");
            System.out.println("1. Yes       2. No");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (editChoice == 1) {
                System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();

               
                birthCertificate.editInformation(rowToEdit, scanner);

             
                System.out.println("\nUpdated Information:");
                birthCertificate.displayInformation();
            } else if (editChoice == 2) {
                birthCertificate.displayInformation();
                System.out.println("Do you want to sample copy?: [1] Yes or [2] no");
                int L = scanner.nextInt();
                while(true)
                    if(L == 1){
                    birthCertificate.CombinedInformation();
                        
                    }else if(L == 2){
                        birthCertificate.displayInformation();
                    }else
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        
        
    }
   
   
   
   
   
   public static void PerformD(){
   Scanner scanner = new Scanner(System.in);
   DeathCertificate deathcertificate = new DeathCertificate();
      System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Deaath Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        deathcertificate.inputInformation(scanner);
    while (true) {
            
          deathcertificate.displayInformation();
          
            System.out.println("\nDo you want to edit?");
            System.out.println("1. Yes       2. No");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (editChoice == 1) {
                System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();

               
                deathcertificate.editInformation(rowToEdit, scanner);

             
                System.out.println("\nUpdated Information:");
                deathcertificate.displayInformation();
            } else if (editChoice == 2) {
                deathcertificate.displayInformation();
                System.out.println("Do you want to sample copy?: [1] Yes or [2] no");
                int L = scanner.nextInt();
                while (true) {
                    if (L == 1) {
                        deathcertificate.CombinedInformation();
                    } else if (L == 2) {
                      
                    } else {
                        break;
                    }
                }              
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    
         
   }

    public static void Perform() {
   Scanner scanner = new Scanner(System.in);
    Marriage marriage = new Marriage();
   System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Wife Information:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    marriage.wifeInformation(scanner);
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Husband Information:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

           marriage.husbandInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

   marriage.displayInformation();
      
     
   
    while (true) {
            
          marriage.displayInformation();
          
            System.out.println("\nDo you want to edit?");
            System.out.println("1. Yes       2. No");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (editChoice == 1) {
                System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();

               
                marriage.editInformation(rowToEdit, scanner);

             
                System.out.println("\nUpdated Information:");
                marriage.displayInformation();
            } else if (editChoice == 2) {
                marriage.displayInformation();
                System.out.println("Do you want to sample copy?: [1] Yes or [2] no");
                int L = scanner.nextInt();
                while (true) {
                    if (L == 1) {
                        marriage.CombinedInformation();
                    } else if (L == 2) {
                      
                    } else {
                        break;
                    }
                }              
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}

     

       

    
    

    


    
    

