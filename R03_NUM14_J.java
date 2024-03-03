public class R03_NUM14_J{

    static int countOneBits(long value){
            int bits = 0;
            while( value != 0) {
                bits += value &1l;
                value >>= 1;//signed right shift, by 1
            }
            return bits;
        } 
}