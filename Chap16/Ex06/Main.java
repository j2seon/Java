package Chap16.Ex06;

public class Main {

	public static void main(String[] args) {
		
		
		GenericPrinter<Powder> powderPrinter =new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder = powderPrinter.getMaterial(); //객체를 가져와서 powder에 할당
		System.out.println(powderPrinter); //GeneticPrinter타입의 
		System.out.println(powder);
		powder.doPrinting();
		System.out.println("====================");
		
		
		GenericPrinter<Plastic> plasticPrinter =new GenericPrinter();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(plastic);
		plastic.doPrinting();
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter();
		waterPrinter.setMaterial(new Water());
		Water water=waterPrinter.getMaterial();
		System.out.println(waterPrinter);
		System.out.println(water);
		water.doPrinting();
		
		
	}

}
