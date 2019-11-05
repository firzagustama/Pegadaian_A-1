import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Barang> barangList = new ArrayList<>();

        // DATA DUMMY
        barangList.add(new Barang(1, "Firza", "Laptop", "Cepat Sekali", 7000000));
        barangList.add(new Barang(2, "Ruben", "Emas", "Berat Sekali", 10000000));
        barangList.add(new Barang(3, "Onggo", "Motor", "Bensin Habis", 3000000));
		
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
        	} else {
        		System.out.println("!!!!! Barang Tidak Di Temukan !!!!!");
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

    }
}
