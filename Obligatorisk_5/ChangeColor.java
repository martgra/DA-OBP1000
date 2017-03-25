
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
public class ChangeColor extends JFrame implements AdjustmentListener 
{
	private JScrollBar jscbRod = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
	private JScrollBar jscbGronn = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
	private JScrollBar jscbBla = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
	private JLabel rod = new JLabel("Rød"); 
	private JLabel gronn = new JLabel("Grønn");
	private JLabel bla = new JLabel("Blå");
	public int rodTekst=0, blaTekst=0,gronnTekst=0;
	MessagePanel text = new MessagePanel("tekst i farger");
	public Font font1 = new Font("Arial", Font.BOLD, 30);
	
	public static void main(String[] args) 
	{
		ChangeColor frame = new ChangeColor();
	    frame.setTitle("Fargevelger");
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);

	}

	
	

	public ChangeColor() 
	{
	 // Create a panel to hold buttons
		
		
		
		JPanel fargeVelger = new JPanel(new GridLayout(3,2));
		fargeVelger.setBorder(BorderFactory.createTitledBorder("Velg Farger"));
		fargeVelger.add(rod);
		fargeVelger.add(jscbRod);
		fargeVelger.add(gronn);
		fargeVelger.add(jscbGronn);
		fargeVelger.add(bla);
		fargeVelger.add(jscbBla);
	    	    
	    JPanel tekstFelt = new JPanel(new BorderLayout());
	    tekstFelt.add(text);
	    text.setCentered(true);
	    text.setFont(font1);
	    
	 
	    // Register listener with buttons
	    jscbRod.addAdjustmentListener(this);
	    jscbGronn.addAdjustmentListener(this);
	    jscbBla.addAdjustmentListener(this);
	    
	    setLayout(new BorderLayout());	    
	    add(fargeVelger, BorderLayout.NORTH);
	    add(tekstFelt, BorderLayout.CENTER);
	    
	    
	}	
	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		rodTekst = jscbRod.getValue();
		gronnTekst = jscbGronn.getValue();
		blaTekst = jscbBla.getValue();
		Color color = new Color(rodTekst, gronnTekst, blaTekst);
		text.setForeground (color);
	}

			
}
	

