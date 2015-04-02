
public class List_House {
	private String lotno ;
	private String fname;
	private String lname;
	private double price;
	private double square_feet;
	private int no_of_bedroom;
	
	public List_House(String lotno, String fname, String lname,
			double price, double square_feet, int no_of_bedroom) {
		super();
		this.lotno = lotno;
		this.fname = fname;
		this.lname = lname;
		this.price = price;
		this.square_feet = square_feet;
		this.no_of_bedroom = no_of_bedroom;
	}
	public String getLotno() {
		return lotno;
	}
	public void setLotno(String lotno) {
		this.lotno = lotno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSquare_feet() {
		return square_feet;
	}
	public void setSquare_feet(double square_feet) {
		this.square_feet = square_feet;
	}
	public int getNo_of_bedroom() {
		return no_of_bedroom;
	}
	public void setNo_of_bedroom(int no_of_bedroom) {
		this.no_of_bedroom = no_of_bedroom;
	}
	
	
}