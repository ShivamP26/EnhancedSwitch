
public class TryingNew {
	public static void main(String[] args) {
		String newName = "XYZ"; // if you put JANUARY or any month will give correct 
		System.out.println(newName + " is in the " + getQuater(newName) + " quarter");
	}
	
	public static String getQuater(String month) {
		return switch(month) {
		case "JANUARY","FEBRUARY", "MARCH" -> { yield "1ST"; }
		case "APRIL", "MAY", "JUNE" -> "2ND";
		case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
		case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
		default -> {
			String badResponse = month + " is bad";
			yield badResponse;
		}
		}; 
	}

}
