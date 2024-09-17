package myfirstpackage;

public class MySecondClass {
    int a;
    int b;

    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int xor() {
        return this.a ^ this.b;
    }
}
