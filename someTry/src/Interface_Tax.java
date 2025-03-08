public class Interface_Tax {
    public static void main(String[] args) {
		// TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		for(Income income:incomes){
			total+=income.getTax();
		}
		System.out.println(total);
	}
}
interface Income {

	double getTax();
	

}
class RoyaltyIncome implements Income {
	private double income;
	@Override
	public double getTax(){
		return this.income*0.2;
	}
	public RoyaltyIncome(double income){
		this.income=income;
	}



}
class SalaryIncome implements Income {
	private double income;
	@Override
	public double getTax(){
		if(income<=5000){
			return 0;
		}
		return (this.income-5000)*0.3;
	}
	public SalaryIncome(double income){
		this.income=income;
	}



}