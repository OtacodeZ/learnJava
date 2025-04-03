public class S3_3 {
    public static void main(String[] args) {
        Date date=new Date(21,2,2025);
        System.out.println(date.toString());
    }
}
class Date{
    public int day;
    public int month;
    public int year;
    Date(int day,int month,int year ){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    Date(){

    }
    @Override
    public String toString(){
        return month+"/"+day+"/"+year;
    }
}