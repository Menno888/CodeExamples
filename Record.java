import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.*;
import java.lang.annotation.Repeatable;
import java.io.*;

@XmlRootElement
public class Record
{
	private String recordHash;
	private String url;
	private String title;
	private String description;
	private String description2;
	private String offerid;
	private String image;
	private double price;
	private String category;
	private String subcategory;
	private String stock;
	private String timetoship;
	private String ean;
	private double priceShipping;
	private double priceOld;
	private String vendor;
	private String categoryPath;
	private String largeimage;
	private int model;
	private String thirdcategory;
	private String column0;
	private String column1;
	private String color;
	private String material;
	private String size;
	private String gender;
	private String fourthCategory;
	private String age;
	private int merchantID;
	private String zupid;
	private String sizeStock;
	private double stockAmount;
	private String adult;
	
	public Record() {}
	public Record(String recordHash, String url, String title, String description, String description2, String offerid, String image, double price, String category, String subcategory, String stock, String timetoship, String ean, double priceShipping, double priceOld, String vendor, String categoryPath, String largeimage, int model, String thirdcategory, String column0, String column1, String color, String material, String size, String gender, String fourthCategory, String age, int merchantID, String zupid, String sizeStock, double stockAmount, String adult)
	{
		super();
		this.recordHash = recordHash;
		this.url = url;
		this.title = title;
		this.description = description;
		this.description2 = description2;
		this.offerid = offerid;
		this.image = image;
		this.price = price;
		this.category = category;
		this.subcategory = subcategory;
		this.stock = stock;
		this.timetoship = timetoship;
		this.ean = ean;
		this.priceShipping = priceShipping;
		this.priceOld = priceOld;
		this.vendor = vendor;
		this.categoryPath = categoryPath;
		this.largeimage = largeimage;
		this.model = model;
		this.thirdcategory = thirdcategory;
		this.column0 = column0;
		this.column1 = column1;
		this.color = color;
		this.material = material;
		this.size = size;
		this.gender = gender;
		this.fourthCategory = fourthCategory;
		this.age = age;
		this.merchantID = merchantID;
		this.zupid = zupid;
		this.sizeStock = sizeStock;
		this.stockAmount = stockAmount;
		this.adult = adult;
	}
	
	@XmlElement
	public String getRecordHash()
	{
		return recordHash;
	}
	
	public void setRecordHash(String recordHash)
	{
		this.recordHash = recordHash;
	}
	
	@XmlElement
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	@XmlElement
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	@XmlElement
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@XmlElement
	public String getDescription2()
	{
		return description2;
	}
	
	public void setDescription2(String description2)
	{
		this.description2 = description2;
	}
	
	public String getOfferId()
	{
		return offerid;
	}
	
	@XmlElement(name = "offerid")
	public void setOfferId(String offerid)
	{
		this.offerid = offerid;
	}
	
	@XmlElement(name = "offer")
	public void setOfferId2(String offerid)
	{
		this.offerid = offerid;
	}
	
	@XmlElement
	public String getImage()
	{
		return image;
	}
	
	public void setImage(String image)
	{
		this.image = image;
	}
	
	@XmlElement
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	@XmlElement
	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	@XmlElement(name = "subcategory")
	public String getSubCategory()
	{
		return subcategory;
	}
	
	public void setSubCategory(String subcategory)
	{
		this.subcategory = subcategory;
	}
	
	@XmlElement
	public String getStock()
	{
		return stock;
	}
	
	public void setStock(String stock)
	{
		this.stock = stock;
	}
	
	@XmlElement(name = "timetoship")
	public String getTimeToShip()
	{
		return timetoship;
	}
	
	public void setTimeToShip(String timetoship)
	{
		this.timetoship = timetoship;
	}
	
	@XmlElement
	public String getEan()
	{
		return ean;
	}
	
	public void setEan(String ean)
	{
		this.ean = ean;
	}
	
	@XmlElement(name = "price_shipping")
	public double getPriceShipping()
	{
		return priceShipping;
	}
	
	public void setPriceShipping(double priceShipping)
	{
		this.priceShipping = priceShipping;
	}
	
