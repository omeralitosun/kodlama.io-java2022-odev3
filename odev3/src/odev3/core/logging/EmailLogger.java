package odev3.core.logging;

public class EmailLogger implements BaseLogger{

	@Override
	public void log(String log) {
		
		System.out.println("Email loglandı "+log);
	}

}
