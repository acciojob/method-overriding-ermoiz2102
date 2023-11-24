package com.driver;
  class classA{
    public classA() {
    }
    public String meth(){
        return "Invoking method from class A";
    }
}
  class classB extends classA{
    public classB() {
    }
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
  public static void main(String[] args) {

        classA nn= new classA();
        classB nd= new classB();
        System.out.println(nn.meth());
        System.out.println(nd.meth());
    }
  
}
