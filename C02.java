import java.util.*; 
import java.io.*; 

class C02{
void input(){
Scanner s=new Scanner(System.in);
System.out.print("아파트 분양 면적(제곱미트)을 입력하시오.");
double m2_area=s.nextInt();
double pyung_area;
pyung_area=m2_area*3.305;
System.out.print("아파트 평형은"+pyung_area+"입니다");

if(pyung_area<15){
System.out.print("소형아파트입니다");
}
else if(pyung_area>=15&&pyung_area<30){
System.out.print("중소형아파트입니다");
}
else if(pyung_area>=30&&pyung_area<50){
System.out.print("중형아파트입니다");
}
else{
System.out.print("대형아파트입니다")
}
}
public static void main(String [] args) throws IOException{

        
	                 new C02().input();
			        
				         }
					 }

