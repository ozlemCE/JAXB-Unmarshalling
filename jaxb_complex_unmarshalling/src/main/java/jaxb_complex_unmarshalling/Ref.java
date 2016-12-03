package jaxb_complex_unmarshalling;
import javax.xml.bind.annotation.*;


@XmlRootElement
public class Ref 
{
	String id;
	String to;
	@XmlAttribute
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlAttribute
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
}
