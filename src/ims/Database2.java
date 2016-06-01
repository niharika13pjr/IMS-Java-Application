
package ims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Database2 implements ims.InventoryManagementSystem 
{
	@Override
	public PickingResult pickProduct(String productId, int amountToPick)
	{
		// TODO Auto-generated method stub
		PickingResult pr=new PickingResult();
		ArrayList<Items> arr=new ArrayList<Items>();
		arr=initdata();
		boolean isExist=false;
		for(int i=0;i<arr.size();i++)
		{
			//System.out.println(arr.get(0).getName()+productId);
			if(arr.get(i).getName().equals(productId))
			{
				isExist=true;
				if(arr.get(i).getLevels()>amountToPick)
				{
				
				pr.setproductname(productId);
				pr.setroom(arr.get(i).getRoom());
				pr.setnumberofitems(arr.get(i).getLevels()-amountToPick);
				pr.setmessage("Product picked");
				}
				else
					pr.setmessage("count requested doesnt exist");
			}
			if(isExist==false)
				pr.setmessage("Product doesnt exist");
		}
		return pr;
		
	}

	@Override
	public RestockingResult restockProduct(String productId, int amountToRestock)
	{
		// TODO Auto-generated method stub
		RestockingResult rp=new RestockingResult();
		ArrayList<Items> arr=new ArrayList<Items>();
		arr=initdata();
		boolean isExist=false;
		for(int i=0;i<arr.size();i++)
		{
			//System.out.println(arr.get(0).getName()+productId);
			if(arr.get(i).getName().equals(productId))
			{
				isExist=true;
				rp.setproductname(productId);
				rp.setroom(arr.get(i).getRoom());
				rp.setnumberofitems(arr.get(i).getLevels()+amountToRestock);
				rp.setmessage("Product restocked");
			}
			if(isExist==false)
				rp.setmessage("Product doesnt exist");
		}
		return rp;
	}
	public ArrayList<Items> initdata()
	{
		Items i1=new Items("apples",5,"room1");
		Items i2=new Items("oranges",5,"room1");
		Items i3=new Items("berries",5,"room1");
		ArrayList<Items> arr=new ArrayList<Items>();
		arr.add(i1);
		arr.add(i2);
		arr.add(i3);
		return arr;
	}
	
}
