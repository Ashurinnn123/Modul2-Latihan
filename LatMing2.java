import java.util.LinkedList;

public class LatMing2 {
    public static void main(String[] args) {
		LinkedList<String> hewan = new LinkedList<>();
		LinkedList<String> HapusHewan = new LinkedList<>();
		
		hewan.add("sapi");
		hewan.add("kelinci");
		hewan.add("kambing");
		hewan.add("unta");
		hewan.add("domba");
		System.out.println("Hewan : "+hewan);
		
		HapusHewan.add("kelinci");
		HapusHewan.add("kambing");
		HapusHewan.add("unta");
		System.out.println("\nHewan yang dihapus: ");
		System.out.println(HapusHewan);
		
		for(int i=0; i<hewan.size();i++) {
			for(int j=0; j<HapusHewan.size();j++) {
				if(hewan.get(i) == HapusHewan.get(j)) {
					hewan.remove(i);
				}
			}
		}
		
		System.out.println("\nOutput hewan : ");
		System.out.println(hewan);
		
	}

}
