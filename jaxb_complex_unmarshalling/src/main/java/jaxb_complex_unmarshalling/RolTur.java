package jaxb_complex_unmarshalling;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;


@XmlRootElement
public class RolTur
{

	String Rol;
	String rolID;
	@XmlAttribute
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	@XmlAttribute
	public String getRolID() {
		return rolID;
	}
	public void setRolID(String rolID) {
		this.rolID = rolID;
	}
	

}
