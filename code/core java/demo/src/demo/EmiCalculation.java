package demo;
public class EmiCalculation {
	
	public float emiEstimation(int princple,float roi,int tenure) {
		float emi = princple + roi * tenure;  //logic  or task
		return emi;	
	}	
	public static void main(String[] args) {
		
		EmiCalculation emi=new EmiCalculation();
		float monthlyEmi=emi.emiEstimation(40000,4.5f,12);
		float total = monthlyEmi+4000-120;
		System.out.println(total);
		
		
	}
}
