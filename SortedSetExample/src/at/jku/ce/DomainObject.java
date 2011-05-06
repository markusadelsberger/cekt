package at.jku.ce;

public class DomainObject {
	
	/** * Default constructor */
	public DomainObject() {
		super();
	}
	
	private String uuid = UUid.randomUUid().toString();
	private String name;
	private String comment;

	public DomainObject(String name, String comment) {
	  super();
	  this.uuid = uuid;
	}

	public String getuuid() {
	   return uuid;
	}

	public String getComment() {
	   return comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(final String name) {
		this.name = name; 
	}

}
