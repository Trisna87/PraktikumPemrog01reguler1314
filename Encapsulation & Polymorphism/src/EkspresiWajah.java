//created by: Trisna nugraha
//data		: 10 Juni 2014

package praktikum10.bin;

public class EkspresiWajah
{
	public String respons()
	{
		return("perhatikan ekspresi wajah saya");
	}
}

class Gembira extends EkspresiWajah
{
	public String respons()
	{
		return("ha ha ha..");
	}
}

class Sedih extends EkspresiWajah
{
	public String respons()
	{
		return("hik hik ngeee ngeee ngeee..");
	}
}

class Marah extends EkspresiWajah
{
	public String respons()
	{
		return("hai kurang ajar !!");
	}
}