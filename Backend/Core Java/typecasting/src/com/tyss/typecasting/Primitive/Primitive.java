package com.tyss.typecasting.Primitive;

public class Primitive {
  byte b=4;
  short s=b;
  int i=b;
  float f=b;
  double d=b;
  void value() {
	  System.out.println("b value is"+b);
	  System.out.println("s value is"+s);
	  System.out.println("i value is"+i);
	  System.out.println("f value is"+f);
	  System.out.println("d value is"+d);
	
}
  //explicit
  double pi=3.142;
  int a=(int)pi;
  void details() {
	  System.out.println("int value is "+a);
	  System.out.println("double value is "+pi);
  }
}
