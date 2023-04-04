public class CafeJava {

    public static void main(String[] args){
        
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattePrice = 3;
        double cappucinoPrice = 2.0;
        double dripCoffeePrice = 1.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        System.out.println(isReadyOrder1 ? customer1 + readyMessage : customer1 + pendingMessage);

        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (lattePrice * 2));
        if (!isReadyOrder2) {
            System.out.println(customer2 + pendingMessage);
        }
        else {
            System.out.println(customer2 + readyMessage);
        }

        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (dripCoffeePrice));
        System.out.println("Sorry " + customer3 + "Your ordered a Latte instead. You owe us $" + (lattePrice - dripCoffeePrice));

    }
    
}
