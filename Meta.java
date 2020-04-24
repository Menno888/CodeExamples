import java.util.*;

public class Meta
{
	private String action = "full";
	private String imageSmall;
	private String imageMedium;
	private String imageLarge;
	private ArrayList<String> categoryDataShop;
	private ArrayList<String> filterDataShop;
	
	public Meta(Record r)
	{
		imageSmall = r.getImage();
		imageMedium = r.getImage();
		imageLarge = r.getImage();
		ArrayList<String> categoryDataShop = new ArrayList<String>(10);
		ArrayList<String> filterDataShop = new ArrayList<String>(10);
		categoryDataShop.add(r.getGender());
		categoryDataShop.add(r.getCategory());
		categoryDataShop.add(r.getSubCategory());
		categoryDataShop.add(r.getThirdCategory());
		categoryDataShop.add(r.getFourthCategory());
		filterDataShop.add(r.getColor());
		filterDataShop.add(r.getVendor());
		filterDataShop.add(r.getMaterial());
		filterDataShop.add(r.getAdult());
		filterDataShop.add(r.getSize());
		this.categoryDataShop = categoryDataShop;
		this.filterDataShop = filterDataShop;
	}
	
	public void recordToString()
	{
		System.out.println("imageSmall: " + imageSmall);
		System.out.println("imageMedium: " + imageMedium);
		System.out.println("imageLarge: " + imageLarge);
		System.out.println("categoryDataShop: " + arrayListToString(categoryDataShop));
		System.out.println("filterDataShop: " + arrayListToString(filterDataShop));
	}
	
	public String arrayListToString(ArrayList<String> list)
	{
		StringBuilder sb = new StringBuilder();
		for (String s : list)
		{
			sb.append(s);
			sb.append(", ");
		}
		
		return sb.toString();
	}
}