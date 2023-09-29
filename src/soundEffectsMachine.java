import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class soundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton fart = new JButton();
	JButton woohoo = new JButton();
	JButton drum = new JButton();
	public void showButton() {
		
		button.setText("Sawing Wood");
		fart.setText("Fart");
		woohoo.setText("Woohoo");
		drum.setText("Drum");
		
		frame.add(panel);
		frame.pack();
		
		panel.add(button);
		frame.pack();
		
		panel.add(fart);
		frame.pack();
		
		panel.add(woohoo);
		frame.pack();
		
		panel.add(drum);
		frame.pack();
		
		
		
		
		frame.setVisible(true);
		
		button.addActionListener(this);
		fart.addActionListener(this);
		woohoo.addActionListener(this);
		drum.addActionListener(this);
		
	}
	
	
	
	
	
	
	
	
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}








	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
		playSound("sawing-wood-daniel_simon.wav");
		}
		
		if (arg0.getSource() == fart) {
			playSound("fart.wav");
		}
		
		if(arg0.getSource() == woohoo) {
			playSound("homer-woohoo.wav");
		}
		
		if (arg0.getSource() == drum) {
			playSound("drum.wav");
		}
	}









	

}









