package jaxb_complex_unmarshalling;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@XmlRootElement(name="adres")

public class Adres {
	
	
	
	private String il;
	@XmlAttribute
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	
	private String fax;
	@XmlAttribute
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}

	private String ilce;
	@XmlAttribute
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	
	private String adres;
	@XmlAttribute
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	private String ilkodu;
	@XmlAttribute
	public String getIlkodu() {
		return ilkodu;
	}
	public void setIlkodu(String ilkodu) {
		this.ilkodu = ilkodu;
	}

	private String telefon;
	@XmlAttribute
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	private String ilceKodu;
	@XmlAttribute
	public String getIlceKodu() {
		return ilceKodu;
	}
	public void setIlceKodu(String ilceKodu) {
		this.ilceKodu = ilceKodu;
	}
	
	private String adresTuru;
	@XmlAttribute
	public String getAdresTuru() {
		return adresTuru;
	}
	public void setAdresTuru(String adresTuru) {
		this.adresTuru = adresTuru;
	}
	
	private String postaKodu;
	@XmlAttribute
	public String getPostaKodu() {
		return postaKodu;
	}
	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}
	
	private String cepTelefonu;
	@XmlAttribute
	public String getCepTelefonu() {
		return cepTelefonu;
	}
	public void setCepTelefonu(String cepTelefonu) {
		this.cepTelefonu = cepTelefonu;
	}
	
	private String adresTuruAciklama;
	@XmlAttribute
	public String getAdresTuruAciklama() {
		return adresTuruAciklama;
	}
	public void setAdresTuruAciklama(String adresTuruAciklama) {
		this.adresTuruAciklama = adresTuruAciklama;
	}
	
	private String elektronikPostaAdresi;
	@XmlAttribute
	public String getElektronikPostaAdresi() {
		return elektronikPostaAdresi;
	}
	public void setElektronikPostaAdresi(String elektronikPostaAdresi) {
		this.elektronikPostaAdresi = elektronikPostaAdresi;
	}
	
	

}
