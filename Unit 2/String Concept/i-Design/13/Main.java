import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int n = Integer.parseInt(scanner.nextLine());

        Item[] items = new Item[n];

        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split("\\$");
            items[i] = new Item(details[0], details[1], Integer.parseInt(details[2]), Integer.parseInt(details[3]));
        }

        System.out.println("Items:");
        for (Item item : items) {
            StringBuilder sb = new StringBuilder();
            sb.append(item.getName()).append(",");
            sb.append(item.getType()).append(",");
            sb.append(item.getCost()).append(",");
            sb.append(item.getAvailableQuantity());

            System.out.println(sb.toString());
        }
    }
}