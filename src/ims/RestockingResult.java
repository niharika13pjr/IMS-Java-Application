package ims;

public class RestockingResult {
	private String productname;
	private int numberofitems;
	private String message;
	private String room;
	public String getroom()
	{
		return this.room;
	}
	public void setroom(String room)
	{
		this.room=room;
	}
	public String getproductname()
	{
		return this.productname;
	}
	public int numberofitems()
	{
		return this.numberofitems;
	}
	public void setproductname(String pname)
	{
		this.productname=pname;
	}
	public void setnumberofitems(int item)
	{
		this.numberofitems=item;
	}
	public String getmessage()
	{
		return this.message;
	}
	public void setmessage(String mes)
	{
		this.message=mes;
	}
}
