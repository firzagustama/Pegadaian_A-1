import java.util.ArrayList;
import java.util.List;

public class Main {

    static Main main = new Main();
	
	public static void main(String[] args) {
	// write your code here
        List<Barang> barangList = new ArrayList<>();

        // DATA DUMMY
        barangList.add(new Barang(1, "Firza", "Laptop", "Cepat Sekali", 7000000));
        barangList.add(new Barang(2, "Ruben", "Emas", "Berat Sekali", 10000000));
        barangList.add(new Barang(3, "Onggo", "Motor", "Bensin Habis", 3000000));
        
        main.inventory(barangList);
    }

    // TODO buat insert barang gadai disini
    public static void gadai(List<Barang> barangList) {

    }

    // TODO buat tebus disini
    public static void tebus(List<Barang> barangList) {

    }

    // TODO buat tampilkan inventory disini
    public static void inventory(List<Barang> barangList) {
    	//ArrayList<Barang> bl = new ArrayList<>();
    	
    	/*System.out.println("+----+------------+-----------------+--------------+-----------+");
        System.out.format("| %-2s | %-10s | %-15s | %-12s | %-9s |%n", "ID", "Product", "Name", "Deskripsi", "Price");
        System.out.println("+----+------------+-----------------+--------------+-----------+");*/

        String format = "| %-2d | %-10s | %-15s | %-6s | %-9d |%n";
        for(Barang barang : barangList) {
        	if(barang.getStatus().equalsIgnoreCase("lunas")) {
        		System.out.format(format, barang.getId(),barang.getNama() ,barang.getKategori(),barang.getDeskripsi() ,barang.getHarga());
        	}
        }
        System.out.println("+----+------------+-----------------+--------------+-----------+");
    }
}
