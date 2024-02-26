//TRUCK FLEET CLASS: MAKE SEPARATE QUEUES BASED ON AREA FOR TRUCKS THAT ARE GOING TO DIFFERENT AREAS, EVERYTIME U MAKE NEW AREA, ADD TO A LIST OF QUEUES
//TRUCK CLASS: MAKE A STACK FOR EACH TRUCK TO PUT PACKAGES INSIDE


public class Package_Preiser {
    private double packageWeight;
    private String destinationArea;
    private String destinationAddress;
    private String packageStatus;

    public Package_Preiser(double packageWeight, String destinationArea, String destinationAddress, String packageStatus)
    {
        this.packageWeight = packageWeight;
        this.destinationArea = destinationArea;
        this.destinationAddress = destinationAddress;
        this.packageStatus = packageStatus;
    }

    public double getPackageWeight()
    {
        return packageWeight;
    }
    public String getDestinationArea()
    {
        return destinationArea;
    }
    public String getDestinationAddress()
    {
        return destinationAddress;
    }
    public String getPackageStatus()
    {
        return packageStatus;
    }
    public void setPackageStatus(String x)
    {
        this.packageStatus = x;
    }
}
