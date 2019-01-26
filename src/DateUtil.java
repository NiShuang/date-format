import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciel on 2019/1/24
 */
public class DateUtil {
    public static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("januar", 1);
        map.put("februar", 2);
        map.put("märz", 3);
        map.put("april", 4);
        map.put("mai", 5);
        map.put("juni", 6);
        map.put("juli", 7);
        map.put("august", 8);
        map.put("september", 9);
        map.put("oktober", 10);
        map.put("november", 11);
        map.put("dezember", 12);

        map.put("enero", 1);
        map.put("febrero", 2);
        map.put("marzo", 3);
        map.put("abril", 4);
        map.put("mayo", 5);
        map.put("junio", 6);
        map.put("julio", 7);
        map.put("agosto", 8);
        map.put("septiembre", 9);
        map.put("octubre", 10);
        map.put("noviembre", 11);
        map.put("diciembre", 12);

        map.put("gennaio", 1);
        map.put("febbraio", 2);
        map.put("marzo", 3);
        map.put("aprile", 4);
        map.put("maggio", 5);
        map.put("giugno", 6);
        map.put("luglio", 7);
        map.put("agosto", 8);
        map.put("settembre", 9);
        map.put("ottobre", 10);
        map.put("novembre", 11);
        map.put("dicembre", 12);

        map.put("janvier", 1);
        map.put("février", 2);
        map.put("mars", 3);
        map.put("avril", 4);
        map.put("mai", 5);
        map.put("juin", 6);
        map.put("juillet", 7);
        map.put("août", 8);
        map.put("septembre", 9);
        map.put("octobre", 10);
        map.put("novembre", 11);
        map.put("décembre",12);

        map.put("january", 1);
        map.put("february", 2);
        map.put("march", 3);
        map.put("april", 4);
        map.put("may", 5);
        map.put("june", 6);
        map.put("july", 7);
        map.put("august", 8);
        map.put("september", 9);
        map.put("october", 10);
        map.put("november", 11);
        map.put("december",12);
    }

    public static String parseDate(String s) {
        String dateStr = s.toLowerCase().replace(".", "").replace(" de "," ").replace("," ,"").replace("年", " ").replace("月", " ").replace("日", "");
        String[] parts = dateStr.split(" ");
        Integer month = null;
        String day = "1";
        String year = "2019";
        for (String part : parts) {
            char c = part.charAt(0);
            if (c >= 'a' && c <= 'z') {
                month = map.get(part);
            } else if (part.length() == 4) {
                year = part;
            } else {
                day = part;
            }
        }
        if (month == null) {
            day = parts[2];
            month = Integer.parseInt(parts[1]);
        }
        return year + "-" + String.valueOf(month) + "-" + day;
    }

    public static void main(String[] args) {
        System.out.println(DateUtil.parseDate("11 August 2018"));
        System.out.println(DateUtil.parseDate("October 27, 2018"));
        System.out.println(DateUtil.parseDate("2018年10月24日"));
        System.out.println(DateUtil.parseDate("19 de octubre de 2018"));
        System.out.println(DateUtil.parseDate("5 octobre 2018"));
        System.out.println(DateUtil.parseDate("22. Oktober 2018"));
        System.out.println(DateUtil.parseDate("2 ottobre 2018"));

    }
}
