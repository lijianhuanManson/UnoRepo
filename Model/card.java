package Model;

public class Card {
	
	private String color;
    private int value;
    private String image;
    private String type;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(String color, int value, String image, String type) {
		super();
		this.color = color;
		this.value = value;
		this.image = image;
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "card [color=" + color + ", value=" + value + ", image=" + image + ", type=" + type + "]";
	}
	public void setType(String type) {
		this.type = type;
	}
    
    
    
}
    
    
	