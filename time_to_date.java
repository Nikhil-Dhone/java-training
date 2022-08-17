package date_time;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class time_to_date {
	public static void main(String[] args) {
	LocalDate ld = LocalDate.of(2020, 10, 2);
	LocalDateTime td = ld.atTime(2, 00);
	System.out.println(td);
	}
}
