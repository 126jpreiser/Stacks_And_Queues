import java.util.Stack;

public class Truck_Preiser {

    Stack<Package_Preiser> truck = new Stack<>();
    private String truckStatus = "";
    private double weight = 0;
    private int maxCapacity = 0;
    private double maxWeight = 0;
    private static String area = "";
    private String truckLocation = "";
    public Truck_Preiser(int maxCapacity, double maxWeight, String area, double weight, String truckLocation, String truckStatus)//b(ii)
    {

        Stack<Package_Preiser> truck = new Stack<>();
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        Truck_Preiser.area = area;
        this.weight = weight;
        this.truckLocation = truckLocation;
        this.truckStatus = truckStatus;
    }

    public Truck_Preiser() {

    }

    public void addWeight(double y)
    {
     weight += y;
    }
    public void setArea(String a)
    {
        area = a;
    }
    public String getArea()
    {
        return area;
    }
    public void setTruckLocation(String loc)
    {
        truckLocation = loc;
    }
    public String getTruckLocation()
    {
        return truckLocation;
    }
    public void removeWeight(double y)
    {
        weight -= y;
    }
    public Stack<Package_Preiser> getStack()
    {
        return truck;
    }
    public int getNumPackages()//b(iii)
    {
        return truck.size();
    }
    public void setTruckStatus(String x)
    {
        truckStatus = x;
    }
    public String getTruckStatus()
    {
        return truckStatus + " and " + truckLocation;
    }
    public double getMaxWeight()
    {
        return maxWeight;
    }
    public static String load(Truck_Preiser y, Package_Preiser x)//b(vi)
    {
        if((y.getTruckWeight()+x.getPackageWeight()) > y.getMaxWeight())
            return "Truck weight has gone over it's maximum, the package has not been loaded, " + startDelivery(y);
        else if ((y.getTruckWeight()+x.getPackageWeight()) == y.getMaxWeight()) {
            (y.getStack()).push(x);
            y.addWeight(x.getPackageWeight());
            x.setPackageStatus("Package is currently loaded on truck headed for " + y.getArea());
            y.setTruckStatus("Truck has left the warehouse and is currently headed for " + y.getTruckStatus());
            return "Package successfully loaded on truck headed for " +y.getArea()  + (startDelivery(y));
        }
        (y.getStack()).push(x);
        y.addWeight(x.getPackageWeight());
        x.setPackageStatus("Package is currently loaded on it's truck");
        return "Package successfully loaded onto the truck, " + startDelivery(y);
    }
    public void unload(Truck_Preiser y)//b(vii)
    {
        y.removeWeight((y.getStack().peek()).getPackageWeight());
        y.getStack().peek().setPackageStatus("Package has been unloaded off of it's truck");
        y.getStack().pop();

    }
    public double getTruckWeight()//b(iv)
    {
        return weight;
    }
    public int getMaxCapacity()
    {
        return maxCapacity;
    }
    public static String startDelivery(Truck_Preiser x)//b(viii)
    {
        if(x.getNumPackages() == x.getMaxCapacity()) {
            x.setTruckLocation("Truck has left the warehouse");
            return "Truck is ready to start delivery";
        }
        else if (x.getMaxWeight() == x.getTruckWeight()) {
            x.setTruckLocation("Truck has left the warehouse");
            return "Truck is ready to start delivery";
        }
        else return "Truck is not ready for delivery";
    }
    public static String getNextLocation(Truck_Preiser truck)
    {
        if(truck.getStack().isEmpty())
            return "No packages in the truck. No next location.";
        Package_Preiser pack = truck.getStack().peek();//find pack+1 in list and do that
        truck.getStack().pop();
        if(truck.getStack().isEmpty())
        {
            truck.getStack().push(pack);
            return "No more packages after this! Next stop is back to the warehouse.";
        }
        Package_Preiser p = truck.getStack().peek();
        truck.getStack().push(pack);
        return "Next stop is " + p.getDestinationAddress();
    }





}
