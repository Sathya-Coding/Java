import java.io.*;

public class exceptionhandlingshoppingcart {
    public static void main(String[] args) {
        String inputFile = "orders.txt";
        String outputFile = "bills.txt";

        String[] customers = new String[100];
        int[] totals = new int[100];
        int customerCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length == 4) {
                    String customer = parts[0];
                    int quantity = Integer.parseInt(parts[2]);
                    int price = Integer.parseInt(parts[3]);
                    int amount = quantity * price;

                    boolean found = false;

                    for (int i = 0; i < customerCount; i++) {
                        if (customers[i].equals(customer)) {
                            totals[i] += amount;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        customers[customerCount] = customer;
                        totals[customerCount] = amount;
                        customerCount++;
                    }
                }
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            for (int i = 0; i < customerCount; i++) {
                bw.write(customers[i] + " Total Bill: ₹" + totals[i]);
                bw.newLine();
            }
            bw.close();

            System.out.println("Bill written successfully to bills.txt ✅");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
