package date_time;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class country_dt {
	public static void main(String[] args) {
		String canada = DateFormat.getDateInstance(DateFormat.SHORT,Locale.CANADA).format(new Date());
		String frache = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.FRANCE).format(new Date());
		String japan = DateFormat.getDateInstance(DateFormat.LONG,Locale.JAPAN).format(new Date());
		System.out.println(canada+"\n"+frache+"\n"+japan);
		
	}
}
