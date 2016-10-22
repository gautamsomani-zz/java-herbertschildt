class Solution {
    public static void main(String[] args) {
        double d = 3.000000000;
        System.out.println(convert1(d));
        System.out.println(convert2(d));
    }

    static Object convert1(double d) {
        if(d % 1 == 0)
            return (int) d;
        else
            return d;
    }

    static Object convert2(double d) {
        return ((d%1) == 0) ? ((int) (d)) : d;
    }
}
