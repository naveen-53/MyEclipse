package Date_and_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertDateFormat {

	public static void main(String[] args) {
		
		String s ="2025-08-21";
		
		LocalDate ld = LocalDate.parse(s);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		
		String date = ld.format(dtf);
		System.out.println(date);

	}

}

//| Pattern               | Example Output (for `2025-08-21`) | Meaning                      |
//| --------------------- | --------------------------------- | ---------------------------- |
//| `dd-MM-yyyy`          | `21-08-2025`                      | Day-Month-Year (numeric)     |
//| `dd/MM/yyyy`          | `21/08/2025`                      | Day/Month/Year (slashes)     |
//| `MM-dd-yyyy`          | `08-21-2025`                      | US style (Month first)       |
//| `yyyy-MM-dd`          | `2025-08-21`                      | ISO standard                 |
//| `dd-MMM-yyyy`         | `21-Aug-2025`                     | Day-Month(short name)-Year   |
//| `dd-MMMM-yyyy`        | `21-August-2025`                  | Full month name              |
//| `E, dd-MM-yyyy`       | `Thu, 21-08-2025`                 | Short weekday                |
//| `EEEE, dd MMMM yyyy`  | `Thursday, 21 August 2025`        | Full weekday + month         |
//| `yyyy/MM/dd HH:mm:ss` | `2025/08/21 14:35:10`             | Date + 24-hr time            |
//| `dd-MM-yyyy hh:mm a`  | `21-08-2025 02:35 PM`             | Date + 12-hr time with AM/PM |
//| `yyyyMMdd`            | `20250821`                        | Compact format               |
//| `dd.MM.yyyy`          | `21.08.2025`                      | European style with dots     |
