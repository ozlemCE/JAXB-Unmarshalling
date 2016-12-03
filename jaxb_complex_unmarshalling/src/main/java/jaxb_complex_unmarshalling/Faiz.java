package jaxb_complex_unmarshalling;
import javax.xml.bind.annotation.*;



@XmlRootElement(name="faiz")
public class Faiz {
	
	String id;
	String faizOran;
	String faizTipKod;
	String faizSureTip;
	String baslangicTarihi;
	String faizTipKodAciklama;
	
	
	@XmlAttribute
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlAttribute
	public String getFaizOran() {
		return faizOran;
	}
	public void setFaizOran(String faizOran) {
		this.faizOran = faizOran;
	}
	@XmlAttribute
	public String getFaizTipKod() {
		return faizTipKod;
	}
	public void setFaizTipKod(String faizTipKod) {
		this.faizTipKod = faizTipKod;
	}
	@XmlAttribute
	public String getFaizSureTip() {
		return faizSureTip;
	}
	public void setFaizSureTip(String faizSureTip) {
		this.faizSureTip = faizSureTip;
	}
	@XmlAttribute
	public String getBaslangicTarihi() {
		return baslangicTarihi;
	}
	public void setBaslangicTarihi(String baslangicTarihi) {
		this.baslangicTarihi = baslangicTarihi;
	}
	@XmlAttribute
	public String getFaizTipKodAciklama() {
		return faizTipKodAciklama;
	}
	public void setFaizTipKodAciklama(String faizTipKodAciklama) {
		this.faizTipKodAciklama = faizTipKodAciklama;
	}
	

}
