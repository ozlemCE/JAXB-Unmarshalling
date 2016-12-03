package jaxb_complex_unmarshalling;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;




@XmlRootElement(name="vekil")
public class Vekil 
{
	
   String id;
   String adi;
   String tbbNo;
   String baroNo;
   String vergiNo;
   String kurumAvukatiMi;
   String avukatlikBuroAdi;
   
   @XmlAttribute
   public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@XmlAttribute
public String getAdi() {
	return adi;
}
public void setAdi(String adi) {
	this.adi = adi;
}
@XmlAttribute
public String getTbbNo() {
	return tbbNo;
}
public void setTbbNo(String tbbNo) {
	this.tbbNo = tbbNo;
}
@XmlAttribute
public String getBaroNo() {
	return baroNo;
}
public void setBaroNo(String baroNo) {
	this.baroNo = baroNo;
}
@XmlAttribute
public String getVergiNo() {
	return vergiNo;
}
public void setVergiNo(String vergiNo) {
	this.vergiNo = vergiNo;
}
@XmlAttribute
public String getKurumAvukatiMi() {
	return kurumAvukatiMi;
}
public void setKurumAvukatiMi(String kurumAvukatiMi) {
	this.kurumAvukatiMi = kurumAvukatiMi;
}
@XmlAttribute
public String getAvukatlikBuroAdi() {
	return avukatlikBuroAdi;
}
public void setAvukatlikBuroAdi(String avukatlikBuroAdi) {
	this.avukatlikBuroAdi = avukatlikBuroAdi;
}
  

}
