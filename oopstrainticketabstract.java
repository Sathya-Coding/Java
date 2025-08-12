import java.util.Scanner;

abstract class ticket{
    abstract void ticketdetails();
}
    class type extends ticket {
        private String passangername;
        private String Tickettype;
        private int distance;
        private double fare;

        public type(String passangername, String Tickettype, int distance) {
            this.passangername = passangername;
            this.distance = distance;
            setTickettype(Tickettype);
        }
        public String getPassangername() {
            return passangername;
        }
        public void setPassangername(String passangername) {
            this.passangername=passangername;
        }

        public String getTickettype() {
            return Tickettype;
        }

        public void setTickettype(String tickettype) {
           this.Tickettype=tickettype;
            if(Tickettype.equalsIgnoreCase("Sleeper")) {
                this.fare = 5.90;
            }
             else if(Tickettype.equalsIgnoreCase("Ac"))   {
                 this.fare=7.90;
                }
            else {
                this.fare=3.90;
            }
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance=distance;
        }

        public double getFare() {
            return fare;
        }
        public void setTotalfare() {
            double totalfare = distance * fare;
        }
        public void ticketdetails(){
            System.out.println("Booking Details");
            System.out.println("Passenger Name: " + passangername);
            System.out.println("Ticket Type: " + getTickettype());
            System.out.println("Distance: " + distance + " km");
            System.out.printf("Fare: ₹%.2f\n", (distance * fare));
        }
}
public class
oopstrainticketabstract {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Passenger Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Ticket Type (Sleeper/AC/General): ");
        String ticketType = scanner.nextLine();

        System.out.print("Enter Distance (in km): ");
        int distance = scanner.nextInt();

        ticket t = new type(name, ticketType, distance); // no fare input now
        t.ticketdetails();
    }
}

