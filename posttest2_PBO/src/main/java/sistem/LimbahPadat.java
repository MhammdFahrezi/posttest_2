package sistem;

public final class LimbahPadat extends Limbah {
    public LimbahPadat(int jumlah, String metodePembuangan) {
        super("Limbah Padat", jumlah, metodePembuangan);
    }

    @Override
    public void tampilkanDetailLimbah() {
        System.out.println("Jenis: " + getJenis() + ", Jumlah: " + getJumlah() + " kg, Metode Pembuangan: " + getMetodePembuangan());
    }
}
