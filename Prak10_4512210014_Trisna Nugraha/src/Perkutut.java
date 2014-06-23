package praktikum14a.bin;

class Perkutut extends Hewan
{
    public Perkutut()
	{
	    super("perkutut",2,true);
		}
	
    public void bersuara()
    {
        System.out.println("\ncuit, cuit, ciut");
    }
    
    public static void main(String[] Trisna)
    {
        Perkutut p = new Perkutut();
        p.isHewan();
        p.bersuara();
    }
}	