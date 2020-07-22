import java.util .*;
class StandardMaterial
{
	void calculateCost(int stdmaterial,double area)
	{
		double cost=stdmaterial*area;
		System.out.printf("House Construction Cost : %.2f",cost);
	}
}
class AboveStandardMaterial
{
	void calculateCost(int abovestdmaterial,double area)
	{
		double cost=abovestdmaterial*area;
		System.out.printf("House Construction Cost : %.2f",cost);
	}
}
class HighStandardMaterial
{
	void calculateCost(int highstdmaterial,double area)
	{
		double cost=highstdmaterial*area;
		System.out.printf("House Construction Cost : %.2f",cost);
	}
}
class HighStandardMaterialAndAutomated
{
	void calculateCost(int highstdmaterialAutomated,double area)
	{
		double cost=highstdmaterialAutomated*area;
		System.out.printf("House Construction Cost : %.2f",cost);
	}
}
class HouseCost
{
    public static void main (String argu[ ])
{
	System.out.println("CalculateCost:\n1.1200INR if we use standard materials\n2.1500INR if we use above standard materials\n3.1800INR if you need high standard material\n4.2500INR if you need high standard material and fully automated\n Enter your choice:");
    Scanner sc=new Scanner (System. in);
    int materialstandard=sc.nextInt();
    double Area;
    System.out.println("Enter the area:");
    Area=sc.nextDouble();
    
    System. out. println("Do you need fully automated? : YES/NO");
    String needautomated=sc.next();

	switch(materialstandard)
	{
		case 1:
		StandardMaterial obj1=new StandardMaterial();
		int stdmaterial=1200;
		obj1.calculateCost(stdmaterial,Area);
		break;
		case 2:
		AboveStandardMaterial obj2=new AboveStandardMaterial();
		int abovestdmaterial=1500;
		obj2.calculateCost(abovestdmaterial,Area);
		break;
		case 3:
		HighStandardMaterial obj3=new HighStandardMaterial();
		int highstdmaterial=1800;
		obj3.calculateCost(highstdmaterial,Area);
		break;
		case 4:
		HighStandardMaterialAndAutomated obj4=new HighStandardMaterialAndAutomated();
		int highstdmaterialAutomated=1200;
		obj4.calculateCost(highstdmaterialAutomated,Area);
		break;
		
	}
     
   }
}