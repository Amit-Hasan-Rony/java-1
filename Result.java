import java.util.Scanner;

class Student 
{
	String name=new String("Amit");
	int roll;
	double grade;
	char ch;
	void calculate() {
		 Scanner input = new Scanner(System.in);
		 int[] num = new int[input.nextInt()];
	roll=5;
	for(int i=0;i<2;i++)
		num[i]=input.nextInt();
	for(int i=0;i<2;i++)
	{
		if(num[i]>=80)
			grade=grade+5;
		else if(num[i]>=70)
			grade=grade+4;
		else if(num[i]>=60)
			grade=grade+3;
		else if(num[i]>=50)
			grade=grade+2;
		else if(num[i]>=40)
			grade=grade+1;
		else 
			grade=grade+0;
	}
	grade=grade/3;
	
	if(grade>=5)
		ch='A';
	else if(grade>=4)
		ch='B';
	else if(grade>=3)
		ch='C';
	else if(grade>=2)
		ch='D';
	else if(grade>=1)
		ch='E';
	else ch='F';
	System.out.println("Name: Amit");
	System.out.println("Roll:"+roll);
	System.out.println("GPA is : "+grade );
	System.out.println("Grade is :"+ ch );
		
	
}
};

public class Result {

	public static void main(String[] args) {
		
		Student ob=new Student();
		ob.calculate();
	}

};
