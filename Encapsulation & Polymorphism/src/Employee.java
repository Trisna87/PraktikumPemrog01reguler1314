//created by: Trisna nugraha
//data		: 10 Juni 2014

package praktikum10.bin;

public class Employee
{
	private String name;
	private double salary;
	protected Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	protected String getDetails()
	{
		return "Name : "+name+ "\nSalary : "+salary;
	}
	
	public void cetak()
	{
		System.out.println("coba di employee");
	}
}