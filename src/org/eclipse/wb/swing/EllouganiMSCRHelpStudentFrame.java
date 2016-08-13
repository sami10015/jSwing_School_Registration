package org.eclipse.wb.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EllouganiMSCRHelpStudentFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblLastName = new JLabel("Last Name: Enter Student's Last Name");
	private final JLabel lblFirstNameEnter = new JLabel("First Name: Enter Student's First Name");
	private final JLabel lblMiddleInitialEnter = new JLabel("Middle Initial: Enter Student's Middle Initial");
	private final JLabel lblPreferredNameEnter = new JLabel("Preferred Name: Enter Student's Preferred Name");
	private final JLabel lblEthnicityChooseThe = new JLabel("Ethnicity: Choose the Student's Ethnicity");
	private final JLabel lblRaceChooseThe = new JLabel("Race: Choose the Student's Race");
	private final JLabel lblAdditionalInformationProvide = new JLabel("Additional Information: Provide Additional Information about the Student");
	private final JLabel lblGenderChooseThe = new JLabel("Gender: Choose the Student's Gender");
	private final JLabel lblDobEnterThe = new JLabel("D.O.B.: Enter the Student's Date of Birth");
	private final JLabel lblGradeEnterThe = new JLabel("Grade: Enter the Student's Grade Level, enter with 0 if one digit number");
	private final JLabel lblAddressInformationEnter = new JLabel("Address Information: Enter Student's Address Information");
	private final JLabel lblStreetAddressEnter = new JLabel("Street Address: Enter the Student's Street Address");
	private final JLabel lblCityEnterThe = new JLabel("City: Enter the Student's City");
	private final JLabel lblZipEnterThe = new JLabel("Zip: Enter the Student's Zip");
	private final JLabel lblHomeEnter = new JLabel("Home #: Enter the Student's Home Phone Number");
	private final JLabel lblSubdivisionEnterThe = new JLabel("Subdivision: Enter the Student's Subdivision");
	private final JLabel lblOwnleaseChooseOwn = new JLabel("Own/Lease: Choose Own or Lease");
	private final JLabel lblLeaseExpirationEnter = new JLabel("Lease Expiration: Enter the Lease Expiration");
	private final JButton btnClose = new JButton("Close");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EllouganiMSCRHelpStudentFrame frame = new EllouganiMSCRHelpStudentFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EllouganiMSCRHelpStudentFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Madison County School Student Help");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 542, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastName.setBounds(81, 30, 245, 14);
		
		contentPane.add(lblLastName);
		lblFirstNameEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFirstNameEnter.setBounds(81, 55, 245, 14);
		
		contentPane.add(lblFirstNameEnter);
		lblMiddleInitialEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMiddleInitialEnter.setBounds(81, 80, 266, 14);
		
		contentPane.add(lblMiddleInitialEnter);
		lblPreferredNameEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPreferredNameEnter.setBounds(81, 105, 305, 14);
		
		contentPane.add(lblPreferredNameEnter);
		lblEthnicityChooseThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEthnicityChooseThe.setBounds(81, 130, 285, 14);
		
		contentPane.add(lblEthnicityChooseThe);
		lblRaceChooseThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRaceChooseThe.setBounds(81, 155, 266, 14);
		
		contentPane.add(lblRaceChooseThe);
		lblAdditionalInformationProvide.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAdditionalInformationProvide.setBounds(81, 180, 435, 14);
		
		contentPane.add(lblAdditionalInformationProvide);
		lblGenderChooseThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGenderChooseThe.setBounds(81, 205, 305, 14);
		
		contentPane.add(lblGenderChooseThe);
		lblDobEnterThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDobEnterThe.setBounds(81, 230, 323, 14);
		
		contentPane.add(lblDobEnterThe);
		lblGradeEnterThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGradeEnterThe.setBounds(81, 255, 435, 14);
		
		contentPane.add(lblGradeEnterThe);
		lblAddressInformationEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddressInformationEnter.setBounds(81, 280, 388, 14);
		
		contentPane.add(lblAddressInformationEnter);
		lblStreetAddressEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStreetAddressEnter.setBounds(81, 305, 388, 14);
		
		contentPane.add(lblStreetAddressEnter);
		lblCityEnterThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCityEnterThe.setBounds(81, 330, 245, 14);
		
		contentPane.add(lblCityEnterThe);
		lblZipEnterThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblZipEnterThe.setBounds(81, 355, 305, 14);
		
		contentPane.add(lblZipEnterThe);
		lblHomeEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHomeEnter.setBounds(81, 380, 305, 14);
		
		contentPane.add(lblHomeEnter);
		lblSubdivisionEnterThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubdivisionEnterThe.setBounds(81, 405, 305, 14);
		
		contentPane.add(lblSubdivisionEnterThe);
		lblOwnleaseChooseOwn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOwnleaseChooseOwn.setBounds(81, 430, 370, 14);
		
		contentPane.add(lblOwnleaseChooseOwn);
		lblLeaseExpirationEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLeaseExpirationEnter.setBounds(81, 455, 305, 14);
		
		contentPane.add(lblLeaseExpirationEnter);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnClose_actionPerformed(arg0);
			}
		});
		btnClose.setBounds(242, 484, 89, 23);
		
		contentPane.add(btnClose);
	}
	protected void do_btnClose_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
}
