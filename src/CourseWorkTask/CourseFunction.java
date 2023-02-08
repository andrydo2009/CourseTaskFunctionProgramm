package CourseWorkTask;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CourseFunction {


    public static void dividerWords(String s) {
        String k = s.replace ( "." , "" );
        String g = k.replace ( "," , "" );
        String divider = " ";
        System.out.println ( g );
        String[] words = g.split ( divider );
        System.out.println ( "Количество слов в строке - " + words.length );
    }

    public static void searchWords(String s) {

        String k = s.replace ( "." , "" );
        String g = k.replace ( "," , "" );
        System.out.println ( g );
        String divider = " ";
        String[] words = g.split ( divider );
        Map<String, Integer> map = Arrays.stream( words )
                .map ( String::toLowerCase )
                .collect( Collectors.toMap ( Function.identity(), value->1, (a, b) -> a + 1));
        System.out.println ( "TOP слов: " );
        map.entrySet ().stream ()
                .sorted (Map.Entry.comparingByValue ( Comparator.reverseOrder () ) )
                    .forEach ( stringIntegerEntry -> {

                    System.out.println ( stringIntegerEntry.getKey () + " - " + stringIntegerEntry.getValue () );
                } );


    }

    public static void main(String[] args) {

    /* String testString = "За свою карьеру я пропустил более 9000 бросков, проиграл почти 300 игр. 26 раз мне доверяли сделать финальный победный бросок, и я промахивался.Я терпел поражения снова, и снова, и снова. И именно поэтому я добился успеха.
    "*/

        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Введите строку: " );
        String testString = scanner.nextLine ();
        dividerWords ( testString );
        searchWords ( testString );


    }
}
