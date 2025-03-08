import java.util.Scanner;

public class TotalTax {
    public static void main(String[] args) {
       double total=0; 
       Scanner scanner=new Scanner(System.in);
       double a=scanner.nextDouble();
       double b=scanner.nextDouble();
       double c=scanner.nextDouble();
       Income[] incomes={
        new Income(a),
        new Salary(b),
        new StateCouncilSpecialAllowance(c)
       };
       for(Income income:incomes){
            total+=income.getTax();
        }
       System.out.println(total);
        
    }
   
    
}
class Income{
    protected double income;
    public Income (double income){
        this.income=income;
    }
    public double getTax(){
        return income*0.1;
    }
}
class Salary extends Income{
    @Override
    public double getTax(){
        if(income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
    public Salary(double income){
        super(income);
    }
}
 
class StateCouncilSpecialAllowance extends Income{
    @Override 
    public double getTax(){
        return 0;
    }
    public StateCouncilSpecialAllowance(double income)
    {
        super(income);
    } 
}