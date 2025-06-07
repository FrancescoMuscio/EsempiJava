package ChainofResponsibility;

abstract class Handler {
	
	    protected Handler nextHandler;

	    // Metodo per impostare il prossimo handler nella catena
	    public void setNextHandler(Handler nextHandler) {
	        this.nextHandler = nextHandler;
	    }

	    // Metodo astratto per gestire il reclamo
	    public abstract void handleComplaint(String complaint, int level);
	}

