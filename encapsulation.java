package ENCAPSULATION;

import java.util.Scanner;

public class encapsulation {
    private  int age;
    private String sex;
    private String dop;
    private String name;
   
  
    
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
	
		  Scanner vi=new Scanner(System.in);
		  System.out.println("ENTER YOUR AGE-");
		  this.age =vi.nextInt();
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		  Scanner vi=new Scanner(System.in);
		  System.out.println("ENTER YOUR SEX-");
		  this.sex =vi.nextLine();
		
	}

	public String getDop() {
		return dop;
	}

	public void setDop(String dop) {
		Scanner vi=new Scanner(System.in);
		  System.out.println("ENTER YOUR DOP-");
		  this.dop  =vi.nextLine();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Scanner vi=new Scanner(System.in);
		  System.out.println("ENTER YOUR NAME-");
		  this.name   =vi.nextLine();
		
	}

	public static void main(String[] args) {
		encapsulation p1=new encapsulation();
		p1.setName("");
		System.out.println(p1.getName());
		p1.setSex("");
		System.out.println(p1.getSex());
		p1.setDop("");
		System.out.println(p1.getDop());
	    p1.setAge(0);
	    System.out.println(p1.getAge());
		
	}
}
