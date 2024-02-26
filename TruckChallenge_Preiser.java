import java.util.ArrayList;

public class TruckChallenge_Preiser {
    public static void main(String[] args) {
        ArrayList<Truck_Preiser> x = new ArrayList<>();
        TruckFleet_Preiser<Truck_Preiser> warehouse = new TruckFleet_Preiser(x);

        Truck_Preiser truck1 = new Truck_Preiser(15, 200, "Freehold", 0, "Warehouse", "Ready to load");
        Truck_Preiser truck2 = new Truck_Preiser(7, 100, "Manalapan", 0, "Warehouse", "Ready to load");
        Truck_Preiser truck3 = new Truck_Preiser(2, 75, "Colts Neck", 0, "Warehouse", "Ready to load");
        Truck_Preiser truck4 = new Truck_Preiser(25, 300, "Howell", 0, "Warehouse", "Ready to load");
        Truck_Preiser truck5 = new Truck_Preiser(21, 250, "Marlboro", 0, "Warehouse", "Ready to load");

        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);

        Package_Preiser package1 = new Package_Preiser(20, "Manalapan", "101 Road St, Manalapan", "Ready to be loaded");
        Package_Preiser package2 = new Package_Preiser(100, "Manalapan", "300 Street Road, Manalapan", "Ready to be loaded");
        Package_Preiser package3 = new Package_Preiser(150, "Freehold", "32 Avenue Road, Freehold", "Ready to be loaded");
        Package_Preiser package4 = new Package_Preiser(10, "Freehold", "1 Main St, Freehold", "Ready to be loaded");
        Package_Preiser package5 = new Package_Preiser(15, "Freehold", "15 Temple Road, Freehold", "Ready to be loaded");
        Package_Preiser package6 = new Package_Preiser(16, "Freehold", "3 My Road, Freehold", "Ready to be loaded");
        Package_Preiser package7 = new Package_Preiser(1, "Marlboro", "4 Goldstein Way, Marlboro", "Ready to be loaded");
        Package_Preiser package8 = new Package_Preiser(15, "Marlboro", "15 Goldstein Way, Marlboro", "Ready to be loaded");
        Package_Preiser package9 = new Package_Preiser(35, "Freehold", "53 CompSci Ct, Freehold", "Ready to be loaded");
        Package_Preiser package10 = new Package_Preiser(54, "Marlboro", "32 ColtsNeck Rd, Marlboro", "Ready to be loaded");

        Truck_Preiser.load(truck2, package1);
        Truck_Preiser.load(truck2, package2);
        Truck_Preiser.load(truck1, package3);
        Truck_Preiser.load(truck1, package4);
        Truck_Preiser.load(truck1, package5);
        Truck_Preiser.load(truck1, package6);
        Truck_Preiser.load(truck5, package7);
        Truck_Preiser.load(truck5, package8);
        Truck_Preiser.load(truck5, package10);
        Truck_Preiser.load(truck1, package9);

        warehouse.test();
        System.out.println("Truck 1: " + Truck_Preiser.getNextLocation(truck1));
        System.out.println("Truck 2: " + Truck_Preiser.getNextLocation(truck2));
        System.out.println("Truck 3: " + Truck_Preiser.getNextLocation(truck3));
        System.out.println("Truck 4: " + Truck_Preiser.getNextLocation(truck4));
        System.out.println("Truck 5: " + Truck_Preiser.getNextLocation(truck5));
        System.out.println(" ");

        package1.setPackageStatus("Delivered");
        package2.setPackageStatus("Delivered");
        package3.setPackageStatus("Delivered");
        package4.setPackageStatus("Delivered");
        package5.setPackageStatus("Delivered");
        package6.setPackageStatus("Delivered");
        package7.setPackageStatus("Delivered");
        package8.setPackageStatus("Delivered");
        package9.setPackageStatus("Delivered");
        package10.setPackageStatus("Delivered");

        truck1.setTruckLocation("Warehouse");
        truck2.setTruckLocation("Warehouse");
        truck3.setTruckLocation("Warehouse");
        truck4.setTruckLocation("Warehouse");
        truck5.setTruckLocation("Warehouse");
        warehouse.test();


        System.out.println(package1.getPackageStatus());
        System.out.println(package2.getPackageStatus());
        System.out.println(package3.getPackageStatus());
        System.out.println(package4.getPackageStatus());
        System.out.println(package5.getPackageStatus());
        System.out.println(package6.getPackageStatus());
        System.out.println(package7.getPackageStatus());
        System.out.println(package8.getPackageStatus());
        System.out.println(package9.getPackageStatus());
        System.out.println(package10.getPackageStatus());








    }
}
