public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absx = Math.abs(x);
        int absy = Math.abs(y);
        assert (absx <= Integer.MAX_VALUE - absy);
        return absx + absy;
    }
}