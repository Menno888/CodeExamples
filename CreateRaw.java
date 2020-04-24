public class CreateRaw
{
	public static void main(String[] args)
	{
		RawProduct r = new RawProduct("Test", "Test", "Test", "Test");
		r.setImageSmall("Small");
		r.setImageMedium("Medium");
		r.setImageLarge("Large");
		r.setShopName("Schoenenreus");
		Product p = new Product("Test", "Test", "Test", "Test");
		Transformer t = new Transformer();
		p = t.setImages(r, p);
		System.out.println(p.getImageSmall());
	}
}