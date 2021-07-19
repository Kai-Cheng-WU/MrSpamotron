import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class MrSpamotron {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot mrSpam = new Robot();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text:");
		Scanner myScan = new Scanner(System.in);
		String text = myScan.nextLine();
		
		StringSelection mySelection = new StringSelection(text);
		Clipboard myClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		myClipboard.setContents(mySelection, null);
		
		System.out.println("Enter the number of times you want the message to be sent, in integer");
		int times = myScan.nextInt();
		System.out.println("Enter the time interval between spams, in miliseconds");
		int interval = myScan.nextInt();
		System.out.println("Set a wait timer until the Mr. Spamotron starts working, in seconds");
		int waitTimer = myScan.nextInt();

		
		Thread.sleep(waitTimer*1000);
		
		for(int i=0; i<times; i++) {
			mrSpam.keyPress(KeyEvent.VK_META);
			mrSpam.keyPress(KeyEvent.VK_V);
			mrSpam.keyRelease(KeyEvent.VK_META);
			mrSpam.keyRelease(KeyEvent.VK_V);
			mrSpam.keyPress(KeyEvent.VK_ENTER);
			mrSpam.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(interval);
		}
		
	}

}
