package sistem;

// Interface untuk operasi CRUD


public interface CRUD {
    void tambahLimbah(Limbah limbah);
    void lihatSemuaLimbah();
    void perbaruiLimbah(String jenis, int jumlahBaru, String metodePembuanganBaru);
    void hapusLimbah(String jenis);
}
