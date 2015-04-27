
/**
 * 
 * @author aaronortiz
 * 04-23-2015
 *
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Testscores extends JFrame implements ActionListener {
	
	private JTextField test1;
	private JTextField weight1;
	private JTextField test2;
	private JTextField weight2;
	private JTextField test3;
	private JTextField weight3;
	private JTextField test4;
	private JTextField weight4;
    private JLabel result;
    public int average = 0;
    
    public Testscores() {
    	setSize(300,200);
    	setTitle("Score Calculator");
    	setLocation(150,150);
    	
    	Container contentPane = getContentPane();
    	contentPane.setLayout(null);
    	contentPane.setBackground(Color.GREEN);
    	
    	test1 = new JTextField("Test 1");
    	test1.setBounds(25, 10, 100, 20);
    	contentPane.add(test1);
    	
    	weight1 = new JTextField ("Weight 1");
    	weight1.setBounds(150, 10,100,20);
    	contentPane.add(weight1);
    	
    	test2 = new JTextField("Test 2");
    	test2.setBounds(25, 35, 100, 20);
    	contentPane.add(test2);
    	
    	weight2 = new JTextField ("Weight 2");
    	weight2.setBounds(150, 35, 100, 20);
    	contentPane.add(weight2);
    	
    	test3 = new JTextField("Test 3");
    	test3.setBounds(25, 60, 100, 20);
    	contentPane.add(test3);
    	
    	weight3 = new JTextField ("Weight 3");
    	weight3.setBounds(150, 60, 100, 20);
    	contentPane.add(weight3);
    	
    	test4 = new JTextField("Test 4");
    	test4.setBounds(25, 85, 100, 20);
    	contentPane.add(test4);
    	
    	weight4 = new JTextField ("Weight 4");
    	weight4.setBounds(150, 85, 100, 20);
    	contentPane.add(weight4);
    	
    	JButton calculate = new JButton("Calculate");
    	calculate.setBounds(85, 110, 100, 20);
    	contentPane.add(calculate);
    	calculate.addActionListener(this);
    	
    	result = new JLabel("");
    	result.setBounds(85, 135, 120, 25);
    	contentPane.add(result);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testscores test = new Testscores();
		test.setVisible(true);
		test.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		calculateAverage();
	}
	
	public void calculateAverage(){
		int t1 = Integer.parseInt(test1.getText());
		double w1 = Double.parseDouble(weight1.getText());
		int t2 = Integer.parseInt(test2.getText());
		double w2 = Double.parseDouble(weight2.getText());
		int t3 = Integer.parseInt(test3.getText());
		double w3 = Double.parseDouble(weight3.getText());
		int t4 = Integer.parseInt(test4.getText());
		double w4 = Double.parseDouble(weight4.getText());
		average = (int)((t1*w1) + (t2*w2) + (t3*w3) + (t4*w4));
		result.setText(Integer.toString(average));
	}
	
	

}

