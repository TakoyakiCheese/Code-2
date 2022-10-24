import java.util.Scanner;


public class RunBloodData {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String bt, rh;
        
        System.out.print("\nEnter blood type of patient: ");
        bt = sc.nextLine();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        rh = sc.nextLine();
        
        if(bt.isEmpty() && rh.isEmpty()) {
            BloodData bd = new BloodData();
            bd.display();
        } else if(bt.isEmpty()) {
            System.out.println("\nInvalid input!");
        } else if(rh.isEmpty()) {
            System.out.println("\nInvalid input.");
        } else if(bt.equals("A") || bt.equals("B") || bt.equals("O") || bt.equals("AB")){
            BloodData bd = new BloodData(bt, rh);
            bd.display();
        } else {
            System.out.println("\nInvalid blood type.");
        }
        
    }
    
}