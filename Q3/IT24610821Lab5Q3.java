import java.util.Scanner;
public class IT24104179Lab5Q3{
public static void main(String[] args ){
Scanner input = new Scanner(System.in);

final double room_Day_Charges = 48000;
int reserved_days;
double amount;

System.out.print("Enter Start Date (1-31): ");
int start = input.nextInt();
System.out.print("Enter End Date (1-31): ");
int end = input.nextInt();

if(start >= 0 && start <= 31 && end >= 0 && end <= 31 ){
            if( end > start){
                reserved_days = end - start;
		 if(reserved_days<3){
			System.out.println("Room Charges Per Day: "+"Rs. "+room_Day_Charges+"/=");
			System.out.println("Number Of Days Reserved: "+reserved_days);
			amount = reserved_days*room_Day_Charges;
			System.out.println("Total Amount to be paid: "+amount);
                 }else if(reserved_days>=3 && reserved_days<=4){
			System.out.println("Room Charges Per Day: "+"Rs. "+room_Day_Charges+"/=");
			System.out.println("Number Of Days Reserved: "+reserved_days);
			amount = reserved_days*room_Day_Charges*0.9;
			System.out.println("Total Amount to be paid: "+amount);
                 }else {
			System.out.println("Room Charges Per Day: "+"Rs. "+room_Day_Charges+"/=");
			System.out.println("Number Of Days Reserved: "+reserved_days);
			amount = reserved_days*room_Day_Charges*0.8;
			System.out.println("Total Amount to be paid: "+amount);  }
	   }else{
		System.out.print("Error: Start Day must be less than end date");
                }
}else{System.out.print("Error: Days must be between 1 and 31");}
}
}