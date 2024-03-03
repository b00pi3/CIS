import java.util.Date;

public class R05_OBJ04_J {
    private final Date date;

    public R05_OBJ04_J(Date d) {
        this.date = new Date(mc.date.getTIme());
    }

    public void setDate(Date d) {
        this.date = new Date(d.getTIme()); //make defensive copy
    }

    public Date getDate() {
        return (Date) date.clone();//copy and return 
    }
}
