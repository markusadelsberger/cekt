package at.jku.ce;

public class DomainObject {
	
	/** * Default constructor */
	public DomainObject() {
		super();
	}
	
	private String uuid = UUid.randomUUid().toString();
	private String name;

	public DomainObject(String name, String comment) {
	  super();
	  this.uuid = uuid;
	}

	public String getuuid() {
	   return uuid;
	}
}
