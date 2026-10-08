import java.util.Scanner;
class MovieTicket{
    String movieName;
    int ticketPrice;
    int numberofTickets;

    public MovieTicket(String movieName, int ticketPrice, int numberofTickets){
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberofTickets = numberofTickets;
    }
    public double calculateTotalPrice(){
        return ticketPrice * numberofTickets;
    }
    public double calculateDiscount(double totalPrice){
        if(numberofTickets >= 5){
            return totalPrice * 0.10;
        }
        return 0;
    }
    public double calculateFinalPrice(double totalPrice, double discount){
        return totalPrice - discount;
    }
    public void displayBill(){
        double totalPrice = calculateTotalPrice();
        double discount = calculateDiscount(totalPrice);
        double finalPrice = calculateFinalPrice(totalPrice, discount);

        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberofTickets);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        int ticketPrice = sc.nextInt();

        System.out.print("Enter number of tickets: ");
        int numberofTickets = sc.nextInt();

        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberofTickets);
        ticket.displayBill();
    }
}