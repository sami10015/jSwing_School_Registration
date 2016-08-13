package org.eclipse.wb.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EllouganiMSCRHelpParentFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblLastNameEnter = new JLabel("Last Name: Enter Parent's Last Name");
	private final JLabel lblFirstNameEnter = new JLabel("First Name: Enter Parent's First Name");
	private final JLabel lblMiEnterParents = new JLabel("M.I.: Enter Parent's Middle Initial");
	private final JLabel lblHomeEnterParents = new JLabel("Home#: Enter Parent's Home Phone Number");
	private final JLabel lblWorkEnterParents = new JLabel("Work#: Enter Parent's Work Phone Number");
	private final JLabel lblCellEnterParents = new JLabel("Cell#: Enter Parent's Cell Phone Number");
	private final JLabel lblLivesWithChoose = new JLabel("Lives With: Choose if Student Lives with Parent");
	private final JLabel lblAddressifDifferentChoose = new JLabel("Address(if different): Choose Address(if different from Student)");
	private final JLabel lblPlaceOfEmployment = new JLabel("Place of Employment: Enter Place of Employment");
	private final JLabel lblOccupationEnterOccupation = new JLabel("Occupation: Enter Occupation at Place of Employment");
	private final JLabel lblEmailAddressEnter = new JLabel("Email Address: Enter Parent's Email Address");
	private final JLabel lblRelationEnterRelation = new JLabel("Relation: Enter Relation to Student");
	private final JLabel lblSiblingNameEnter = new JLabel("Sibling Name: Enter Sibling's name");
	private final JLabel lblSiblingDobEnter = new JLabel("Sibling D.O.B.: Enter Sibling's Date of Birth");
	private final JLabel lblSiblingGradeEnter = new JLabel("Sibling Grade: Enter Sibling's Grade, enter 0 if one digit");
	private final JLabel lblSiblingSchoolEnter = new JLabel("Sibling School: Enter the name of the Sibling's school");
	private final JLabel lblSpecialServicesChoose = new JLabel("Special Services: Choose one of the special services, none if the Student has none");
	private final JLabel lblLifeThreatningAllergy = new JLabel("Life Threatning Allergy: Enter an allergy if the Student has one");
	private final JLabel lblEmergencyNameEnter = new JLabel("Emergency Name: Enter the Emergency Contact's Name");
	private final JLabel lblEmergencyRelationshipChoose = new JLabel("Emergency Relationship: Choose the Emergency Contact's Relation to the Student");
	private final JLabel lblEmergencyPhoneNumber = new JLabel("Emergency Phone Number: Enter the Emergency Contact's Phone Number");
	private final JButton btnClose = new JButton("Close");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EllouganiMSCRHelpParentFrame frame = new EllouganiMSCRHelpParentFrame();
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
	public EllouganiMSCRHelpParentFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Madison County School Parent Help");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 656, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblLastNameEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastNameEnter.setBounds(110, 31, 307, 14);
		
		contentPane.add(lblLastNameEnter);
		lblFirstNameEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFirstNameEnter.setBounds(110, 56, 293, 14);
		
		contentPane.add(lblFirstNameEnter);
		lblMiEnterParents.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMiEnterParents.setBounds(110, 81, 263, 14);
		
		contentPane.add(lblMiEnterParents);
		lblHomeEnterParents.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHomeEnterParents.setBounds(110, 106, 263, 14);
		
		contentPane.add(lblHomeEnterParents);
		lblWorkEnterParents.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWorkEnterParents.setBounds(110, 131, 293, 14);
		
		contentPane.add(lblWorkEnterParents);
		lblCellEnterParents.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCellEnterParents.setBounds(110, 156, 307, 14);
		
		contentPane.add(lblCellEnterParents);
		lblLivesWithChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLivesWithChoose.setBounds(110, 181, 349, 14);
		
		contentPane.add(lblLivesWithChoose);
		lblAddressifDifferentChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddressifDifferentChoose.setBounds(110, 206, 403, 14);
		
		contentPane.add(lblAddressifDifferentChoose);
		lblPlaceOfEmployment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPlaceOfEmployment.setBounds(110, 231, 403, 14);
		
		contentPane.add(lblPlaceOfEmployment);
		lblOccupationEnterOccupation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOccupationEnterOccupation.setBounds(110, 256, 349, 14);
		
		contentPane.add(lblOccupationEnterOccupation);
		lblEmailAddressEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmailAddressEnter.setBounds(110, 281, 307, 14);
		
		contentPane.add(lblEmailAddressEnter);
		lblRelationEnterRelation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRelationEnterRelation.setBounds(110, 306, 239, 14);
		
		contentPane.add(lblRelationEnterRelation);
		lblSiblingNameEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSiblingNameEnter.setBounds(110, 331, 307, 14);
		
		contentPane.add(lblSiblingNameEnter);
		lblSiblingDobEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSiblingDobEnter.setBounds(110, 356, 279, 14);
		
		contentPane.add(lblSiblingDobEnter);
		lblSiblingGradeEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSiblingGradeEnter.setBounds(110, 381, 365, 14);
		
		contentPane.add(lblSiblingGradeEnter);
		lblSiblingSchoolEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSiblingSchoolEnter.setBounds(110, 406, 349, 14);
		
		contentPane.add(lblSiblingSchoolEnter);
		lblSpecialServicesChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSpecialServicesChoose.setBounds(110, 431, 534, 14);
		
		contentPane.add(lblSpecialServicesChoose);
		lblLifeThreatningAllergy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLifeThreatningAllergy.setBounds(110, 456, 417, 14);
		
		contentPane.add(lblLifeThreatningAllergy);
		lblEmergencyNameEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmergencyNameEnter.setBounds(110, 481, 380, 14);
		
		contentPane.add(lblEmergencyNameEnter);
		lblEmergencyRelationshipChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmergencyRelationshipChoose.setBounds(110, 506, 507, 14);
		
		contentPane.add(lblEmergencyRelationshipChoose);
		lblEmergencyPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmergencyPhoneNumber.setBounds(110, 531, 484, 14);
		
		contentPane.add(lblEmergencyPhoneNumber);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnClose_actionPerformed(arg0);
			}
		});
		btnClose.setBounds(276, 555, 89, 23);
		
		contentPane.add(btnClose);
	}

	protected void do_btnClose_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
}
