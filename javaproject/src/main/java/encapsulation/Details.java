package encapsulation;

public class Details {
private String emailId;
private String name;
private int age;
public void setter(String emailId,String name,int age)
{
	this.emailId=emailId;
	this.name=name;
	this.age=age;
}
public void getter()
{
	System.out.println(emailId);
	System.out.println(name);
	System.out.println(age);
}


}
