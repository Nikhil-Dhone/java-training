package date_time;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class different_format_date {

	public static void main(String[] args) {
	
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime lt = LocalDateTime.now();
		System.out.println(dt.format(lt));
				
	}
	
}
