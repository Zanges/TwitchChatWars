package twitch.chatWars;

import java.io.*;

public class TwitchWarsMain {

	
	public static void main(String[] args) throws Exception{
		Bot bot = new Bot();
		FileReader fr = new FileReader("token.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String passwort = br.readLine();
		
		br.close();
		
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, passwort);
		bot.joinChannel("#TwichChatWars");
		
	}
	
}
