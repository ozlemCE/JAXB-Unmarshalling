package jaxb_complex_unmarshalling;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;



@XmlRootElement
public class VekilKisi {


 String id;
 @XmlAttribute
 public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
Vekil vekil;
 KisiTumBilgileri kisiBilgileri;
 Adres adres;
 
 @XmlElement
 public Vekil getVekil() {
	return vekil;
}
public void setVekil(Vekil vekil) {
	this.vekil = vekil;
}
@XmlElement
public KisiTumBilgileri getKisiBilgileri() {
	return kisiBilgileri;
}
public void setKisiBilgileri(KisiTumBilgileri kisiBilgileri) {
	this.kisiBilgileri = kisiBilgileri;
}

@XmlElement
public Adres getAdres() {
	return adres;
}
public void setAdres(Adres adres) {
	this.adres = adres;
}
	
}
