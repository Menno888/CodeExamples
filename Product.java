public class Product
{
	private String imageSmall;
	private String imageMedium;
	private String imageLarge;
	private String shopName;
	
	public Product(String iS, String iM, String iL, String sN)
	{
		imageSmall = iS;
		imageMedium = iM;
		imageLarge = iL;
		shopName = sN;
	}
	
	public void setImageSmall(String iS)
	{
		imageSmall = iS;
	}
	
	public String getImageSmall()
	{
		return imageSmall;
	}
	
	public void setImageMedium(String iM)
	{
		imageMedium = iM;
	}
	
	public String getImageMedium()
	{
		return imageMedium;
	}
	
	public void setImageLarge(String iL)
	{
		imageLarge = iL;
	}
	
	public String getImageLarge()
	{
		return imageLarge;
	}
	
	public void setShopName(String sN)
	{
		shopName = sN;
	}
	
	public String getShopName()
	{
		return shopName;
	}
}