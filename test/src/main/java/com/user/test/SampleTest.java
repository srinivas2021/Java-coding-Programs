import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
//        String s = "my name is Srinivas I am a java developer";
//        String str = Arrays.stream(s.split(" "))
////                .forEach(System.out::println);
//                .sorted(Comparator.comparing(String::length).reversed())
//                .skip(1)
//                .findFirst()
//                .get();
//        System.out.printf(str);


//        String[] str = {"srini","","raju","","uday",null};
//        String[] st = Arrays.stream(str)
//                .filter(Objects::nonNull)
//                .filter(s -> !s.isEmpty())
//                .toArray(String[]::new);
////                .forEach(System.out::println);
//        System.out.printf(Arrays.toString(st)); //[srini, raju, uday]

//        List<Integer> numbers = Arrays.asList(43, 12, 54, 57, 26, 89, 31, 94, 57, 89);
//        int n = 4;
//        Optional<Integer> nThHighestNumber = numbers.stream()
//                                                    .sorted(Comparator.reverseOrder())
//                                                    .distinct()
//                                                    .skip(n)
//                                                    // .toList();
//                                                    .findFirst();
//        System.out.println(nThHighestNumber);   //[94, 89, 57, 54, 43, 31, 26, 12]

//        List<Integer> numbers = Arrays.asList(43, 12, 54, 57, 26, 89, 31, 94, 57, 89);
//        Set<Integer> s = new HashSet<>();
//        List<Integer> duplicates = numbers.stream()
//                                           .filter(i->!s.add(i))
//                                           .toList();
//        System.out.println(duplicates);

//        List<Integer> numbers = Arrays.asList(43, 12, 54, 57, 26, 89, 31, 94, 57, 89);
//        Map<Boolean,  List<Integer>> partition = numbers.stream()
//                .collect(Collectors.partitioningBy(n-> n%2 == 0));
//
//        List<Integer> even = partition.get(true);
//        List<Integer> odd = partition.get(false);
//
//        System.out.println("Even numbers: " + even);   //Even numbers: [12, 54, 26, 94]
//        System.out.println("Odd numbers: " +odd);     //Odd numbers: [43, 57, 89, 31, 57, 89]

//        String str = "Hello Java";
//        long vowels = str.toLowerCase().chars()
//                .filter(ch -> "aeiou".indexOf(ch) != -1).count();
//
//        long consonants = str.toLowerCase().chars()
//                .filter(ch -> ch >= 'a' && ch <= 'z')
//                .filter(ch -> "aeiou".indexOf(ch) == -1).count();
//
//        System.out.println("vowels count: " + vowels);
//        System.out.println("consonants count: " +consonants);

//        String s = "srinivas";
//        Map<String, Long> map = Arrays.stream(s.split(""))
//                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        /*for (Map.Entry entry: map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }*/
//        System.out.println(map);

//        String s = "my name is srinivas";
//        List<String> reversesWords = Arrays.stream(s.split(" "))
//                                .collect(Collectors.toList());
//        Collections.reverse(reversesWords);
//        System.out.print(String.join(" ",reversesWords));

        char[] ch = {'c','g','k','d','p','g','k',' '};
        //String str = "my name is srinivas";
        // 1. Convert char array to a String
        String str = new String(ch);
//        System.out.println(str);
        // 2. Get a Map of character frequencies using streams
        Map<Character, Long> map  =  str.chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(map);
    }
}
