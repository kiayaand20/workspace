class Television {
    //  FIELDS or INSTANCE VARIABLES
    private String brand = "Toshiba";
    private int volume = 1;
    private boolean muted = false;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    private int previousVolume = 0;
    DisplayType display = DisplayType.LED;


    //  CONSTRUCTORS
    public Television(){
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume); //used for data validation
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand);
        this.volume = volume;
        this.display = display;
    }

    //  BUSINESS METHODS
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV to volume " + volume + ".");
    }

    public void turnOff() {
        System.out.println("Shutting down your " + brand + " TV now. Goodnight!");
    }

    public boolean isMuted(){
        return muted;
    }

    //  ACCESSOR METHODS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        switch(brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Error. Not a valid brand");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume < MIN_VOLUME || volume > MAX_VOLUME) {
            System.out.println("Error. Invalid volume. Must be between 0 and 100.");
        } else {
            this.volume = volume;
            muted = false;
        }
    }

    public void setMuted(boolean muted){
        this.muted =  muted;
    }

    public int getPreviousVolume(){
        return previousVolume;
    }

    public void setPreviousVolume(int previousVolume){
        this.previousVolume = previousVolume;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean toggleMute() {
        if (isMuted()) {
            performUnmuteOperation();
            System.out.println("TV volume is not muted. Reset volume to previous value: " + getVolume());
        } else {
            performMuteOperation();
            System.out.println("TV volume is muted. The volume is " + getVolume());
        }
        return muted;
    }

    private void performMuteOperation(){
        setPreviousVolume(getVolume());
        setVolume(MIN_VOLUME);
        setMuted(true);
    }

    private void performUnmuteOperation(){
        setVolume(getPreviousVolume());
        setMuted(false);
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    //  toString() METHOD
    @Override
    public String toString() {
        return "Television: " + "brand= " + brand + ", volume= " + volume + ", Display= " + display;
    }
}
