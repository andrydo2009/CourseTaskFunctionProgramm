package CourseWorkTask;
import java.util.*;
public class CourseFunction {


    public static void dividerWords(String s) {
        String k = s.replace ( "." , "" );
        String g = k.replace ( "," , "" );
        String divider = " ";
        System.out.println ( g );
        String[] words = g.split ( divider );
        System.out.println ( "Количество слов в строке - " + words.length );
//        int j = 1;
//        for (String word : words) {
//            System.out.println ( j++ + " " + word );
//        }
    }

    public static void searchWords(String s) {
//        System.out.println ( s );
        String k = s.replace ( "." , "" );
        String g = k.replace ( "," , "" );
        System.out.println ( g );
        String divider = " ";
        String[] words = g.split ( divider );
        Map<String, Integer> map = new HashMap<> ();
        for (String word : words) {
            if (!map.containsKey ( word )) {
                map.put ( word , 1 );
            } else {
                map.put ( word , map.get ( word ) + 1 );
            }
        }
//        map.forEach ( (key , value) -> System.out.println ( "Слово <" + key + "> повторяется " + value + " раз " ) );
        System.out.println ( "TOP слов: " );
        map.entrySet ().stream ()
                .sorted ( Map.Entry.comparingByValue ( Comparator.reverseOrder () ) )
                .forEach ( System.out::println );
    }

    public static void main(String[] args) {

        String testString = "За свою карьеру я пропустил более 9000 бросков, проиграл почти 300 игр. " +
                "26 раз мне доверяли сделать финальный победный бросок, и я промахивался. " +
                "Я терпел поражения снова, и снова, и снова. И именно поэтому я добился успеха.";

        dividerWords ( testString );

        searchWords ( testString );


    }
}

// end