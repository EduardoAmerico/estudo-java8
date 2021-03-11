import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpieda = LocalDate.of(2025, Month.JUNE,5);
        System.out.println(olimpieda);

        int  anos = olimpieda.getYear() - hoje.getYear();
        System.out.println(anos);

        Period p = Period.between(hoje, olimpieda);
        System.out.println(p);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(hoje.format(f));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(f2));
    }
}
