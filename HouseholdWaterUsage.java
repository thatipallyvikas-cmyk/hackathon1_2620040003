import java.util.Scanner;

class HouseholdWaterUsage{
  public static int calculateTotal(int morningUsage, int eveningUsage){
    return morningUsage + eveningUsage;
  }
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of people in the household: ");
int numberOfPeople = sc.nextInt();
System.out.print("Water consumed in liters: ");
int waterConsumedLiters = sc.nextInt();
System.out.println("House number: ");
int houseNumber = sc.nextInt();
System.out.println("Water usage status ( A says active,N says Not active):  ");
char status = sc.next().charAt(0);
System.out.println("Enter the morning water usage in liters: ");
int morningUsage = sc.nextInt();
System.out.println("Enter the evening water usage in liters: ");
int eveningUsage = sc.nextInt();
int totalUsage = calculateTotal(morningUsage, eveningUsage);
System.out.println("Total water usage in the morning liters: " + morningUsage);
System.out.println("Total water usage in the evening liters: " + eveningUsage);
System.out.println("Total water usage in liters: " + totalUsage);
System.out.println("House number: " + houseNumber);
System.out.println("Number of people in the household: " + numberOfPeople);
System.out.println("Water consumed in liters: " + waterConsumedLiters);
if(status == 'A' || status == 'a'){
System.out.println("Water usage status: Active");
}else if(status == 'N' || status == 'n'){
      System.out.println("Water usage status: Not Active");
    }
    if (waterConsumedLiters <= 500){
      System.out.println("The bill is 100/-");
  }
  else if (waterConsumedLiters > 500){
      System.out.println("The bill is 200/-");
  }
 }
}