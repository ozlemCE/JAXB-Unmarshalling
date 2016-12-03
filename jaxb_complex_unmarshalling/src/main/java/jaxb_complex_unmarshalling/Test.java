package jaxb_complex_unmarshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;


public class Test {
	
	static void main(String [] args) throws JAXBException
	{
	
     JAXBContext context = JAXBContext.newInstance(VekilKisi.class);
     Unmarshaller un = context.createUnmarshaller();
     VekilKisi vekilKisi = (VekilKisi) un.unmarshal(new File("C://Users//Özlem//Desktop//file(2).xml"));
     
     System.out.println(vekilKisi.id +" "+vekilKisi.getAdres()+" "+vekilKisi.getKisiBilgileri()+" "+vekilKisi.getVekil());     
	}

}
