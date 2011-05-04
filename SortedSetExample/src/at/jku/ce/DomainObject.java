package at.jku.ce;

public class DomainObject {
	
	/** * Default constructor */
	public DomainObject() {
		super();
	}
	
	public String uuid = UUid.randomUUid().toString();
	private String name;

	public DomainObject(String uuid) {
	  super();
	  this.uuid = uuid;
	}

	public String getuuid() {	   return uuid;	}
}
