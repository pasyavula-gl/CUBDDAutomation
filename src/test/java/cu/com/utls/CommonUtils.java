package cu.com.utls;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class CommonUtils {


    public static String getCountryIsoCode(String country) {
        Map<String, String> countries = new HashMap<>();
        for (String iso : Locale.getISOCountries()) {
            Locale locale = new Locale("", iso);
            countries.put(locale.getDisplayCountry(), locale.getISO3Country());
        }
        return countries.get(country);
    }

    public static String getDate(int days, String format) {
        LocalDateTime myDateObj = LocalDateTime.now().plusDays(days);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(format);
        return myDateObj.format(myFormatObj);
    }

    public static String removeFirstAndLastChars(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length() - 1);
        sb.deleteCharAt(0);
        return sb.toString();
    }

//    public static ArrayList<OrgEventDetails> getSingleKeyValues(String key, HashMap<String, ArrayList<OrgEventDetails>> map) {
//        ArrayList<OrgEventDetails> arrayLists = new ArrayList<>();
//        if (map.get(key) != null) {
//            arrayLists.addAll(map.get(key));
//        } else {
//            System.out.println("There are no values for the key : " + key);
//        }
//        return arrayLists;
//    }
//
//    public static HashMap<String, ArrayList<OrgEventDetails>> mapEventDetailsWithStatus(ArrayList<String> statusList, String eventsResponse ) {
//        ArrayList<String> rows = new ArrayList<>();
//        Collections.addAll(rows, eventsResponse.split("\n"));
//
//        ArrayList<OrgEventDetails> events = new ArrayList<>();
//        HashMap<String, ArrayList<OrgEventDetails>> eventsMap = new HashMap<>();
//        String[] strings;
//        if (rows.size() != 0) {
//            for (int i = 1; i < rows.size(); i++) {
//                String string = CommonUtils.removeFirstAndLastChars(Arrays.toString(rows.get(i).split(",")));
//                strings = string.split(",");
//                events.add(new OrgEventDetails(strings[0].trim(), strings[1].trim(),
//                        strings[2].trim(), strings[3].trim(), strings[4].trim(), strings[5].trim(), strings[6].trim()
//                        , strings[7].trim(), strings[8].trim()));
//            }
//
//            for (String string : statusList) {
//                ArrayList<OrgEventDetails> arr = new ArrayList<>();
//                for (OrgEventDetails event : events) {
//                    if (event.getEvent().contains(string)) {
//                        arr.add(event);
//                    }
//                }
//                eventsMap.put(string, arr);
//            }
//        }
//        return eventsMap;
//    }
//
//    public static void displayEventMonthly(String status, ArrayList<String> statusList, String eventsResponse )
//    {
//        ArrayList<OrgEventDetails> details = getSingleKeyValues(status, mapEventDetailsWithStatus(statusList, eventsResponse));
//        ArrayList<String> monthList = new ArrayList<>();
//        HashMap<String, ArrayList<OrgEventDetails>> maps = new HashMap<>();
//
//        if (!details.isEmpty()) {
//            for (OrgEventDetails detail : details) {
//                String string = detail.getTimestamp().substring(0, 7);
//                if (!monthList.contains(string)) {
//                    monthList.add(string);
//                }
//            }
//            for (String string : monthList) {
//                ArrayList<OrgEventDetails> arr = new ArrayList<>();
//                for (OrgEventDetails s : details) {
//                    if (s.getTimestamp().contains(string)) {
//                        arr.add(s);
//                    }
//                }
//                maps.put(string, arr);
//            }
//            maps.forEach((k, v) -> System.out.println(k + " -> " + v.size() + "\n" + k + " -> " + v));
//        }
//        else
//        {
//            System.out.println("There is no data created");
//        }
//    }
}