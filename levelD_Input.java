import java.util.ArrayList;
import java.util.Scanner;

public class levelD_Input {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    ArrayList<Integer> lines = new ArrayList<Integer>();
    int num=0;
    
    int rangset = 0;
    for(int i = 0;i < range;i++) {
    	int line = Integer.parseInt(sc.next());
    	lines.add(line);
		num+=1;
    }

    for(int i = 0;i < num;i++) {
    	for(int j = 0;j <num-i-1;j++) {
    		if(lines.get(j+1) > lines.get(j) ) {
    			int a = lines.get(j+1);
    			int b = lines.get(j);
    			lines.set(j,a );
    			lines.set(j+1, b);
    		}
    		
    	
    	}
    }
    for(int i1= 0;i1<num;i1++) {
    	System.out.println(lines.get(i1));
    }
	
    
	}
}

