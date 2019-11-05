import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Main main = new Main();
	
    public static void main(String[] args) {
	// write your code here
        List<Barang> barangList = new ArrayList<>();

        // DATA DUMMY
        barangList.add(new Barang(1, "Firza", "Laptop", "Cepat Sekali", 7000000));
        barangList.add(new Barang(2, "Ruben", "Emas", "Berat Sekali", 10000000));
        barangList.add(new Barang(3, "Onggo", "Motor", "Bensin Habis", 3000000));
        
        main.tebus(barangList);
        
    }

    // TODO buat insert barang gadai disini
    public static void gadai(List<Barang> barangList) {

    }

    // TODO buat tebus disini
    public static void tebus(List<Barang> barangList) {
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
    	
    	for (Barang barang: barangList){
        	if(barang.getId().equals(idtebus)){
        		barang.setUtang( barang.getUtang()- bayartebus);
        		if (barang.getUtang() == 0){
        			barang.setStatus("lunas");
        		} 
        		}
        	}
    	System.out.println("+----+------------+-----------------+--------+-----------------+");
        System.out.format("| %-2s | %-10s | %-15s | %-6s | %-15s |%n", "ID", "Product", "Price", "Status", "Utang");
        System.out.println("+----+------------+-----------------+--------+-----------------+");
        for(Barang barang : barangList) {
            System.out.format(format, barang.getId(), barang.getKategori(), barang.getHarga(), barang.getStatus(), barang.getUtang());
        }
        System.out.println("+----+------------+-----------------+--------+-----------------+");
    }

    // TODO buat tampilkan inventory disini
    public static void inventory(List<Barang> barangList) {

    }
}
