package algo4.practice1_2;

public class _16 {
    private final long num;
    private final long den;

    public _16(long numerator, long denominator){
        if(denominator==0)
            throw new RuntimeException("Denominator is zero");
        long g = gcd(numerator,denominator);

        if(denominator<0)
            g=-g;
        this.num = numerator/g;
        this.den = denominator/g;
    }

    public _16 plus(_16 b){
        long d = den*b.den;
        long n = num*b.den+den*b.num;
        return new _16(n,d);
    }

    public _16 minus(_16 b){
        long d = den*b.den;
        long n = num*b.den - den*b.num;
        return new _16(n,d);
    }

    public _16 times(_16 b)
    {
        return new _16(num * b.num, den * b.den);
    }

    public _16 divides(_16 b)
    {
        return new _16(num * b.den, den * b.num);
    }

    public boolean equals(_16 that) {
        if (this == that) return true;
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;
        return (num == that.num && den == that.den);
    }

        private static long gcd(long m, long n) {
        if(m<0) m=-m;
        if(n<0) n=-n;
        if(n==0) return m;
        return gcd(n,m%n);
    }
    public String toString()
    {
        if (this.den == 1)
            return String.format("%d", this.num);
        return String.format("%d/%d", this.num, this.den);
    }


    public static void main(String[] args){
        _16 r = new _16(2, -6);
        System.out.println(r);
        _16 r1 = new _16(1, 5);
        _16 r2 = new _16(-1, 15);
        System.out.println(r.plus(r1));
        System.out.println(r.plus(r2).plus(r1));
        System.out.println(r.minus(r1));
        System.out.println(r.times(r1));
        System.out.println(r.divides(r1));
        System.out.println(r.times(r1).equals(r2));
        r = new _16(0, 2);
        System.out.println(r);
        System.out.println(r.plus(r1));

        r1 = new _16(1, 3);
        r2 = new _16(2, 3);
        System.out.println(r1.plus(r2));

        r1 = new _16(1, 200000000);
        r2 = new _16(1, 300000000);
        System.out.println(r1.plus(r2));

        r1 = new _16(1073741789, 20);
        r2 = new _16(1073741789, 30);
        System.out.println(r1.plus(r2));

    }
}
