package com.driver;
  class A{
    public A() {
    }
    public String meth(){
        return "Invoking method from class A";
    }
}
  class B extends A{
    public B() {
    }
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
  public static void main(String[] args) {

        A nn= new A();
        B nd= new B();
        System.out.println(nn.meth());
        System.out.println(nd.meth());
    }
  
}
