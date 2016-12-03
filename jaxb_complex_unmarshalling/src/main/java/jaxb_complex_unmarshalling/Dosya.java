package jaxb_complex_unmarshalling;
import java.util.List;

import javax.xml.bind.annotation.*;




@XmlRootElement(name="dosya")
public class Dosya
{
	String dosyaTipi;
	String dosyaTuru;
	String takipTuru;
	String takipYolu;
	String takipSekli;
	String aciklama48e9;
	String BSMVUygulansin;
	String KKDFUygulansin;
	VekilKisi vekilKisi;
	List<Taraf> taraf;

	DigerAlacak digerAlacak;
	
	
	 @XmlAttribute
	public String getDosyaTipi() {
		return dosyaTipi;
	}
	public void setDosyaTipi(String dosyaTipi) {
		this.dosyaTipi = dosyaTipi;
	}
	
	 @XmlAttribute
	public String getDosyaTuru() {
		return dosyaTuru;
	}
	public void setDosyaTuru(String dosyaTuru) {
		this.dosyaTuru = dosyaTuru;
	}
	 @XmlAttribute
	public String getTakipTuru() {
		return takipTuru;
	}
	public void setTakipTuru(String takipTuru) {
		this.takipTuru = takipTuru;
	}
	
	 @XmlAttribute
	public String getTakipYolu() {
		return takipYolu;
	}
	public void setTakipYolu(String takipYolu) {
		this.takipYolu = takipYolu;
	}
	
	 @XmlAttribute
	public String getTakipSekli() {
		return takipSekli;
	}
	public void setTakipSekli(String takipSekli) {
		this.takipSekli = takipSekli;
	}
	
	 @XmlAttribute
	public String getAciklama48e9() {
		return aciklama48e9;
	}
	public void setAciklama48e9(String aciklama48e9) {
		this.aciklama48e9 = aciklama48e9;
	}
	
	 @XmlAttribute
	public String getBSMVUygulansin() {
		return BSMVUygulansin;
	}
	public void setBSMVUygulansin(String bSMVUygulansin) {
		BSMVUygulansin = bSMVUygulansin;
	}
    @XmlAttribute
	public String getKKDFUygulansin() {
		return KKDFUygulansin;
	}
	public void setKKDFUygulansin(String kKDFUygulansin) {
		KKDFUygulansin = kKDFUygulansin;
	}
	
	@XmlElement
	public VekilKisi getVekilKisi() {
		return vekilKisi;
	}
	public void setVekilKisi(VekilKisi vekilKisi) {
		this.vekilKisi = vekilKisi;
	}
	
	@XmlElement
	public List<Taraf> getTaraf() {
		return taraf;
	}
	public void setTaraf(List<Taraf> taraf) {
		this.taraf = taraf;
	}
	@XmlElement
	public DigerAlacak getDigerAlacak() {
		return digerAlacak;
	}
	public void setDigerAlacak(DigerAlacak digerAlacak) {
		this.digerAlacak = digerAlacak;
	}


}
