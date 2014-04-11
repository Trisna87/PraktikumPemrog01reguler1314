//Created By Trisna nugraha
//praktikum 02
//date : 10 april 2014

public class Trisna2 {
    private String nama;
	public static void main(String[] Trisna){
	    Trisna2 test;
		test = new Trisna2();
		test.setNama("andi");
		byte b = 100;
		short s = 100;
		
		Trisna2 belajarVariabel = test;
		belajarVariabel.setNama("belajar variabel");
		
		System.out.println(b + s);
		System.out.println("nama : " + test.getNama () + " " + b);
	}
    public void setNama(String aNama){
        this.nama = aNama;
    }
    public String getNama(){
        return this.nama;
    }
}	