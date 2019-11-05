import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Barang> barangList = new ArrayList<>();
		
        Scanner scanner = new Scanner(System.in);
    	int input;
    	do {
    		System.out.println("Pegadaian System");
            System.out.println("================");
            System.out.println("1. Gadai");
        	System.out.println("2. Tebus");
        	System.out.println("3. Tampilkan Inventory");
        	System.out.println("4. Exit");
			System.out.println("================");
			System.out.print("Opsi : ");

			input = scanner.nextInt();
			
        	switch(input) {
				case 1:
					gadai(barangList);
					break;
				case 2:
					tebus(barangList);
					break;
				case 3:
					inventory(barangList);
					break;
			}

    	} while (input != 4);
    }

    // TODO buat insert barang gadai disini
    public static void gadai(ArrayList<Barang> barangList) {
    	Scanner in = new Scanner(System.in);
    	
    	//inisiasi nilai
    	String nama;
    	String kategori, deskripsi;
    	int id, harga, words;
    	
    	//input nama
    	System.out.print("Nama : ");
    	do {
    		nama = in.nextLine();
    		if(nama.length() < 3 || nama.length() > 15) {
    			System.out.print("Masukkan Salah! Nama harus terdiri dari 3-15 karakter. Masukkan kembali. \nNama : ");
    		}
    	} while (nama.length() < 3 || nama.length() > 15);
    	
    	//input Kategori
    	System.out.print("Kategori Produk : ");
    	do {
    		kategori = in.nextLine();
    		if(!kategori.equalsIgnoreCase("Motor") && !kategori.equalsIgnoreCase("Laptop") && !kategori.equalsIgnoreCase("Emas")) {
    			System.out.print("Masukkan Salah! Produk hanya terdiri dari Motor, Laptop, Emas. Masukkan kembali. \nKategori Produk : ");
    		}
    	} while (!kategori.equalsIgnoreCase("Motor") && !kategori.equalsIgnoreCase("Laptop") && !kategori.equalsIgnoreCase("Emas"));
    	
    	//input deskripsi
		System.out.print("Deskripsi : ");
    	do {
    		deskripsi = in.nextLine();
    		words = deskripsi.split(" ").length;
    		if(words < 2) {
    			System.out.print("Masukkan Salah! Deskripsi harus terdiri minimal 2 kata. Masukkan kembali. \nDeskripsi : ");
    		}
    	}while(words < 2);

    	//input harga
    	System.out.print("Harga: ");
    	do{
    		harga = in.nextInt();
    		if(harga%10000 != 0) {
    			System.out.print("Masukkan Salah! Harga harus kelipatan 10000. Masukkan kembali. Harga : ");
    		}
    	}while(harga%10000 != 0);
    	
    	id = barangList.size()+1;
    	barangList.add(new Barang(id, nama, kategori, deskripsi, harga));
    }

    // TODO buat tebus disini
    public static void tebus(ArrayList<Barang> barangList) {
    	// Print table
    	System.out.println("+----+------------+-----------------+--------+-----------------+");
        System.out.format("| %-2s | %-10s | %-15s | %-6s | %-15s |%n", "ID", "Product", "Price", "Status", "Utang");
        System.out.println("+----+------------+-----------------+--------+-----------------+");
        String format = "| %-2d | %-10s | %-15d | %-6s | %-15d |%n";
        for(Barang barang : barangList) {
            System.out.format(format, barang.getId(), barang.getKategori(), barang.getHarga(), barang.getStatus(), barang.getUtang());
        }
        System.out.println("+----+------------+-----------------+--------+-----------------+");
    	
        // Input
    	System.out.print("Masukkan ID Barang : ");
    	
    	Scanner input_id= new Scanner(System.in);
    	int idtebus = input_id.nextInt();
    	
    	System.out.print("Masukkan Nominal Tebus : ");
    	
    	Scanner input_pembayaran= new Scanner(System.in);
    	int bayartebus= input_pembayaran.nextInt();
    	
    	// Cek pembayaran
    	for (Barang barang: barangList){
        	if(barang.getId().equals(idtebus)){
        		
        		int hitungHutang = barang.getUtang() - bayartebus;
        		if (hitungHutang  < 0) {
        			barang.setUtang(0);
        		} else {
        			barang.setUtang(hitungHutang);
        		}
        		
        		if (barang.getUtang() == 0){
        			barang.setStatus("lunas");
        		}
        	} 
    	}
    	
    	//Print Tabel akhir
    	System.out.println("+----+------------+-----------------+--------+-----------------+");
        System.out.format("| %-2s | %-10s | %-15s | %-6s | %-15s |%n", "ID", "Product", "Price", "Status", "Utang");
        System.out.println("+----+------------+-----------------+--------+-----------------+");
        for(Barang barang : barangList) {
            System.out.format(format, barang.getId(), barang.getKategori(), barang.getHarga(), barang.getStatus(), barang.getUtang());
        }
        System.out.println("+----+------------+-----------------+--------+-----------------+");
    }

    // TODO buat tampilkan inventory disini
    public static void inventory(ArrayList<Barang> barangList) {
    	System.out.println("+----+------------+-----------------+--------------+-----------+");
        System.out.format("| %-2s | %-10s | %-15s | %-12s | %-9s |%n", "ID", "Name", "Product", "Description", "Price");
        System.out.println("+----+------------+-----------------+--------------+-----------+");

        String format = "| %-2d | %-10s | %-15s | %-12s | %-9d |%n";
        for(Barang barang : barangList) {
        	if(barang.getStatus().equalsIgnoreCase("gadai")) {
        		System.out.format(format, barang.getId(),barang.getNama() ,barang.getKategori(),barang.getDeskripsi() ,barang.getHarga());
        	}
        }
        System.out.println("+----+------------+-----------------+--------------+-----------+");
    }
}
