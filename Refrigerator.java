/**
 * Represents a Refrigerator with various properties such as color, temperature,
 * material, size, ice tray availability, and technology type.
 */
public class Refrigerator {

    // Instance variables
    private String color;
    private double temperature;
    private String material;
    private String size;
    private IceTray iceTray;
    private String technology;

    /**
     * Constructs a Refrigerator with the specified properties.
     *
     * @param color      the color of the refrigerator
     * @param temperature the temperature setting of the refrigerator
     * @param material   the material of the refrigerator
     * @param size       the size of the refrigerator
     * @param iceTray    whether the refrigerator has an ice tray
     * @param technology the technology type of the refrigerator
     */
    public Refrigerator(String color, double temperature, String material, String size, IceTray iceTray, String technology) {
        this.color = color;
        this.temperature = temperature;
        this.material = material;
        this.size = size;
        this.iceTray = iceTray;
        this.technology = technology;
    }

    /**
     * Constructs a Refrigerator with default temperature, material, and technology.
     *
     * @param color   the color of the refrigerator
     * @param size    the size of the refrigerator
     * @param iceTray whether the refrigerator has an ice tray
     */
    public Refrigerator(String color, String size, IceTray iceTray) {
        this.color = color;
        this.size = size;
        this.iceTray = iceTray;
        this.temperature = 4.0; // Default temperature
        this.material = "Steel"; // Default material
        this.technology = "Standard"; // Default technology
    }

    /**
     * Changes the temperature of the refrigerator.
     *
     * @param newTemp the new temperature to set
     * @return the updated temperature of the refrigerator
     */
    public double changeTemp (double newTemp) {
        this.temperature = newTemp;
        return this.temperature;
    }

    /**
     * Dispenses water from the refrigerator.
     */
    public void dispenseWater () {
        System.out.println("Dispensing water...");
    }

    /**
     * Ages the refrigerator by modifying its material property.
     */
    public void ageRefrigerator() {
        if (this.material.equals("Steel")) {
            this.material = "Rusty Steel";
        }

        else {
            this.material = "Worn " + this.material;
        }
    }

    /**
     * Upgrades the technology of the refrigerator.
     *
     * @param newTech the new technology to set
     * @return the updated technology of the refrigerator
     */
    public String upgradeTechnology(String newTech) {
        this.technology = newTech;
        return this.technology;
    }

    /**
     * Gets the color of the refrigerator.
     *
     * @return the color of the refrigerator
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the refrigerator.
     *
     * @param color the new color of the refrigerator
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the temperature of the refrigerator.
     *
     * @return the temperature of the refrigerator
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature of the refrigerator.
     *
     * @param temperature the new temperature of the refrigerator
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Gets the material of the refrigerator.
     *
     * @return the material of the refrigerator
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the material of the refrigerator.
     *
     * @param material the new material of the refrigerator
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Gets the size of the refrigerator.
     *
     * @return the size of the refrigerator
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of the refrigerator.
     *
     * @param size the new size of the refrigerator
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Checks if the refrigerator has an ice tray.
     *
     * @return true if the refrigerator has an ice tray, false otherwise
     */
    public IceTray hasIceTray() {
        return iceTray;
    }

    /**
     * Sets whether the refrigerator has an ice tray.
     *
     * @param iceTray true if the refrigerator has an ice tray, false otherwise
     */
    public void setIceTray(IceTray iceTray) {
        this.iceTray = iceTray;
    }

    /**
     * Gets the technology type of the refrigerator.
     *
     * @return the technology type of the refrigerator
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets the technology type of the refrigerator.
     *
     * @param technology the new technology type of the refrigerator
     */
    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Refrigerator [color=" + color + ", temperature=" + temperature + ", material=" + material + ", size="
                + size + ", iceTray=" + iceTray + ", technology=" + technology + "]";
    }
}
