package day7;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class d7project2 {
	int a,b,c;
	@BeforeTest
	void getdata() {
		System.out.println("Enter the values to calculate");
		Scanner sc=new Scanner(System.in);
		//a=7;
		//b=4;
		a=sc.nextInt();
		b=sc.nextInt();

	}
  @Test(priority=4)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c,11);
  }
  @Test(priority=1)
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c,3);
  }
  @Test(priority=2)
  public void mul() {
	  c=a*b;
	  Assert.assertEquals(c,28);
  }
  @Test(priority=3)
  public void div() {
	  c=a/b;
	  Assert.assertEquals(c,1);
  }
}
