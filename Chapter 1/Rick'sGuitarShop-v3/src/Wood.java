
public enum Wood {
	
	ROSEWOOD, CEDAR, MAHOGANY, ALDER;
	

	public String toString() {
	    switch(this) {
	      case ROSEWOOD:
	    	  return "Rosewood";
	      case CEDAR:
	    	  return "Cedar";
	      case MAHOGANY:
	    	  return "Mahogany";
	      case ALDER:
	    	  return "Alder";
	      default:  
	    	  return "unspecified";
	    }
	}
}
