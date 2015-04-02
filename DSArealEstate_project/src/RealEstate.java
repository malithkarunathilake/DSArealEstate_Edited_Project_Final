import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RealEstate {

	private JFrame frmRealEstate;
	private JTextField lotnumbertextField;
	private JTextField firstnametextField_1;
	private JTextField lastnametextField_2;
	private JTextField pricetextField_3;
	private JTextField squafeattextField_4;
	private JTextField numberofbedtextField_5;

	int displayedEstate; // how many estate that need to be displayed
	ArrayList<List_House> estateList; // make a arraylist for Estate class feilds
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealEstate window = new RealEstate();
					window.frmRealEstate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RealEstate() {
		
		initialize();
		estateList = new ArrayList<List_House>();// instantiate arraylist
		displayedEstate = -1; // initialization
		//displayedEstate1 = 1;
	//disEstate = 0;
		List_House e1 = new List_House("1", "malith", "karunathilake", 120000, 350, 3); // make a instance as e1 from estateList
		estateList.add(e1);
		
		List_House e2 = new List_House("2", "prabath", "madusanka", 234000, 450, 4); 
		estateList.add(e2);	
		List_House e3 = new List_House("3"," saman"," bandara", 344000, 550, 5); 
		estateList.add(e3);	
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRealEstate = new JFrame();
		frmRealEstate.getContentPane().setBackground(new Color(216, 191, 216));
		frmRealEstate.setTitle("Real Estate");
		frmRealEstate.setBounds(100, 100, 505, 504);
		frmRealEstate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRealEstate.getContentPane().setLayout(null);
		
		lotnumbertextField = new JTextField();
		lotnumbertextField.setBounds(207, 50, 195, 26);
		frmRealEstate.getContentPane().add(lotnumbertextField);
		lotnumbertextField.setColumns(10);
		
		firstnametextField_1 = new JTextField();
		firstnametextField_1.setBounds(207, 87, 195, 25);
		frmRealEstate.getContentPane().add(firstnametextField_1);
		firstnametextField_1.setColumns(10);
		
		lastnametextField_2 = new JTextField();
		lastnametextField_2.setBounds(207, 123, 195, 26);
		frmRealEstate.getContentPane().add(lastnametextField_2);
		lastnametextField_2.setColumns(10);
		
		pricetextField_3 = new JTextField();
		pricetextField_3.setBounds(207, 160, 195, 26);
		frmRealEstate.getContentPane().add(pricetextField_3);
		pricetextField_3.setColumns(10);
		
		squafeattextField_4 = new JTextField();
		squafeattextField_4.setBounds(207, 197, 195, 26);
		frmRealEstate.getContentPane().add(squafeattextField_4);
		squafeattextField_4.setColumns(10);
		
		JLabel lblMessages = new JLabel("Messages");
		lblMessages.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblMessages.setBackground(new Color(244, 164, 96));
		lblMessages.setBounds(61, 11, 272, 26);
		frmRealEstate.getContentPane().add(lblMessages);
		
		JLabel lblNewLabel = new JLabel("Lot Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(76, 56, 74, 14);
		frmRealEstate.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(76, 92, 74, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(76, 129, 74, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(76, 166, 74, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Squa_feat");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(76, 203, 74, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_4);
		
		JButton ResetbtnNewButton = new JButton("Reset");
		ResetbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayedEstate=-1;
				
			}
		});
		ResetbtnNewButton.setBackground(new Color(144, 238, 144));
		ResetbtnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		ResetbtnNewButton.setBounds(76, 281, 138, 38);
		frmRealEstate.getContentPane().add(ResetbtnNewButton);
		
		JButton addbtnNewButton_1 = new JButton("Add");
		addbtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		addbtnNewButton_1.addMouseListener(new MouseAdapter() {  // add data to arraylist
			@Override
			public void mouseClicked(MouseEvent arg0)
			
			{
				
				/*if(displayedEstate!=estateList.size())
				{
					
					
					lotnumbertextField.setText(estateList.get(displayedEstate++).getLotno());
					firstnametextField_1.setText(estateList.get(displayedEstate).getFname());
					lastnametextField_2.setText(estateList.get(displayedEstate).getLname());
					pricetextField_3.setText(estateList.get(displayedEstate).getPrice());
					squafeattextField_4.setText(estateList.get(displayedEstate).getSquare_feet());
					numberofbedtextField_5.setText(estateList.get(displayedEstate).getNo_of_bedroom());
				}*/
				
				
			
		double prz = Double.parseDouble(pricetextField_3.getText());
		double sqr = Double.parseDouble(squafeattextField_4.getText());
		int nob = Integer.parseInt(numberofbedtextField_5.getText());
				
				List_House copy = new List_House(lotnumbertextField.getText(), firstnametextField_1.getText(), lastnametextField_2.getText(),prz, sqr, nob);
				estateList.add(copy);
			}
		});
		
		addbtnNewButton_1.setBackground(new Color(144, 238, 144));
		addbtnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		addbtnNewButton_1.setBounds(76, 325, 138, 38);
		frmRealEstate.getContentPane().add(addbtnNewButton_1);
		
		JButton clearbtnNewButton_2 = new JButton("Clear");
		clearbtnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lotnumbertextField.setText("");
				firstnametextField_1.setText("");
				lastnametextField_2.setText("");
				pricetextField_3.setText("");
				squafeattextField_4.setText("");
				numberofbedtextField_5.setText("");
			}
		});
		clearbtnNewButton_2.setBackground(new Color(144, 238, 144));
		clearbtnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		clearbtnNewButton_2.setBounds(76, 370, 138, 38);
		frmRealEstate.getContentPane().add(clearbtnNewButton_2);
		
		JButton NextbtnNewButton_3 = new JButton("Next");
		NextbtnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
						
				if(!estateList.isEmpty()){	
					if(estateList.size()-1!=displayedEstate){
						displayedEstate++;
						lotnumbertextField.setText(estateList.get(displayedEstate).getLotno());
						firstnametextField_1.setText(estateList.get(displayedEstate).getFname());
						lastnametextField_2.setText(estateList.get(displayedEstate).getLname());
						pricetextField_3.setText(String.valueOf(estateList.get(displayedEstate).getPrice()));
						squafeattextField_4.setText(String.valueOf(estateList.get(displayedEstate).getSquare_feet()));
						numberofbedtextField_5.setText(String.valueOf(estateList.get(displayedEstate).getNo_of_bedroom()));
					}
									
				}
				
			}
			
		});
		NextbtnNewButton_3.setBackground(new Color(144, 238, 144));
		NextbtnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextbtnNewButton_3.setBounds(244, 281, 138, 38);
		frmRealEstate.getContentPane().add(NextbtnNewButton_3);
		
		JButton deletebtnNewButton_4 = new JButton("Delete");
		deletebtnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!estateList.isEmpty()){  // have to be used isEmpty method to empty data from the arraylist temparaly 
					//Last object
					if(displayedEstate==estateList.size()-1){
						estateList.remove(displayedEstate);
																		
						lotnumbertextField.setText("");
						firstnametextField_1.setText("");
						lastnametextField_2.setText("");
						pricetextField_3.setText("");
						squafeattextField_4.setText("");
						numberofbedtextField_5.setText("");
						//displayedEstate++;			
					}else{
						estateList.remove(displayedEstate);
						
						lotnumbertextField.setText(estateList.get(displayedEstate).getLotno());
						firstnametextField_1.setText(estateList.get(displayedEstate).getFname());
						lastnametextField_2.setText(estateList.get(displayedEstate).getLname());
						pricetextField_3.setText(String.valueOf(estateList.get(displayedEstate).getPrice()));
						squafeattextField_4.setText(String.valueOf(estateList.get(displayedEstate).getSquare_feet()));
						numberofbedtextField_5.setText(String.valueOf(estateList.get(displayedEstate).getNo_of_bedroom()));
						//displayedEstate++;
					}
				}else{
					lotnumbertextField.setText("");
					firstnametextField_1.setText("");
					lastnametextField_2.setText("");
					pricetextField_3.setText("");
					squafeattextField_4.setText("");
					numberofbedtextField_5.setText("");
				}
			}
		});
		deletebtnNewButton_4.setBackground(new Color(144, 238, 144));
		deletebtnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		deletebtnNewButton_4.setBounds(244, 325, 138, 38);
		frmRealEstate.getContentPane().add(deletebtnNewButton_4);
		
		JButton findbtnNewButton_5 = new JButton("Find");
		findbtnNewButton_5.setBackground(new Color(144, 238, 144));
		findbtnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		findbtnNewButton_5.setBounds(244, 370, 138, 38);
		frmRealEstate.getContentPane().add(findbtnNewButton_5);
		
		JLabel lblNewLabel_5 = new JLabel("Number of Bedrooms");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(40, 239, 138, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_5);
		
		numberofbedtextField_5 = new JTextField();
		numberofbedtextField_5.setBounds(207, 234, 195, 26);
		frmRealEstate.getContentPane().add(numberofbedtextField_5);
		numberofbedtextField_5.setColumns(10);
	}
}