	@XmlElement(name = "price_old")
	public double getPriceOld()
	{
		return priceOld;
	}
	
	public void setPriceOld(double priceOld)
	{
		this.priceOld = priceOld;
	}
	
	@XmlElement
	public String getVendor()
	{
		return vendor;
	}
	
	public void setVendor(String vendor)
	{
		this.vendor = vendor;
	}
	
	@XmlElement(name = "category_path")
	public String getCategoryPath()
	{
		return categoryPath;
	}
	
	public void setCategoryPath(String categoryPath)
	{
		this.categoryPath = categoryPath;
	}
	
	@XmlElement(name = "largeimage")
	public String getLargeImage()
	{
		return largeimage;
	}
	
	public void setLargeImage(String largeimage)
	{
		this.largeimage = largeimage;
	}
	
	@XmlElement
	public int getModel()
	{
		return model;
	}
	
	public void setModel(int model)
	{
		this.model = model;
	}
	
	@XmlElement(name = "thirdcategory")
	public String getThirdCategory()
	{
		return thirdcategory;
	}
	
	public void setThirdCategory(String thirdcategory)
	{
		this.thirdcategory = thirdcategory;
	}
	
	@XmlElement
	public String getColumn0()
	{
		return column0;
	}
	
	public void setColumn0(String column0)
	{
		this.column0 = column0;
	}
	
	@XmlElement
	public String getColumn1()
	{
		return column1;
	}
	
	public void setColumn1(String column1)
	{
		this.column1 = column1;
	}
	
	@XmlElement
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	@XmlElement
	public String getMaterial()
	{
		return material;
	}
	
	public void setMaterial(String material)
	{
		this.material = material;
	}
	
	@XmlElement
	public String getSize()
	{
		return size;
	}
	
	public void setSize(String size)
	{
		this.size = size;
	}
	
	@XmlElement
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	@XmlElement(name = "fourth_category")
	public String getFourthCategory()
	{
		return fourthCategory;
	}
	
	public void setFourthCategory(String fourthCategory)
	{
		this.fourthCategory = fourthCategory;
	}
	
	@XmlElement
	public String getAge()
	{
		return age;
	}
	
	public void setAge(String age)
	{
		this.age = age;
	}
	
	@XmlElement(name = "merchantID")
	public int getMerchantId()
	{
		return merchantID;
	}
	
	public void setMerchantId(int merchantID)
	{
		this.merchantID = merchantID;
	}
	
	@XmlElement
	public String getZupid()
	{
		return zupid;
	}
	
	public void setZupid(String zupid)
	{
		this.zupid = zupid;
	}
	
	@XmlElement(name = "size_stock")
	public String getSizeStock()
	{
		return sizeStock;
	}
	
	public void setSizeStock(String sizeStock)
	{
		this.sizeStock = sizeStock;
	}
	
	@XmlElement(name = "stock_amount")
	public double getStockAmount()
	{
		return stockAmount;
	}
	
	public void setStockAmount(double stockAmount)
	{
		this.stockAmount = stockAmount;
	}
	
	@XmlElement
	public String getAdult()
	{
		return adult;
	}
	
	public void setAdult(String adult)
	{
		this.adult = adult;
	}
	
	public void printInformation()
	{
		System.out.println(recordHash);
		System.out.println(url);
		System.out.println(title);
		System.out.println(description);
		System.out.println(description2);
		System.out.println(offerid);
		System.out.println(image);
		System.out.println(price);
		System.out.println(category);
		System.out.println(subcategory);
		System.out.println(stock);
		System.out.println(timetoship);
		System.out.println(ean);
		System.out.println(priceShipping);
		System.out.println(priceOld);
		System.out.println(vendor);
		System.out.println(categoryPath);
		System.out.println(largeimage);
		System.out.println(model);
		System.out.println(thirdcategory);
		System.out.println(column0);
		System.out.println(column1);
		System.out.println(color);
		System.out.println(material);
		System.out.println(size);
		System.out.println(gender);
		System.out.println(fourthCategory);
		System.out.println(age);
		System.out.println(merchantID);
		System.out.println(zupid);
		System.out.println(sizeStock);
		System.out.println(stockAmount);
		System.out.println(adult);
	}
}