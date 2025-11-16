package resumesystem;

import java.util.*;

public class Main {
	 public static void main(String[] args) {
	     SoftwareEngineer se = new SoftwareEngineer();
	     DataScientist ds = new DataScientist();
	     ProductManager pm = new ProductManager();

	     AIResume<SoftwareEngineer> r1 = new AIResume<>("Alice", se, Arrays.asList("Java","Algorithms"));
	     AIResume<SoftwareEngineer> r2 = new AIResume<>("Bob", se, Arrays.asList("Python","Git"));
	     AIResume<DataScientist> r3 = new AIResume<>("Clara", ds, Arrays.asList("Python","ML","Statistics"));
	     AIResume<ProductManager> r4 = new AIResume<>("Dave", pm, Arrays.asList("Communication","Analytics"));

	     List<AIResume<? extends JobRole>> all = Arrays.asList(r1, r2, r3, r4);
	     Screening.screen(all, 0.6);
	 }
	}
