package jaxb_complex_unmarshalling;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement
public class AlacakKalemi {
	
	
	String id;
	String aciklama;
	String tutarAdi;
	String tutarTur;
	String alacakKalemAdi;
	String alacakKalemKod;
	String alacakKalemTutar;
	String alacakKalemKodTuru;
	String alacakKalemIlkTutar;
	String alacakKalemKodAciklama;
	List<Ref> ref;
	Faiz faiz;
	
	@XmlAttribute
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlAttribute
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
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
	public String getAlacakKalemAdi() {
		return alacakKalemAdi;
	}
	public void setAlacakKalemAdi(String alacakKalemAdi) {
		this.alacakKalemAdi = alacakKalemAdi;
	}
	
	@XmlAttribute
	public String getAlacakKalemKod() {
		return alacakKalemKod;
	}
	public void setAlacakKalemKod(String alacakKalemKod) {
		this.alacakKalemKod = alacakKalemKod;
	}
	
	@XmlAttribute
	public String getAlacakKalemTutar() {
		return alacakKalemTutar;
	}
	public void setAlacakKalemTutar(String alacakKalemTutar) {
		this.alacakKalemTutar = alacakKalemTutar;
	}
	
	@XmlAttribute
	public String getAlacakKalemKodTuru() {
		return alacakKalemKodTuru;
	}
	public void setAlacakKalemKodTuru(String alacakKalemKodTuru) {
		this.alacakKalemKodTuru = alacakKalemKodTuru;
	}
	
	@XmlAttribute
	public String getAlacakKalemIlkTutar() {
		return alacakKalemIlkTutar;
	}
	public void setAlacakKalemIlkTutar(String alacakKalemIlkTutar) {
		this.alacakKalemIlkTutar = alacakKalemIlkTutar;
	}
	
	@XmlAttribute
	public String getAlacakKalemKodAciklama() {
		return alacakKalemKodAciklama;
	}
	public void setAlacakKalemKodAciklama(String alacakKalemKodAciklama) {
		this.alacakKalemKodAciklama = alacakKalemKodAciklama;
	}
	
	@XmlElement
	public List<Ref> getRef() {
		return ref;
	}
	public void setRef(List<Ref> ref) {
		this.ref = ref;
	}
	
	@XmlElement(nillable=true)
	public Faiz getFaiz() {
		return faiz;
	}
	public void setFaiz(Faiz faiz) {
		this.faiz = faiz;
	}

}
