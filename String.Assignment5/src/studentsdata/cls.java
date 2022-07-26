package studentsdata;

public class cls {

	String name;
	int age;
	char section;
	char gender;
	int subject1=0,subject2=0,subject3=0;
	long total;
	double percentage;
	cls(String abc,int b,char c,char d,int x,int y,int z)
	{
		this.name=abc;
		this.age=b;
		this.section=c;
		this.gender=d;
		this.subject1=x;
		this.subject2=y;
		this.subject3=z;
		total=subject1+subject2+subject3;
		percentage=(total/300.0)*100.0;
	}
	cls(String a,int b,char c,char d,int y,int z)
	{
		this.name=a;
		this.age=b;
		this.section=c;
		this.gender=d;
		this.subject2=y;
		this.subject3=z;
		total=subject1+subject2+subject3;
		percentage=total/300.0*100.0;
	}
	void display(){
		System.out.println("Student name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student section is '"+section+"'");
		System.out.println("Student gender is "+gender);
		System.out.println("Student mark in Subject1 is "+subject1);
		System.out.println("Student mark in Subject2 is "+subject2);
		System.out.println("Student mark in Subject3 is "+subject3);
		System.out.println("Student total mark is "+total);
		System.out.println("Student Percentage is "+String.format("%.2f",percentage)+"%\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cls s1=new cls("ram",15,'A','M',66,75,86);
		cls s2=new cls("rani",15,'A','F',90,67);
		cls s3=new cls("raja",15,'A','M',57,98);
		cls s4=new cls("keerthi",15,'A','F',93,100,75);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}

}
