package sistem;



public abstract class Limbah implements Pengelolaan {
    private final String jenis;
    private int jumlah;
    private String metodePembuangan;

    public Limbah(String jenis, int jumlah, String metodePembuangan) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.metodePembuangan = metodePembuangan;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getMetodePembuangan() {
        return metodePembuangan;
    }

    public void setMetodePembuangan(String metodePembuangan) {
        this.metodePembuangan = metodePembuangan;
    }

    @Override
    public abstract void tampilkanDetailLimbah();
}
