import java.util.*; 
import java.io.*; 

class C01{
void input(){
Scanner s=new Scanner(System.in);
System.out.print("첫번째 숫자를 입력하세요");
int num1=s.nextInt();
System.out.print("두번째 숫자를 입력하세요");
int num2=s.nextInt();
System.out.print("세번째 숫자를 입력하세요");
int num3=s.nextInt();

int max_num;
int min_num;

if(num1>num2){
max_num=num1;
min_num=num2;
}
else if(num3>num1){
max_num=num3;
min_num=num2;
}
}

System.put.print("가장 큰 수는"+max_num+"이고, 가장 작은수는"+ min_num+"입니다");
     
     public static void main(String [] args) throws IOException{

             
	                      new C01().input();
			             
				              }
					      }

