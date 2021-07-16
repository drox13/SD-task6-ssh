import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bash {

	public String executeCommand(String pathFile) {

		ProcessBuilder pb = new ProcessBuilder(pathFile);
		Process p;
		try {
			p = pb.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pathFile;
	}

	public static void main(String[] args) {
		Bash com = new Bash();
		com.executeCommand("/home/drox/SD-task6-ssh/run.sh");
	}
}
