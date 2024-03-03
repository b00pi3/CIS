public class R02_EXP05_J{
        public static void main(String[] args) {
          int number = 17;
          int threshold = 10;
        final int authum = get();
                
          final int authnum = get();
number = ((31 * (number + 1)) * authnum) + (authnum > threshold ? 0 : -2);
          // ...
          if (number == 0) {
            System.out.println("Access granted");
          } else {
            System.out.println("Denied access"); // number = -2
          }
        }
       
        public static int get() {
          int number = 0;
          // Assign number to nonzero value if authorized, else 0
          return number;
        }
}
