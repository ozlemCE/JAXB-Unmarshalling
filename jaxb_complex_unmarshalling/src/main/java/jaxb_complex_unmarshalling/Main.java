package jaxb_complex_unmarshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Main 
{
	public static void main(String[] args) throws JAXBException	
 { 
	
 try {
		
  JAXBContext context=JAXBContext.newInstance(Dosyalar.class);
  Unmarshaller un = context.createUnmarshaller();
  Dosyalar dosyalar = null;
try {
	// Bu aşamada eğer ki MalFormed Exception alıyorsak new File("dosya_yolu") notasyonu yerıne asagıdakı gıbı Stream kullanırsak hata ortadan kalkacaktır.*/
	dosyalar = (Dosyalar) un.unmarshal(new InputStreamReader(new FileInputStream("D:/uyap_takip1.xml"), "ISO-8859-1"));
} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  // Bu kısımda xml den verilerin cekilip cekilemedigini test etmek amaclı yalnızca dosya tipi kontrolu yaptım, dıger verileri listelemek ıcın asagıdakı kodu guncellemenız yeterli
  List<Dosya> list=dosyalar.getDosyalar();
  for(Dosya d :list)
  {
	  System.out.println(d.getDosyaTipi());
  }

  }
   catch (JAXBException e)
  {
      e.printStackTrace();
  }
 }
}
