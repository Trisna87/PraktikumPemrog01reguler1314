//created by: Trisna nugraha
//data		: 10 Juni 2014

package praktikum10.bin;

public class Manager extends Employee
{
	private String department;
	public Manager(String nama, double salary, String dep)
	{
		super(nama, salary);
		department = dep;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getDetails()
	{
		return super.getDetails()+"\nDepartment : "+getDepartment();
	}
	
	public void cetak()
	{
		System.out.println("coba di manager");
	}
}