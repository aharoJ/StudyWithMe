package tiktok;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class ReformatDate_1507 {
  public String reformatDate(String date) {
    Map<String, String> map = new HashMap<>();
    map.put("Jan", "01");
    map.put("Feb", "02");
    map.put("Mar", "03");
    map.put("Apr", "04");
    map.put("May", "05");
    map.put("Jun", "06");
    map.put("Jul", "07");
    map.put("Aug", "08");
    map.put("Sep", "09");
    map.put("Oct", "10");
    map.put("Nov", "11");
    map.put("Dec", "12");

    // Split the input date string into parts
    String[] parts = date.split(" ");
    String day = parts[0];
    String month = parts[1];
    String year = parts[2];

    // Remove the ordinal suffix from the day and ensure it's two digits
    day = day.replaceAll("[^0-9]", "");
    if (day.length() == 1) {
      day = "0" + day;
    }

    // Convert month using the map
    month = map.get(month);

    // Format the date in "YYYY-MM-DD" format
    return year + "-" + month + "-" + day;
  }

  public static void main(String[] args) {
    ReformatDate_1507 obj = new ReformatDate_1507();
    System.out.println(obj.reformatDate("20th Oct 2052"));
  }
}
