package socialWebsite;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebsiteConnection {
	
	public HttpURLConnection getConnection(String website) throws IOException {
		URL url=new URL(website);
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		return connection;
	}

}
