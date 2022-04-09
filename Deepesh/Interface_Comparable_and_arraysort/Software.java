public class Software extends Product {
	private String version;	
	
	public Software() {
		version = "";
	}
	
    public Software(String c, String des, double pri, String ver) {
        super(c, des, pri);
        version = ver;
    }

	public void setVersion(String s) {
		version = s;
	}

 	public String getVersion() {
		return version;
	}
  
	public String toString()
    {
        return super.toString() + 
		       " Author:      " + author + "\n";
    }

 
}
 
