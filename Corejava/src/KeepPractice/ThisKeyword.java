package KeepPractice;

public class ThisKeyword 
{
int age;
String name;
double salary;

void add()
{
	int age = 10;
	String name = "ram";
	double salary = 111.22;
	
	this.age=age;// this keyword - assigning local value to the global variable
	this.name=name;
	this.salary=salary;
	
	System.out.println("Ram11");
}
public static void main(String[] args)
{
	ThisKeyword e1=new ThisKeyword();
    e1.add();
	System.out.println(e1.age);
	//System.out.println(e1.name);
	//System.out.println(e1.salary);
	
	e1.add();
	System.out.println(e1.age);
	//System.out.println(e1.name);
	//System.out.println(e1.salary);
}
}
