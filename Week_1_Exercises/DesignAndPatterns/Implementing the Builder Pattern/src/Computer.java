public class Computer {
    // Required parameters
    private String CPU;
    private String RAM;

    // Optional parameters
    private String Storage;
    private String GraphicsCard;
    private boolean hasWiFi;

    // Private constructor to be used by the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GraphicsCard = builder.GraphicsCard;
        this.hasWiFi = builder.hasWiFi;
    }

    // Getters for the attributes
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return Storage; }
    public String getGraphicsCard() { return GraphicsCard; }
    public boolean hasWiFi() { return hasWiFi; }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String CPU;
        private String RAM;

        // Optional parameters
        private String Storage = "256GB SSD";
        private String GraphicsCard = "Integrated";
        private boolean hasWiFi = true;

        // Constructor with required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter methods for optional parameters
        public Builder setStorage(String storage) {
            this.Storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.GraphicsCard = graphicsCard;
            return this;
        }

        public Builder setHasWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        // Build method to return the final Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
