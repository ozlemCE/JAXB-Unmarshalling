package jaxb_complex_unmarshalling;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="digerAlacak")
public class DigerAlacak
{
	
   String id;
   String tutar;
   String alacakNo;
   String tutarAdi;
   String tutarTur;
   String digerAlacakAciklama;
  List<AlacakKalemi> alacakKalemi;
   
   

@XmlAttribute
   public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

@XmlAttribute
public String getTutar() {
	return tutar;
}
public void setTutar(String tutar) {
	this.tutar = tutar;
}

@XmlAttribute
public String getAlacakNo() {
	return alacakNo;
}
public void setAlacakNo(String alacakNo) {
	this.alacakNo = alacakNo;
}

@XmlAttribute
public String getTutarAdi() {
	return tutarAdi;
}
public void setTutarAdi(String tutarAdi) {
	this.tutarAdi = tutarAdi;
}
@XmlAttribute
public String getTutarTur() {
	return tutarTur;
}
public void setTutarTur(String tutarTur) {
	this.tutarTur = tutarTur;
}

@XmlAttribute
public String getDigerAlacakAciklama() {
	return digerAlacakAciklama;
}
public void setDigerAlacakAciklama(String digerAlacakAciklama) {
	this.digerAlacakAciklama = digerAlacakAciklama;
}

@XmlElement
public List<AlacakKalemi> getAlacakKalemi() {
	return alacakKalemi;
}
public void setAlacakKalemi(List<AlacakKalemi> alacakKalemi) {
	this.alacakKalemi = alacakKalemi;
}

}
