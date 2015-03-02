package MediaRental.Model;

/**
 * Created by Obberton13 on 2/16/2015.
 */
public class Product {
	protected int id;
	protected String title;
	protected String type;
	protected String genre;
	protected int quantity;
	protected int catalogId;

	public Product(String title) {
		this.title = title;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getCatalogId() {
		return catalogId;
	}
	
	public void setCatalogId(int id) {
		catalogId = id;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}


	@Override
	public String toString()
	{
		return "" + id + ", " + title + ", " + type;
	}
}
