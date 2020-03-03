package project_3;
import java.util.Scanner;
public class project_3 {
	public static void main(String[] args){

		Scanner scan =new Scanner(System.in);

		float m=0;
		float xj;
		float xi;
		float tk = 0;
		System.out.println("Enter a,b,k values:");
		float a=scan.nextFloat();
		float b=scan.nextFloat();
		int k=scan.nextInt();
		System.out.println("Choose one function:");
		System.out.println("1.f(x) = 4/(1+x^2)	2.f(x)=x^0.5*log(x)");
		int s=scan.nextInt();

		float h=(b-a)/k;
		if(s==1){
			for(int j=1;j<=k;j++){
				xj=a+j*h;
				xi=a+(j-1)*h;
				float x=(xi+xj)/2;
				float y=function1(x);
				m+=y;
			}
			float mk=h*m;
			System.out.println("Composite midpoint rule solution:");
			System.out.println(mk);

			for(int j=1;j<=k;j++){
				xj=a+j*h;
				xi=a+(j-1)*h;
				tk+=((xj-xi)/2)*(function1(xj)+function1(xi));
			}
			System.out.println("Composite trapezoid rule solution:");
			System.out.println(tk);
		}
		else{
			for(int j=1;j<=k;j++){
				xj=a+j*h;
				xi=a+(j-1)*h;
				float x=(xi+xj)/2;
				float y=function2(x);
				m+=y;
			}
			float mk=h*m;
			System.out.println("Composite midpoint rule solution:");
			System.out.println(mk);

			for(int j=1;j<=k;j++){

				xj=a+j*h;
				xi=a+(j-1)*h;
				if(xj==0)
					xj=(float) 0.000001;
				if(xi==0)
					xi=(float) 0.000001;

				tk+=((xj-xi)/2)*(function2(xj)+function2(xi));
			}
			System.out.println("Composite trapezoid rule solution:");
			System.out.println(tk);
		}


	}
	public static float function1(float x){
		float y=0;
		y= (float) (4/(1+Math.pow(x,2)));
		return y;
	}
	public static float function2(float x){
		float y=0;
		y= (float) (Math.pow(x,0.5)*Math.log(x));
		return y;
	}



}
