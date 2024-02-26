import java.util.Stack;
import java.util.ArrayList;
import java.util.List;


public class TruckFleet_Preiser<E> {
    private ArrayList<Truck_Preiser> truckFleet = new ArrayList<>();
    ArrayList<Package_Preiser> storage = new ArrayList<>();
    public TruckFleet_Preiser(ArrayList<Truck_Preiser> x)
    {
        truckFleet = x;
    }
    public void addTruck(Truck_Preiser t)
    {
        truckFleet.add(t);
    }

    public String addPackage(Package_Preiser p)
    {
        for(Truck_Preiser x: truckFleet)//IDK if this is rights
        {
            if(x.getArea().equals(p.getDestinationArea()))
                return Truck_Preiser.load(x,p);
        }
        storage.add(p);
        p.setPackageStatus("Currently in storage");
        return "No trucks have been found that are going to the package's area, package has been put in storage.";
    }
    public String searchPackage(Package_Preiser p)
    {
        return p.getPackageStatus();
    }
    public String searchTruck(Truck_Preiser t)
    {
        return t.getTruckStatus();
    }
    public void setPackageDelivered(Package_Preiser p)
    {
        p.setPackageStatus("Package is successfully delivered to " + p.getDestinationAddress());
    }
    public void setTruckReturned(Truck_Preiser t)
    {
        t.setTruckLocation("Truck is currently at the warehouse.");
        t.setTruckStatus("Truck is back at the warehouse and is ready to begin loading again.");
    }
    public E test()
    {
        return null;
    }

}
