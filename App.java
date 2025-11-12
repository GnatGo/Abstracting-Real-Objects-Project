public class App {
    public static void main(String[] args) throws Exception {
        IceTray newTray = new IceTray(8, "Plastic");
        // Create a Refrigerator object
        Refrigerator fridge = new Refrigerator("White", 4.0, "Steel", "Medium", newTray, "Basic Cooling");

        // Test the changeTemp method
        System.out.println("Initial Temperature: " + fridge.getTemperature());
        fridge.changeTemp(-2.0); // Change the temperature
        System.out.println("After Changing Temperature: " + fridge.getTemperature());

        // Test the ageRefrigerator method
        System.out.println("\nInital material: " + fridge.getMaterial());
        fridge.ageRefrigerator(); // Simulate aging the refrigerator
        System.out.println("After aging: " + fridge.getMaterial());

        // Test the dispenseWater method
        System.out.println("\nTesting dispenseWater:");
        fridge.dispenseWater(); // Dispense water

        // Test the upgradeTechnology method
        System.out.println("\nInitial Technology: " + fridge.getTechnology());
        fridge.upgradeTechnology("Advanced Cooling"); // Upgrade the technology
        System.out.println("After Upgrading Technology: " + fridge.getTechnology());
    }
}
