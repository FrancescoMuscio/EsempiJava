package ChainofResponsibility;

public class Supervisor extends Handler { //ConcreteHandler 2

	@Override
    public void handleComplaint(String complaint, int level) {
        if (level == 2) {
            System.out.println("Supervisore: Reclamo gestito da un supervisore: " + complaint);
        } else if (nextHandler != null) {
            nextHandler.handleComplaint(complaint, level);
        }
    }
}
