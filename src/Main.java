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
    	
    	//inisiasi nilai
    	String nama;
    	String kategori, deskripsi;
    	int id, harga;
    	
    	//input nama
    	System.out.println("Nama: ");
    	do {
    		nama = in.nextLine();
    		if(nama.length()<3 || nama.length()>15) {
    			System.out.println("Masukkan Salah! Nama harus terdiri dari 3-15 karakter. Masukkan kembali. \nNama:");
    		}
    	}while (nama.length()<3 || nama.length()>15);
    	
    	//input Kategori
    	System.out.println("Kategori Produk: ");
     	
    	do {
    		kategori = in.nextLine();
    		if(!kategori.equalsIgnoreCase("Motor") && !kategori.equalsIgnoreCase("Laptop") && !kategori.equalsIgnoreCase("Emas")) {
    			System.out.println("Masukkan Salah! Produk hanya terdiri dari Motor, Laptop, Emas. Masukkan kembali. \nKategori Produk:");
    		}
    	}while (!kategori.equalsIgnoreCase("Motor") && !kategori.equalsIgnoreCase("Laptop") && !kategori.equalsIgnoreCase("Emas"));
    	
    	//input deskripsi
    	deskripsi = in.nextLine();
    	
    	//input harga dan id
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
