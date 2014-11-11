import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;


public class dogBean implements Serializable {

	private String color;
	private String breed;
	private String size;
	private catBean cat;
	private ArrayList<catBean> cats = new ArrayList<catBean>();
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public catBean getCat() {
		return cat;
	}

	public void setCat(catBean cat) {
		this.cat = cat;
	}
	public void addCat(catBean cat){
		this.cats.add(cat);
	}
	
}
