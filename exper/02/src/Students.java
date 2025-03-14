import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入学生个数：");
        int count=scanner.nextInt();
        Student[] stus=new Student[count];
        for(int i=0;i<count;i++){
            stus[i]=new Student();
            System.out.print("学生姓名：");
            scanner.nextLine();
            stus[i].name=scanner.nextLine();
            
            System.out.print("学生成绩：");
            stus[i].score=scanner.nextInt();
        }
        
        if(stus.length==1){
            System.out.println("仅有一个学生，则最高分即"+stus[0].score);
            return;
        }
        int m1=0,m2=1;
    
        for(int i=1;i<count;i++){
            if(stus[m1].score<=stus[i].score){
                m2=m1;
                m1=i;
            }
            else{
                if(stus[m2].score<=stus[i].score){
                    m2=i;
                }
            }
        }
        System.out.println("获得最高分的是"+stus[m1].name+"其成绩为"+stus[m1].score);
        System.out.println("获得第二高分的是"+stus[m2].name+"其成绩为"+stus[m2].score);
        

    }
    
}
class Student{
    String name;
    int score;
    
    Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    Student(){

    }

}