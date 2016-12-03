package jaxb_complex_unmarshalling;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;


@XmlRootElement(name="kurum")
public class Kurum 
{
/*kurum id=””,ticaretSicilNoVerildigiYer="" >*/		
	
String id;
String kamuOzel;
String kurumAdi;
String vergiNo;
String verdiDairesi;
String ticaretSicilNo;
String sskIsyeriSicilNo;
String ticaretSicilNoVerildigiYer;

@XmlAttribute
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

@XmlAttribute
public String getKamuOzel() {
	return kamuOzel;
}
public void setKamuOzel(String kamuOzel) {
	this.kamuOzel = kamuOzel;
}
@XmlAttribute
public String getKurumAdi() {
	return kurumAdi;
}
public void setKurumAdi(String kurumAdi) {
	this.kurumAdi = kurumAdi;
}
@XmlAttribute
public String getVergiNo() {
	return vergiNo;
}
public void setVergiNo(String vergiNo) {
	this.vergiNo = vergiNo;
}
@XmlAttribute
public String getVerdiDairesi() {
	return verdiDairesi;
}
public void setVerdiDairesi(String verdiDairesi) {
	this.verdiDairesi = verdiDairesi;
}
@XmlAttribute
public String getTicaretSicilNo() {
	return ticaretSicilNo;
}
public void setTicaretSicilNo(String ticaretSicilNo) {
	this.ticaretSicilNo = ticaretSicilNo;
}
@XmlAttribute
public String getSskIsyeriSicilNo() {
	return sskIsyeriSicilNo;
}
public void setSskIsyeriSicilNo(String sskIsyeriSicilNo) {
	this.sskIsyeriSicilNo = sskIsyeriSicilNo;
}
@XmlAttribute
public String getTicaretSicilNoVerildigiYer() {
	return ticaretSicilNoVerildigiYer;
}
public void setTicaretSicilNoVerildigiYer(String ticaretSicilNoVerildigiYer) {
	this.ticaretSicilNoVerildigiYer = ticaretSicilNoVerildigiYer;
}


}
