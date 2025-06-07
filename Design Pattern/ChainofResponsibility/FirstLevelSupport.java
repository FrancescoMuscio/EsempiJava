package ChainofResponsibility;

public class FirstLevelSupport extends Handler { //ConcreteHandler 1
	 
	@Override
	   public void handleComplaint(String complaint, int level) {
	       if (level == 1) {
	           System.out.println("Primo livello: Reclamo gestito da supporto di primo livello: " + complaint);
	       } else if (nextHandler != null) {
	            nextHandler.handleComplaint(complaint, level);
	        }
	    
	 }
}
