import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
JFrame frame  = new JFrame();
JPanel panel = new JPanel();
JButton ducks = new JButton();
JButton frog = new JButton();
	public void showButton() {
		ducks.setText("Duck Video");
		frog.setText("Frog Video");
		ducks.addActionListener(this);
		frog.addActionListener(this);
		
		frame.add(panel);
		frame.pack();
		
		panel.add(ducks);
		panel.add(frog);
		frame.pack();
		
		frame.setVisible(true);
		
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == ducks) {
			showDucks();
		}
		
		if (arg0.getSource() == frog) {
			showFrog();
		}
		
	}

	
	
}
