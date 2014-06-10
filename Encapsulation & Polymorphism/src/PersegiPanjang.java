//created by: Trisna nugraha
//data		: 10 Juni 2014

package praktikum10.bin;

public class PersegiPanjang
{
	private double panjang;
	private double lebar;
	private double tinggi;
	public PersegiPanjang()
	{
		panjang = 0;
		lebar = 0;
	}
	
	private double luas(double p, double l)
	{
		return p*l;
	}
	
	public void setPanjang(double panjang)
	{
		this.panjang = panjang;
	}
	
	public void setLebar(double lebar)
	{
		this.lebar = lebar;
	}
	
	public double getPanjang()
	{
		return panjang;
	}
	
	public double getLebar()
	{
		return lebar;
	}
	
	public double getLuas()
	{
		return luas(panjang, lebar);
	}
}