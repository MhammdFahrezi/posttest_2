
package com.mycompany.posttest2_pbo;

import java.util.ArrayList;
import java.util.Scanner;
import sistem.Limbah;
import sistem.LimbahPadat;
import sistem.LimbahCair;

public class PengelolahanLimbah {
    // ArrayList untuk menyimpan data limbah
    static ArrayList<Limbah> daftarLimbah = new ArrayList<>();

    // Metode utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nSistem Pengelolaan Limbah");
            System.out.println("1. Tambah Limbah");
            System.out.println("2. Lihat Semua Limbah");
            System.out.println("3. Perbarui Limbah");
            System.out.println("4. Hapus Limbah");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahLimbah(scanner);
                    break;
                case 2:
                    lihatSemuaLimbah(); // Pastikan metode ini static
                    break;
                case 3:
                    perbaruiLimbah(scanner);
                    break;
                case 4:
                    hapusLimbah(scanner);
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }

        } while (pilihan != 5);
    }

    // Metode untuk menambah limbah
    public static void tambahLimbah(Scanner scanner) {
        System.out.print("Masukkan jenis limbah (padat/cair): ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        System.out.print("Masukkan metode pembuangan: ");
        String metodePembuangan = scanner.nextLine();

        Limbah limbahBaru;
        if (jenis.equalsIgnoreCase("padat")) {
            limbahBaru = new LimbahPadat(jumlah, metodePembuangan);
        } else if (jenis.equalsIgnoreCase("cair")) {
            limbahBaru = new LimbahCair(jumlah, metodePembuangan);
        } else {
            System.out.println("Jenis limbah tidak valid.");
            return;
        }

        // Menambah limbah ke daftar
        daftarLimbah.add(limbahBaru);
        System.out.println("Limbah berhasil ditambahkan.");
    }

    // Metode untuk melihat semua limbah
    public static void lihatSemuaLimbah() {
        if (daftarLimbah.isEmpty()) {
            System.out.println("Tidak ada data limbah.");
        } else {
            for (Limbah limbah : daftarLimbah) {
                limbah.tampilkanDetailLimbah();
            }
        }
    }

    // Metode untuk memperbarui limbah
    public static void perbaruiLimbah(Scanner scanner) {
        System.out.print("Masukkan jenis limbah yang ingin diperbarui: ");
        String jenisUntukDiperbarui = scanner.nextLine();
        boolean ditemukan = false;

        for (Limbah limbah : daftarLimbah) {
            if (limbah.getJenis().equalsIgnoreCase(jenisUntukDiperbarui)) {
                System.out.print("Masukkan jumlah baru: ");
                int jumlahBaru = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline
                System.out.print("Masukkan metode pembuangan baru: ");
                String metodePembuanganBaru = scanner.nextLine();

                limbah.setJumlah(jumlahBaru);
                limbah.setMetodePembuangan(metodePembuanganBaru);

                System.out.println("Limbah berhasil diperbarui.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Limbah tidak ditemukan.");
        }
    }

    // Metode untuk menghapus limbah
    public static void hapusLimbah(Scanner scanner) {
        System.out.print("Masukkan jenis limbah yang ingin dihapus: ");
        String jenisUntukDihapus = scanner.nextLine();
        boolean dihapus = daftarLimbah.removeIf(limbah -> limbah.getJenis().equalsIgnoreCase(jenisUntukDihapus));

        if (dihapus) {
            System.out.println("Limbah berhasil dihapus.");
        } else {
            System.out.println("Limbah tidak ditemukan.");
        }
    }
}
