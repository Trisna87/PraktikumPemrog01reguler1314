package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass
{
	public static void main(String[] Trisna)
	{
		CalculatorService service = new CalculatorServiceImpl();
		
		Integer a = service.tambah(200, 4);
		Integer b = service.kurang(200, 4);
		Integer c = service.kali(200, 4);
		Integer d = service.bagi(200, 4);
		
		System.out.println("output");
		System.out.println("nilai a : " + a);
		System.out.println("nilai b : " + b);
		System.out.println("nilai c : " + c);
		System.out.println("nilai d : " + d);
	}
}