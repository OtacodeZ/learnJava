//把下面的代码补充完整，输出结果为“实现了Inner接口的匿名内部类！”，并测试输出结果。
interface Inner{
	  void introduce();
}

class Outer{

      public static Inner method(){
        return new Inner(){
            @Override
            public void introduce(){
                System.out.println("hi");
            }
        };
      }
    
}

class S4_6{
	  public static void main(String[] args){
	       Outer.method().introduce ();
}
}
