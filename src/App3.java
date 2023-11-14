import java.util.*;
import java.util.stream.Collectors;

public class App3 {

    public static void main(String[] args){
        List<String> users = Arrays.asList("Amalia", "Jose",
                "Teresa", "Ana", "Daniel", "Alberto", "María");
        Optional<String> findFirst =
                users.parallelStream().filter(s ->
                        s.startsWith("A")).findFirst();
        Optional<String> findAny =
                users.parallelStream().filter(s ->
                        s.startsWith("A")).findAny();

        System.out.println(findFirst);
        System.out.println(findAny);




        // 12

        System.out.println("¿Qué imprime los siguientes fragmentos de código y explique cuál es la diferencia\n" +
                "entre map y flatmap?");

        Map<String, List<String>> user = new HashMap<>();
        user.put("Carolina", Arrays.asList("051-922-977234",
                "051-998-92223"));
        user.put("Bertha", Arrays.asList("051-991-927204",
                "051-991-96263"));
        user.put("Marco", Arrays.asList("051-931-977003",
                "051-961-98861"));
        List<String> names = user.keySet().stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(names);
        List<String> phones = user.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(phones);
    }

}
