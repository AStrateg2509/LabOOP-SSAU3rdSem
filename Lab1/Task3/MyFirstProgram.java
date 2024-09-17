// 10 variant (xor ^)

class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass(0, 0);
        System.out.println(o.xor());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.xor()); System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    int a;
    int b;

    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    int getA() {
        return this.a;
    }

    int getB() {
        return this.b;
    }

    int xor() {
        return this.a ^ this.b;
    }
}
