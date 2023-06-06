import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int weekTenSum = 1+2+3+4+5+6+7+8+9+10;
        return weekTenSum;
    }

    public double getOrderTotal(double[] prices) {
        double totalSum = 0;
        for(int i=0; i<prices.length; i++) {
            totalSum += prices[i];
        }
        return totalSum;
    }

    public void displayMenu(ArrayList<String>menuItems) {
        for(int i=0; i<menuItems.size(); i++) {
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }
    }

    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName);
        // add userName to customers ArrayList
        customers.add(userName);
        int customerCount = (customers.size()-1);
        System.out.println("There are " + customerCount + " people in front of you");
        System.out.println(customers);
    }
}