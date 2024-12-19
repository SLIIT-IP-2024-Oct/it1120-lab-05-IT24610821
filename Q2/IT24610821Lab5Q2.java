import java.util.Scanner;
public class IT24104179Lab5Q2{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 int members = input.nextInt();
 if(members >= 0){
 switch (members){
 case 0:
	System.out.print("Prize is a : No Prize");
	break;
 case 1:
	System.out.print("Prize is a : Pen");
	break;
 case 2:
	System.out.print("Prize is a : Umbrella");
	break;
 case 3:
	System.out.print("Prize is a : Bag");
	break;
 case 4:
	System.out.print("Prize is a : Travelling Chair");
	break;
 case 5:
	System.out.print("Prize is a : Headphone");
	break;
 default:
	System.out.print("Prize is a : Headphone");
   }
  }else{System.out.print("Input must be a number 0 or geater");}
 
 }
 
}