package tugass;

/**
 * Created by User on 11/06/2015.
 */
public class Pembalap {
    private String motorPembalap;
    private String helmPembalap;
    private String sarungTanganPembalap;
    private String merkSepatu;

    public Pembalap() {
    }

    public Pembalap(String motorPembalap, String helmPembalap) {
        this.motorPembalap = motorPembalap;
        this.helmPembalap = helmPembalap;
    }

    public Pembalap(String motorPembalap, String helmPembalap, String sarungTanganPembalap, String merkSepatu) {
        this.motorPembalap = motorPembalap;
        this.helmPembalap = helmPembalap;
        this.sarungTanganPembalap = sarungTanganPembalap;
        this.merkSepatu = merkSepatu;
    }

    public String getMotorPembalap() {
        return motorPembalap;
    }

    public void setMotorPembalap(String motorPembalap) {
        this.motorPembalap = motorPembalap;
    }

    public String getHelmPembalap() {
        return helmPembalap;
    }

    public void setHelmPembalap(String helmPembalap) {
        this.helmPembalap = helmPembalap;
    }

    public String getSarungTanganPembalap() {
        return sarungTanganPembalap;
    }

    public void setSarungTanganPembalap(String sarungTanganPembalap) {
        this.sarungTanganPembalap = sarungTanganPembalap;
    }

    public String getMerkSepatu() {
        return merkSepatu;
    }

    public void setMerkSepatu(String merkSepatu) {
        this.merkSepatu = merkSepatu;
    }

    @Override
    public String toString() {
        return "Pembalap{" +
                "motorPembalap='" + motorPembalap + '\'' +
                ", helmPembalap='" + helmPembalap + '\'' +
                ", sarungTanganPembalap='" + sarungTanganPembalap + '\'' +
                ", merkSepatu='" + merkSepatu + '\'' +
                '}';
    }
}

