class ClassB{
  String abc;
  int a;
  Float fa;
ClassB(int a, String abc){
    this.a = a;
    this.abc = abc;
    System.out.println("welcome to class B");
  }

// prints the value of a and abc
  void printValue(){
    System.out.println("value of a is "+ a+"  "+ abc);

  }

 // sets value of fa
  void setFloatValueFa(Float f){
    this.fa = f;
    System.out.println("value of fa");

  }

}
