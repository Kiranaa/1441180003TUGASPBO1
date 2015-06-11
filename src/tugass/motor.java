package tugass;

/**
 * Created by User on 11/06/2015.
 */
public class motor {
    private String merkMotor;
    private String warnaMotor;
    private int mesinMotor;
    private String suspensiMotor;

    public motor() {
    }

    public motor(String merkMotor, String warnaMotor, int mesinMotor) {
        this.merkMotor = merkMotor;
        this.warnaMotor = warnaMotor;
        this.mesinMotor = mesinMotor;
    }

    public motor(String merkMotor, String warnaMotor, int mesinMotor, String suspensiMotor) {
        this.merkMotor = merkMotor;
        this.warnaMotor = warnaMotor;
        this.mesinMotor = mesinMotor;
        this.suspensiMotor = suspensiMotor;
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }

    public String getWarnaMotor() {
        return warnaMotor;
    }

    public void setWarnaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
    }

    public int getMesinMotor() {
        return mesinMotor;
    }

    public void setMesinMotor(int mesinMotor) {
        this.mesinMotor = mesinMotor;
    }

    public String getSuspensiMotor() {
        return suspensiMotor;
    }

    public void setSuspensiMotor(String suspensiMotor) {
        this.suspensiMotor = suspensiMotor;
    }

    @Override
    public String toString() {
        return "motor{" +
                "merkMotor='" + merkMotor + '\'' +
                ", warnaMotor='" + warnaMotor + '\'' +
                ", mesinMotor=" + mesinMotor +
                ", suspensiMotor='" + suspensiMotor + '\'' +
                '}';
    }
}
