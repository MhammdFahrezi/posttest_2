package sistem;

public final class LimbahCair extends Limbah {
    public LimbahCair(int jumlah, String metodePembuangan) {
        super("Limbah Cair", jumlah, metodePembuangan);
    }

    @Override
    public void tampilkanDetailLimbah() {
        System.out.println("Jenis: " + getJenis() + ", Jumlah: " + getJumlah() + " liter, Metode Pembuangan: " + getMetodePembuangan());
    }
}
