package DateSorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class DateSortingClass {
	public static void main(String[] args) {
        
		List<Date> dateList = new ArrayList<>();
		dateList.add(new Date(2016-1900, 03, 03));
		dateList.add(new Date(2012-1900, 06, 06));
		dateList.add(new Date(2017-1900, 07, 23));
        dateList.add(new Date(2012-1900, 01, 18));
         
        Collections.sort(dateList, new Comparator<Date>(){
 
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
         
        for(int i = 0; i < dateList.size(); i++){
            System.out.println(dateList.get(i).toString());
        }
 
    }

}