package jaxb_complex_unmarshalling;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;


@XmlRootElement(name="kisiTumBilgileri")
public class KisiTumBilgileri {
	
	String id;
	String adi;
	String anaAdi;
	String babaAdi;
	String kayitNo;
	String cuzdanNo;
	String cinsiyeti;
	String dogumYeri;
	String aileSiraNo;
	String tcKimlikNo;
	String dogumTarihi;
	String cuzdanSeriNo;
	String oncekiSoyadi;
	String ybnNfsKayitliOldgYer;
	
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
	public String getAnaAdi() {
		return anaAdi;
	}
	public void setAnaAdi(String anaAdi) {
		this.anaAdi = anaAdi;
	}
	@XmlAttribute
	public String getBabaAdi() {
		return babaAdi;
	}
	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}
	@XmlAttribute
	public String getKayitNo() {
		return kayitNo;
	}
	public void setKayitNo(String kayitNo) {
		this.kayitNo = kayitNo;
	}
	@XmlAttribute
	public String getCuzdanNo() {
		return cuzdanNo;
	}
	public void setCuzdanNo(String cuzdanNo) {
		this.cuzdanNo = cuzdanNo;
	}
	@XmlAttribute
	public String getCinsiyeti() {
		return cinsiyeti;
	}
	public void setCinsiyeti(String cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}
	@XmlAttribute
	public String getDogumYeri() {
		return dogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	@XmlAttribute
	public String getAileSiraNo() {
		return aileSiraNo;
	}
	public void setAileSiraNo(String aileSiraNo) {
		this.aileSiraNo = aileSiraNo;
	}
	@XmlAttribute
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	@XmlAttribute
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	@XmlAttribute
	public String getCuzdanSeriNo() {
		return cuzdanSeriNo;
	}
	public void setCuzdanSeriNo(String cuzdanSeriNo) {
		this.cuzdanSeriNo = cuzdanSeriNo;
	}
	@XmlAttribute
	public String getOncekiSoyadi() {
		return oncekiSoyadi;
	}
	public void setOncekiSoyadi(String oncekiSoyadi) {
		this.oncekiSoyadi = oncekiSoyadi;
	}
	@XmlAttribute
	public String getYbnNfsKayitliOldgYer() {
		return ybnNfsKayitliOldgYer;
	}
	public void setYbnNfsKayitliOldgYer(String ybnNfsKayitliOldgYer) {
		this.ybnNfsKayitliOldgYer = ybnNfsKayitliOldgYer;
	}
	
	
	

}
