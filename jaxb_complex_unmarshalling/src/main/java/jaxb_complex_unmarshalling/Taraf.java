package jaxb_complex_unmarshalling;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="taraf")
public class Taraf {
	
	String id;
	KisiKurumBilgileri kisiKurumBilgileri;
	RolTur rolTur;
	Ref ref;


	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
	@XmlElement
	public KisiKurumBilgileri getKisiKurumBilgileri() {
		return kisiKurumBilgileri;
	}

	public void setKisiKurumBilgileri(KisiKurumBilgileri kisiKurumBilgileri) {
		this.kisiKurumBilgileri = kisiKurumBilgileri;
	}
	
	@XmlElement
	public RolTur getRolTur() {
		return rolTur;
	}

	public void setRolTur(RolTur rolTur) {
		this.rolTur = rolTur;
	}
	
	@XmlElement(nillable=true)
	public Ref getRef() {
		return ref;
	}

	public void setRef(Ref ref) {
		this.ref = ref;
	}

}
