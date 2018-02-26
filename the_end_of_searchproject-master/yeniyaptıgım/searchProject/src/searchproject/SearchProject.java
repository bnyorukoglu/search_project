package searchproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SearchProject {


    public static int DateBinarySearch(long value, List<Long> Milliseconds) {

        if (value < Milliseconds.get(0)) {
            return 0;
        }
        if (value >Milliseconds.get(Milliseconds.size()-1) ){
            return (Milliseconds.size()-1);
        }

        int lo = 0;
        int hi =  Milliseconds.size()-1 ;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (value <Milliseconds.get(mid)) {
                hi = mid - 1;
            } else if (value > Milliseconds.get(mid)) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        // lo == hi + 1
        return(Milliseconds.get(lo) - value) < (value - Milliseconds.get(hi)) ? lo : hi;
    }

    public static void parseFunction(String line, Content obj, List<Long> Milliseconds) throws ParseException {
        String forDate = "";
        String forTime = "";
        String forWord = "";
        String forDetail = "";
        String forDateTime = "";
        StringBuilder strBindDate = new StringBuilder("");
        StringBuilder strBindTime = new StringBuilder("");
        StringBuilder strBindWord = new StringBuilder("");
        StringBuilder strBindDetail = new StringBuilder("");
        StringBuilder strTopla = new StringBuilder("");
        int sayac = 0;
        for (int i = 0; i < line.length(); ++i) {
            StringBuilder DateAndTime = new StringBuilder("");
            if (sayac == 0 || sayac == 1 || sayac == 2) {
                if (sayac == 0) {
                    while (line.charAt(i) != ' ' && i < line.length()) {
                        strBindDate.append(line.charAt(i));
                        ++i;

                    }

                    forDate = strBindDate.toString();
                } else if (sayac == 1) {
                    while (i < line.length() && line.charAt(i) != ' ' && sayac == 1) {
                        strBindTime.append(line.charAt(i));
                        ++i;

                    }

                    forTime = strBindTime.toString();
                } else if (sayac == 2) {

                    while (i < line.length() && line.charAt(i) != ' ' && sayac == 2) {
                        strBindWord.append(line.charAt(i));
                        ++i;
                    }
                    forWord = strBindWord.toString();
                }
                if (i < line.length()) {
                    if (line.charAt(i) == ' ') {
                        while (line.charAt(i) == ' ') {
                            ++i;
                        }
                        --i;
                    }
                }
            } else {
                while (i < line.length()) {
                    strBindDetail.append(line.charAt(i));
                    ++i;
                }
                forDetail = strBindDetail.toString();
            }
            sayac++;
        }

        strTopla.append(forDate);
        strTopla.append(" ");
        strTopla.append(forTime);
        forDateTime = strTopla.toString();

        String myDate = forDateTime;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        Date date = sdf.parse(myDate);
        long millis = date.getTime();
        Milliseconds.add(millis);

        forDetail = strBindDetail.toString();
        obj.setDate(forDate);
        obj.setTime(forTime);
        obj.setWord(forWord);
        obj.setDetail(forDetail);
    }

    public static void addOtherDetail(String line, Content obj) {
        Content tempObj = new Content();
        tempObj.setDetail(obj.getDetail());
        tempObj.setDetail(tempObj.getDetail() + "\n");
        if (!"".equals(line)) {
            for (int i = 0; i < line.length(); ++i) {
                tempObj.setDetail(tempObj.getDetail() + line.charAt(i));
            }
            obj.setDetail(tempObj.getDetail());
        } else {
            tempObj.setDetail(tempObj.getDetail() + "\n");
            obj.setDetail(tempObj.getDetail());
        }
    }

    //istenen kelimeyi word için bulma(INFO/DEBUG)
    public static void wordSearch(CharSequence word, List<Content> content, List<Integer> gelen) {
        boolean wordFound;
        for (int i = 0; i < content.size(); ++i) {
            wordFound = content.get(i).getWord().contains(word);
            if (wordFound == true) {
                gelen.add(i);
            }
        }
    }

    //istenen kelime objenin detail kısmında aranır eger bulunursa gelen liste
    //dogru bulunan objelerin indexleri atılır
    public static void textSearch(CharSequence word, List<Content> content, List<Integer> gelen) {
        boolean wordFound;
        for (int i = 0; i < content.size(); ++i) {
            wordFound = content.get(i).getDetail().contains(word);
            if (wordFound == true) {
                gelen.add(i);
            }
        }
        for(int i=0;i<gelen.size();++i){
            System.out.println("indexler" +gelen.get(i));
        }
    }

    public static boolean wordOf4(String line) {
        StringBuilder temp = new StringBuilder("");
        String s1 = "2018";
        String s2 = "";
        for (int i = 0; i < 4; ++i) {
            if (i < line.length()) {
                temp.append(line.charAt(i));
            }
        }
        s2 = temp.toString();
        if (s2.equals(s1) == true) {
            return true;
        } else {
            return false;
        }
    }

}
