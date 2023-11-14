import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static  void main(String[] args){
        System.out.println("Hola");

        Stream<Integer> generarEnteros = Stream
                .generate(() ->
                    new Random().nextInt(100) + 1
                );

        List<Integer> numerosEnteros = generarEnteros.limit(10).collect(Collectors.toList());

        // 1
        System.out.println("Dada una lista de números enteros aleatorios, imprimir todos los números pares que\n" +
                "existen en la lista usando las funciones Stream.");
        numerosEnteros.stream()
                .filter(x -> x%2==0)
                        .forEach(System.out::println);

        // 2
        System.out.println("Dada una lista de números enteros aleatorios, imprimir todos los números que\n" +
                "comienzan con 5 usando las funciones Stream.");
        numerosEnteros.stream()
                .filter(x -> x.toString().startsWith("5"))
                .forEach(System.out::println);

        // 3
        System.out.println("Dada una lista de números enteros aleatorios, imprimir todos los números\n" +
                "duplicados usando las funciones Stream.");
        numerosEnteros.stream()
                .distinct()
                .forEach(System.out::println);

        // 4
        System.out.println("Dada una lista de números enteros aleatorios, imprimir el número total de\n" +
                "elementos presentes en la lista usando funciones Stream.");
        Long totalElementos  = numerosEnteros.stream().count();
        System.out.println(totalElementos);

        // 5
        System.out.println("Dada una lista de números enteros aleatorios, imprime todos los valores presentes\n" +
                "en ella en orden descendente utilizando las funciones Stream.");
        numerosEnteros.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        // 6
        System.out.println(" Dado un array de números enteros, devuelve true si algún valor aparece al menos \n tres veces en el array y devuelve falso si cada elemento es distinto.");
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 8, 23, 4, 6, 8, 0, 2}; // Example array
        boolean elementosQueSeRepitenMasde3Veces = Arrays.stream(array)
                .anyMatch(element -> Arrays.stream(array).filter(e -> e.equals(element)).count() >= 3);

        System.out.println(elementosQueSeRepitenMasde3Veces);

        // 7
        System.out.println("Dado dos arrays de cadenas, se desea concatenar.");
        Integer[] A = new Integer[]{1, 2, 3, 4, 5, 8, 23};
        Integer[] B = new Integer[]{4, 6, 8, 0, 2};
        List<Integer> list = new ArrayList<>(Arrays.asList(A));
        list.addAll(Arrays.asList(B));
        Integer[] concatenatedArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(concatenatedArray));

        // 8

        System.out.println("Dado una lista de números enteros aleatorios, calcular el cubo de los números de\n" +
                "los elementos de lista y filtrar números mayores a 50.");

        numerosEnteros.stream()
                .map(x -> Math.pow(x,3))
                .filter(x -> x > 50)
                .forEach(System.out::println);


    }

}
