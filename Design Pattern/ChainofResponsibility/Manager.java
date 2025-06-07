package ChainofResponsibility;

public class Manager extends Handler { //ConcreteHandler 3
	
	@Override
    public void handleComplaint(String complaint, int level) {
        if (level == 3) {
            System.out.println("Manager: Reclamo gestito dal manager: " + complaint);
        } else {
            System.out.println("Manager: Livello non supportato per il reclamo: " + complaint);
        }
    }
}
