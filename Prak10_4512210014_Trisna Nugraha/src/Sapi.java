package praktikum14a.bin;

class Sapi extends Hewan 
{
    public Sapi()
	{
	    super("sapi", 4, false);
	}
    public void bersuara()
    {
        System.out.println("\nemoh...,emoh...");
    }
    public static void main(String[] Trisna)
    {
        Sapi s = new Sapi();
        s.isHewan();
        s.bersuara();
    }
}	