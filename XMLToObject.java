import java.io.File;
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;
import java.lang.reflect.*;

public class XMLToObject
{
	public void createRecord(File f)
	{
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(Class.forName("Record"));
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Record r = (Record) jaxbUnmarshaller.unmarshal(f);
			createShopRecord(r);
		}
		catch (JAXBException e)
		{
			System.out.println("Ongeldige file");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public void createShopRecord(Record r)
	{
		ShopRecord sr = new ShopRecord(r);
		sr.recordToString();
	}
}