import java.io.Serializable;


public class catBean implements Serializable{
	
	private String type;
	private String color;
	private Boolean hair;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getHair() {
		return hair;
	}
	public void setHair(Boolean hair) {
		this.hair = hair;
	}

}
