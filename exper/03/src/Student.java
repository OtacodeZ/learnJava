public class Student{
    int studentNo;
    String studentName;
    String studentGender;
    int studentAge;
    public void showNo(){
        System.out.println(this.studentNo);
    }
    public void showName(){
        System.out.println(this.studentName);
    }
    public void showSex(){
        System.out.println(this.studentGender);
    }
    public void showAge(){
        System.out.println(this.studentAge);
    }
    public void modifyAge(int x){
        System.out.println(this.studentAge=x);
    }

    public Student(int a,String b,String c,int d){
        this.studentAge=a;
        this.studentGender=b;
        this.studentName=c;
        this.studentNo=d;
    }
    public Student(){

    }
}
