//created by: Trisna nugraha
//data		: 10 Juni 2014

package praktikum10.bin;

class Main
{
	public static void main(String[] Trisna_nugraha)
	{
		Santapan s = new Santapan();
		Makanan ma = new Makanan();
		Minuman mi = new Minuman();
		Cemilan ce = new Cemilan();
		
		s.cerna(ma);
		s.cerna(mi);
		s.cerna(ce);
	}
}