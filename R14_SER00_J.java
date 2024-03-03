import java.io.Serializable;

public static R14_SER00_J {

class GameWeapon implements Serializable{
        public static final long serialVersionUID = 2L;

        int numOfWeapons = 10;

        public String tostring() {
            return String.valueOf(numOfWeapons);
        }
    }
}
