public class Data {

    private String nama;
    private String nim;
    private String kelas;
    private String alamat;

    public Data() {
        nama = "";
        nim = "";
        kelas = "";
        alamat = "";
    }

    public Data(String nama, String nim, String kelas, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.alamat = alamat;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnama() { return nama; }

    public String getnim() { return nim; }

    public String getkelas() { return kelas; }

    public String getalamat() { return alamat; }

}
