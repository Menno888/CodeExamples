public class Transformer extends TransformerRawToProduct
{	
	public Product setImages(RawProduct r, Product p)
	{
		p = super.setImages(r, p);
		
		if (r.getShopName() == "Schoenenreus")
		{
			p.setImageLarge(r.getImageSmall());
			p.setImageSmall(r.getImageLarge());
		}
		
		return p;
	}
}