import java.util .*;
class SimpleInterest
{
	void calculate(double PrincipalAmount,double Time,double InterestRate)
	{
		double interest=(PrincipalAmount * Time * InterestRate)/100;
		System.out.printf("Simple Interest : %.2f",interest);
	}
}
class CompoundInterest
{
	void calculate(double PrincipalAmount,double Time,double InterestRate)
	{
		    double interest=PrincipalAmount * Math.pow(1.0+InterestRate/100.0,Time) - PrincipalAmount;
       		System.out.printf("Compound Interest : %.2f",interest);
	}
}
class SimpleAndCompoundInterest
{
    public static void main (String argu[ ])
{
	System.out.println("Calculate:\n1.Simple Interest\n2.Compound Interest\nEnter your choice:");
    Scanner sc=new Scanner (System. in);
    int option=sc.nextInt();
    double PrincipalAmount, InterestRate, Time;
    System.out.println("Enter the amount:");
    PrincipalAmount=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    Time=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    InterestRate=sc.nextDouble();

	switch(option)
	{
		case 1:
		SimpleInterest objs=new SimpleInterest();
		objs.calculate(PrincipalAmount,Time,InterestRate);
		break;
		case 2:
		CompoundInterest objc=new CompoundInterest();
		objc.calculate(PrincipalAmount,Time,InterestRate);
		break;
		
	}
     
   }
}