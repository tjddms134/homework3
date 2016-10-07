import java.util.*;
 import java.io.*;

class B04{
  public void input(){
    Scanner s=new Scanner(System.in);
    System.out.print("연봉을 원 단위로 입력하세요:");
    double money=s.nextInt();
    
    if(money>100000000){
      double tax=money*0.095;
        System.out.print("연봉 금액에 대한 소득세는:"+tax);
    }
    
      else if(money>=100000000&&money<400000000){
        double tax=money*0.19;
        System.out.print("연봉 금액에 대한 소득세는:"+tax);
      }
    
      else if(money>=400000000&&money<800000000){
        double tax=money*0.28;
        System.out.print("연봉 금액에 대한 소득세는:"+tax);
      }
    
     else  if(money>=800000000){
        double tax=money*0.37;
        System.out.print("연봉 금액에 대한 소득세는:"+tax);
      }
  }

      public static void main(String [] args) throws IOException{

        
                 new B04().input();
      
  }
}
