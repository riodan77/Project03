
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Creating empty priority queue
        PriorityQueue<Location> pQueue = new PriorityQueue<>();
        File file = new File("100RandomLocations.txt");

        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] tmp = line.split("\\s+");

            Location location = new Location(Integer.parseInt(tmp[0]), tmp[1], tmp[2], Integer.parseInt(tmp[3]));

            pQueue.add(location);

        }
        input.close();

        /* Menu Items */
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 5) {
            System.out.println("1. Print All Locations");
            System.out.println("2. Print The Peek Location[Nearest]");
            System.out.println("3. Remove Head [Nearest After Delivered]");
            System.out.println("4. Search For Location");
            System.out.println("5. Quit");
            System.out.print("Choice> ");
            choice = sc.nextInt();
            System.out.println("--------------------");
            switch (choice) {
                case 1:

                    Iterator itr = pQueue.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 2:
                    System.out.println(pQueue.peek());
                    break;

                case 3:
                    pQueue.poll();
                    System.out.print("Nearest Order Removed");
                    break;

                case 4:
                    System.out.print("Enter house Number:");
                    int houseNumber;
                    houseNumber = sc.nextInt();
                    
                    String streetName;
                    System.out.print("Enter street Name:");
                    streetName = sc.next();
                    
                    String streetNumber;
                    System.out.print("Enter street Number:");
                    streetNumber = sc.next();
                    
  
                    Location loc = new Location(houseNumber, streetName, streetNumber, 0);
                    
                    String location = sc.nextLine();
                    boolean b = pQueue.contains(loc);
                    System.out.println("Searching for Location: " + loc);
                    if (b) {
                        System.out.println("Location Found");
                    } else {
                        System.out.println("Oops, The location Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Bye");
                    break;
            }
            System.out.println("--------------------");

        }

    }
}
