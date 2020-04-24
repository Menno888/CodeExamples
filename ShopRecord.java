public class ShopRecord
{
	private Meta metadata;
	private String language;
	private String affiliatePartner;
	private String shopname;
	private String key;
	private String shopProductId;
	private String recordHash;
	private String title;
	private String description;
	private String description2;
	private String url;
	private String pluginSearchKey;
	private double price;
	private double oldPrice;
	
	public ShopRecord() {}
	public ShopRecord(Record r)
	{
		super();
		Meta metadata = new Meta(r);
		this.metadata = metadata;
		this.language = "NL";
		this.affiliatePartner = "zanox";
		this.shopname = "schuurman_schoenen";
		this.key = r.getZupid();
		this.shopProductId = r.getOfferId();
		this.recordHash = r.getRecordHash();
		this.title = r.getTitle();
		this.description = r.getDescription();
		this.description2 = r.getDescription2();
		this.url = r.getUrl();
		this.pluginSearchKey = "dummy";
		this.price = r.getPrice();
		this.oldPrice = r.getPriceOld();
	}
	
	public void recordToString()
	{
		this.metadata.recordToString();
		System.out.println("language: " + language);
		System.out.println("affiliatePartner: " + affiliatePartner);
		System.out.println("shopname: " + shopname);
		System.out.println("key: " + key);
		System.out.println("shopProductId: " + shopProductId);
		System.out.println("recordHash: " + recordHash);
		System.out.println("title: " + title);
		System.out.println("description: " + description);
		System.out.println("description2: " + description2);
		System.out.println("url: " + url);
		System.out.println("pluginSearchKey: " +  pluginSearchKey);
		System.out.println("price: " + price);
		System.out.println("oldPrice: " + oldPrice);
	}
}