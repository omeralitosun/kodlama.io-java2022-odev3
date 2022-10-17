package odev3.core.logging;

public class FileLogger implements BaseLogger{

	@Override
	public void log(String log) {
		System.out.println("File loglandı "+log);
		
	}

}
