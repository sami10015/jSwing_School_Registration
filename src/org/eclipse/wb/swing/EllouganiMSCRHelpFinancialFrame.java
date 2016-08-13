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

public class EllouganiMSCRHelpFinancialFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblLunchRequestChoose = new JLabel("Lunch Request: Choose if you would like to request for free/reduced lunch");
	private final JLabel lblSiblingCountChoose = new JLabel("Sibling Count: Choose how many people live with you");
	private final JLabel lblHousemateNameEnter = new JLabel("Housemate Name: Enter name for other housemate");
	private final JLabel lblHousemateRelationshipChoose = new JLabel("Housemate Relationship: Choose relation to housemate");
	private final JLabel lblHousemateAgeEnter = new JLabel("Housemate Age: Enter age for housemate, enter 0 if it is one digit");
	private final JLabel lblHousemateSsdEnter = new JLabel("Housemate SSD: Enter Social Security Number for housemate");
	private final JLabel lblSalaryEnterSalary = new JLabel("Salary: Enter Salary Income");
	private final JLabel lblSocialSecurityEnter = new JLabel("Social Security: Enter Social Security Income");
	private final JLabel lblUtilityAssisstanceEnter = new JLabel("Utility Assisstance: Enter Utility Assisstance Income");
	private final JLabel lblUnemploymentEnterUnemployment = new JLabel("Unemployment: Enter Unemployment Income");
	private final JLabel lblDisabilityEnterDisability = new JLabel("Disability: Enter Disability Income");
	private final JLabel lblFoodStampsEnter = new JLabel("Food Stamps: Enter Food Stamps Income");
	private final JLabel lblTanfafdcEnterTanfafdc = new JLabel("TANF/AFDC: Enter TANF/AFDC Income");
	private final JLabel lblChildSupportEnter = new JLabel("Child Support: Enter Child Support Income");
	private final JLabel lblOtherEnterOther = new JLabel("Other: Enter Other Income");
	private final JLabel lblRentEnterRent = new JLabel("Rent: Enter Rent Expense");
	private final JLabel lblLightBillEnter = new JLabel("Light Bill: Enter Light Bill Expense");
	private final JLabel lblCableTvEnter = new JLabel("Cable TV: Enter Cable TV Expense");
	private final JLabel lblPhoneBillEnter = new JLabel("Phone Bill: Enter Phone Bill Expense");
	private final JLabel lblCarPaymentEnter = new JLabel("Car Payment: Enter Car Payment Expense");
	private final JLabel lblDoctormedEnterDoctormed = new JLabel("Doctor/Med: Enter Doctor/Med Expense");
	private final JLabel lblGaswaterEnterGaswater = new JLabel("Gas/Water: Enter Gas/Water Expense");
	private final JLabel lblFurnappliancesEnterFurnappliances = new JLabel("Furn/Appliances: Enter Furn/Appliances Expense");
	private final JLabel lblOtherEnterOther_1 = new JLabel("Other: Enter Other Expenses");
	private final JButton btnClose = new JButton("Close");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EllouganiMSCRHelpFinancialFrame frame = new EllouganiMSCRHelpFinancialFrame();
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
	public EllouganiMSCRHelpFinancialFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Madison County School Financial Help");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 671, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblLunchRequestChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLunchRequestChoose.setBounds(84, 38, 524, 14);
		
		contentPane.add(lblLunchRequestChoose);
		lblSiblingCountChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSiblingCountChoose.setBounds(84, 63, 422, 16);
		
		contentPane.add(lblSiblingCountChoose);
		lblHousemateNameEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHousemateNameEnter.setBounds(84, 88, 387, 14);
		
		contentPane.add(lblHousemateNameEnter);
		lblHousemateRelationshipChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHousemateRelationshipChoose.setBounds(84, 113, 422, 14);
		
		contentPane.add(lblHousemateRelationshipChoose);
		lblHousemateAgeEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHousemateAgeEnter.setBounds(84, 138, 387, 21);
		
		contentPane.add(lblHousemateAgeEnter);
		lblHousemateSsdEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHousemateSsdEnter.setBounds(84, 168, 397, 14);
		
		contentPane.add(lblHousemateSsdEnter);
		lblSalaryEnterSalary.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSalaryEnterSalary.setBounds(84, 193, 250, 14);
		
		contentPane.add(lblSalaryEnterSalary);
		lblSocialSecurityEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSocialSecurityEnter.setBounds(84, 218, 333, 16);
		
		contentPane.add(lblSocialSecurityEnter);
		lblUtilityAssisstanceEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUtilityAssisstanceEnter.setBounds(84, 245, 351, 14);
		
		contentPane.add(lblUtilityAssisstanceEnter);
		lblUnemploymentEnterUnemployment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUnemploymentEnterUnemployment.setBounds(84, 270, 321, 16);
		
		contentPane.add(lblUnemploymentEnterUnemployment);
		lblDisabilityEnterDisability.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDisabilityEnterDisability.setBounds(84, 297, 294, 14);
		
		contentPane.add(lblDisabilityEnterDisability);
		lblFoodStampsEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFoodStampsEnter.setBounds(84, 322, 294, 14);
		
		contentPane.add(lblFoodStampsEnter);
		lblTanfafdcEnterTanfafdc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTanfafdcEnterTanfafdc.setBounds(84, 347, 250, 14);
		
		contentPane.add(lblTanfafdcEnterTanfafdc);
		lblChildSupportEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChildSupportEnter.setBounds(84, 372, 308, 14);
		
		contentPane.add(lblChildSupportEnter);
		lblOtherEnterOther.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOtherEnterOther.setBounds(84, 397, 250, 14);
		
		contentPane.add(lblOtherEnterOther);
		lblRentEnterRent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRentEnterRent.setBounds(84, 422, 250, 14);
		
		contentPane.add(lblRentEnterRent);
		lblLightBillEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLightBillEnter.setBounds(84, 447, 275, 14);
		
		contentPane.add(lblLightBillEnter);
		lblCableTvEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCableTvEnter.setBounds(84, 472, 261, 14);
		
		contentPane.add(lblCableTvEnter);
		lblPhoneBillEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPhoneBillEnter.setBounds(84, 497, 250, 14);
		
		contentPane.add(lblPhoneBillEnter);
		lblCarPaymentEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCarPaymentEnter.setBounds(84, 522, 294, 14);
		
		contentPane.add(lblCarPaymentEnter);
		lblDoctormedEnterDoctormed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoctormedEnterDoctormed.setBounds(84, 547, 294, 14);
		
		contentPane.add(lblDoctormedEnterDoctormed);
		lblGaswaterEnterGaswater.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGaswaterEnterGaswater.setBounds(84, 572, 275, 14);
		
		contentPane.add(lblGaswaterEnterGaswater);
		lblFurnappliancesEnterFurnappliances.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFurnappliancesEnterFurnappliances.setBounds(84, 597, 333, 14);
		
		contentPane.add(lblFurnappliancesEnterFurnappliances);
		lblOtherEnterOther_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOtherEnterOther_1.setBounds(84, 622, 250, 14);
		
		contentPane.add(lblOtherEnterOther_1);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnClose_actionPerformed(arg0);
			}
		});
		btnClose.setBounds(289, 646, 89, 23);
		
		contentPane.add(btnClose);
	}

	protected void do_btnClose_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
}
