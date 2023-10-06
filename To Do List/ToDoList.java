import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n==== To-Do List ====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();
                    todoList.add(itemToAdd);
                    System.out.println("NICE , item has been added to your list !!");
                    break;
                case 2:
                    if (todoList.isEmpty()) {
                        System.out.println("Oops , Your List is Empty !!!");
                    } else {
                        System.out.println("Current To-Do List:");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                        
                        System.out.print("Enter the item number to remove: ");
                        int iNTRemove = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (iNTRemove >= 1 && iNTRemove <= todoList.size()) {
                            String RemovedList = todoList.remove(iNTRemove - 1);
                            System.out.println(RemovedList + " removed from your list.");
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    }
                    break;
                case 3:
                    if (todoList.isEmpty()) {
                        System.out.println("Oops , Your List is Empty !!!");
                    } else {
                        System.out.println("Current To-Do List:");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

