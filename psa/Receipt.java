
package psa;
import java.util.*;
import static psa.PSA.Perform;
import static psa.PSA.PerformD;
import static psa.PSA.performRegistration;
public class Receipt {
             
	public void  PickUpReceiptPSA() {
		 Scanner s = new Scanner(System.in);
		 System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Press 1: ");
			
			String choose = s.next();	
			if(choose.equalsIgnoreCase("1")) {
			 
		    System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.print("\tFull name of receiver: ");
			String name = s.next();
			
			System.out.print("\tContact number ex.(0912345678): ");
			String contact = s.next();
			
			System.out.print("\tDelivery address:");
			String address = s.next();
			
	        System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("\tPlease check delivery information.");
			System.out.println("\tName: " + name);
			System.out.println("\tContact Number: " + contact);
			System.out.println(" ");
			System.out.println("Please be reminded that the payment fee for (1)copy PSA Certificate is PHP250.00");
			System.out.println("we will call to " + contact + " once the certificate is ready for pick up. Thank you!");
	        System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.print("\tCheck the details if correct to proceed(Y/N):");
			String details = s.next();
	        System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			if(details.equalsIgnoreCase("Y"));
				System.out.println("\tPAYMENT DETAILS");
		        System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		        System.out.print("\tHow many copies?: ");
		        int copies = s.nextInt();
		        int piece = 250;
		        int tax = 30;
		        double price = copies * piece;
		        System.out.println("\tTotal: " + price);
		        System.out.print("\tEnter the amount you recieved: ");
		        double amount = s.nextDouble();
		        double change = amount - price;
		        double minus = change - tax;
		        System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		        System.out.println("\tPrinting of receipt. Please wait a moment...");
		        if(details.equalsIgnoreCase("N")) {
				System.out.println("Incorrect your details please fill-up correctly.");
				}try{
		   		System.out.println("**************************************************************************");
                                  Thread.sleep(300); 
		   		System.out.println("**************************************************************************");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\t\tRepublic of the Philippines\t\t\t" + "||"  );
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\t       PHILIPPINE STATISTICS AUTHORITY\t\t\t" + "||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\t\t\t\t\t\t\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\t\t   OFFICIAL RECEIPT" + " \t\t\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\t\t\t\t\t\tAmount\t" + "\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "----------------------------------------------------------------------" + "||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t" + name + "\t\t\t\t\t\t\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\tCopy of Issurance - PSA CERTIFICATE" + "\t\t\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\tUnit cost: " + piece  + "\t Qty: " + copies + "\t\t\t\t" + price + "\t\t||" );
                                  Thread.sleep(300); 
				System.out.println("||" + "\tTotal\t\t\t" + "\t\t\t" + price + "\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\tAmount Tendered:\t " + "\t\t\t" + amount + "\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\tChange:\t\t " + "\t\t\t\t" + minus + "\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\tINCLUDE DOCUMENTARY STAMP TAX OF" + "\t\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\t\tPHP30.00/COPY" + "\t\t\t\t\t||");
                                  Thread.sleep(300); 
				System.out.println("||----------------------------------------------------------------------||");
                                  Thread.sleep(300); 
				System.out.println("||" + "\t\tCollecting Officer: Benneth, Marciano" + "\t\t\t||");
                                  Thread.sleep(300); 
		        System.out.println("||" + "\t\tDate-Time: 01/18/2024 00:06:08" + "\t\t\t\t||");
                          Thread.sleep(300); 
		        System.out.println("||----------------------------------------------------------------------||"); 
                          Thread.sleep(300); 
		        System.out.println("||----------------------------------------------------------------------||");
                          Thread.sleep(300); 
		        System.out.println("**************************************************************************");
                          Thread.sleep(300); 
		   		System.out.println("**************************************************************************");
                                  Thread.sleep(300); 
                                  
			 }
                                
                catch(InterruptedException f){
                f.printStackTrace();}
                                   System.out.println("Do you want to try Again? YES/NO: ");
                        
                        }String K = s.nextLine().toUpperCase();
                      switch (K){
                            case "Y":
                                performRegistration();
                                break;
                                
                            case "N":
                                System.out.println("\"Thank You For Using Our System \" ");
                                break;
                                
                            default:
	}
                      }
                      
	public void  PickUpdeathCertificate() {  
            		 Scanner s = new Scanner(System.in);

	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tFull name of receiver: ");
	String name = s.next();
	
	System.out.print("\tContact number ex.(0912345678): ");
	String contact = s.next();
	
	System.out.print("\tDelivery address:");
	String address = s.next();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("\tPlease check delivery information.");
	System.out.println("\tName: " + name);
	System.out.println("\tContact Number: " + contact);
	System.out.println(" ");
	System.out.println("\tPlease be reminded that the payment fee for (1)copy CENOMAR Certificate is PHP250.00");
	System.out.println("\twe will call to " + contact + " once the certificate is ready for pick up. Thank you!");
	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tCheck the details if correct to proceed(Y/N):");
	String details = s.next();
	System.out.println("----------------------------------------------------------------------------------");
	if(details.equalsIgnoreCase("Y"));
		System.out.println("\tPAYMENT DETAILS");
		System.out.println("----------------------------------------------------------------------------------");
        System.out.print("\tHow many copies?: ");
        int copies = s.nextInt();
        int piece = 250;
        int tax = 30;
        double price = copies * piece;
        System.out.println("\tTotal: " + price);
        System.out.print("\tEnter the amount you recieved: ");
        double amount = s.nextDouble();
        double change = amount - price;
        double minus = change - tax;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tPrinting of receipt. Please wait a moment...");
        if(details.equalsIgnoreCase("N")) {
		System.out.println("Incorrect your details please fill-up correctly.");

   }try{
   		System.out.println("**************************************************************************");
                  Thread.sleep(300); 
   		System.out.println("**************************************************************************");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\tRepublic of the Philippines\t\t\t" + "||"  );
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t       PHILIPPINE STATISTICS AUTHORITY\t\t\t" + "||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\t   OFFICIAL RECEIPT" + " \t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\tAmount\t" + "\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "----------------------------------------------------------------------" + "||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t" + name + "\t\t\t\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tCopy of Issurance - PSA CERTIFICATE" + "\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tUnit cost: " + piece  + "\t Qty: " + copies + "\t\t\t\t" + price + "\t\t||" );
                  Thread.sleep(300); 
		System.out.println("||" + "\tTotal\t\t\t" + "\t\t\t" + price + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tAmount Tendered:\t " + "\t\t\t" + amount + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tChange:\t\t " + "\t\t\t\t" + minus + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\tINCLUDE DOCUMENTARY STAMP TAX OF" + "\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\tPHP30.00/COPY" + "\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||----------------------------------------------------------------------||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\tCollecting Officer: Benneth, Marciano" + "\t\t\t||");
                  Thread.sleep(300); 
        System.out.println("||" + "\t\tDate-Time: 01/18/2024 00:06:08" + "\t\t\t\t||");
          Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||"); 
          Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||");
          Thread.sleep(300); 
        System.out.println("**************************************************************************");
          Thread.sleep(300); 
   		System.out.println("**************************************************************************");
	 }  
    catch(InterruptedException f){
                f.printStackTrace();}
 
        
        }
	
	public void PickUprecieptMarraige() {
            		 Scanner s = new Scanner(System.in);

	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tFull name of receiver: ");
	String name = s.next();
	
	System.out.print("\tContact number ex.(0912345678): ");
	String contact = s.next();
	
	System.out.print("\tDelivery address:");
	String address = s.next();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("\tPlease check delivery information.");
	System.out.println("\tName: " + name);
	System.out.println("\tContact Number: " + contact);
	System.out.println(" ");
	System.out.println("\tPlease be reminded that the payment fee for (1)copy MARRAIGE Certificate is PHP250.00");
	System.out.println("\twe will call to " + contact + " once the certificate is ready for pick up. Thank you!");
	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tCheck the details if correct to proceed(Y/N):");
	String details = s.next();
	System.out.println("----------------------------------------------------------------------------------");
	if(details.equalsIgnoreCase("Y"));
		System.out.println("\tPAYMENT DETAILS");
		System.out.println("----------------------------------------------------------------------------------");
        System.out.print("\tHow many copies?: ");
        int copies = s.nextInt();
        int piece = 250;
        int tax = 30;
        double price = copies * piece;
        System.out.println("\tTotal: " + price);
        System.out.print("\tEnter the amount you recieved: ");
        double amount = s.nextDouble();
        double change = amount - price;
        double minus = change - tax;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tPrinting of receipt. Please wait a moment...");
   if(details.equalsIgnoreCase("N")) {
		System.out.println("Incorrect your details please fill-up correctly.");

   }try{
   		System.out.println("**************************************************************************");
                  Thread.sleep(300); 
   		System.out.println("**************************************************************************");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\tRepublic of the Philippines\t\t\t\t" + "||"  );
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t       PHILIPPINE STATISTICS AUTHORITY\t\t\t" + "||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\t   OFFICIAL RECEIPT" + " \t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\tAmount\t" + "\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "----------------------------------------------------------------------" + "||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t" + name + "\t\t\t\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tCopy of Issurance - MARRAIGE CERTIFICATE" + "\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tUnit cost: " + piece  + "\t Qty: " + copies + "\t\t\t\t" + price + "\t\t||" );
                  Thread.sleep(300); 
		System.out.println("||" + "\tTotal\t\t\t" + "\t\t\t" + price + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tAmount Tendered:\t " + "\t\t\t" + amount + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tChange:\t\t " + "\t\t\t\t" + minus + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\tINCLUDE DOCUMENTARY STAMP TAX OF" + "\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\tPHP30.00/COPY" + "\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||----------------------------------------------------------------------||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\tCollecting Officer: Benneth, Marciano" + "\t\t\t||");
                  Thread.sleep(300); 
        System.out.println("||" + "\t\tDate-Time: 01/18/2024 00:06:08" + "\t\t\t\t||");
          Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||"); 
          Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||");
          Thread.sleep(300); 
        System.out.println("**************************************************************************");
          Thread.sleep(300); 
   		System.out.println("**************************************************************************");
                  Thread.sleep(300); 
              
                   }
                catch(InterruptedException f){
                f.printStackTrace();}
}
	public void DeliveryreceiptPSA() { 
            		 Scanner s = new Scanner(System.in);

    System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	System.out.print("\tFull name of receiver: ");
	String name = s.next();
	
	System.out.print("\tContact number ex.(0912345678): ");
	String contact = s.next();
	
	System.out.print("\tDelivery address:");
	String address = s.next();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("\tPlease check delivery information.");
	System.out.println("\tName: " + name);
	System.out.println("\tContact Number: " + contact);
	System.out.println("\tDelivery: " + address);
	System.out.println(" ");
	System.out.println("\tPlease be reminded that the payment fee for (1)copy");
	System.out.println("\tof PSA Certificate is Php and Delivery fee is 50.00");
	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tCheck the details if correct to proceed(Y/N):");
	String details = s.next();
	System.out.println("----------------------------------------------------------------------------------");
	if(details.equalsIgnoreCase("Y"));
		System.out.println("\tPAYMENT DETAILS");
		System.out.println("----------------------------------------------------------------------------------");
        System.out.print("\tHow many copies?: ");
        int copies = s.nextInt();
        int piece = 250;
        int tax = 30;
        double price = copies * piece;
        System.out.println("\tTotal: " + price);
        System.out.print("\tEnter the amount you recieved: ");
        double amount = s.nextDouble();
        double change = amount - price;
        double minus = change - tax;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tPrinting of receipt. Please wait a moment...");
   if(details.equalsIgnoreCase("N")) {
		System.out.println("Incorrect your details please fill-up correctly.");

   }
   try{
   		System.out.println("**************************************************************************");
               Thread.sleep(500); 
   		System.out.println("**************************************************************************");
                Thread.sleep(500); 
   		System.out.println("||" + "\t\t       PHILIPPINE STATISTICS AUTHORITY\t\t\t" + "||");
                Thread.sleep(500); 
		System.out.println("||" + "\t\t\t\t\t\t\t\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\t\t\t   OFFICIAL RECEIPT" + " \t\t\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\t\t\t\t\t\t\tAmount\t" + "\t||");
                Thread.sleep(500); 
		System.out.println("||" + "----------------------------------------------------------------------" + "||");
                Thread.sleep(500); 
		System.out.println("||" + "\t" + name + "\t\t\t\t\t\t\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\tCopy of Issurance - PSA CERTIFICATE" + "\t\t\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\tUnit cost: " + piece  + "\t Qty: " + copies + "\t\t\t\t" + price + "\t\t||" );
                Thread.sleep(500); 
		System.out.println("||" + "\tDelivery fee:\t " + "\t\t\t\t50.00" + "\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\tTotal\t\t\t" + "\t\t\t" + price + "\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\tAmount Tendered:\t " + "\t\t\t" + amount + "\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\tChange:\t\t " + "\t\t\t\t" + minus + "\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\t\tINCLUDE DOCUMENTARY STAMP TAX OF" + "\t\t\t||");
                Thread.sleep(500); 
		System.out.println("||" + "\t\t\tPHP30.00/COPY" + "\t\t\t\t\t||");
                Thread.sleep(500); 
		System.out.println("||----------------------------------------------------------------------||");
                Thread.sleep(500); 
		System.out.println("||" + "\t\tCollecting Officer: Benneth, Marciano" + "\t\t\t||");
                Thread.sleep(500); 
        System.out.println("||" + "\t\tDate-Time: 01/18/2024 00:06:08" + "\t\t\t\t||");
        Thread.sleep(500); 
        System.out.println("||----------------------------------------------------------------------||"); 
        Thread.sleep(500); 
        System.out.println("||----------------------------------------------------------------------||");
        Thread.sleep(500); 
        System.out.println("**************************************************************************");
        Thread.sleep(500); 
   		System.out.println("**************************************************************************");
                   
                 }
                catch(InterruptedException f){
                f.printStackTrace();
                }
	}
 
	public void DeliveryreceiptDeathCertificate() {
            		 Scanner s = new Scanner(System.in);

	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tFull name of receiver: ");
	String name = s.next();
	
	System.out.print("\tContact number ex.(0912345678): ");
	String contact = s.next();
	
	System.out.print("\tDelivery address:");
	String address = s.next();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("\tPlease check delivery information.");
	System.out.println("\tName: " + name);
	System.out.println("\tContact Number: " + contact);
	System.out.println("\tDelivery: " + address);
	System.out.println(" ");
	System.out.println("\tPlease be reminded that the payment fee for (1)copy CENOMAR Certificate is PHP250.00");
	System.out.println("\twe will call to " + contact + " once the certificate is ready for pick up. Thank you!");
	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tCheck the details if correct to proceed(Y/N):");
	String details = s.next();
	System.out.println("----------------------------------------------------------------------------------");
	if(details.equalsIgnoreCase("Y"));
		System.out.println("\tPAYMENT DETAILS");
		System.out.println("----------------------------------------------------------------------------------");
        System.out.print("\tHow many copies?: ");
        int copies = s.nextInt();
        int piece = 250;
        int tax1 = 30;
        double price = copies * piece;
        System.out.println("\tTotal: " + price);
        System.out.print("\tEnter the amount you recieved: ");
        double amount = s.nextDouble();
        double change = amount - price;
        double minus1 = change - tax1;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tPrinting of receipt. Please wait a moment...");
   if(details.equalsIgnoreCase("N")) {
		System.out.println("Incorrect your details please fill-up correctly.");

   }
   try{
   		System.out.println("**************************************************************************");
                Thread.sleep(300); 
   		System.out.println("**************************************************************************");
                   Thread.sleep(300); 
   		System.out.println("||" + "\t\t       PHILIPPINE STATISTICS AUTHORITY\t\t\t" + "||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\t\t   OFFICIAL RECEIPT" + " \t\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\tAmount\t" + "\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "----------------------------------------------------------------------" + "||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t" + name + "\t\t\t\t\t\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\tCopy of Issurance - CENOMAR CERTIFICATE" + "\t\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\tUnit cost: " + piece  + "\t Qty: " + copies + "\t\t\t\t" + price + "\t\t||" );
                   Thread.sleep(300); 
		System.out.println("||" + "\tDelivery fee:\t " + "\t\t\t\t50.00" + "\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\tTotal\t\t\t" + "\t\t\t" + price + "\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\tAmount Tendered:\t " + "\t\t\t" + amount + "\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\tChange:\t\t " + "\t\t\t\t" + minus1 + "\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\tINCLUDE DOCUMENTARY STAMP TAX OF" + "\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\t\tPHP30.00/COPY" + "\t\t\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||----------------------------------------------------------------------||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\tCollecting Officer: Benneth, Marciano" + "\t\t\t||");
                   Thread.sleep(300); 
        System.out.println("||" + "\t\tDate-Time: 01/18/2024 00:11:18" + "\t\t\t\t||");
           Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||"); 
           Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||");
           Thread.sleep(300); 
        System.out.println("**************************************************************************");
           Thread.sleep(300); 
   		System.out.println("**************************************************************************");
                   Thread.sleep(300); 
                   
                   
	 } 
    catch(InterruptedException f){
                f.printStackTrace();
    }
        }
		
	public void DeliveryreceiptMarraige() {
            		 Scanner s = new Scanner(System.in);

	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tFull name of receiver: ");
	String name = s.next();
	
	System.out.print("\tContact number ex.(0912345678): ");
	String contact = s.next();
	
	System.out.print("\tDelivery address:");
	String address = s.next();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("\tPlease check delivery information.");
	System.out.println("\tName: " + name);
	System.out.println("\tContact Number: " + contact);
	System.out.println("\tDelivery: " + address);
	System.out.println(" ");
	System.out.println("\tPlease be reminded that the payment fee for (1)copy");
	System.out.println("\tof PSA Certificate is Php and Delivery fee is 50.00");
	System.out.println("----------------------------------------------------------------------------------");
	System.out.print("\tCheck the details if correct to proceed(Y/N):");
	String details = s.next();
	System.out.println("----------------------------------------------------------------------------------");
	if(details.equalsIgnoreCase("Y"));
		System.out.println("\tPAYMENT DETAILS");
		System.out.println("----------------------------------------------------------------------------------");
        System.out.print("\tHow many copies?: ");
        int copies = s.nextInt();
        int piece = 250;
        int tax2 = 30;
        double price = copies * piece;
        System.out.println("\tTotal: " + price);
        System.out.print("\tEnter the amount you recieved: ");
        double amount = s.nextDouble();
        double change = amount - price;
        double minus2 = change - tax2;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tPrinting of receipt. Please wait a moment...");
   if(details.equalsIgnoreCase("N")) {
		System.out.println("Incorrect your details please fill-up correctly.");

   }try{
   		System.out.println("**************************************************************************");
                   Thread.sleep(300); 
   		System.out.println("**************************************************************************");
                   Thread.sleep(300); 
   		System.out.println("||" + "\t\t       PHILIPPINE STATISTICS AUTHORITY\t\t\t" + "||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\t\t   OFFICIAL RECEIPT" + " \t\t\t\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t\t\t\t\t\t\tAmount\t" + "\t||");
                   Thread.sleep(300); 
		System.out.println("||" + "----------------------------------------------------------------------" + "||");
                   Thread.sleep(300); 
		System.out.println("||" + "\t" + name + "\t\t\t\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tCopy of Issurance - MARRIAGE CERTIFICATE" + "\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tUnit cost: " + piece  + "\t Qty: " + copies + "\t\t\t\t" + price + "\t\t||" );
                  Thread.sleep(300); 
		System.out.println("||" + "\tDelivery fee:\t " + "\t\t\t\t50.00" + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tTotal\t\t\t" + "\t\t\t" + price + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tAmount Tendered:\t " + "\t\t\t" + amount + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\tChange:\t\t " + "\t\t\t\t" + minus2 + "\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\tINCLUDE DOCUMENTARY STAMP TAX OF" + "\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\t\tPHP30.00/COPY" + "\t\t\t\t\t||");
                  Thread.sleep(300); 
		System.out.println("||----------------------------------------------------------------------||");
                  Thread.sleep(300); 
		System.out.println("||" + "\t\tCollecting Officer: Benneth,Marciano" + "\t\t\t||");
                  Thread.sleep(300); 
        System.out.println("||" + "\t\tDate-Time: 01/18/2024 00:12:36" + "\t\t\t\t||");
          Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||"); 
          Thread.sleep(300); 
        System.out.println("||----------------------------------------------------------------------||");
          Thread.sleep(300); 
        System.out.println("**************************************************************************");
          Thread.sleep(300); 
   		System.out.println("**************************************************************************");
                  Thread.sleep(300); 
                   
                   }
                catch(InterruptedException f){
                f.printStackTrace();}
        }   }
		