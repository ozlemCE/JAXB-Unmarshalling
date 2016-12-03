package jaxb_complex_unmarshalling;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="dosyalar")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dosyalar {
	
	@XmlElement(name="dosya")
	List<Dosya> ds=null;

	public List<Dosya> getDosyalar() {
		return ds;
	}

	public void setDosyalar(List<Dosya> dosyalar) {
		this.ds = dosyalar;
	}

}
