package at.jku.ce;

public class DomainObject implements Comparable<DomainObject> {
	
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

	public boolean equals (Object obj) {
	  if (!(obj instanceof DomainObject)) { return false; }
	  DomainObject domainObj = (DomainObject) obj;
	  return uuid.equals(domainObj.getUuid());
	}

	public String toString() {
	  return "DomainObject [name=" + name + ", comment=" + 	  comment + ", uuid=" + uuid + "]";
	}

	public int hashCode() {
	  if(uuid != null) {
	    return uuid.hashCode();
	  } else {
	    return super.hashCode();
	  }
     }

	public String getuuid() {
	   return uuid;
	}

	public String getComment() {
	   return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}

	public int compareTo(DomainObject o) {	   DomainObject domainObj = (DomainObject) o;	   int domObjeComp = name.compareTo(domainObj.getName());		  return ((domObjeComp == 0) ? uuid.compareTo(domainObj.getUuid()) : 	           domObjeComp);	}
}
