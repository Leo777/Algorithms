package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {
//        IntStream.range(1,10).forEach(System.out::println);

       List<String> allowed = Arrays.asList("some", "is", "another", "bubble", "gum", "startcraft");
       List<String> requested = Arrays.asList("some", "is", "leningrad", "huj", "pizdec", "startcraft");
       List<String> filtered = requested.stream().filter(e-> allowed.contains(e)).collect(Collectors.toList());
        System.out.println(filtered);
    }

}
