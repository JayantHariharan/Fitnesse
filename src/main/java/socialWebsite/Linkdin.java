package socialWebsite;

import java.io.IOException;
import java.net.HttpURLConnection;

import fit.ColumnFixture;

public class Linkdin extends ColumnFixture{

	String urlName;
	WebsiteConnection website;
	HttpURLConnection connection;

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	
	public String urlStatus() throws IOException {
		website=new WebsiteConnection();
		connection=website.getConnection(urlName);
		return "checking";
	}
	public int statusCode() throws IOException {
		int code=connection.getResponseCode();
		return code;
	}
	public String message() throws IOException {
		String content=connection.getResponseMessage();
		return content;
	}
	
}
