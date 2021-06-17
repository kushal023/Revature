class FirstClass
{
int a, b, add, sub, multi;
float div;

void sum(){
add=a+b;
}

void subtract(){
sub=a-b;
}

void multiply(){
multi=a*b;
}

void division(){
div= a/b;
}

}

class SecondClass
{

public static void main(String args[])
{
FirstClass obj = new FirstClass();

obj.a=100;
obj.b=50;
obj.sum();
obj.subtract();
obj.multiply();
obj.division();


System.out.println("Add = " + obj.add);
System.out.println("Subtract = " + obj.sub);
System.out.println("Multiply = " + obj.multi);
System.out.println("Divide = " + obj.div);

}

}

