class Formula {
    int a;
    int b;
    int c;

    Formula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void displayFormula() {
        double vector = a * Math.pow(b, c);
        System.out.println(vector);
    }
}
class Formula2 {
    int j;
    int d;
    int m;

    Formula2(int j, int d, int m) {
        this.j = j;
        this.d = d;
        this.m = m;
    }

    public void displayFormula() {
        double vector = j * Math.pow(d, m);
        System.out.println(vector);
    }
}
@FunctionalInterface
interface Converter <Formula,Formula2> {
    Formula2 conv(Formula t);

}
class Main {

    public static void main(String[] args) {
        Formula first = new Formula(6,3,4);
        Converter bb = x -> new Formula2(first.a, first.b, first.c);
        Formula2 second = (Formula2) bb.conv(first);
        second.displayFormula();

    }
}