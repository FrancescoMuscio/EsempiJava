package SingletonMultiplo;

import java.util.ArrayList;
import java.util.List;

public class MultiInstanceSingleton {
	private static final List<MultiInstanceSingleton> instances = new ArrayList<>();
    private static int maxInstances = 1; // Default

    private MultiInstanceSingleton() {
        // Costruttore privato per impedire istanziazione esterna
    }

    public static void setMaxInstances(int max) {
        if (max > 0 && instances.isEmpty()) {
            maxInstances = max;
        }
    }

    public static MultiInstanceSingleton getInstance() {
        if (instances.size() < maxInstances) {
            MultiInstanceSingleton instance = new MultiInstanceSingleton();
            instances.add(instance);
            return instance;
        }
        return instances.get(instances.size() - 1); // Restituisce l'ultima istanza se il limite è raggiunto
    }

    public static int getInstanceCount() {
        return instances.size();
    }
}
