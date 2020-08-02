
import java.util.Scanner;

public class LiquidContainers2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container containers1 = new Container();
        Container containers2 = new Container();
      
        while (true) {
            System.out.println("First: " + containers1);
            System.out.println("Second: " + containers2);
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                containers1.add(amount);
                System.out.println("");
            } else if (command.equals("move")) {
                if (containers1.contains() >= amount) {
                    containers2.add(amount);
                    containers1.remove(amount);
                }else{
                    containers2.add(containers1.contains());
                    containers1.remove(containers1.contains());
                }
                System.out.println("");
            } else if (command.equals("remove")) {
                containers2.remove(amount);
                System.out.println("");
            }
            
        }
        
    }
    
}
