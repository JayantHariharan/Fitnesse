package healthTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import fit.ColumnFixture;

public class WebsiteCheck extends ColumnFixture{
	
	String website;
	URL url;
	HttpURLConnection connection;
	int code;
	String message;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	
	public String urlStatus() throws IOException {
		url=new URL(website);
		connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		return "processing...";
	}
	
	public int statusCode() throws IOException {
		code=connection.getResponseCode();
		return code;
	}
	public String messageCode() throws IOException {
		message=connection.getResponseMessage();
		return message;
	}
	
}
