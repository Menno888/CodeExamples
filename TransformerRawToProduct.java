public class TransformerRawToProduct
{
	public Product setImages(RawProduct r, Product p)
	{
		p.setImageSmall(r.getImageSmall());
		p.setImageMedium(r.getImageMedium());
		p.setImageLarge(r.getImageLarge());
		
		return p;
	}
}