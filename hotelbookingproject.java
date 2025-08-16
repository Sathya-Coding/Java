import java.util.*;
import java.io.*;

public class hotelbookingproject {

    static class Room {
        int roomNumber;
        String roomType;
        boolean isAC;
        int price;
        boolean isBooked;

        Room(int roomNumber, String roomType, boolean isAC, int price) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.isAC = isAC;
            this.price = price;
            this.isBooked = false;
        }

        public String toString() {
            return "Room " + roomNumber + " | Type: " + roomType + (isAC ? " (AC)" : " (General)") +
                    " | ₹" + price + " | Status: " + (isBooked ? "Booked" : "Available");
        }
    }

    static class User {
        String name;
        String password;
        long mobile;

        User(String name, String password, long mobile) {
            this.name = name;
            this.password = password;
            this.mobile = mobile;
        }
    }

    static Map<Integer, Room> rooms = new HashMap<>();
    static Map<String, User> users = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static int totalBooked = 3, totalCancelled = 4;

    public static void main(String[] args) {
        initializeRooms();
        users.put("Mani", new User("Mani", "2510", 9876543210L));

        while (true) {
            System.out.println("\n--- Hotel Room Booking System ---");
            System.out.println("1. Admin Login\n2. Customer Login\n3. Customer Registration\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 : adminLogin();
                case 2 : customerLogin();
                case 3 : registerCustomer();
                case 4 : {
                    System.out.println("Thank you for using the system!");
                    break;
                }
                default : System.out.println("Invalid choice.");
            }
        }
    }

    static void initializeRooms() {
        for (int i = 101; i <= 110; i++)
            rooms.put(i, new Room(i, "Deluxe Room", true, 2500));
        for (int i = 111; i <= 115; i++)
            rooms.put(i, new Room(i, "Family Room", true, 2300));
        for (int i = 116; i <= 120; i++)
            rooms.put(i, new Room(i, "Family Room", false, 2000));
        for (int i = 121; i <= 125; i++)
            rooms.put(i, new Room(i, "Double Bed Room", true, 1800));
        for (int i = 126; i <= 130; i++)
            rooms.put(i, new Room(i, "Double Bed Room", false, 1500));
        for (int i = 131; i <= 135; i++)
            rooms.put(i, new Room(i, "Single Bedroom", true, 1200));
        for (int i = 136; i <= 140; i++)
            rooms.put(i, new Room(i, "Single Bedroom", false, 1000));
    }

    static void adminLogin() {
        System.out.print("Enter Admin Username: ");
        String user = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();
        if (user.equals("Sathya") && pass.equals("1025")) {
            System.out.println("Admin Login Successful!");
            adminMenu();
        } else {
            System.out.println("Invalid admin credentials.");
        }
    }

    static void adminMenu() {
        System.out.println("\n--- Admin Panel ---");
        System.out.println("Total Rooms Booked: " + totalBooked);
        System.out.println("Total Cancellations: " + totalCancelled);
        System.out.println("\n--- Room Availability Breakdown ---");
        displayRoomAvailabilityByType();
    }

    static void displayRoomAvailabilityByType() {
        int deluxeAC = 0, familyAC = 0, familyGen = 0;
        int doubleAC = 0, doubleGen = 0;
        int singleAC = 0, singleGen = 0;

        for (Room room : rooms.values()) {
            if (!room.isBooked) {
                switch (room.roomType) {
                    case "Deluxe Room" -> deluxeAC++;
                    case "Family Room" -> {
                        if (room.isAC) familyAC++;
                        else familyGen++;
                    }
                    case "Double Bed Room" -> {
                        if (room.isAC) doubleAC++;
                        else doubleGen++;
                    }
                    case "Single Bedroom" -> {
                        if (room.isAC) singleAC++;
                        else singleGen++;
                    }
                }
            }
        }

        System.out.println("Available Deluxe Room (AC): " + deluxeAC);
        System.out.println("Available Family Room (AC): " + familyAC);
        System.out.println("Available Family Room (General): " + familyGen);
        System.out.println("Available Double Bed Room (AC): " + doubleAC);
        System.out.println("Available Double Bed Room (General): " + doubleGen);
        System.out.println("Available Single Bedroom (AC): " + singleAC);
        System.out.println("Available Single Bedroom (General): " + singleGen);
    }

    static void registerCustomer() {
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Create Password: ");
        String pass = sc.next();
        System.out.print("Enter Mobile Number: ");
        long mob = sc.nextLong();
        users.put(name, new User(name, pass, mob));
        System.out.println("Registration successful. You can now login.");
    }

    static void customerLogin() {
        System.out.print("Enter Username: ");
        String name = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();
        User u = users.get(name);
        if (u != null && u.password.equals(pass)) {
            System.out.println("Login successful. Welcome, " + u.name + "!");
            customerMenu(u.name);
        } else {
            System.out.println("Invalid login credentials.");
        }
    }

    static void customerMenu(String customerName) {
        System.out.println("\n--- Customer Menu ---");
        System.out.println("1. View Available Rooms");
        System.out.println("2. Book a Room");
        System.out.println("3. Cancel Booking");
        System.out.print("Choose an option: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1 -> displayAvailableRoomsWithFacilities();
            case 2 -> {
                System.out.println("\nAvailable Rooms for Booking:");
                for (Room room : rooms.values()) {
                    if (!room.isBooked) {
                        System.out.println(room);
                        System.out.println("Facilities: " + getFacilities(room));
                    }
                }
                System.out.print("Enter Room Number to Book: ");
                int rno = sc.nextInt();
                Room selectedRoom = rooms.get(rno);
                if (selectedRoom != null && !selectedRoom.isBooked) {
                    System.out.print("Enter number of days to stay: ");
                    int days = sc.nextInt();
                    int total = selectedRoom.price * days;
                    bookRoom(rno);
                    System.out.println("Room " + rno + " booked successfully for " + days + " days.");
                    System.out.println("Total Amount: ₹" + total);
                    saveBillToFile(customerName, selectedRoom, days);
                    saveToBookingHistory(customerName, selectedRoom, days);
                } else {
                    System.out.println("Room not available or already booked.");
                }
            }
            case 3 -> {
                System.out.print("Enter Room Number to Cancel: ");
                int rno = sc.nextInt();
                if (cancelBooking(rno))
                    System.out.println("Booking for Room " + rno + " cancelled.");
                else
                    System.out.println("Room not booked or invalid number.");
            }
            case 4-> {
                System.out.println("Exit");
            }
            default -> System.out.println("Invalid option. Try again.");
        }
        System.out.println("Returning to Main Menu...");
    }

    static void displayAvailableRoomsWithFacilities() {
        for (Room room : rooms.values()) {
            if (!room.isBooked) {
                System.out.println(room);
                System.out.println("Facilities: " + getFacilities(room));
            }
        }
    }

    static String getFacilities(Room room) {
        String type = room.roomType;
        boolean isAC = room.isAC;

        return switch (type) {
            case "Deluxe Room" -> "Shoot room, Hot water, Drinking water, AC, WiFi, TV, Balcony view";
            case "Family Room" -> isAC ?
                    "Triple bed, Hot water, WiFi, TV, AC" :
                    "Triple bed, Hot water, WiFi, TV";
            case "Double Bed Room" -> isAC ?
                    "Double bed, Hot water, WiFi, TV, AC" :
                    "Double bed, Hot water, WiFi, TV";
            case "Single Bedroom" -> isAC ?
                    "Single bed, Hot water, WiFi, TV, AC" :
                    "Single bed, Hot water, WiFi, TV";
            default -> "No facilities listed";
        };
    }

    static boolean bookRoom(int roomNo) {
        Room room = rooms.get(roomNo);
        if (room != null && !room.isBooked) {
            room.isBooked = true;
            totalBooked++;
            return true;
        }
        return false;
    }

    static boolean cancelBooking(int roomNo) {
        Room room = rooms.get(roomNo);
        if (room != null && room.isBooked) {
            room.isBooked = false;
            totalCancelled++;
            return true;
        }
        return false;
    }

    static void saveBillToFile(String customerName, Room room, int days) {
        int total = room.price * days;
        String filename = "bill_" + room.roomNumber + ".txt";

        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println("--- Hotel Room Booking Receipt ---\n");
            writer.println("Customer Name   : " + customerName);
            writer.println("Room Number     : " + room.roomNumber);
            writer.println("Room Type       : " + room.roomType + (room.isAC ? " (AC)" : " (General)"));
            writer.println("Facilities      : " + getFacilities(room));
            writer.println("Price Per Day   : ₹" + room.price);
            writer.println("Number of Days  : " + days);
            writer.println("Total Amount    : ₹" + total);
            writer.println("\nThank you for booking with us!");
            System.out.println("Receipt saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing bill: " + e.getMessage());
        }
    }

    static void saveToBookingHistory(String customerName, Room room, int days) {
        int total = room.price * days;
        String type = room.roomType + (room.isAC ? " (AC)" : " (General)");

        try (FileWriter fw = new FileWriter("bookings.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println("Customer: " + customerName +
                    " | Room: " + room.roomNumber +
                    " | Type: " + type +
                    " | Days: " + days +
                    " | Total: ₹" + total);
        } catch (IOException e) {
            System.out.println("Error saving booking history: " + e.getMessage());
        }
    }
}
