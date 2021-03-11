import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {
        List<String> livro = new ArrayList<>();
        livro.add("Alura Onlive");
        livro.add("Java OO");
        livro.add("Cálculo Linear");
        livro.add("C++ ");

        Comparator<String> c = new ComparadorPorTamanho();
       // livro.sort(c);
        livro.sort((s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        });
        livro.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(livro);

        //mais facil
        livro.forEach(s -> System.out.println(s));

        livro.forEach(new Consumer<String>() { //classe anonma
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}
