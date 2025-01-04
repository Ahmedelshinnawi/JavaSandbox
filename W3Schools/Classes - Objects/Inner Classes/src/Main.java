/*
Java Inner Classes
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:

 */

class OuterClass {
    int x = 10;
    class InnerClass {
        int y = 20;
    }
}

/*
Private Inner Class
Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:
 */
class OuterClass2 {
    int x = 10;
    private class InnerClass {
        int y = 20;
    }
}

/*
Static Inner Class
An inner class can also be static, which means that you can access it without creating an object of the outer class:
 */
class OuterClass3 {
    int x = 10;
   static class InnerClass {
       int y = 20;
   }
}

/*
Access Outer Class From Inner Class
 */
class OuterClass4 {
    int x = 10;
    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);

        OuterClass2 myOuter2 = new OuterClass2();

        OuterClass3.InnerClass myInner2 = new OuterClass3.InnerClass();
        System.out.println(myInner2.y);

        OuterClass4 myOuter4 = new OuterClass4();
        OuterClass4.InnerClass myInner4 = myOuter4.new InnerClass();
        System.out.println(myInner4.myInnerMethod());
    }
}