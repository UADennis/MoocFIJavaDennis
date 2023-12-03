
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry = new HashMap<>();

    public VehicleRegistry() {

    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.get(licensePlate) == null) {
            registry.put(licensePlate, owner);
            return true;

        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        if (registry.get(licensePlate) == null) {
            return null;
        }
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return false;
        }
        registry.remove(licensePlate);
        return true;

    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owner = new ArrayList<>();
        for (LicensePlate platte : registry.keySet()) {

            if (owner.contains(registry.get(platte))) {

            } else {
                owner.add(registry.get(platte));
            }
        }
        for (String s : owner) {
            System.out.println(s);
        }

    }
}
