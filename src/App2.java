import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App2 {

    public static void main (String[] args){

        String banco = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ123456789";

        List<String> cadenasAleatorias = Stream.generate(() -> {
            int longitud = numeroAlearotioEnRango(1,10);
            return Stream.generate(() -> {
                int index = numeroAlearotioEnRango(0, banco.length() -1);
                return banco.charAt(index);
            }).limit(longitud)
            .map(Objects::toString)
            .collect(Collectors.joining());
        }).limit(10)
        .map(Object::toString).toList();

        Long totalPalabras = cadenasAleatorias.stream().count();
        System.out.println(totalPalabras);

    }


    public static int numeroAlearotioEnRango(int min, int max){

        return new Random().nextInt(max - min + 1) + min;

    }

}
