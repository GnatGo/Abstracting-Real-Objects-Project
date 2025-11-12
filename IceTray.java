public class IceTray {
    private int capacity; // Number of ice cubes the tray can hold
    private String material; // Material of the ice tray (e.g., plastic, metal)

    /**
     * Constructs an IceTray with the specified capacity and material.
     *
     * @param capacity the capacity of the ice tray
     * @param material the material of the ice tray
     */
    public IceTray(int capacity, String material) {
        this.capacity = capacity;
        this.material = material;
    }

    /**
     * Gets the capacity of the ice tray.
     *
     * @return the capacity of the ice tray
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the ice tray.
     *
     * @param capacity the new capacity of the ice tray
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the material of the ice tray.
     *
     * @return the material of the ice tray
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the material of the ice tray.
     *
     * @param material the new material of the ice tray
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "IceTray{" +
                "capacity=" + capacity +
                ", material='" + material + '\'' +
                '}';
    }
}
