package date_time;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class current_date_time {
	public static void main(String[] args) {
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("MM/dd/YYYY hh:mm:ss");
		LocalDateTime t = LocalDateTime.now();
		System.out.println(dt.format(t));
	}
	
}
