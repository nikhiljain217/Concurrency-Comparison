import java.util.*;

public class Cell {
 private int row;
 private int col;
 private int intValue;
 private boolean value = false;
 ArrayList<Integer> potentialValues;
 
 	public Cell(int _row, int _col)
 	{
 		row=_row;
 		col=_col;
 		intValue=0;
 		potentialValues = new ArrayList();
 	}
 	
 	public void setIntValue(int v)
 	{
 		this.intValue = v;
 	}
 	
 	public int getIntValue()
 	{
 		return this.intValue;
 	}
 	
 	
 	public ArrayList<Integer> getPV()
 	{
 		return potentialValues;
 	}
 	
 	public void setPV(ArrayList<Integer> p)
 	{
 		this.potentialValues = p;
 	}

	public void add(int v)
 	{
 		potentialValues.add(v);
 	}
 	
 	public void remove(int v)
 	{
 		potentialValues.remove(new Integer(v));
 	}
 	
 	public void print()
 	{
 		System.out.print(row+" "+col+": ");
 		for(int i=0;i<potentialValues.size();i++)
 			System.out.print(potentialValues.get(i)+" ");
 		System.out.print("\n");
 	}
 	
 	public boolean isSet()
 	{
 		return value;
 	}
 	
 	public void setValue()
 	{
 		value=true;
 	}
 	
 	public int getPotentialValuesSize()
 	{
 		return potentialValues.size();
 	}
 	public int getRow()
 	{
 		return row;
 	}
 	public int getCol()
 	{
 		return col;
 	}
 	
 	//Should only be used for fixed cell
 	public int getFirstPotentialValue()
 	{
 		return this.potentialValues.get(0);
 	}
 	
 	public int getPotentialValue(int i)
 	{
 		return this.potentialValues.get(i);
 	}
}
