public class S4_5 {
    public static void main(String[] args) {
        Employee worker=new Worker("s",19,01,7000,1);
        worker.upSalary();
        Employee manager=new Manager("s",30,78,20000,8);
        manager.upSalary();
    }
    
}
//经理与员工工资，主要考察多态
//某公司的人员分为员工和经理两类，但经理也属于员工中的一类，公司员工和经理都有自己的
//姓名，年龄，工号、工资、工龄等属性（通过属性无法区分员工和经理）和工资上涨函数。假设每次给员工涨工资一次能
//涨10%，经理能涨20%。要求利用多态实现给员工和经理涨工资，测试并通过。

class Employee{
    String name ;
    int age;
    int no;
    int salary;
    int yearOfWork;
    protected double upGrade;
    public void upSalary(){
        this.salary*=(this.upGrade+1);
        System.out.println("涨工资后工资为"+this.salary);
    }
    public Employee(String name,int age,int no,int salary,int yearOfWork){
        this.name=name;
        this.age=age;
        this.no=no;
        this.salary=salary;
        this.yearOfWork=yearOfWork;
    }

}
class Worker extends Employee{
    public Worker(String name,int age,int no,int salary,int yearOfWork){
    super(name, age, no, salary, yearOfWork);
    this.upGrade=0.1;
    }
}
class Manager extends Employee{
    public Manager(String name,int age,int no,int salary,int yearOfWork){
        super(name, age, no, salary, yearOfWork);
        this.upGrade=0.2;
        }
}