				Test Inheritance(30min)

Q1.
Consider the following classes... 

class Car
{
   public int gearRatio = 8;
   public String accelerate() {  return "Accelerate : Car";  }
}
class SportsCar extends Car
{
   public int gearRatio = 9;
   public String accelerate() {  return  "Accelerate : SportsCar";  }
   public static void main(String[] args)
   {
      Car c = new SportsCar();
      System.out.println( c.gearRatio+"  "+c.accelerate() );
   }
}

What will be printed when SportsCar is run?  

Select 1 correct option. 
a  8   Accelerate : Car          
b  9  Accelerate : Car           
c  8  Accelerate : SportsCar   
d  9  Accelerate : SportsCar    
e  None of the above.   

Q2.
Which statements, when inserted at line 1, will cause a runtime exception ? 
class B {}
class B1 extends B {}
class B2 extends B {}
public class ExtendsTest
{
  public static void main(String args[])
  {
     B b = new B();
     B1 b1 = new B1();
     B2 b2 = new B2();
     // insert statement here
  }

Select 1 correct option. 
a.  b = b1;   
b.  b2 = b;   
c.  b1 = (B1) b;   
d.  b2 = (B2) b1;   
e.  b1 = (B) b1;   

Q3.
public class Plant {
private String name;
public Plant(String name) { this.name = name; }
public String getName() { return name; }
}
1. public class Tree extends Plant {
2. public void growFruit() { }
3. public void dropLeaves() { }
4. }
Which statement is true?
A. The code will compile without changes.
B. The code will compile if public Tree() { Plant(); } is added to the Tree class.
C. The code will compile if public Plant() { Tree(); } is added to the Plant class.
D. The code will compile if public Plant() { this("fern"); } is added to the Plant class.
E. The code will compile if public Plant() { Plant("fern"); } is added to the Plant class.

Q4.
class Super {
2. private int a;
3. protected Super(int a) { this.a = a; }
4. }
...
11. class Sub extends Super {
12. public Sub(int a) { super(a); }
13. public Sub() { this.a = 5; }
14. }
Which two, independently, will allow Sub to compile? (Choose two.)
A. Change line 2 to:
public int a;
B. Change line 2 to :protected int a;
C. Change line 13 to :public Sub() { this(5); }
D. Change line 13 to :public Sub() { super(5); }
E. Change line 13 to :public Sub() { super(a); }

Q5.
class ClassA {
2. public int numberOfInstances;
3. protected ClassA(int numberOfInstances) {
4. this.numberOfInstances = numberOfInstances;
5. }
6. }
7. public class ExtendedA extends ClassA {
8. private ExtendedA(int numberOfInstances) {
9. super(numberOfInstances);
10. }
11. public static void main(String[] args) {
12. ExtendedA ext = new ExtendedA(420);
13. System.out.print(ext.numberOfInstances);
14. }
15. }
Which statement is true?
A. 420 is the output.
B. An exception is thrown at runtime.
C. All constructors must be declared public.
D. Constructors CANNOT use the private modifier.
E. Constructors CANNOT use the protected modifier.

6.
abstract class A {
11. abstract void a1();
12. void a2() { }
13. }
14. class B extends A {
15. void a1() { }
16. void a2() { }
17. }
18. class C extends B { void c1() { } }
and:
A x = new B(); C y = new C(); A z = new C();
What are four valid examples of polymorphic method calls? (Choose four.)
A. x.a2();
B. z.a2();
C. z.c1();
D. z.a1();
E. y.c1();
F. x.a1();

7.
class Animal { public String noise() { return "peep"; } }
12. class Dog extends Animal {
13. public String noise() { return "bark"; }
14. }
15. class Cat extends Animal {
16. public String noise() { return "meow"; }
17. }
...
30. Animal animal = new Dog();
31. Cat cat = (Cat)animal;
32. System.out.println(cat.noise());
What is the result?
A. peep
B. bark
C. meow
D. Compilation fails.
E. An exception is thrown at runtime.



8.
interface Jumper { public void jump(); }
...
20. class Animal {}
...
30. class Dog extends Animal {
31. Tail tail;
32. }
...
40. class Beagle extends Dog implements Jumper{
41. public void jump() {} 
42. }
...
50. class Cat implements Jumper{
51. public void jump() {}
52. }
Which three are true? (Choose three.)
A. Cat is-a Animal
B. Cat is-a Jumper
C. Dog is-a Animal
D. Dog is-a Jumper
E. Cat has-a Animal
F. Beagle has-a Tail
G. Beagle has-a Jumper

9.
public class SuperCalc {
11. protected static int multiply(int a, int b) { return a * b;}
12. }
and:
20. public class SubCalc extends SuperCalc{
21. public static int multiply(int a, int b) {
22. int c = super.multiply(a, b);
23. return c;
24. }
25. }
and:
30. SubCalc sc = new SubCalc ();
31. System.out.println(sc.multiply(3,4));
32. System.out.println(SubCalc.multiply(2,2));
What is the result?
A. 12  4
B. The code runs with no output.
C. An exception is thrown at runtime.
D. Compilation fails because of an error in line 21.
E. Compilation fails because of an error in line 22.
F. Compilation fails because of an error in line 31.

10.
class TestA {
2. public void start() { System.out.println("TestA"); }
3. }
4. public class TestB extends TestA {
5. public void start() { System.out.println("TestB"); }
6. public static void main(String[] args) {
7. ((TestA)new TestB()).start();
8. }
9. }
What is the result?
A. TestA
B. TestB
C. Compilation fails.
D. An exception is thrown at runtime.

11.
class A {
12. void process() throws Exception { throw new Exception(); }
13. }
14. class B extends A {
15. void process() { System.out.println("B"); }
16. }
17. public static void main(String[] args) {
18. new B().process();
19. }
What is the result?
A. B
B. The code runs with no output.
C. Compilation fails because of an error in line 12.
D. Compilation fails because of an error in line 15.
E. Compilation fails because of an error in line 18.

12.
class Clidders {
public final void flipper() { System.out.println("Flip a Clidder"); }
}
public class Clidlets extends Clidders {
public void flipper() {
System.out.println("Flip a Clidlet");
super.flipper();
}
public static void main(String [] args) {
new Clidlets().flipper();
}}
What is the result?
A. Flip a Clidlet
B. Flip a Clidder
C. Flip a Clidder
Flip a Clidlet
D. Flip a Clidlet
Flip a Clidder
E. Compilation fails.




13.
class Zing {
2. protected Hmpf h;
3. }
4. class Woop extends Zing { }
5. class Hmpf { }
Which is true? (Choose all that apply.)
A. Woop is-a Hmpf and has-a Zing.
B. Zing is-a Woop and has-a Hmpf.
C. Hmpf has-a Woop and Woop is-a Zing.
D. Woop has-a Hmpf and Woop is-a Zing.
E. Zing has-a Hmpf and Zing is-a Woop.

14.
What would be the result of attempting to compile and run the following code?
public class TestClass
{
   public static void main(String args[])
   {
      B c = new C();
      System.out.println(c.max(10, 20));
   }
}
class A
{
   int max(int x, int y)  { if (x>y) return x; else return y; }
}
class B extends A
{
  int max(int x, int y)  {  return 2 * super.max(x, y) ; }
}
class C extends B
{
  int max(int x, int y)  {  return super.max( 2*x, 2*y); }
}
Select 1 correct option. 
a  The code will fail to compile.   
b  Runtime error.   
c  The code will compile without errors and will print 80 when run.   
d  The code will compile without errors and will print 40 when run.   
e  The code will compile without errors and will print 20 when run. 

15.
Consider the following  class... 
class MyString extends String
{
   MyString(){ super(); }
}
The above code will not compile. 
Select 1 correct option. 
a  True   
b  False 

