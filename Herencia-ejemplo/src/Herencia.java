class A
	{
	int x;
		void func()
		{
			System.out.print("Hola Mundo");
			}
	}
class B extends A
	{
	int y;
		void func2()
		{
			System.out.print("Hola mundo2");
		}
		}
	
public class Herencia {
public static void main(String[] args) {
A a;
B b;

a=new A();
b=new B();
a.func();
b.func2();
b.func();
}
}
