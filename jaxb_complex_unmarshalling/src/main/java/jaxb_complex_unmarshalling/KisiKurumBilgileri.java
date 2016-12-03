package jaxb_complex_unmarshalling;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;



@XmlRootElement(name="kisiKurumBilgileri")
public class KisiKurumBilgileri {
	
	
	String id;
	String ad;
	Kurum kurum;
	Adres adres;
	KisiTumBilgileri kisiTumBilgileri;
	
	

	@XmlAttribute
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlAttribute
	public String getAd() 
	{
		return ad;
	}
	public void setAd(String ad) 
	{
		this.ad = ad;
	}
	
	@XmlElement(nillable=true)
	public Kurum getKurum() {
		return kurum;
	}
	public void setKurum(Kurum kurum) {
		this.kurum = kurum;
	}
	@XmlElement
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	@XmlElement(nillable=true)
	public KisiTumBilgileri getKisiTumBilgileri() {
		return kisiTumBilgileri;
	}
	public void setKisiTumBilgileri(KisiTumBilgileri kisiTumBilgileri) {
		this.kisiTumBilgileri = kisiTumBilgileri;
	}

}
