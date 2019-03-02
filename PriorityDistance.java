import java.util.Comparator;

public class PriorityDistance implements Comparator<String> {
	// current truck location
	double x1 = 9.15054266588354;
	double y1 = 15.000153451765999;
				
    @Override
    public int compare(String s1, String s2)
    {
        String[] splited1 = s1.split(" ");
		String[] splited2 = s2.split(" ");


				
				
		double x2 = Double.parseDouble(splited1[3]);
		double y2 = Double.parseDouble(splited1[4]);

		
		double distance1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		x2 = Double.parseDouble(splited2[3]);
	    y2 = Double.parseDouble(splited2[4]);

		
		double distance2 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		if(distance1>distance2)
			return 1;
		
		if(distance1<distance2)
			return -1;		
				
        return 0;
    }
}