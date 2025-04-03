import java.util.Random;

public class S4_3 {
    public static void main(String[] args) {
        OnTheJobPostgraduate s=new OnTheJobPostgraduate();
        s.count();
    }
}
//研究生薪资管理（注：在职研究生继承学生类，实现雇员接口）
//在学校中，学生每个月需要交相应的生活费（2000元），雇员每个月有相应的工资（1000~3000随机生成），
//而在职研究生（on-the-job postgraduate）既是雇员又是学生，所以在职研究生既需要交学费又会有工资。
//下面要求编写一个程序来统计在职研究生的收入与学费，如果收入无法满足交学费，则输出“撸起袖子加油干！”信息。（思考：如果使用抽象类，是否能完成该要求？）

interface Employee{
    int salaryOfE();
}
class Postgraduate{
    protected final int cost=2000;

}
class OnTheJobPostgraduate extends Postgraduate implements Employee{
    public int salaryOfE(){
        Random rand = new Random();
       
        return rand.nextInt(2001) + 1000; 
    }
    public void count(){
        if(this.cost-salaryOfE()<0)
        System.out.print("撸起袖子加油干！");
        else
        System.out.print("工资高过学费");
    }

}