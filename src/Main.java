import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Barang> barangList = new ArrayList<>();

        // DATA DUMMY
        barangList.add(new Barang(1, "Firza", "Laptop", "Cepat Sekali", 7000000));
        barangList.add(new Barang(2, "Ruben", "Emas", "Berat Sekali", 10000000));
        barangList.add(new Barang(3, "Onggo", "Motor", "Bensin Habis", 3000000));
    }

    // TODO buat insert barang gadai disini
    public static void gadai(List<Barang> barangList) {
    	Scanner in = new Scanner(System.in);
    	String nama;
    	String kategori, deskripsi;
    	int id, harga;
    	System.out.println("Nama: ");
    	
    	do {
    		nama = in.nextLine();
    		if(nama.length()<3 || nama.length()>15) {
    			System.out.println("Masukkan Salah! Nama harus terdiri dari 3-15 karakter. Masukkan kembali. \nNama:");
    		}
    	}while (nama.length()<3 || nama.length()>15);
    	kategori = in.nextLine();
    	deskripsi = in.nextLine();
    	harga = in.nextInt();
    	id = barangList.size()+1;
    	barangList.add(new Barang(id, nama, kategori, deskripsi, harga));
    }

    // TODO buat tebus disini
    public static void tebus(List<Barang> barangList) {

    }

    // TODO buat tampilkan inventory disini
    public static void inventory(List<Barang> barangList) {

    }
}
