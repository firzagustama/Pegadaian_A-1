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
        
        System.out.println("1. Gadai");
    	System.out.println("2. Tebus");
    	System.out.println("3. Tampilkan Inventory");
    	System.out.println("4. Exit");
    	System.out.print("Input : ");
    	Scanner scanner = new Scanner(System.in);
    	int input = scanner.nextInt();
    	
    	if (input == 1){
    		
    	}
    	else if (input == 2){
    		
    	}
    	else if (input ==3){
    		
    	}
    	else if (input ==4){
    	}
    	else {}
    }

    // TODO buat insert barang gadai disini
    public static void gadai(List<Barang> barangList) {

    }

    // TODO buat tebus disini
    public static void tebus(List<Barang> barangList) {

    }

    // TODO buat tampilkan inventory disini
    public static void inventory(List<Barang> barangList) {

    }
}
