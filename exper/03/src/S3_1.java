
public class S3_1{
    public static void main(String[] args){
        Student s1=new Student(01,"a","male",18);
        Student s2=new Student(02,"b","female",16);
        s1.showNo();
        s1.showName();
        s1.showSex();
        s1.showAge();
        s1.modifyAge(20);
        s1.showAge();

        s2.showNo();
        s2.showName();
        s2.showSex();
        s2.showAge();


    }
}
class Student{
    int studentNo;
    String studentName;
    String studentGender;
    int studentAge;
    public void showNo(){
        System.out.println("No="+this.studentNo);
    }
    public void showName(){
        System.out.println("Name="+this.studentName);
    }
    public void showSex(){
        System.out.println("Sex="+this.studentGender);
    }
    public void showAge(){
        System.out.println("Age="+this.studentAge);
    }
    public void modifyAge(int x){
      this.studentAge=x;
    }

    public Student(int a,String b,String c,int d){
        this.studentNo=a;
        this.studentGender=b;
        this.studentName=c;
        this.studentAge=d;
    }
    public Student(){

    }
}

