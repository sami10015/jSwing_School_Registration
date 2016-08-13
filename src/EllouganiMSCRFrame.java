import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import org.eclipse.wb.swing.EllouganiMSCRHelpFinancialFrame;
import org.eclipse.wb.swing.EllouganiMSCRHelpParentFrame;
import org.eclipse.wb.swing.EllouganiMSCRHelpStudentFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.text.Format;

public class EllouganiMSCRFrame extends JFrame {

	//Panels, tabs, and menu items
	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel StudentInformation = new JPanel();
	private final JPanel ParentInformation = new JPanel();
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmStartNewForm = new JMenuItem("Start New Form");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenuItem mntmStudentHelp = new JMenuItem("Student Help");
	private final JMenuItem mntmFamilyHelp = new JMenuItem("Family Help");
	private final JMenuItem mntmFinancialHelp = new JMenuItem("Financial Help");

	//All the input masks and numberformatters
	MaskFormatter zipMask = createFormatter("#####");
	MaskFormatter homePhoneMask = createFormatter("(###)-###-####");
	MaskFormatter homePhoneMask2 = createFormatter("(###)-###-####");
	MaskFormatter homePhoneMask3 = createFormatter("(###)-###-####");
	MaskFormatter workPhoneMask = createFormatter("(###)-###-####");
	MaskFormatter cellPhoneMask = createFormatter("(###)-###-####");
	MaskFormatter workPhoneMask2 = createFormatter("(###)-###-####");
	MaskFormatter cellPhoneMask2 = createFormatter("(###)-###-####");
	MaskFormatter emergencyPhoneMask = createFormatter("(###)-###-####");
	MaskFormatter emergencyPhoneMask2 = createFormatter("(###)-###-####");
	MaskFormatter gradeMask = createFormatter("##");
	MaskFormatter gradeMask2 = createFormatter("##");
	MaskFormatter gradeMask3 = createFormatter("##");
	MaskFormatter gradeMask4 = createFormatter("##");
	MaskFormatter ageMask = createFormatter("##");
	MaskFormatter ageMask2 = createFormatter("##");
	MaskFormatter ageMask3 = createFormatter("##");
	MaskFormatter ageMask4 = createFormatter("##");
	MaskFormatter ageMask5 = createFormatter("##");
	MaskFormatter ssdMask = createFormatter("###-##-####");
	MaskFormatter ssdMask2 = createFormatter("###-##-####");
	MaskFormatter ssdMask3 = createFormatter("###-##-####");
	MaskFormatter ssdMask4 = createFormatter("###-##-####");
	MaskFormatter ssdMask5 = createFormatter("###-##-####");
	double num = 0.0;
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	
	//All the labels and text fields under the student information tab
	private final JLabel studentNameLabel = new JLabel("Student Name:");
	private final JLabel lastNameLabel = new JLabel("*Last Name:");
	private final JLabel firstNameLabel = new JLabel("*First Name:");
	private final JTextField lastNameTF = new JTextField();
	private final JTextField firstNameTF = new JTextField();
	private final JLabel middleInitialLabel = new JLabel("M.I.");
	private final JTextField middleInitialTF = new JTextField();
	private final JLabel preferredNameLabel = new JLabel("Preferred Name:");
	private final JTextField preferredNameTF = new JTextField();
	private final JLabel raceLabel = new JLabel("*Race:");
	private final JLabel ethnicityLabel = new JLabel("*Ethnicity:");
	private final JRadioButton rdbtnHispanicOrLatino = new JRadioButton("Hispanic or Latino");
	private final JRadioButton rdbtnNotHispanicOr = new JRadioButton("Not Hispanic or Latino");
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final JLabel genderLabel = new JLabel("*Gender:");
	private final JRadioButton rdbtnMale = new JRadioButton("Male");
	private final JRadioButton rdbtnFemale = new JRadioButton("Female");
	private final JCheckBox chckbxAmericanIndian = new JCheckBox("American Indian or Alaska Native");
	private final JCheckBox chckbxAsian = new JCheckBox("Asian");
	private final JCheckBox chckbxBlackOrAfrican = new JCheckBox("Black or African American");
	private final JCheckBox chckbxNativeHawaiian = new JCheckBox("Native Hawaiian or Other Pacific Islander");
	private final JCheckBox chckbxWhite = new JCheckBox("White");
	private final JCheckBox chckbxOther = new JCheckBox("Other");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JLabel dateOfBirthLabel = new JLabel("*D.O.B:");
	private final JLabel gradeLabel = new JLabel("*Grade:");
	private final JFormattedTextField gradeFTF = new JFormattedTextField();
	private final JLabel addressInfoLabel = new JLabel("Address Information:");
	private final JLabel streetAddressLabel = new JLabel("*Street Address:");
	private final JTextField streetAddressTF = new JTextField();
	private final JLabel cityLabel = new JLabel("*City:");
	private final JTextField cityTF = new JTextField();
	private final JLabel zipLabel = new JLabel("*Zip:");
	private final JFormattedTextField zipFTF = new JFormattedTextField();
	private final JLabel homePhoneLabel = new JLabel("*Home Phone:");
	private final JFormattedTextField homePhoneFTF = new JFormattedTextField();	
	private final JComboBox dobMonthComboBox = new JComboBox();
	private final JComboBox dobDayComboBox = new JComboBox();
	private final JComboBox dobYearComboBox = new JComboBox();
	private final JLabel subdivisionLabel = new JLabel("*Subdivision:");
	private final JTextField subdivisionTF = new JTextField();
	private final JLabel leaseOwnLabel = new JLabel("*Lease/Own:");
	private final JRadioButton rdbtnOwn = new JRadioButton("Own");
	private final JRadioButton rdbtnLease = new JRadioButton("Lease");
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final JLabel leaseExpirationLabel = new JLabel("Lease Expiration:");
	private final JComboBox leaseMonthComboBox = new JComboBox();
	private final JComboBox leaseDayComboBox = new JComboBox();
	private final JComboBox leaseYearComboBox = new JComboBox();
	
	//All the labels and text fields for the parent information tab
	private final JLabel parentGuardianLabel = new JLabel("Parent/Guardian Information:");
	private final JLabel lastNameParentLabel = new JLabel("*Last Name:");
	private final JTextField lastNameParentTF = new JTextField();
	private final JLabel firstNameParentLabel = new JLabel("*First Name:");
	private final JTextField firstNameParentTF = new JTextField();
	private final JLabel middleInitialParentLabel = new JLabel("M.I.");
	private final JTextField middleInitialParentTF = new JTextField();
	private final JLabel homePhoneNumberLabel = new JLabel("*Home #");
	private final JFormattedTextField homePhoneNumberFTF = new JFormattedTextField();
	private final JLabel workPhoneNumberLabel = new JLabel("*Work #");
	private final JFormattedTextField workPhoneNumberFTF = new JFormattedTextField();
	private final JLabel cellNumberLabel = new JLabel("*Cell #");
	private final JFormattedTextField cellNumberFTF = new JFormattedTextField();
	private final JLabel addressIfDifferentLabel = new JLabel("Address (if different):");
	private final JTextField parentAddressTF = new JTextField();
	private final JLabel placeOfEmploymentLabel = new JLabel("*Place of Employment:");
	private final JTextField employmentTF = new JTextField();
	private final JLabel occupationLabel = new JLabel("*Occupation:");
	private final JTextField occupationTF = new JTextField();
	private final JLabel emailAddressLabel = new JLabel("*Email Address:");
	private final JTextField emailAddressTF = new JTextField();
	private final JRadioButton rdbtnMother = new JRadioButton("Mother");
	private final JRadioButton rdbtnFather = new JRadioButton("Father");
	private final JRadioButton rdbtnOther = new JRadioButton("Other");
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final JLabel parentGuardianLabel2 = new JLabel("Parent/Guardian Information 2:");
	private final JLabel lastNameParentLabel2 = new JLabel("Last Name:");
	private final JTextField lastNameParentTF2 = new JTextField();
	private final JLabel firstNameParentLabel2 = new JLabel("First Name:");
	private final JTextField firstNameParentTF2 = new JTextField();
	private final JLabel middleInitialParentLabel2 = new JLabel("M.I.");
	private final JTextField middleInitialParentTF2 = new JTextField();
	private final JLabel homePhoneNumberLabel2 = new JLabel("Home #");
	private final JFormattedTextField homePhoneNumberFTF2 = new JFormattedTextField();
	private final JLabel workPhoneNumberLabel2 = new JLabel("Work #");
	private final JFormattedTextField workPhoneNumberFTF2 = new JFormattedTextField();
	private final JLabel cellNumberLabel2 = new JLabel("Cell #");
	private final JFormattedTextField cellNumberFTF2 = new JFormattedTextField();
	private final JLabel placeOfEmploymentLabel2 = new JLabel("Place of Employment:");
	private final JTextField employmentTF2 = new JTextField();
	private final JLabel occupationLabel2 = new JLabel("Occupation:");
	private final JTextField occupationTF2 = new JTextField();
	private final JLabel emailAddressLabel2 = new JLabel("Email Address:");
	private final JTextField emailAddressTF2 = new JTextField();
	private final JRadioButton rdbtnMother2 = new JRadioButton("Mother");
	private final JRadioButton rdbtnFather2 = new JRadioButton("Father");
	private final JRadioButton rdbtnOther2 = new JRadioButton("Other");
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final JButton btnAddParent = new JButton("Add Parent/Guardian");
	private final JButton btnRemoveParent = new JButton("Remove Parent/Guardian");
	private final JLabel livesWithLabel = new JLabel("*Lives with: ");
	private final JRadioButton rdbtnYes = new JRadioButton("Yes");
	private final JRadioButton rdbtnNo = new JRadioButton("No");
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final JLabel livesWithLabel2 = new JLabel("Lives with: ");
	private final JRadioButton rdbtnYes2 = new JRadioButton("Yes");
	private final JRadioButton rdbtnNo2 = new JRadioButton("No");
	private final JTextField parentAddressTF2 = new JTextField();
	private final JLabel addressIfDifferentLabel2 = new JLabel("Address (if different):");
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final JLabel relationLabel = new JLabel("*Relation:");
	private final JLabel relationLabel2 = new JLabel("Relation:");
	private final JLabel siblingInformationLabel = new JLabel("Sibling Information:");
	private final JLabel siblingCountLabel = new JLabel("*How many siblings?: ");
	private final JComboBox siblingComboBox = new JComboBox();
	private final JLabel siblingNameLabel = new JLabel("Name: ");
	private final JTextField siblingNameTF = new JTextField();
	private final JLabel siblingDateOfBirthLabel = new JLabel("D.O.B:");
	private final JComboBox siblingMonthComboBox = new JComboBox();
	private final JComboBox siblingDayComboBox = new JComboBox();
	private final JComboBox siblingYearComboBox = new JComboBox();
	private final JFormattedTextField siblingGradeFTF = new JFormattedTextField();
	private final JLabel siblingSchoolLabel = new JLabel("School:");
	private final JTextField siblingSchoolTF = new JTextField();
	private final JLabel siblingGradeLabel = new JLabel("Grade:");
	private final JLabel siblingNameLabel2 = new JLabel("Name: ");
	private final JTextField siblingNameTF2 = new JTextField();
	private final JLabel siblingDateOfBirthLabel2 = new JLabel("D.O.B:");
	private final JComboBox siblingMonthComboBox2 = new JComboBox();
	private final JComboBox siblingDayComboBox2 = new JComboBox();
	private final JComboBox siblingYearComboBox2 = new JComboBox();
	private final JLabel siblingGradeLabel2 = new JLabel("Grade:");
	private final JFormattedTextField siblingGradeFTF2 = new JFormattedTextField();
	private final JLabel siblingSchoolLabel2 = new JLabel("School:");
	private final JTextField siblingSchoolTF2 = new JTextField();
	private final JLabel siblingNameLabel3 = new JLabel("Name: ");
	private final JTextField siblingNameTF3 = new JTextField();
	private final JLabel siblingDateOfBirthLabel3 = new JLabel("D.O.B:");
	private final JComboBox siblingMonthComboBox3 = new JComboBox();
	private final JComboBox siblingDayComboBox3 = new JComboBox();
	private final JComboBox siblingYearComboBox3 = new JComboBox();
	private final JLabel siblingGradeLabel3 = new JLabel("Grade:");
	private final JFormattedTextField siblingGradeFTF3 = new JFormattedTextField();
	private final JLabel siblingSchoolLabel3 = new JLabel("School:");
	private final JTextField siblingSchoolTF3 = new JTextField();
	private final JSeparator siblingSeperator = new JSeparator();
	private final JSeparator siblingSeperator2 = new JSeparator();
	private final JLabel childInformationLabel = new JLabel("Child/Dependant Information:");
	private final JLabel specialServicesLabel = new JLabel("*Special Services: ");
	private final JRadioButton rdbtnGifted = new JRadioButton("Gifted");
	private final JRadioButton rdbtnSpediep = new JRadioButton("Sped-IEP");
	private final JRadioButton rdbtnSpeechiep = new JRadioButton("Speech-IEP");
	private final JRadioButton rdbtnEll = new JRadioButton("ELL");
	private final JRadioButton rdbtnNone = new JRadioButton("None");
	private final JLabel allergyLabel = new JLabel("Life Threatening Allergy:");
	private final JTextField allergyTF = new JTextField();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final JLabel emergencyContactInfoLabel = new JLabel("Emergency Contact Information: ");
	private final JLabel emergencyContactNameLabel = new JLabel("*Name:");
	private final JTextField emergencyContactNameTF = new JTextField();
	private final JLabel emergencyContactRelationshipLabel = new JLabel("*Relationship: ");
	private final JComboBox emergencyContactRelationshipComboBox = new JComboBox();
	private final JLabel emergencyContactPhoneNumberLabel = new JLabel("*Phone Number: ");
	private final JFormattedTextField emergencyPhoneFTF = new JFormattedTextField();
	private final JLabel emergencyContactNameLabel2 = new JLabel("*Name:");
	private final JTextField emergencyContactNameTF2 = new JTextField();
	private final JLabel emergencyContactRelationshipLabel2 = new JLabel("*Relationship: ");
	private final JComboBox emergencyContactRelationshipComboBox2 = new JComboBox();
	private final JLabel emergencyContactPhoneNumberLabel2 = new JLabel("*Phone Number: ");
	private final JFormattedTextField emergencyPhoneFTF2 = new JFormattedTextField();
	private final JLabel emergencyMseLabel = new JLabel("*My child's name, address & phone number may appear in the MSE directory: ");
	private final JRadioButton rdbtnEmergencyYes = new JRadioButton("Yes");
	private final JRadioButton rdbtnEmergencyNo = new JRadioButton("No");
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	
	//All the labels, text fields, and information for the FinancialInformation tab
	private final JPanel FinancialInformation = new JPanel();
	private final JLabel requestLunchLabel = new JLabel("*Would you like to request for free/reduced lunch for your child(ren)?:");
	private final JLabel householdNameLabel = new JLabel("Name:");
	private final JLabel householdRelationshipLabel = new JLabel("Relationship:");
	private final JLabel householdAgeLabel = new JLabel("Age:");
	private final JLabel householdSSLabel = new JLabel("SS#:");
	private final JTextField householdNameTF = new JTextField();
	private final JComboBox householdRelationshipComboBox = new JComboBox();
	private final JFormattedTextField householdAgeFTF = new JFormattedTextField();
	private final JFormattedTextField ssFTF = new JFormattedTextField();
	private final JLabel householdNameLabel2 = new JLabel("Name:");
	private final JTextField householdNameTF2 = new JTextField();
	private final JComboBox householdRelationshipComboBox2 = new JComboBox();
	private final JLabel householdRelationshipLabel2 = new JLabel("Relationship:");
	private final JLabel householdAgeLabel2 = new JLabel("Age:");
	private final JFormattedTextField householdAgeFTF2 = new JFormattedTextField();
	private final JFormattedTextField ssFTF2 = new JFormattedTextField();
	private final JLabel householdSSLabel2 = new JLabel("SS#:");
	private final JLabel householdNameLabel3 = new JLabel("Name:");
	private final JTextField householdNameTF3 = new JTextField();
	private final JComboBox householdRelationshipComboBox3 = new JComboBox();
	private final JLabel householdRelationshipLabel3 = new JLabel("Relationship:");
	private final JLabel householdAgeLabel3 = new JLabel("Age:");
	private final JFormattedTextField householdAgeFTF3 = new JFormattedTextField();
	private final JFormattedTextField ssFTF3 = new JFormattedTextField();
	private final JLabel householdSSLabel3 = new JLabel("SS#:");
	private final JLabel householdNameLabel4 = new JLabel("Name:");
	private final JTextField householdNameTF4 = new JTextField();
	private final JComboBox householdRelationshipComboBox4 = new JComboBox();
	private final JLabel householdRelationshipLabel4 = new JLabel("Relationship:");
	private final JLabel householdAgeLabel4 = new JLabel("Age:");
	private final JFormattedTextField householdAgeFTF4 = new JFormattedTextField();
	private final JFormattedTextField ssFTF4 = new JFormattedTextField();
	private final JLabel householdSSLabel4 = new JLabel("SS#:");
	private final JLabel householdNameLabel5 = new JLabel("Name:");
	private final JTextField householdNameTF5 = new JTextField();
	private final JComboBox householdRelationshipComboBox5 = new JComboBox();
	private final JLabel householdRelationshipLabel5 = new JLabel("Relationship:");
	private final JLabel householdAgeLabel5 = new JLabel("Age:");
	private final JFormattedTextField householdAgeFTF5 = new JFormattedTextField();
	private final JFormattedTextField ssFTF5 = new JFormattedTextField();
	private final JLabel householdSSLabel5 = new JLabel("SS#:");
	private final JComboBox freeLunchComboBox = new JComboBox();
	private final JSeparator separator = new JSeparator();
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private final JLabel peopleCountLabel = new JLabel("How many people live in your household:");
	private final JComboBox peopleCountComboBox = new JComboBox();
	private final JLabel lblotherThanYou = new JLabel("(Other than you and your spouse)");
	private final JLabel incomeLabel = new JLabel("Income:");
	private final JLabel salaryLabel = new JLabel("Salary:");
	private final JLabel socialSecurityLabel = new JLabel("Social Security:");
	private final JLabel utilityLabel = new JLabel("Utility Assistance: ");
	private final JLabel unemploymentLabel = new JLabel("Unemployment:");
	private final JLabel disabilityLabel = new JLabel("Disablity:");
	private final JLabel lblFoodStamps = new JLabel("Food Stamps:");
	private final JLabel tanfLabel = new JLabel("TANF/AFDC:");
	private final JLabel lblChildSupport = new JLabel("Child Support:");
	private final JLabel lblOther = new JLabel("Other:");
	private final JFormattedTextField salaryFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField socialSecurityFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField utilityFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField unemploymentFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField disabilityFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField foodStampsFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField tanfFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField childSupportFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField otherFTF = new JFormattedTextField(currencyFormat);
	private final JLabel lblTotalIncome = new JLabel("Total Income:");
	private final JFormattedTextField totalIncomeFTF = new JFormattedTextField(currencyFormat);
	private final JLabel expensesLabel = new JLabel("Expenses:");
	private final JLabel rentLabel = new JLabel("Rent:");
	private final JFormattedTextField rentFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField lightBillFTF = new JFormattedTextField(currencyFormat);
	private final JLabel lightBillLabel = new JLabel("Light Bill:");
	private final JLabel cableLabel = new JLabel("Cable TV:");
	private final JFormattedTextField cableFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField phoneBillFTF = new JFormattedTextField(currencyFormat);
	private final JLabel phoneBillLabel = new JLabel("Phone Bill:");
	private final JLabel carPaymentLabel = new JLabel("Car Payment:");
	private final JFormattedTextField carPaymentFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField doctorFTF = new JFormattedTextField(currencyFormat);
	private final JLabel doctorLabel = new JLabel("Doctor/Med:");
	private final JLabel gasLabel = new JLabel("Gas/Water:");
	private final JFormattedTextField gasFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField appliancesFTF = new JFormattedTextField(currencyFormat);
	private final JLabel appliancesLabel = new JLabel("Furn/Applicances:");
	private final JLabel label_9 = new JLabel("Other:");
	private final JFormattedTextField otherFTF2 = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField totalExpensesFTF = new JFormattedTextField(currencyFormat);
	private final JLabel totalExpensesLabel = new JLabel("Total Expenses:");
	private final JLabel netIncomeLabel = new JLabel("Net Income:");
	private final JFormattedTextField netIncomeFTF = new JFormattedTextField(currencyFormat);
	private final JButton btnSubmit = new JButton("Submit");
	private final JLabel addtionalInfoLabel = new JLabel("Additional Information to help us in placement:");
	private final JTextArea additionalInfoTextArea = new JTextArea();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EllouganiMSCRFrame frame = new EllouganiMSCRFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Created createFormatter method which is used to create formatter 
	public MaskFormatter createFormatter(String s) {
	     MaskFormatter formatter = null;
	     try {
	          formatter = new MaskFormatter(s);
	         } 
	     catch (java.text.ParseException exc) {
		          System.err.println("formatter is bad: " + exc.getMessage());
		          System.exit(-1);
		      }
	      return formatter;
	}
	
	/**
	 * Create the frame.
	 */
	public EllouganiMSCRFrame() {
		householdNameTF.setEditable(false);
		householdNameTF.setBounds(72, 96, 107, 20);
		householdNameTF.setColumns(10);
		emergencyContactNameTF.setBounds(429, 544, 134, 20);
		emergencyContactNameTF.setColumns(10);
		allergyTF.setBounds(522, 475, 278, 20);
		allergyTF.setColumns(10);
		siblingSchoolTF.setEditable(false);
		siblingSchoolTF.setBounds(444, 143, 119, 20);
		siblingSchoolTF.setColumns(10);
		siblingNameTF.setEditable(false);
		siblingNameTF.setBounds(444, 65, 119, 20);
		siblingNameTF.setColumns(10);
		subdivisionTF.setBounds(444, 267, 135, 20);
		subdivisionTF.setColumns(10);
		emailAddressTF.setBounds(121, 292, 137, 20);
		emailAddressTF.setColumns(10);
		occupationTF.setBounds(100, 264, 122, 20);
		occupationTF.setColumns(10);
		employmentTF.setBounds(157, 236, 137, 20);
		employmentTF.setColumns(10);
		parentAddressTF.setEditable(false);
		parentAddressTF.setBounds(157, 211, 137, 20);
		parentAddressTF.setColumns(10);
		middleInitialParentTF.setBounds(100, 86, 31, 20);
		middleInitialParentTF.setColumns(10);
		firstNameParentTF.setBounds(100, 62, 110, 20);
		firstNameParentTF.setColumns(10);
		lastNameParentTF.setBounds(100, 36, 110, 20);
		lastNameParentTF.setColumns(10);
		cityTF.setBounds(404, 187, 86, 20);
		cityTF.setColumns(10);
		streetAddressTF.setBounds(464, 164, 153, 20);
		streetAddressTF.setColumns(10);
		preferredNameTF.setBounds(118, 108, 101, 20);
		preferredNameTF.setColumns(10);
		middleInitialTF.setBounds(94, 83, 20, 20);
		middleInitialTF.setColumns(10);
		firstNameTF.setBounds(95, 58, 110, 20);
		firstNameTF.setColumns(10);
		lastNameTF.setToolTipText("");
		lastNameTF.setBounds(95, 33, 110, 20);
		lastNameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Ellougani MSCR");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1036, 815);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmStartNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmStartNewForm_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmStartNewForm);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmExit_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnHelp);
		mntmStudentHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmStudentHelp_actionPerformed(arg0);
			}
		});
		
		mnHelp.add(mntmStudentHelp);
		mntmFamilyHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmFamilyHelp_actionPerformed(arg0);
			}
		});
		
		mnHelp.add(mntmFamilyHelp);
		mntmFinancialHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmFinancialHelp_actionPerformed(arg0);
			}
		});
		
		mnHelp.add(mntmFinancialHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(10, 11, 1004, 733);
		
		contentPane.add(tabbedPane);

		//All the labels and text fields under the Student Information tab
		tabbedPane.addTab("Student Information", null, StudentInformation, null);
		StudentInformation.setLayout(null);
		studentNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		studentNameLabel.setBounds(10, 11, 104, 14);
		
		StudentInformation.add(studentNameLabel);
		lastNameLabel.setToolTipText("Enter Student's Last Name\r\n");
		lastNameLabel.setBounds(20, 36, 71, 14);
		
		StudentInformation.add(lastNameLabel);
		firstNameLabel.setToolTipText("Enter Student's First Name");
		firstNameLabel.setBounds(20, 61, 71, 14);
		
		StudentInformation.add(firstNameLabel);
		
		StudentInformation.add(lastNameTF);
		
		StudentInformation.add(firstNameTF);
		middleInitialLabel.setToolTipText("Enter Student's Middle Initial");
		middleInitialLabel.setBounds(52, 86, 39, 14);
		
		StudentInformation.add(middleInitialLabel);
		
		StudentInformation.add(middleInitialTF);
		preferredNameLabel.setToolTipText("Enter Student's Preferred Name");
		preferredNameLabel.setBounds(20, 111, 94, 14);
		
		StudentInformation.add(preferredNameLabel);
		
		StudentInformation.add(preferredNameTF);
		raceLabel.setToolTipText("Choose the Student's Race");
		raceLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		raceLabel.setBounds(10, 213, 46, 14);
		
		StudentInformation.add(raceLabel);
		ethnicityLabel.setToolTipText("Choose an Ethnicity");
		ethnicityLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ethnicityLabel.setBounds(10, 136, 81, 19);
		
		StudentInformation.add(ethnicityLabel);
		buttonGroup_1.add(rdbtnHispanicOrLatino);
		rdbtnHispanicOrLatino.setBounds(20, 157, 138, 23);
		
		StudentInformation.add(rdbtnHispanicOrLatino);
		buttonGroup_1.add(rdbtnNotHispanicOr);
		rdbtnNotHispanicOr.setBounds(20, 183, 163, 23);
		
		StudentInformation.add(rdbtnNotHispanicOr);
		genderLabel.setToolTipText("Choose the Student's Gender");
		genderLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		genderLabel.setBounds(352, 24, 63, 14);
		
		StudentInformation.add(genderLabel);
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(408, 22, 53, 23);
		
		StudentInformation.add(rdbtnMale);
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(463, 22, 109, 23);
		
		StudentInformation.add(rdbtnFemale);
		chckbxAmericanIndian.setBounds(20, 234, 224, 23);
		
		StudentInformation.add(chckbxAmericanIndian);
		chckbxAsian.setBounds(20, 260, 97, 23);
		
		StudentInformation.add(chckbxAsian);
		chckbxBlackOrAfrican.setBounds(20, 286, 185, 23);
		
		StudentInformation.add(chckbxBlackOrAfrican);
		chckbxNativeHawaiian.setBounds(20, 312, 270, 23);
		
		StudentInformation.add(chckbxNativeHawaiian);
		chckbxWhite.setBounds(20, 337, 97, 23);
		
		StudentInformation.add(chckbxWhite);
		chckbxOther.setBounds(20, 363, 97, 23);
		
		StudentInformation.add(chckbxOther);
		dateOfBirthLabel.setToolTipText("Enter the Student's Date of Birth");
		dateOfBirthLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dateOfBirthLabel.setBounds(352, 60, 94, 14);
		
		StudentInformation.add(dateOfBirthLabel);
		gradeLabel.setToolTipText("<html>\r\nEnter the Student's Grade Level<br>If a single digit enter 0 first\r\n</html>");
				
		gradeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gradeLabel.setBounds(352, 97, 53, 14);
		
		StudentInformation.add(gradeLabel);
		gradeFTF.setBounds(408, 96, 36, 20);
		
		//Installing placeholder character and mask for the gradeFTF
		gradeMask.setPlaceholderCharacter('#');
		gradeMask.install(gradeFTF);
		StudentInformation.add(gradeFTF);
		addressInfoLabel.setToolTipText("Enter Student's Address Information\r\n");
		
		addressInfoLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addressInfoLabel.setBounds(352, 137, 138, 14);
		
		StudentInformation.add(addressInfoLabel);
		streetAddressLabel.setToolTipText("Enter the Student's Street Address");
		streetAddressLabel.setBounds(362, 167, 110, 14);
		
		StudentInformation.add(streetAddressLabel);
		
		StudentInformation.add(streetAddressTF);
		cityLabel.setToolTipText("Enter the Student's City");
		cityLabel.setBounds(362, 190, 46, 14);
		
		StudentInformation.add(cityLabel);
		
		StudentInformation.add(cityTF);
		zipLabel.setToolTipText("Enter the Student's Zip");
		zipLabel.setBounds(362, 216, 46, 14);
		
		StudentInformation.add(zipLabel);
		zipFTF.setBounds(404, 213, 63, 20);
		
		//Installing placeholder character and mask for the zipFTF
		zipMask.setPlaceholderCharacter('#');
		zipMask.install(zipFTF);
		StudentInformation.add(zipFTF);
		homePhoneLabel.setToolTipText("Enter the Student's Home Phone Number");
		
		homePhoneLabel.setBounds(362, 242, 84, 14);
		StudentInformation.add(homePhoneLabel);
		homePhoneFTF.setBounds(456, 238, 123, 22);
		
		//Installing placeholder character and mask for the homePhoneFTF
		homePhoneMask.setPlaceholderCharacter('#');
		homePhoneMask.install(homePhoneFTF);
		StudentInformation.add(homePhoneFTF);
		dobMonthComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_dobMonthComboBox_itemStateChanged(arg0);
			}
		});
		
		dobMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		dobMonthComboBox.setBounds(449, 59, 63, 20);
		
		StudentInformation.add(dobMonthComboBox);
		dobDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dobDayComboBox.setBounds(529, 59, 48, 20);
		
		StudentInformation.add(dobDayComboBox);
		dobYearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"}));
		dobYearComboBox.setBounds(594, 59, 63, 20);
		
		StudentInformation.add(dobYearComboBox);
		subdivisionLabel.setToolTipText("Enter the Student's Subdivision");
		subdivisionLabel.setBounds(362, 270, 79, 14);
		
		StudentInformation.add(subdivisionLabel);
		
		StudentInformation.add(subdivisionTF);
		leaseOwnLabel.setToolTipText("Choose Own or Lease");
		leaseOwnLabel.setBounds(362, 296, 79, 14);
		
		StudentInformation.add(leaseOwnLabel);
		buttonGroup_4.add(rdbtnOwn);
		rdbtnOwn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_rdbtnOwn_actionPerformed(arg0);
			}
		});
		rdbtnOwn.setBounds(435, 292, 55, 23);
		
		StudentInformation.add(rdbtnOwn);
		buttonGroup_4.add(rdbtnLease);
		rdbtnLease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_rdbtnLease_actionPerformed(arg0);
			}
		});
		rdbtnLease.setBounds(489, 292, 83, 23);
		
		StudentInformation.add(rdbtnLease);
		leaseExpirationLabel.setToolTipText("Enter the Lease Expiration");
		leaseExpirationLabel.setBounds(362, 322, 123, 14);
		
		StudentInformation.add(leaseExpirationLabel);
		leaseMonthComboBox.setEnabled(false);
		leaseMonthComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_leaseMonthComboBox_itemStateChanged(arg0);
			}
		});
		leaseMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		leaseMonthComboBox.setBounds(475, 319, 63, 20);
		
		StudentInformation.add(leaseMonthComboBox);
		leaseDayComboBox.setEnabled(false);
		leaseDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		leaseDayComboBox.setBounds(548, 319, 48, 20);
		
		StudentInformation.add(leaseDayComboBox);
		leaseYearComboBox.setEnabled(false);
		leaseYearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		leaseYearComboBox.setBounds(606, 319, 63, 20);
		
		StudentInformation.add(leaseYearComboBox);
		addtionalInfoLabel.setToolTipText("Provide Additional Information about the Student");
		addtionalInfoLabel.setBounds(20, 417, 290, 14);
		
		StudentInformation.add(addtionalInfoLabel);
		additionalInfoTextArea.setWrapStyleWord(true);
		additionalInfoTextArea.setLineWrap(true);
		additionalInfoTextArea.setBounds(20, 442, 290, 147);
		
		StudentInformation.add(additionalInfoTextArea);
		ParentInformation.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				do_ParentInformation_focusGained(arg0);
			}
		});
		
		
		//ALL THE LABELS AND TEXT FIELDS UNDER THE PARENT INFORMATION TAB
		tabbedPane.addTab("Parent Information", null, ParentInformation, null);
		ParentInformation.setLayout(null);
		parentGuardianLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		parentGuardianLabel.setBounds(10, 11, 208, 14);
		ParentInformation.add(parentGuardianLabel);
		lastNameParentLabel.setToolTipText("Enter Parent's Last Name\r\n");
		lastNameParentLabel.setBounds(24, 39, 78, 14);
		
		ParentInformation.add(lastNameParentLabel);
		
		ParentInformation.add(lastNameParentTF);
		firstNameParentLabel.setToolTipText("Enter Parent's First Name");
		firstNameParentLabel.setBounds(24, 65, 78, 14);
		
		ParentInformation.add(firstNameParentLabel);
		
		ParentInformation.add(firstNameParentTF);
		middleInitialParentLabel.setToolTipText("Enter Parent's Middle Initial\r\n");
		middleInitialParentLabel.setBounds(56, 89, 46, 14);
		
		ParentInformation.add(middleInitialParentLabel);
		
		ParentInformation.add(middleInitialParentTF);
		homePhoneNumberLabel.setToolTipText("Enter Parent's Home Phone Number");
		homePhoneNumberLabel.setBounds(44, 114, 54, 14);
		
		ParentInformation.add(homePhoneNumberLabel);
		homePhoneNumberFTF.setBounds(100, 111, 110, 20);
		
		//Installing using another phoneMask
		homePhoneMask2.setPlaceholderCharacter('#');
		homePhoneMask2.install(homePhoneNumberFTF);
		ParentInformation.add(homePhoneNumberFTF);
		workPhoneNumberLabel.setToolTipText("Enter Parent's Work Phone Number");
		
		workPhoneNumberLabel.setBounds(44, 143, 46, 14);
		ParentInformation.add(workPhoneNumberLabel);
		
		workPhoneNumberFTF.setBounds(100, 140, 110, 20);
		
		//Installing using another phoneMask
		workPhoneMask.setPlaceholderCharacter('#');
		workPhoneMask.install(workPhoneNumberFTF);
		ParentInformation.add(workPhoneNumberFTF);
		cellNumberLabel.setToolTipText("Enter Parent's Cell Phone Number");
		
		cellNumberLabel.setBounds(44, 168, 46, 14);
		ParentInformation.add(cellNumberLabel);
		cellNumberFTF.setBounds(100, 165, 110, 20);
		
		//Installing using another phoneMask
		cellPhoneMask.setPlaceholderCharacter('#');
		cellPhoneMask.install(cellNumberFTF);
		ParentInformation.add(cellNumberFTF);
		addressIfDifferentLabel.setToolTipText("Choose Address(if different from Student)");
		
		addressIfDifferentLabel.setBounds(24, 214, 127, 14);
		
		ParentInformation.add(addressIfDifferentLabel);
		
		ParentInformation.add(parentAddressTF);
		placeOfEmploymentLabel.setToolTipText("Enter Place of Employment");
		placeOfEmploymentLabel.setBounds(24, 239, 151, 14);
		
		ParentInformation.add(placeOfEmploymentLabel);
		
		ParentInformation.add(employmentTF);
		occupationLabel.setToolTipText("Enter Occupation at Place of Employment");
		occupationLabel.setBounds(24, 267, 78, 14);
		
		ParentInformation.add(occupationLabel);
		
		ParentInformation.add(occupationTF);
		emailAddressLabel.setToolTipText("Enter Parent's Email Address\r\n");
		emailAddressLabel.setBounds(24, 295, 90, 14);
		
		ParentInformation.add(emailAddressLabel);
		
		ParentInformation.add(emailAddressTF);
		buttonGroup_2.add(rdbtnMother);
		rdbtnMother.setBounds(81, 316, 67, 23);
		
		ParentInformation.add(rdbtnMother);
		buttonGroup_2.add(rdbtnFather);
		rdbtnFather.setBounds(150, 316, 67, 23);
		
		ParentInformation.add(rdbtnFather);
		buttonGroup_2.add(rdbtnOther);
		rdbtnOther.setBounds(214, 316, 67, 23);
		
		ParentInformation.add(rdbtnOther);
		
		
		//SECOND SET OF LABELS AND TEXT FIELDS THAT ARE NOT EDITABLE UNTIL THE ADD PARENT BUTTON IS USED
		parentGuardianLabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		parentGuardianLabel2.setBounds(10, 347, 208, 14);
		ParentInformation.add(parentGuardianLabel2);
		lastNameParentLabel2.setToolTipText("Enter Parent's Last Name");
		
		lastNameParentLabel2.setBounds(20, 372, 78, 14);
		ParentInformation.add(lastNameParentLabel2);
		lastNameParentTF2.setEditable(false);
		
		lastNameParentTF2.setColumns(10);
		lastNameParentTF2.setBounds(96, 369, 110, 20);
		ParentInformation.add(lastNameParentTF2);
		firstNameParentLabel2.setToolTipText("Enter Parent's First Name");
		
		firstNameParentLabel2.setBounds(20, 398, 78, 14);
		ParentInformation.add(firstNameParentLabel2);
		firstNameParentTF2.setEditable(false);
		
		firstNameParentTF2.setColumns(10);
		firstNameParentTF2.setBounds(96, 395, 110, 20);
		ParentInformation.add(firstNameParentTF2);
		middleInitialParentLabel2.setToolTipText("Enter Parent's Middle Initial");
		
		middleInitialParentLabel2.setBounds(52, 422, 46, 14);
		ParentInformation.add(middleInitialParentLabel2);
		middleInitialParentTF2.setEditable(false);
		
		middleInitialParentTF2.setColumns(10);
		middleInitialParentTF2.setBounds(96, 419, 31, 20);
		ParentInformation.add(middleInitialParentTF2);
		homePhoneNumberLabel2.setToolTipText("Enter Parent's Home Phone Number");
		
		homePhoneNumberLabel2.setBounds(40, 447, 62, 14);
		ParentInformation.add(homePhoneNumberLabel2);
		homePhoneNumberFTF2.setEditable(false);
		
		homePhoneNumberFTF2.setBounds(96, 444, 110, 20);
		
		//Installing using another phoneMask
		homePhoneMask3.setPlaceholderCharacter('#');
		homePhoneMask3.install(homePhoneNumberFTF2);
		ParentInformation.add(homePhoneNumberFTF2);
		workPhoneNumberLabel2.setToolTipText("Enter Parent's Work Phone Number");
		
		workPhoneNumberLabel2.setBounds(40, 476, 46, 14);
		ParentInformation.add(workPhoneNumberLabel2);
		workPhoneNumberFTF2.setEditable(false);
		
		workPhoneNumberFTF2.setBounds(96, 473, 110, 20);
		
		//Installing using another phoneMask
		workPhoneMask2.setPlaceholderCharacter('#');
		workPhoneMask2.install(workPhoneNumberFTF2);
		ParentInformation.add(workPhoneNumberFTF2);
		cellNumberLabel2.setToolTipText("Enter Parent's Cell Phone Number");
		
		cellNumberLabel2.setBounds(40, 501, 46, 14);
		ParentInformation.add(cellNumberLabel2);
		cellNumberFTF2.setEditable(false);
		
		cellNumberFTF2.setBounds(96, 498, 110, 20);
		
		//Installing using another phoneMask
		cellPhoneMask2.setPlaceholderCharacter('#');
		cellPhoneMask2.install(cellNumberFTF2);
		ParentInformation.add(cellNumberFTF2);
		placeOfEmploymentLabel2.setToolTipText("Enter Place of Employment");
		
		placeOfEmploymentLabel2.setBounds(20, 575, 151, 14);
		ParentInformation.add(placeOfEmploymentLabel2);
		employmentTF2.setEditable(false);
		
		employmentTF2.setColumns(10);
		employmentTF2.setBounds(172, 569, 137, 20);
		ParentInformation.add(employmentTF2);
		occupationLabel2.setToolTipText("Enter Occupation at Place of Employment");
		
		occupationLabel2.setBounds(20, 600, 78, 14);
		ParentInformation.add(occupationLabel2);
		occupationTF2.setEditable(false);
		
		occupationTF2.setColumns(10);
		occupationTF2.setBounds(96, 597, 122, 20);
		ParentInformation.add(occupationTF2);
		emailAddressLabel2.setToolTipText("Enter Parent's Email Address");
		
		emailAddressLabel2.setBounds(20, 625, 127, 14);
		ParentInformation.add(emailAddressLabel2);
		emailAddressTF2.setEditable(false);
		
		emailAddressTF2.setColumns(10);
		emailAddressTF2.setBounds(117, 622, 137, 20);
		ParentInformation.add(emailAddressTF2);
		rdbtnMother2.setEnabled(false);
		
		buttonGroup_3.add(rdbtnMother2);
		rdbtnMother2.setBounds(81, 652, 67, 23);
		ParentInformation.add(rdbtnMother2);
		rdbtnFather2.setEnabled(false);
		
		buttonGroup_3.add(rdbtnFather2);
		rdbtnFather2.setBounds(150, 652, 63, 23);
		ParentInformation.add(rdbtnFather2);
		rdbtnOther2.setEnabled(false);
		
		buttonGroup_3.add(rdbtnOther2);
		rdbtnOther2.setBounds(211, 652, 79, 23);
		ParentInformation.add(rdbtnOther2);
		btnAddParent.setToolTipText("Click to Add Parent/Guardian");
		
		//Created action listener for addParent button
		btnAddParent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnAddParent_actionPerformed(arg0);
			}
		});
		
		btnAddParent.setBounds(10, 682, 151, 23);
		
		ParentInformation.add(btnAddParent);
		btnRemoveParent.setToolTipText("Click to Remove Parent/Guardian");
		
		//Created action listener for removeParent button
		btnRemoveParent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnRemoveParent_actionPerformed(arg0);
			}
		});
		btnRemoveParent.setBounds(172, 682, 195, 23);
		
		ParentInformation.add(btnRemoveParent);
		livesWithLabel.setToolTipText("Choose if Student Lives with Parent");
		livesWithLabel.setBounds(24, 189, 78, 14);
		
		ParentInformation.add(livesWithLabel);
		buttonGroup_5.add(rdbtnYes);
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_rdbtnYes_actionPerformed(arg0);
			}
		});
		rdbtnYes.setBounds(102, 184, 49, 23);
		
		ParentInformation.add(rdbtnYes);
		buttonGroup_5.add(rdbtnNo);
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_rdbtnNo_actionPerformed(arg0);
			}
		});
		rdbtnNo.setBounds(157, 185, 46, 23);
		
		ParentInformation.add(rdbtnNo);
		rdbtnYes.setSelected(true);
		livesWithLabel2.setToolTipText("Choose if Student Lives with Parent");
		livesWithLabel2.setBounds(20, 522, 78, 14);
		ParentInformation.add(livesWithLabel2);
		buttonGroup_6.add(rdbtnYes2);
		rdbtnYes2.setEnabled(false);
		rdbtnYes2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_rdbtnYes2_actionPerformed(arg0);
			}
		});
		rdbtnYes2.setSelected(true);
		rdbtnYes2.setBounds(98, 517, 49, 23);
		ParentInformation.add(rdbtnYes2);
		buttonGroup_6.add(rdbtnNo2);
		rdbtnNo2.setEnabled(false);
		rdbtnNo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_rdbtnNo2_actionPerformed(arg0);
			}
		});
		rdbtnNo2.setBounds(168, 514, 46, 23);
		ParentInformation.add(rdbtnNo2);
		parentAddressTF2.setEditable(false);
		parentAddressTF2.setColumns(10);
		parentAddressTF2.setBounds(153, 544, 137, 20);
		ParentInformation.add(parentAddressTF2);
		addressIfDifferentLabel2.setToolTipText("Choose Address(if different from Student)");
		addressIfDifferentLabel2.setBounds(20, 547, 127, 14);
		ParentInformation.add(addressIfDifferentLabel2);
		relationLabel.setToolTipText("Enter Relation to Student");
		relationLabel.setBounds(24, 320, 66, 14);
		
		ParentInformation.add(relationLabel);
		relationLabel2.setToolTipText("Enter Relation to Student");
		relationLabel2.setBounds(20, 656, 66, 14);
		ParentInformation.add(relationLabel2);
		siblingInformationLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		siblingInformationLabel.setBounds(368, 11, 122, 20);
		
		ParentInformation.add(siblingInformationLabel);
		siblingCountLabel.setToolTipText("Choose how many siblings the Student has");
		siblingCountLabel.setBounds(378, 39, 137, 14);
		
		ParentInformation.add(siblingCountLabel);
		siblingComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_siblingComboBox_itemStateChanged(arg0);
			}
		});
		siblingComboBox.setModel(new DefaultComboBoxModel(new String[] {"#", "0", "1", "2", "3"}));
		siblingComboBox.setBounds(500, 36, 33, 20);
		
		ParentInformation.add(siblingComboBox);
		siblingNameLabel.setToolTipText("Enter Sibling's name");
		siblingNameLabel.setBounds(388, 68, 46, 14);
		
		ParentInformation.add(siblingNameLabel);
		
		ParentInformation.add(siblingNameTF);
		siblingDateOfBirthLabel.setToolTipText("Enter Sibling's Date of Birth");
		siblingDateOfBirthLabel.setBounds(388, 92, 46, 14);
		
		ParentInformation.add(siblingDateOfBirthLabel);
		siblingMonthComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_siblingMonthComboBox_itemStateChanged(arg0);
			}
		});
		siblingMonthComboBox.setEnabled(false);
		siblingMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		siblingMonthComboBox.setBounds(434, 89, 63, 20);
		
		ParentInformation.add(siblingMonthComboBox);
		siblingDayComboBox.setEnabled(false);
		siblingDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		siblingDayComboBox.setBounds(505, 89, 48, 20);
		
		ParentInformation.add(siblingDayComboBox);
		siblingYearComboBox.setEnabled(false);
		siblingYearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"}));
		siblingYearComboBox.setBounds(563, 89, 63, 20);
		
		ParentInformation.add(siblingYearComboBox);
		siblingGradeFTF.setEditable(false);
		siblingGradeFTF.setBounds(444, 117, 36, 20);
		
		//Installing using another gradeMask
		gradeMask2.setPlaceholderCharacter('#');
		gradeMask2.install(siblingGradeFTF);
		
		ParentInformation.add(siblingGradeFTF);
		siblingSchoolLabel.setToolTipText("Enter the name of the Sibling's school");
		siblingSchoolLabel.setBounds(388, 146, 62, 14);
		
		ParentInformation.add(siblingSchoolLabel);
		
		ParentInformation.add(siblingSchoolTF);
		siblingGradeLabel.setToolTipText("Enter Sibling's Grade, enter 0 if one digit");
		siblingGradeLabel.setBounds(388, 120, 46, 14);
		
		ParentInformation.add(siblingGradeLabel);
		siblingNameLabel2.setToolTipText("Enter Sibling's name");
		siblingNameLabel2.setBounds(388, 186, 46, 14);
		
		ParentInformation.add(siblingNameLabel2);
		siblingNameTF2.setEditable(false);
		siblingNameTF2.setColumns(10);
		siblingNameTF2.setBounds(444, 183, 119, 20);
		
		ParentInformation.add(siblingNameTF2);
		siblingDateOfBirthLabel2.setToolTipText("Enter Sibling's Date of Birth");
		siblingDateOfBirthLabel2.setBounds(388, 210, 46, 14);
		
		ParentInformation.add(siblingDateOfBirthLabel2);
		siblingMonthComboBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_siblingMonthComboBox2_itemStateChanged(arg0);
			}
		});
		siblingMonthComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		siblingMonthComboBox2.setEnabled(false);
		siblingMonthComboBox2.setBounds(434, 207, 63, 20);
		
		ParentInformation.add(siblingMonthComboBox2);
		siblingDayComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		siblingDayComboBox2.setEnabled(false);
		siblingDayComboBox2.setBounds(505, 207, 48, 20);
		
		ParentInformation.add(siblingDayComboBox2);
		siblingYearComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"}));
		siblingYearComboBox2.setEnabled(false);
		siblingYearComboBox2.setBounds(563, 207, 63, 20);
		
		ParentInformation.add(siblingYearComboBox2);
		siblingGradeLabel2.setToolTipText("Enter Sibling's Grade, enter 0 if one digit");
		siblingGradeLabel2.setBounds(388, 238, 46, 14);
		
		
		ParentInformation.add(siblingGradeLabel2);
		//Installing using another gradeMask
		gradeMask3.setPlaceholderCharacter('#');
		gradeMask3.install(siblingGradeFTF2);
		
		siblingGradeFTF2.setEditable(false);
		siblingGradeFTF2.setBounds(444, 235, 36, 20);
		
		ParentInformation.add(siblingGradeFTF2);
		siblingSchoolLabel2.setToolTipText("Enter the name of the Sibling's school");
		siblingSchoolLabel2.setBounds(388, 264, 62, 14);
		
		ParentInformation.add(siblingSchoolLabel2);
		siblingSchoolTF2.setEditable(false);
		siblingSchoolTF2.setColumns(10);
		siblingSchoolTF2.setBounds(444, 261, 119, 20);
		
		ParentInformation.add(siblingSchoolTF2);
		siblingNameLabel3.setToolTipText("Enter Sibling's name");
		siblingNameLabel3.setBounds(388, 301, 46, 14);
		
		ParentInformation.add(siblingNameLabel3);
		siblingNameTF3.setEditable(false);
		siblingNameTF3.setColumns(10);
		siblingNameTF3.setBounds(444, 298, 119, 20);
		
		ParentInformation.add(siblingNameTF3);
		siblingDateOfBirthLabel3.setToolTipText("Enter Sibling's Date of Birth");
		siblingDateOfBirthLabel3.setBounds(388, 325, 46, 14);
		
		ParentInformation.add(siblingDateOfBirthLabel3);
		siblingMonthComboBox3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_siblingMonthComboBox3_itemStateChanged(arg0);
			}
		});
		siblingMonthComboBox3.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		siblingMonthComboBox3.setEnabled(false);
		siblingMonthComboBox3.setBounds(434, 322, 63, 20);
		
		ParentInformation.add(siblingMonthComboBox3);
		siblingDayComboBox3.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		siblingDayComboBox3.setEnabled(false);
		siblingDayComboBox3.setBounds(505, 322, 48, 20);
		
		ParentInformation.add(siblingDayComboBox3);
		siblingYearComboBox3.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"}));
		siblingYearComboBox3.setEnabled(false);
		siblingYearComboBox3.setBounds(563, 322, 63, 20);
		
		ParentInformation.add(siblingYearComboBox3);
		siblingGradeLabel3.setToolTipText("Enter Sibling's Grade, enter 0 if one digit");
		siblingGradeLabel3.setBounds(388, 353, 46, 14);
		
		ParentInformation.add(siblingGradeLabel3);
		
		//Installing using another gradeMask
		gradeMask4.setPlaceholderCharacter('#');
		gradeMask4.install(siblingGradeFTF3);
		
		siblingGradeFTF3.setEditable(false);
		siblingGradeFTF3.setBounds(444, 350, 36, 20);
		
		ParentInformation.add(siblingGradeFTF3);
		siblingSchoolLabel3.setToolTipText("Enter the name of the Sibling's school");
		siblingSchoolLabel3.setBounds(388, 379, 62, 14);
		
		ParentInformation.add(siblingSchoolLabel3);
		siblingSchoolTF3.setEditable(false);
		siblingSchoolTF3.setColumns(10);
		siblingSchoolTF3.setBounds(444, 376, 119, 20);
		
		ParentInformation.add(siblingSchoolTF3);
		siblingSeperator.setBounds(388, 171, 233, 2);
		
		ParentInformation.add(siblingSeperator);
		siblingSeperator2.setBounds(388, 289, 233, 2);
		
		ParentInformation.add(siblingSeperator2);
		childInformationLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		childInformationLabel.setBounds(368, 422, 204, 20);
		
		ParentInformation.add(childInformationLabel);
		specialServicesLabel.setToolTipText("<html>\r\nChoose one of the special services<br>None if the Student has none\r\n</html>");
		specialServicesLabel.setBounds(378, 453, 127, 14);
		
		ParentInformation.add(specialServicesLabel);
		buttonGroup_7.add(rdbtnGifted);
		rdbtnGifted.setBounds(483, 450, 63, 23);
		
		ParentInformation.add(rdbtnGifted);
		buttonGroup_7.add(rdbtnSpediep);
		rdbtnSpediep.setBounds(548, 450, 78, 23);
		
		ParentInformation.add(rdbtnSpediep);
		buttonGroup_7.add(rdbtnSpeechiep);
		rdbtnSpeechiep.setBounds(628, 450, 102, 23);
		
		ParentInformation.add(rdbtnSpeechiep);
		buttonGroup_7.add(rdbtnEll);
		rdbtnEll.setBounds(732, 449, 46, 23);
		
		ParentInformation.add(rdbtnEll);
		buttonGroup_7.add(rdbtnNone);
		rdbtnNone.setBounds(795, 449, 110, 23);
		
		ParentInformation.add(rdbtnNone);
		allergyLabel.setToolTipText("Enter an allergy if the Student has one");
		allergyLabel.setBounds(378, 478, 151, 14);
		
		ParentInformation.add(allergyLabel);
		
		ParentInformation.add(allergyTF);
		emergencyContactInfoLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emergencyContactInfoLabel.setBounds(368, 516, 253, 20);
		
		ParentInformation.add(emergencyContactInfoLabel);
		emergencyContactNameLabel.setToolTipText("Enter the Emergency Contact's Name");
		emergencyContactNameLabel.setBounds(378, 547, 46, 14);
		
		ParentInformation.add(emergencyContactNameLabel);
		
		ParentInformation.add(emergencyContactNameTF);
		emergencyContactRelationshipLabel.setToolTipText("Choose the Emergency Contact's Relation to the Student");
		emergencyContactRelationshipLabel.setBounds(573, 547, 90, 14);
		
		ParentInformation.add(emergencyContactRelationshipLabel);
		emergencyContactRelationshipComboBox.setModel(new DefaultComboBoxModel(new String[] {"Relationship", "Child", "GrandChild", "Sibling", "Parent", "GrandParent", "ExtendedFamily", "Other"}));
		emergencyContactRelationshipComboBox.setBounds(661, 544, 107, 20);
		
		ParentInformation.add(emergencyContactRelationshipComboBox);
		emergencyContactPhoneNumberLabel.setToolTipText("Enter the Emergency Contact's Phone Number");
		emergencyContactPhoneNumberLabel.setBounds(778, 547, 110, 14);
		
		ParentInformation.add(emergencyContactPhoneNumberLabel);
		emergencyPhoneFTF.setBounds(875, 544, 110, 20);
		
		//Installing phone mask
		emergencyPhoneMask.setPlaceholderCharacter('#');
		emergencyPhoneMask.install(emergencyPhoneFTF);
		ParentInformation.add(emergencyPhoneFTF);
		emergencyContactNameLabel2.setToolTipText("Enter the Emergency Contact's Name");
		emergencyContactNameLabel2.setBounds(378, 578, 46, 14);
		
		ParentInformation.add(emergencyContactNameLabel2);
		emergencyContactNameTF2.setColumns(10);
		emergencyContactNameTF2.setBounds(429, 575, 134, 20);
		
		ParentInformation.add(emergencyContactNameTF2);
		emergencyContactRelationshipLabel2.setToolTipText("Choose the Emergency Contact's Relation to the Student");
		emergencyContactRelationshipLabel2.setBounds(573, 578, 90, 14);
		
		ParentInformation.add(emergencyContactRelationshipLabel2);
		emergencyContactRelationshipComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Relationship", "Child", "GrandChild", "Sibling", "Parent", "GrandParent", "ExtendedFamily", "Other"}));
		emergencyContactRelationshipComboBox2.setBounds(661, 575, 107, 20);
		
		ParentInformation.add(emergencyContactRelationshipComboBox2);
		emergencyContactPhoneNumberLabel2.setToolTipText("Enter the Emergency Contact's Phone Number");
		emergencyContactPhoneNumberLabel2.setBounds(778, 578, 110, 14);
		
		ParentInformation.add(emergencyContactPhoneNumberLabel2);
		emergencyPhoneFTF2.setBounds(875, 575, 110, 20);

		//Installing phone mask
		emergencyPhoneMask2.setPlaceholderCharacter('#');
		emergencyPhoneMask2.install(emergencyPhoneFTF2);
		ParentInformation.add(emergencyPhoneFTF2);
		emergencyMseLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emergencyMseLabel.setBounds(368, 625, 520, 20);
		
		ParentInformation.add(emergencyMseLabel);
		buttonGroup_8.add(rdbtnEmergencyYes);
		rdbtnEmergencyYes.setBounds(850, 626, 46, 23);
		
		ParentInformation.add(rdbtnEmergencyYes);
		buttonGroup_8.add(rdbtnEmergencyNo);
		rdbtnEmergencyNo.setBounds(905, 626, 46, 23);
		
		ParentInformation.add(rdbtnEmergencyNo);
		FinancialInformation.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				do_FinancialInformation_focusGained(arg0);
			}
		});
		
		
		//ALL THE LABELS, TEXT FIELDS, ETC. FOR THE FINANCIAL INFORMATION TAB
		tabbedPane.addTab("Financial Information", null, FinancialInformation, null);
		FinancialInformation.setLayout(null);
		requestLunchLabel.setToolTipText("Choose if you would like to request for free/reduced lunch");
		requestLunchLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		requestLunchLabel.setBounds(0, 11, 480, 22);
		
		FinancialInformation.add(requestLunchLabel);
		householdNameLabel.setToolTipText("Enter name for other housemate");
		householdNameLabel.setBounds(30, 99, 46, 14);
		
		FinancialInformation.add(householdNameLabel);
		householdRelationshipLabel.setToolTipText("Choose relation to housemate");
		householdRelationshipLabel.setBounds(30, 124, 91, 14);
		
		FinancialInformation.add(householdRelationshipLabel);
		householdAgeLabel.setToolTipText("Enter age for housemate, enter 0 if it is one digit");
		householdAgeLabel.setBounds(30, 149, 46, 14);
		
		FinancialInformation.add(householdAgeLabel);
		householdSSLabel.setToolTipText("Enter Social Security Number for housemate");
		householdSSLabel.setBounds(30, 174, 46, 14);
		
		FinancialInformation.add(householdSSLabel);
		
		FinancialInformation.add(householdNameTF);
		householdRelationshipComboBox.setEnabled(false);
		householdRelationshipComboBox.setModel(new DefaultComboBoxModel(new String[] {"Relationship", "Child", "GrandChild", "Sibling", "Parent", "GrandParent", "ExtendedFamily", "Other"}));
		householdRelationshipComboBox.setBounds(111, 121, 107, 20);
		
		FinancialInformation.add(householdRelationshipComboBox);
		householdAgeFTF.setEditable(false);
		householdAgeFTF.setBounds(72, 149, 36, 20);
		
		//Installing age mask
		ageMask.setPlaceholderCharacter('#');
		ageMask.install(householdAgeFTF);
		FinancialInformation.add(householdAgeFTF);
		
		ssFTF.setEditable(false);
		ssFTF.setBounds(72, 171, 123, 22);
		
		//Installing ssdMask
		ssdMask.setPlaceholderCharacter('#');
		ssdMask.install(ssFTF);
		FinancialInformation.add(ssFTF);
		householdNameLabel2.setToolTipText("Enter name for other housemate");
		householdNameLabel2.setBounds(30, 220, 46, 14);
		
		FinancialInformation.add(householdNameLabel2);
		householdNameTF2.setEditable(false);
		householdNameTF2.setColumns(10);
		householdNameTF2.setBounds(72, 217, 107, 20);
		
		FinancialInformation.add(householdNameTF2);
		householdRelationshipComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Relationship", "Child", "GrandChild", "Sibling", "Parent", "GrandParent", "ExtendedFamily", "Other"}));
		householdRelationshipComboBox2.setEnabled(false);
		householdRelationshipComboBox2.setBounds(111, 242, 107, 20);
		
		FinancialInformation.add(householdRelationshipComboBox2);
		householdRelationshipLabel2.setToolTipText("Choose relation to housemate");
		householdRelationshipLabel2.setBounds(30, 245, 91, 14);
		
		FinancialInformation.add(householdRelationshipLabel2);
		householdAgeLabel2.setToolTipText("Enter age for housemate, enter 0 if it is one digit");
		householdAgeLabel2.setBounds(30, 270, 46, 14);
		
		FinancialInformation.add(householdAgeLabel2);
		householdAgeFTF2.setEditable(false);
		householdAgeFTF2.setBounds(72, 270, 36, 20);
		
		//Installing age mask
		ageMask2.setPlaceholderCharacter('#');
		ageMask2.install(householdAgeFTF2);
		FinancialInformation.add(householdAgeFTF2);
		
		ssFTF2.setEditable(false);
		ssFTF2.setBounds(72, 292, 123, 22);
		
		//Installing ssdMask
		ssdMask2.setPlaceholderCharacter('#');
		ssdMask2.install(ssFTF2);
		FinancialInformation.add(ssFTF2);
		householdSSLabel2.setToolTipText("Enter Social Security Number for housemate");
		
		householdSSLabel2.setBounds(30, 295, 46, 14);
		
		FinancialInformation.add(householdSSLabel2);
		householdNameLabel3.setToolTipText("Enter name for other housemate");
		householdNameLabel3.setBounds(30, 344, 46, 14);
		
		FinancialInformation.add(householdNameLabel3);
		householdNameTF3.setEditable(false);
		householdNameTF3.setColumns(10);
		householdNameTF3.setBounds(72, 341, 107, 20);
		
		FinancialInformation.add(householdNameTF3);
		householdRelationshipComboBox3.setModel(new DefaultComboBoxModel(new String[] {"Relationship", "Child", "GrandChild", "Sibling", "Parent", "GrandParent", "ExtendedFamily", "Other"}));
		householdRelationshipComboBox3.setEnabled(false);
		householdRelationshipComboBox3.setBounds(111, 366, 107, 20);
		
		FinancialInformation.add(householdRelationshipComboBox3);
		householdRelationshipLabel3.setToolTipText("Choose relation to housemate");
		householdRelationshipLabel3.setBounds(30, 369, 91, 14);
		
		FinancialInformation.add(householdRelationshipLabel3);
		householdAgeLabel3.setToolTipText("Enter age for housemate, enter 0 if it is one digit");
		householdAgeLabel3.setBounds(30, 394, 46, 14);
		
		FinancialInformation.add(householdAgeLabel3);
		householdAgeFTF3.setEditable(false);
		householdAgeFTF3.setBounds(72, 394, 36, 20);
		
		//Installing age mask
		ageMask3.setPlaceholderCharacter('#');
		ageMask3.install(householdAgeFTF3);
		FinancialInformation.add(householdAgeFTF3);
		
		ssFTF3.setEditable(false);
		ssFTF3.setBounds(72, 416, 123, 22);
		
		//Installing ssdMask
		ssdMask3.setPlaceholderCharacter('#');
		ssdMask3.install(ssFTF3);
		FinancialInformation.add(ssFTF3);
		householdSSLabel3.setToolTipText("Enter Social Security Number for housemate");
		householdSSLabel3.setBounds(30, 419, 46, 14);
		
		FinancialInformation.add(householdSSLabel3);
		householdNameLabel4.setToolTipText("Enter name for other housemate");
		householdNameLabel4.setBounds(30, 466, 46, 14);
		
		FinancialInformation.add(householdNameLabel4);
		householdNameTF4.setEditable(false);
		householdNameTF4.setColumns(10);
		householdNameTF4.setBounds(72, 463, 107, 20);
		
		FinancialInformation.add(householdNameTF4);
		householdRelationshipComboBox4.setModel(new DefaultComboBoxModel(new String[] {"Relationship", "Child", "GrandChild", "Sibling", "Parent", "GrandParent", "ExtendedFamily", "Other"}));
		householdRelationshipComboBox4.setEnabled(false);
		householdRelationshipComboBox4.setBounds(111, 488, 107, 20);
		
		FinancialInformation.add(householdRelationshipComboBox4);
		householdRelationshipLabel4.setToolTipText("Choose relation to housemate");
		householdRelationshipLabel4.setBounds(30, 491, 91, 14);
		
		FinancialInformation.add(householdRelationshipLabel4);
		householdAgeLabel4.setToolTipText("Enter age for housemate, enter 0 if it is one digit");
		householdAgeLabel4.setBounds(30, 516, 46, 14);
		
		FinancialInformation.add(householdAgeLabel4);
		householdAgeFTF4.setEditable(false);
		householdAgeFTF4.setBounds(72, 516, 36, 20);
		
		//Installing age mask
		ageMask4.setPlaceholderCharacter('#');
		ageMask4.install(householdAgeFTF4);
		FinancialInformation.add(householdAgeFTF4);
		
		ssFTF4.setEditable(false);
		ssFTF4.setBounds(72, 538, 123, 22);
		
		//Installing ssdMask
		ssdMask4.setPlaceholderCharacter('#');
		ssdMask4.install(ssFTF4);
		FinancialInformation.add(ssFTF4);
		householdSSLabel4.setToolTipText("Enter Social Security Number for housemate");
		householdSSLabel4.setBounds(30, 541, 46, 14);
		
		FinancialInformation.add(householdSSLabel4);
		householdNameLabel5.setToolTipText("Enter name for other housemate");
		householdNameLabel5.setBounds(30, 586, 46, 14);
		
		FinancialInformation.add(householdNameLabel5);
		householdNameTF5.setEditable(false);
		householdNameTF5.setColumns(10);
		householdNameTF5.setBounds(72, 583, 107, 20);
		
		FinancialInformation.add(householdNameTF5);
		householdRelationshipComboBox5.setModel(new DefaultComboBoxModel(new String[] {"Relationship", "Child", "GrandChild", "Sibling", "Parent", "GrandParent", "ExtendedFamily", "Other"}));
		householdRelationshipComboBox5.setEnabled(false);
		householdRelationshipComboBox5.setBounds(111, 608, 107, 20);
		
		FinancialInformation.add(householdRelationshipComboBox5);
		householdRelationshipLabel5.setToolTipText("Choose relation to housemate");
		householdRelationshipLabel5.setBounds(30, 611, 91, 14);
		
		FinancialInformation.add(householdRelationshipLabel5);
		householdAgeLabel5.setToolTipText("Enter age for housemate, enter 0 if it is one digit");
		householdAgeLabel5.setBounds(30, 636, 46, 14);
		
		FinancialInformation.add(householdAgeLabel5);
		householdAgeFTF5.setEditable(false);
		householdAgeFTF5.setBounds(72, 636, 36, 20);
		
		//Installing age mask
		ageMask5.setPlaceholderCharacter('#');
		ageMask5.install(householdAgeFTF5);
		FinancialInformation.add(householdAgeFTF5);
		ssFTF5.setEditable(false);
		ssFTF5.setBounds(72, 658, 123, 22);
		
		//Installing ssdMask
		ssdMask5.setPlaceholderCharacter('#');
		ssdMask5.install(ssFTF5);
		FinancialInformation.add(ssFTF5);
		householdSSLabel5.setToolTipText("Enter Social Security Number for housemate");
		householdSSLabel5.setBounds(30, 661, 46, 14);
		
		FinancialInformation.add(householdSSLabel5);
		freeLunchComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_freeLunchComboBox_itemStateChanged(arg0);
			}
		});
		freeLunchComboBox.setModel(new DefaultComboBoxModel(new String[] {"N/A", "Yes", "No"}));
		freeLunchComboBox.setBounds(490, 14, 60, 20);
		
		FinancialInformation.add(freeLunchComboBox);
		separator.setBounds(30, 206, 213, 2);
		
		FinancialInformation.add(separator);
		separator_1.setBounds(30, 325, 213, 2);
		
		FinancialInformation.add(separator_1);
		separator_2.setBounds(30, 449, 213, 2);
		
		FinancialInformation.add(separator_2);
		separator_3.setBounds(30, 571, 213, 2);
		
		FinancialInformation.add(separator_3);
		peopleCountLabel.setToolTipText("Choose how many people live with you");
		peopleCountLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		peopleCountLabel.setBounds(10, 46, 235, 14);
		
		FinancialInformation.add(peopleCountLabel);
		peopleCountComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				do_peopleCountComboBox_itemStateChanged(arg0);
			}
		});
		peopleCountComboBox.setEnabled(false);
		peopleCountComboBox.setModel(new DefaultComboBoxModel(new String[] {"#", "0", "1", "2", "3", "4", "5"}));
		peopleCountComboBox.setBounds(254, 44, 33, 20);
		
		FinancialInformation.add(peopleCountComboBox);
		lblotherThanYou.setToolTipText("Choose how many people live with you");
		lblotherThanYou.setBounds(31, 61, 188, 14);
		
		FinancialInformation.add(lblotherThanYou);
		incomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		incomeLabel.setBounds(328, 46, 60, 14);
		
		FinancialInformation.add(incomeLabel);
		salaryLabel.setToolTipText("Enter Salary Income");
		salaryLabel.setBounds(338, 71, 46, 14);
		
		FinancialInformation.add(salaryLabel);
		socialSecurityLabel.setToolTipText("Enter Social Security Income");
		socialSecurityLabel.setBounds(338, 99, 91, 14);
		
		FinancialInformation.add(socialSecurityLabel);
		utilityLabel.setToolTipText("Enter Utility Assisstance Income");
		utilityLabel.setBounds(338, 124, 107, 14);
		
		FinancialInformation.add(utilityLabel);
		unemploymentLabel.setToolTipText("Enter Unemployment Income");
		unemploymentLabel.setBounds(338, 149, 91, 14);
		
		FinancialInformation.add(unemploymentLabel);
		disabilityLabel.setToolTipText("Enter Disability Income");
		disabilityLabel.setBounds(338, 179, 60, 14);
		
		FinancialInformation.add(disabilityLabel);
		lblFoodStamps.setToolTipText("Enter Food Stamps Income");
		lblFoodStamps.setBounds(338, 206, 91, 14);
		
		FinancialInformation.add(lblFoodStamps);
		tanfLabel.setToolTipText("Enter TANF/AFDC Income");
		tanfLabel.setBounds(338, 231, 91, 14);
		
		FinancialInformation.add(tanfLabel);
		lblChildSupport.setToolTipText("Enter Child Support Income");
		lblChildSupport.setBounds(338, 256, 91, 14);
		
		FinancialInformation.add(lblChildSupport);
		lblOther.setToolTipText("Enter Other Income");
		lblOther.setBounds(338, 280, 50, 14);
		
		FinancialInformation.add(lblOther);
		salaryFTF.setEditable(false);
		
		//ALL THE INCOME FORMATTED TEXT FIELDS
		
		
		//Setting salaryFTF value
		salaryFTF.setValue(num);
		salaryFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_salaryFTF_propertyChange(arg0);
			}
		});
		salaryFTF.setBounds(394, 68, 123, 17);
		FinancialInformation.add(salaryFTF);
		socialSecurityFTF.setEditable(false);
		//Setting socialSecurityFTF value
		socialSecurityFTF.setValue(num);
		socialSecurityFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_socialSecurityFTF_propertyChange(arg0);
			}
		});
		socialSecurityFTF.setBounds(440, 99, 123, 17);
		
		
		FinancialInformation.add(socialSecurityFTF);
		utilityFTF.setEditable(false);
		//Setting utilityFTF value
		utilityFTF.setValue(num);
		utilityFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_utilityFTF_propertyChange(arg0);
			}
		});
		utilityFTF.setBounds(450, 124, 123, 17);
		
		
		FinancialInformation.add(utilityFTF);
		unemploymentFTF.setEditable(false);
		//Setting unemploymentFTF value
		unemploymentFTF.setValue(num);
		unemploymentFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_unemploymentFTF_propertyChange(arg0);
			}
		});
		unemploymentFTF.setBounds(441, 149, 123, 17);
		
		
		FinancialInformation.add(unemploymentFTF);
		disabilityFTF.setEditable(false);
		//Setting disabilityFTF value
		disabilityFTF.setValue(num);
		disabilityFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_disabilityFTF_propertyChange(arg0);
			}
		});
		disabilityFTF.setBounds(394, 176, 123, 17);
		
		
		FinancialInformation.add(disabilityFTF);
		foodStampsFTF.setEditable(false);
		//Setting foodStampsFTF value
		foodStampsFTF.setValue(num);
		foodStampsFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_foodStampsFTF_propertyChange(arg0);
			}
		});
		foodStampsFTF.setBounds(428, 203, 123, 17);
		
		
		FinancialInformation.add(foodStampsFTF);
		tanfFTF.setEditable(false);
		//Setting tanfFTF value
		tanfFTF.setValue(num);
		tanfFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_tanfFTF_propertyChange(arg0);
			}
		});
		tanfFTF.setBounds(416, 228, 123, 17);
		
		
		FinancialInformation.add(tanfFTF);
		childSupportFTF.setEditable(false);
		//Setting childSupportFTF value
		childSupportFTF.setValue(num);
		childSupportFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_childSupportFTF_propertyChange(arg0);
			}
		});
		childSupportFTF.setBounds(428, 256, 123, 17);
		
		
		FinancialInformation.add(childSupportFTF);
		otherFTF.setEditable(false);
		//Setting otherFTF value
		otherFTF.setValue(num);
		otherFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_otherFTF_propertyChange(arg0);
			}
		});
		otherFTF.setBounds(380, 280, 123, 17);
		
		
		FinancialInformation.add(otherFTF);
		lblTotalIncome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotalIncome.setBounds(328, 313, 117, 14);
		totalIncomeFTF.setToolTipText("All Income added together");
		totalIncomeFTF.setEditable(false);
		
		//Setting totalIncomeFTF value
		totalIncomeFTF.setValue(num);
		FinancialInformation.add(lblTotalIncome);
		totalIncomeFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_totalIncomeFTF_propertyChange(arg0);
			}
		});
		totalIncomeFTF.setBounds(428, 310, 123, 17);
		
	
		FinancialInformation.add(totalIncomeFTF);
		expensesLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		expensesLabel.setBounds(328, 369, 70, 14);
		
		
		//ALL THE EXPENSES FORMATTED TEXT FIELDS
		FinancialInformation.add(expensesLabel);
		rentLabel.setToolTipText("Enter Rent Expense");
		rentLabel.setBounds(338, 394, 46, 14);
		rentFTF.setEditable(false);
		
		//Setting rentFTF value
		rentFTF.setForeground(Color.red);
		rentFTF.setValue(num);
		FinancialInformation.add(rentLabel);
		rentFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_rentFTF_propertyChange(arg0);
			}
		});
		rentFTF.setBounds(394, 391, 123, 17);
		
		
		FinancialInformation.add(rentFTF);
		lightBillFTF.setEditable(false);
		
		//Setting lightBillIncomeFTF value
		lightBillFTF.setForeground(Color.red);
		lightBillFTF.setValue(num);
		lightBillFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_lightBillFTF_propertyChange(arg0);
			}
		});
		lightBillFTF.setBounds(406, 419, 123, 17);
		
		FinancialInformation.add(lightBillFTF);
		lightBillLabel.setToolTipText("Enter Light Bill Expense");
		lightBillLabel.setBounds(338, 422, 91, 14);
		
		FinancialInformation.add(lightBillLabel);
		cableLabel.setToolTipText("Enter Cable TV Expense");
		cableLabel.setBounds(338, 447, 107, 14);
		cableFTF.setEditable(false);
		
		//Setting cableFTF value
		cableFTF.setForeground(Color.red);
		cableFTF.setValue(num);
		FinancialInformation.add(cableLabel);
		cableFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_cableFTF_propertyChange(arg0);
			}
		});
		cableFTF.setBounds(416, 444, 123, 17);
		
		FinancialInformation.add(cableFTF);
		phoneBillFTF.setEditable(false);
		
		//Setting phoneBillFTF value
		phoneBillFTF.setForeground(Color.red);
		phoneBillFTF.setValue(num);
		phoneBillFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_phoneBillFTF_propertyChange(arg0);
			}
		});
		phoneBillFTF.setBounds(407, 469, 123, 17);
		
		FinancialInformation.add(phoneBillFTF);
		phoneBillLabel.setToolTipText("Enter Phone Bill Expense");
		phoneBillLabel.setBounds(338, 472, 91, 14);
		
		FinancialInformation.add(phoneBillLabel);
		carPaymentLabel.setToolTipText("Enter Car Payment Expense");
		carPaymentLabel.setBounds(338, 502, 107, 14);
		carPaymentFTF.setEditable(false);
		
		//Setting carPaymentFTF value
		carPaymentFTF.setForeground(Color.red);
		carPaymentFTF.setValue(num);
		FinancialInformation.add(carPaymentLabel);
		carPaymentFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_carPaymentFTF_propertyChange(arg0);
			}
		});
		carPaymentFTF.setBounds(440, 500, 123, 17);
		
		FinancialInformation.add(carPaymentFTF);
		doctorFTF.setEditable(false);
		
		//Setting doctorFTF value
		doctorFTF.setForeground(Color.red);
		doctorFTF.setValue(num);
		doctorFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_doctorFTF_propertyChange(arg0);
			}
		});
		doctorFTF.setBounds(428, 526, 123, 17);
		
		FinancialInformation.add(doctorFTF);
		doctorLabel.setToolTipText("Enter Doctor/Med Expense");
		doctorLabel.setBounds(338, 529, 91, 14);
		
		FinancialInformation.add(doctorLabel);
		gasLabel.setToolTipText("Enter Gas/Water Expense");
		gasLabel.setBounds(338, 554, 91, 14);
		
		FinancialInformation.add(gasLabel);
		gasFTF.setEditable(false);
		
		//Setting gasFTF value
		gasFTF.setForeground(Color.red);
		gasFTF.setValue(num);
		gasFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_gasFTF_propertyChange(arg0);
			}
		});
		gasFTF.setBounds(416, 551, 123, 17);
		
		FinancialInformation.add(gasFTF);
		appliancesFTF.setEditable(false);
		
		//Setting appliancesFTF value
		appliancesFTF.setForeground(Color.red);
		appliancesFTF.setValue(num);
		appliancesFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_appliancesFTF_propertyChange(arg0);
			}
		});
		appliancesFTF.setBounds(461, 577, 123, 17);
		
		FinancialInformation.add(appliancesFTF);
		appliancesLabel.setToolTipText("Enter Furn/Appliances Expense");
		appliancesLabel.setBounds(338, 579, 136, 14);
		
		FinancialInformation.add(appliancesLabel);
		label_9.setToolTipText("Enter Other Expenses");
		label_9.setBounds(338, 603, 50, 14);
		
		FinancialInformation.add(label_9);
		otherFTF2.setEditable(false);
		
		//Setting otherFTF2 value
		otherFTF2.setForeground(Color.red);
		otherFTF2.setValue(num);
		otherFTF2.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_otherFTF2_propertyChange(arg0);
			}
		});
		otherFTF2.setBounds(380, 603, 123, 17);
		
		FinancialInformation.add(otherFTF2);
		totalExpensesFTF.setToolTipText("All Expenses added together");
		totalExpensesFTF.setEditable(false);
		
		//Setting otherFTF2 value
		totalExpensesFTF.setForeground(Color.red);
		totalExpensesFTF.setValue(num);
		totalExpensesFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_totalExpensesFTF_propertyChange(arg0);
			}
		});
		totalExpensesFTF.setBounds(428, 633, 123, 17);
		
		FinancialInformation.add(totalExpensesFTF);
		totalExpensesLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalExpensesLabel.setBounds(328, 636, 117, 14);
		
		FinancialInformation.add(totalExpensesLabel);
		netIncomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		netIncomeLabel.setBounds(328, 662, 91, 14);
		
		FinancialInformation.add(netIncomeLabel);
		netIncomeFTF.setToolTipText("Total Income subtracted by Total Expenses");
		netIncomeFTF.setEditable(false);
		
		//Setting netIncomeFTF value
		netIncomeFTF.setValue(num);
		netIncomeFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_netIncomeFTF_propertyChange(arg0);
			}
		});
		netIncomeFTF.setBounds(416, 659, 123, 17);
		
		FinancialInformation.add(netIncomeFTF);
		btnSubmit.setToolTipText("Submit Application\r\n");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnSubmit_actionPerformed(arg0);
			}
		});
		btnSubmit.setBounds(621, 625, 345, 51);
		
		FinancialInformation.add(btnSubmit);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox}));
	}
	
	//Returns a boolean, and if it is false then one of the fields are empty 
	public boolean findEmptyStudentInformationFields(){
		if(lastNameTF.getText().isEmpty()){
			return false;
		}else if(firstNameTF.getText().isEmpty()){
			return false;
		}else if(rdbtnHispanicOrLatino.isSelected() == false && rdbtnNotHispanicOr.isSelected() == false){
			return false;
		}else if(rdbtnMale.isSelected() == false && rdbtnFemale.isSelected() == false){
			return false;
		}else if(chckbxAmericanIndian.isSelected() == false && chckbxAsian.isSelected() == false && chckbxBlackOrAfrican.isSelected() == false && chckbxNativeHawaiian.isSelected() == false && chckbxWhite.isSelected() == false && chckbxOther.isSelected() == false){
			return false;
		}else if(dobMonthComboBox.getSelectedItem().toString() == "Month"){
			return false;
		}else if(dobDayComboBox.getSelectedItem().toString() == "Day"){
			return false;
		}else if(dobYearComboBox.getSelectedItem().toString() == "Year"){
			return false;
		}else if(gradeFTF.getText().contains("#")){
			return false;
		}else if(streetAddressTF.getText().isEmpty()){
			return false;
		}else if(cityTF.getText().isEmpty()){
			return false;
		}else if(zipFTF.getText().contains("#")){
			return false;
		}else if(homePhoneFTF.getText().contains("#")){
			return false;
		}else if(subdivisionTF.getText().isEmpty()){
			return false;
		}else if(rdbtnOwn.isSelected() == false && rdbtnLease.isSelected() == false){
			return false;
		}else if(leaseMonthComboBox.getSelectedItem().toString() == "Month" && rdbtnLease.isSelected()){
			return false;
		}else if(leaseDayComboBox.getSelectedItem().toString() == "Day" && rdbtnLease.isSelected()){
			return false;
		}else if(leaseYearComboBox.getSelectedItem().toString() == "Year" && rdbtnLease.isSelected()){
			return false;
		}else{
			return true;
		}
	}
	
	//Another method that checks all the StudentInformation Fields and sets their color to red if they are not filled
	public void labelChangerStudentInformationFields(){
		//Sets all labels in checkStudentLabel to black
		lastNameLabel.setForeground(Color.black);
		firstNameLabel.setForeground(Color.black);

		rdbtnHispanicOrLatino.setForeground(Color.black);
		rdbtnNotHispanicOr.setForeground(Color.black);

		genderLabel.setForeground(Color.black);

		chckbxAmericanIndian.setForeground(Color.black);
		chckbxAsian .setForeground(Color.black);
		chckbxBlackOrAfrican.setForeground(Color.black);
		chckbxNativeHawaiian.setForeground(Color.black);
		chckbxWhite.setForeground(Color.black);
		chckbxOther.setForeground(Color.black);

		dateOfBirthLabel.setForeground(Color.black);
		gradeLabel.setForeground(Color.black);
		streetAddressLabel.setForeground(Color.black);
		cityLabel.setForeground(Color.black);
		zipLabel.setForeground(Color.black);
		homePhoneLabel.setForeground(Color.black);
		
		subdivisionLabel.setForeground(Color.black);
		leaseExpirationLabel.setForeground(Color.black);
		leaseOwnLabel.setForeground(Color.black);
		
		//Checks if any of the labels are empty, and if they are set the color to red
		if(lastNameTF.getText().isEmpty()){
			lastNameLabel.setForeground(Color.red);
		}if(firstNameTF.getText().isEmpty()){
			firstNameLabel.setForeground(Color.red);
		}if(rdbtnHispanicOrLatino.isSelected() == false && rdbtnNotHispanicOr.isSelected() == false){
			rdbtnHispanicOrLatino.setForeground(Color.red);
			rdbtnNotHispanicOr.setForeground(Color.red);
		}if(rdbtnMale.isSelected() == false && rdbtnFemale.isSelected() == false){
			genderLabel.setForeground(Color.red);
		}if(chckbxAmericanIndian.isSelected() == false && chckbxAsian.isSelected() == false && chckbxBlackOrAfrican.isSelected() == false && chckbxNativeHawaiian.isSelected() == false && chckbxWhite.isSelected() == false && chckbxOther.isSelected() == false){
			chckbxAmericanIndian.setForeground(Color.red);
			chckbxAsian.setForeground(Color.red);
			chckbxNativeHawaiian.setForeground(Color.red);
			chckbxBlackOrAfrican.setForeground(Color.red);
			chckbxWhite.setForeground(Color.red);
			chckbxOther.setForeground(Color.red);
		}if(dobMonthComboBox.getSelectedItem().toString() == "Month"){
			dateOfBirthLabel.setForeground(Color.red);
		}if(dobDayComboBox.getSelectedItem().toString() == "Day"){
			dateOfBirthLabel.setForeground(Color.red);
		}if(dobYearComboBox.getSelectedItem().toString() == "Year"){
			dateOfBirthLabel.setForeground(Color.red);
		}if(gradeFTF.getText().contains("#")){
			gradeLabel.setForeground(Color.red);
		}if(streetAddressTF.getText().isEmpty()){
			streetAddressLabel.setForeground(Color.red);
		}if(cityTF.getText().isEmpty()){
			cityLabel.setForeground(Color.red);
		}if(zipFTF.getText().contains("#")){
			zipLabel.setForeground(Color.red);
		}if(homePhoneFTF.getText().contains("#")){
			homePhoneLabel.setForeground(Color.red);
		}if(subdivisionTF.getText().isEmpty()){
			subdivisionLabel.setForeground(Color.red);
		}if(rdbtnOwn.isSelected() == false && rdbtnLease.isSelected() == false){
			leaseOwnLabel.setForeground(Color.red);
		}if(leaseMonthComboBox.getSelectedItem().toString() == "Month" && rdbtnLease.isSelected()){
			leaseExpirationLabel.setForeground(Color.red);
		}if(leaseDayComboBox.getSelectedItem().toString() == "Day" && rdbtnLease.isSelected()){
			leaseExpirationLabel.setForeground(Color.red);
		}if(leaseYearComboBox.getSelectedItem().toString() == "Year" && rdbtnLease.isSelected()){
			leaseExpirationLabel.setForeground(Color.red);
		}
	}
	
	//Sets the edit state to true, and changes the tab sequence for all the other labels and text fields under the parent information tab
	protected void do_btnAddParent_actionPerformed(ActionEvent arg0) {
		lastNameParentTF2.grabFocus();
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, lastNameParentTF2, firstNameParentTF2, middleInitialParentTF2, homePhoneNumberFTF2, workPhoneNumberFTF2, cellNumberFTF2,  rdbtnYes2, rdbtnNo2, parentAddressTF2, employmentTF2, occupationTF2, emailAddressTF2, rdbtnMother2, rdbtnFather2, rdbtnOther2, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		if(siblingComboBox.getSelectedItem().toString() == "1"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, lastNameParentTF2, firstNameParentTF2, middleInitialParentTF2, homePhoneNumberFTF2, workPhoneNumberFTF2, cellNumberFTF2,  rdbtnYes2, rdbtnNo2, parentAddressTF2, employmentTF2, occupationTF2, emailAddressTF2, rdbtnMother2, rdbtnFather2, rdbtnOther2, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		}
		if(siblingComboBox.getSelectedItem().toString() == "2"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, lastNameParentTF2, firstNameParentTF2, middleInitialParentTF2, homePhoneNumberFTF2, workPhoneNumberFTF2, cellNumberFTF2,  rdbtnYes2, rdbtnNo2, parentAddressTF2, employmentTF2, occupationTF2, emailAddressTF2, rdbtnMother2, rdbtnFather2, rdbtnOther2, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		}
		if(siblingComboBox.getSelectedItem().toString() == "3"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, lastNameParentTF2, firstNameParentTF2, middleInitialParentTF2, homePhoneNumberFTF2, workPhoneNumberFTF2, cellNumberFTF2,  rdbtnYes2, rdbtnNo2, parentAddressTF2, employmentTF2, occupationTF2, emailAddressTF2, rdbtnMother2, rdbtnFather2, rdbtnOther2, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, siblingNameTF3, siblingMonthComboBox3, siblingDayComboBox3, siblingYearComboBox3, siblingGradeFTF3, siblingSchoolTF3, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		}
		
		lastNameParentLabel2.setText("*Last Name:");
		firstNameParentLabel2.setText("*First Name:");
		homePhoneNumberLabel2.setText("*Home #");
		workPhoneNumberLabel2.setText("*Work #");
		cellNumberLabel2.setText("*Cell #");
		livesWithLabel2.setText("*Lives with:");
		if(rdbtnNo2.isSelected()){
			addressIfDifferentLabel2.setText("*Address (if different):");
		}else{
			addressIfDifferentLabel2.setText("Address (if different):");
		}
		placeOfEmploymentLabel2.setText("*Place of Employment");
		occupationLabel2.setText("*Occupation:");
		emailAddressLabel2.setText("*Email Address:");
		relationLabel2.setText("*Relation:");
		
		lastNameParentTF2.setEditable(true);
		firstNameParentTF2.setEditable(true);
		middleInitialParentTF2.setEditable(true);
		homePhoneNumberFTF2.setEditable(true);
		workPhoneNumberFTF2.setEditable(true);
		cellNumberFTF2.setEditable(true);

		rdbtnYes2.setEnabled(true);
		rdbtnNo2.setEnabled(true);

		//parentAddressTF2.setEditable(true);
		employmentTF2.setEditable(true);
		occupationTF2.setEditable(true);
		emailAddressTF2.setEditable(true);

		rdbtnMother2.setEnabled(true);
		rdbtnFather2.setEnabled(true);
		rdbtnOther2.setEnabled(true);
	}
	
	//Sets the edit and enabled to false, changes the colors to black
	//Changes the tab sequence for all the other labels and text fields under the parent information tab
	//Also clears out all the text in the fields
	protected void do_btnRemoveParent_actionPerformed(ActionEvent arg0) {
		lastNameParentTF.grabFocus();
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		if(siblingComboBox.getSelectedItem().toString() == "1"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		}
		if(siblingComboBox.getSelectedItem().toString() == "2"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		}
		if(siblingComboBox.getSelectedItem().toString() == "3"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, siblingNameTF3, siblingMonthComboBox3, siblingDayComboBox3, siblingYearComboBox3, siblingGradeFTF3, siblingSchoolTF3, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
		}
		parentGuardianLabel2.setForeground(Color.black);
		lastNameParentLabel2.setForeground(Color.black);
		firstNameParentLabel2.setForeground(Color.black);
		homePhoneNumberLabel2.setForeground(Color.black);
		workPhoneNumberLabel2.setForeground(Color.black);
		cellNumberLabel2.setForeground(Color.black);
		addressIfDifferentLabel2.setForeground(Color.black);
		placeOfEmploymentLabel2.setForeground(Color.black);
		occupationLabel2.setForeground(Color.black);
		emailAddressLabel2.setForeground(Color.black);
		relationLabel2.setForeground(Color.black);
		
		lastNameParentTF2.setEditable(false);
		firstNameParentTF2.setEditable(false);
		middleInitialParentTF2.setEditable(false);
		homePhoneNumberFTF2.setEditable(false);
		workPhoneNumberFTF2.setEditable(false);
		cellNumberFTF2.setEditable(false);

		rdbtnYes2.setSelected(true);
		rdbtnYes2.setEnabled(false);
		rdbtnNo2.setEnabled(false);

		parentAddressTF2.setEditable(false);
		employmentTF2.setEditable(false);
		occupationTF2.setEditable(false);
		emailAddressTF2.setEditable(false);

		rdbtnMother2.setEnabled(false);
		rdbtnFather2.setEnabled(false);
		rdbtnOther2.setEnabled(false);
		
		lastNameParentTF2.setText("");
		firstNameParentTF2.setText("");
		middleInitialParentTF2.setText("");
		homePhoneMask3.install(homePhoneNumberFTF2);
		workPhoneMask2.install(workPhoneNumberFTF2);
		cellPhoneMask2.install(cellNumberFTF2);
		parentAddressTF2.setText("");
		employmentTF2.setText("");
		occupationTF2.setText("");
		emailAddressTF2.setText("");
		rdbtnMother2.setSelected(false);
		rdbtnMother2.setSelected(false);
		rdbtnFather2.setSelected(false);
		rdbtnOther2.setSelected(false);
		
		lastNameParentLabel2.setText("Last Name:");
		firstNameParentLabel2.setText("First Name:");
		homePhoneNumberLabel2.setText("Home #");
		workPhoneNumberLabel2.setText("Work #");
		cellNumberLabel2.setText("Cell #");
		livesWithLabel2.setText("Lives with:");
		addressIfDifferentLabel2.setText("Address (if different):");
		placeOfEmploymentLabel2.setText("Place of Employment");
		occupationLabel2.setText("Occupation:");
		emailAddressLabel2.setText("Email Address:");
		relationLabel2.setText("Relation:");
	}

	//Changes the amount of days in the date of birth day combo box, if it is February it sets the amount of days to 29
	protected void do_dobMonthComboBox_itemStateChanged(ItemEvent arg0) {
		if(dobMonthComboBox.getSelectedItem().toString() == "2"){
			dobDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
		}else{
			dobDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		}
	}
	
	//Clears out the entire form by starting a new frame
	protected void do_mntmStartNewForm_actionPerformed(ActionEvent arg0) {
		this.dispose();
		EllouganiMSCRFrame frame = new EllouganiMSCRFrame();
		frame.setVisible(true);
	}
	
	//Exits out of the application
	protected void do_mntmExit_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
	
	//Changes the amount of days in the lease day combo box, if it is February it sets the amount of days to 29
	protected void do_leaseMonthComboBox_itemStateChanged(ItemEvent arg0) {
		if(leaseMonthComboBox.getSelectedItem().toString() == "2"){
			leaseDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
		}else{
			leaseDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		}
	}
	
	//If any of the fields aren't filled out in any of the preceding tabs, you are not allowed to click the ParentInformation tab
	//You are allowed to go back to the ParentInformation tab from the FinancialTab, but you are not allowed to go forward without
	//filling out the StudentInformation tab
	protected void do_ParentInformation_focusGained(FocusEvent arg0) {
		if(findEmptyStudentInformationFields() == false){
			tabbedPane.setSelectedIndex(0);
			labelChangerStudentInformationFields();
			JOptionPane.showMessageDialog(this, "Fill out the Student Information Fields!", "Missing Values", 0);
		}else{
			labelChangerStudentInformationFields();
			lastNameParentTF.grabFocus();
		}
	}
	
	//Changes the first parent address text field to true if selected
	protected void do_rdbtnNo_actionPerformed(ActionEvent arg0) {
		parentAddressTF.setEditable(true);
	}
	
	//Changes the first parent address text field to false if selected
	protected void do_rdbtnYes_actionPerformed(ActionEvent arg0) {
		parentAddressTF.setEditable(false);
	}
	
	//Changes the second parent address text field to false if selected
	protected void do_rdbtnYes2_actionPerformed(ActionEvent arg0) {
		parentAddressTF2.setEditable(false);
	}
	
	//Changes the second parent address text field to true if selected
	protected void do_rdbtnNo2_actionPerformed(ActionEvent arg0) {
		parentAddressTF2.setEditable(true);
	}
	
	//Changes all the colors of the labels of the fields that are not filled in
	public void labelChangerParentInformationFields(){
		parentGuardianLabel.setForeground(Color.black);
		lastNameParentLabel.setForeground(Color.black);
		firstNameParentLabel.setForeground(Color.black);
		homePhoneNumberLabel.setForeground(Color.black);
		workPhoneNumberLabel.setForeground(Color.black);
		cellNumberLabel.setForeground(Color.black);
		addressIfDifferentLabel.setForeground(Color.black);
		placeOfEmploymentLabel.setForeground(Color.black);
		occupationLabel.setForeground(Color.black);
		emailAddressLabel.setForeground(Color.black);
		relationLabel.setForeground(Color.black);
		
		parentGuardianLabel2.setForeground(Color.black);
		lastNameParentLabel2.setForeground(Color.black);
		firstNameParentLabel2.setForeground(Color.black);
		homePhoneNumberLabel2.setForeground(Color.black);
		workPhoneNumberLabel2.setForeground(Color.black);
		cellNumberLabel2.setForeground(Color.black);
		addressIfDifferentLabel2.setForeground(Color.black);
		placeOfEmploymentLabel2.setForeground(Color.black);
		occupationLabel2.setForeground(Color.black);
		emailAddressLabel2.setForeground(Color.black);
		relationLabel2.setForeground(Color.black);
		
		siblingCountLabel.setForeground(Color.black);
		
		siblingNameLabel.setForeground(Color.black);
		siblingDateOfBirthLabel.setForeground(Color.black);
		siblingGradeLabel.setForeground(Color.black);
		siblingSchoolLabel.setForeground(Color.black);
		
		siblingNameLabel2.setForeground(Color.black);
		siblingDateOfBirthLabel2.setForeground(Color.black);
		siblingGradeLabel2.setForeground(Color.black);
		siblingSchoolLabel2.setForeground(Color.black);
		
		siblingNameLabel3.setForeground(Color.black);
		siblingDateOfBirthLabel3.setForeground(Color.black);
		siblingGradeLabel3.setForeground(Color.black);
		siblingSchoolLabel3.setForeground(Color.black);
		
		specialServicesLabel.setForeground(Color.black);
		emergencyContactNameLabel.setForeground(Color.black);
		emergencyContactRelationshipLabel.setForeground(Color.black);
		emergencyContactPhoneNumberLabel.setForeground(Color.black);
		emergencyContactNameLabel2.setForeground(Color.black);
		emergencyContactRelationshipLabel2.setForeground(Color.black);
		emergencyContactPhoneNumberLabel2.setForeground(Color.black);
		emergencyMseLabel.setForeground(Color.black);
		
		if(lastNameParentTF.getText().isEmpty()){
			lastNameParentLabel.setForeground(Color.red);
		}if(firstNameParentTF.getText().isEmpty()){
			firstNameParentLabel.setForeground(Color.red);
		}if(homePhoneNumberFTF.getText().contains("#") && workPhoneNumberFTF.getText().contains("#") && cellNumberFTF.getText().contains("#")){
			homePhoneNumberLabel.setForeground(Color.red);
			workPhoneNumberLabel.setForeground(Color.red);
			cellNumberLabel.setForeground(Color.red);
		}if(rdbtnYes.isSelected() == false){
			if(parentAddressTF.getText().isEmpty()){
				addressIfDifferentLabel.setForeground(Color.red);
			}
		}if(employmentTF.getText().isEmpty()){
			placeOfEmploymentLabel.setForeground(Color.red);
		}if(occupationTF.getText().isEmpty()){
			occupationLabel.setForeground(Color.red);
		}if(emailAddressTF.getText().isEmpty()){
			emailAddressLabel.setForeground(Color.red);
		}if(rdbtnMother.isSelected() == false && rdbtnMother.isSelected() == false && rdbtnOther.isSelected() == false){
			relationLabel.setForeground(Color.red);
		}
		
		
		if(lastNameParentTF2.isEditable()){
			if(lastNameParentTF2.getText().isEmpty()){
				lastNameParentLabel2.setForeground(Color.red);
			}if(firstNameParentTF2.getText().isEmpty()){
				firstNameParentLabel2.setForeground(Color.red);
			}if(homePhoneNumberFTF2.getText().contains("#") && workPhoneNumberFTF.getText().contains("#") && cellNumberFTF.getText().contains("#")){
				homePhoneNumberLabel2.setForeground(Color.red);
				workPhoneNumberLabel2.setForeground(Color.red);
				cellNumberLabel2.setForeground(Color.red);
			}if(rdbtnYes2.isSelected() == false){
				if(parentAddressTF2.getText().isEmpty()){
					addressIfDifferentLabel2.setForeground(Color.red);
				}
			}if(employmentTF2.getText().isEmpty()){
				placeOfEmploymentLabel2.setForeground(Color.red);
			}if(occupationTF2.getText().isEmpty()){
				occupationLabel2.setForeground(Color.red);
			}if(emailAddressTF2.getText().isEmpty()){
				emailAddressLabel2.setForeground(Color.red);
			}if(rdbtnMother2.isSelected() == false && rdbtnFather2.isSelected() == false && rdbtnOther2.isSelected() == false){
				relationLabel2.setForeground(Color.red);
			}
		}
		if(siblingComboBox.getSelectedItem().toString() == "#"){
			siblingCountLabel.setForeground(Color.red);
		}
		if(siblingComboBox.getSelectedItem().toString() == "1"){
			if(siblingNameTF.getText().isEmpty()){
				siblingNameLabel.setForeground(Color.red);
			}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingGradeFTF.getText().contains("#")){
				siblingGradeLabel.setForeground(Color.red);
			}if(siblingSchoolTF.getText().isEmpty()){
				siblingSchoolLabel.setForeground(Color.red);
			}
		}if(siblingComboBox.getSelectedItem().toString() == "2"){
			if(siblingNameTF.getText().isEmpty()){
				siblingNameLabel.setForeground(Color.red);
			}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingGradeFTF.getText().contains("#")){
				siblingGradeLabel.setForeground(Color.red);
			}if(siblingSchoolTF.getText().isEmpty()){
				siblingSchoolLabel.setForeground(Color.red);
			}if(siblingNameTF2.getText().isEmpty()){
				siblingNameLabel2.setForeground(Color.red);
			}if(siblingMonthComboBox2.getSelectedItem().toString() == "Month"){
				siblingDateOfBirthLabel2.setForeground(Color.red);
			}if(siblingDayComboBox2.getSelectedItem().toString() == "Day"){
				siblingDateOfBirthLabel2.setForeground(Color.red);
			}if(siblingYearComboBox2.getSelectedItem().toString() == "Year"){
				siblingDateOfBirthLabel2.setForeground(Color.red);
			}if(siblingGradeFTF2.getText().contains("#")){
				siblingGradeLabel2.setForeground(Color.red);
			}if(siblingSchoolTF2.getText().isEmpty()){
				siblingSchoolLabel2.setForeground(Color.red);
			}
		}if(siblingComboBox.getSelectedItem().toString() == "3"){
			if(siblingNameTF.getText().isEmpty()){
				siblingNameLabel.setForeground(Color.red);
			}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
				siblingDateOfBirthLabel.setForeground(Color.red);
			}if(siblingGradeFTF.getText().contains("#")){
				siblingGradeLabel.setForeground(Color.red);
			}if(siblingSchoolTF.getText().isEmpty()){
				siblingSchoolLabel.setForeground(Color.red);
			}if(siblingNameTF2.getText().isEmpty()){
				siblingNameLabel2.setForeground(Color.red);
			}if(siblingMonthComboBox2.getSelectedItem().toString() == "Month"){
				siblingDateOfBirthLabel2.setForeground(Color.red);
			}if(siblingDayComboBox2.getSelectedItem().toString() == "Day"){
				siblingDateOfBirthLabel2.setForeground(Color.red);
			}if(siblingYearComboBox2.getSelectedItem().toString() == "Year"){
				siblingDateOfBirthLabel2.setForeground(Color.red);
			}if(siblingGradeFTF2.getText().contains("#")){
				siblingGradeLabel2.setForeground(Color.red);
			}if(siblingSchoolTF2.getText().isEmpty()){
				siblingSchoolLabel2.setForeground(Color.red);
			}if(siblingNameTF3.getText().isEmpty()){
				siblingNameLabel3.setForeground(Color.red);
			}if(siblingMonthComboBox3.getSelectedItem().toString() == "Month"){
				siblingDateOfBirthLabel3.setForeground(Color.red);
			}if(siblingDayComboBox3.getSelectedItem().toString() == "Day"){
				siblingDateOfBirthLabel3.setForeground(Color.red);
			}if(siblingYearComboBox3.getSelectedItem().toString() == "Year"){
				siblingDateOfBirthLabel3.setForeground(Color.red);
			}if(siblingGradeFTF3.getText().contains("#")){
				siblingGradeLabel3.setForeground(Color.red);
			}if(siblingSchoolTF3.getText().isEmpty()){
				siblingSchoolLabel3.setForeground(Color.red);
			}
		}
		
		if(rdbtnGifted.isSelected() == false && rdbtnSpediep.isSelected() == false && rdbtnSpeechiep.isSelected() == false && rdbtnEll.isSelected() == false && rdbtnNone.isSelected() == false){
			specialServicesLabel.setForeground(Color.red);
		}if(emergencyContactNameTF.getText().isEmpty()){
			emergencyContactNameLabel.setForeground(Color.red);
		}if(emergencyContactRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
			emergencyContactRelationshipLabel.setForeground(Color.red);
		}if(emergencyPhoneFTF.getText().contains("#")){
			emergencyContactPhoneNumberLabel.setForeground(Color.red);
		}if(emergencyContactNameTF2.getText().isEmpty()){
			emergencyContactNameLabel2.setForeground(Color.red);
		}if(emergencyContactRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
			emergencyContactRelationshipLabel2.setForeground(Color.red);
		}if(emergencyPhoneFTF2.getText().contains("#")){
			emergencyContactPhoneNumberLabel2.setForeground(Color.red);
		}
		
		if(rdbtnEmergencyYes.isSelected() == false && rdbtnEmergencyNo.isSelected() == false){
			emergencyMseLabel.setForeground(Color.red);
		}
	}
	
	//Returns false if any of the mandatory parent fields aren't filled in
	public boolean findEmptyParentInformationFields(){
		if(lastNameParentTF.getText().isEmpty()){
			return false;
		}else if(firstNameParentTF.getText().isEmpty()){
			return false;
		}else if(homePhoneNumberFTF.getText().contains("#") && workPhoneNumberFTF.getText().contains("#") && cellNumberFTF.getText().contains("#")){
			return false;
		}else if(rdbtnYes.isSelected() == false){
			if(parentAddressTF.getText().isEmpty()){
				return false;
			}
		}else if(employmentTF.getText().isEmpty()){
			return false;
		}else if(occupationTF.getText().isEmpty()){
			return false;
		}else if(emailAddressTF.getText().isEmpty()){
			return false;
		}else if(rdbtnMother.isSelected() == false && rdbtnMother.isSelected() == false && rdbtnOther.isSelected() == false){
			return false;
		}

		//Checks if another parent was added by checking if it is editable
		else if(lastNameParentTF2.isEditable()){
			if(lastNameParentTF2.getText().isEmpty()){
				return false;
			}else if(firstNameParentTF2.getText().isEmpty()){
				return false;
			}else if(homePhoneNumberFTF2.getText().contains("#") && workPhoneNumberFTF.getText().contains("#") && cellNumberFTF.getText().contains("#")){
				return false;
			}else if(rdbtnYes2.isSelected() == false){
				if(parentAddressTF2.getText().isEmpty()){
					return false;
				}
			}else if(employmentTF2.getText().isEmpty()){
				return false;
			}else if(occupationTF2.getText().isEmpty()){
				return false;
			}else if(emailAddressTF2.getText().isEmpty()){
				return false;
			}else if(rdbtnMother2.isSelected() == false && rdbtnFather2.isSelected() == false && rdbtnOther2.isSelected() == false){
				return false;
			}
			else if(siblingComboBox.getSelectedItem().toString() == "#"){
				return false;
			}else if(siblingComboBox.getSelectedItem().toString() == "1" || siblingComboBox.getSelectedItem().toString() == "2" || siblingComboBox.getSelectedItem().toString() == "3" ){
				if(siblingComboBox.getSelectedItem().toString() == "1"){
					if(siblingNameTF.getText().isEmpty()){
						return false;
					}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
						return false;
					}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
						return false;
					}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
						return false;
					}if(siblingGradeFTF.getText().contains("#")){
						return false;
					}if(siblingSchoolTF.getText().isEmpty()){
						return false;
					}else if(siblingComboBox.getSelectedItem().toString() == "2"){
						if(siblingNameTF.getText().isEmpty()){
							return false;
						}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
							return false;
						}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
							return false;
						}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
							return false;
						}if(siblingGradeFTF.getText().contains("#")){
							return false;
						}if(siblingSchoolTF.getText().isEmpty()){
							return false;
						}if(siblingNameTF2.getText().isEmpty()){
							return false;
						}if(siblingMonthComboBox2.getSelectedItem().toString() == "Month"){
							return false;
						}if(siblingDayComboBox2.getSelectedItem().toString() == "Day"){
							return false;
						}if(siblingYearComboBox2.getSelectedItem().toString() == "Year"){
							return false;
						}if(siblingGradeFTF2.getText().contains("#")){
							return false;
						}if(siblingSchoolTF2.getText().isEmpty()){
							return false;
						}if(siblingComboBox.getSelectedItem().toString() == "3"){
							if(siblingNameTF.getText().isEmpty()){
								return false;
							}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
								return false;
							}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
								return false;
							}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
								return false;
							}if(siblingGradeFTF.getText().contains("#")){
								return false;
							}if(siblingSchoolTF.getText().isEmpty()){
								return false;
							}if(siblingNameTF2.getText().isEmpty()){
								return false;
							}if(siblingMonthComboBox2.getSelectedItem().toString() == "Month"){
								return false;
							}if(siblingDayComboBox2.getSelectedItem().toString() == "Day"){
								return false;
							}if(siblingYearComboBox2.getSelectedItem().toString() == "Year"){
								return false;
							}if(siblingGradeFTF2.getText().contains("#")){
								return false;
							}if(siblingSchoolTF2.getText().isEmpty()){
								return false;
							}if(siblingNameTF3.getText().isEmpty()){
								return false;
							}if(siblingMonthComboBox3.getSelectedItem().toString() == "Month"){
								return false;
							}if(siblingDayComboBox3.getSelectedItem().toString() == "Day"){
								return false;
							}if(siblingYearComboBox3.getSelectedItem().toString() == "Year"){
								return false;
							}if(siblingGradeFTF3.getText().contains("#")){
								return false;
							}if(siblingSchoolTF3.getText().isEmpty()){
								return false;
							}
						}
					}
				}if(rdbtnGifted.isSelected() == false && rdbtnSpediep.isSelected() == false && rdbtnSpeechiep.isSelected() == false && rdbtnEll.isSelected() == false && rdbtnNone.isSelected() == false){
					return false;
				}else if(emergencyContactNameTF.getText().isEmpty()){
					return false;
				}else if(emergencyContactRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(emergencyPhoneFTF.getText().contains("#")){
					return false;
				}else if(emergencyContactNameTF2.getText().isEmpty()){
					return false;
				}else if(emergencyContactRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(emergencyPhoneFTF2.getText().contains("#")){
					return false;
				}
				else if(rdbtnEmergencyYes.isSelected() == false && rdbtnEmergencyNo.isSelected() == false){
					return false;
				}
			}
			else if(siblingComboBox.getSelectedItem().toString() == "0"){
				if(rdbtnGifted.isSelected() == false && rdbtnSpediep.isSelected() == false && rdbtnSpeechiep.isSelected() == false && rdbtnEll.isSelected() == false && rdbtnNone.isSelected() == false){
					return false;
				}else if(emergencyContactNameTF.getText().isEmpty()){
					return false;
				}else if(emergencyContactRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(emergencyPhoneFTF.getText().contains("#")){
					return false;
				}else if(emergencyContactNameTF2.getText().isEmpty()){
					return false;
				}else if(emergencyContactRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(emergencyPhoneFTF2.getText().contains("#")){
					return false;
				}
				else if(rdbtnEmergencyYes.isSelected() == false && rdbtnEmergencyNo.isSelected() == false){
					return false;
				}
			}
		}
		
		//Checks if any siblings were added and returns false if the information is not filled in
		else if(siblingComboBox.getSelectedItem().toString() == "#"){
			return false;
		}else if(siblingComboBox.getSelectedItem().toString() == "1" || siblingComboBox.getSelectedItem().toString() == "2" || siblingComboBox.getSelectedItem().toString() == "3" ){
			if(siblingComboBox.getSelectedItem().toString() == "1"){
				if(siblingNameTF.getText().isEmpty()){
					return false;
				}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
					return false;
				}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
					return false;
				}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
					return false;
				}if(siblingGradeFTF.getText().contains("#")){
					return false;
				}if(siblingSchoolTF.getText().isEmpty()){
					return false;
				}else if(siblingComboBox.getSelectedItem().toString() == "2"){
					if(siblingNameTF.getText().isEmpty()){
						return false;
					}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
						return false;
					}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
						return false;
					}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
						return false;
					}if(siblingGradeFTF.getText().contains("#")){
						return false;
					}if(siblingSchoolTF.getText().isEmpty()){
						return false;
					}if(siblingNameTF2.getText().isEmpty()){
						return false;
					}if(siblingMonthComboBox2.getSelectedItem().toString() == "Month"){
						return false;
					}if(siblingDayComboBox2.getSelectedItem().toString() == "Day"){
						return false;
					}if(siblingYearComboBox2.getSelectedItem().toString() == "Year"){
						return false;
					}if(siblingGradeFTF2.getText().contains("#")){
						return false;
					}if(siblingSchoolTF2.getText().isEmpty()){
						return false;
					}if(siblingComboBox.getSelectedItem().toString() == "3"){
						if(siblingNameTF.getText().isEmpty()){
							return false;
						}if(siblingMonthComboBox.getSelectedItem().toString() == "Month"){
							return false;
						}if(siblingDayComboBox.getSelectedItem().toString() == "Day"){
							return false;
						}if(siblingYearComboBox.getSelectedItem().toString() == "Year"){
							return false;
						}if(siblingGradeFTF.getText().contains("#")){
							return false;
						}if(siblingSchoolTF.getText().isEmpty()){
							return false;
						}if(siblingNameTF2.getText().isEmpty()){
							return false;
						}if(siblingMonthComboBox2.getSelectedItem().toString() == "Month"){
							return false;
						}if(siblingDayComboBox2.getSelectedItem().toString() == "Day"){
							return false;
						}if(siblingYearComboBox2.getSelectedItem().toString() == "Year"){
							return false;
						}if(siblingGradeFTF2.getText().contains("#")){
							return false;
						}if(siblingSchoolTF2.getText().isEmpty()){
							return false;
						}if(siblingNameTF3.getText().isEmpty()){
							return false;
						}if(siblingMonthComboBox3.getSelectedItem().toString() == "Month"){
							return false;
						}if(siblingDayComboBox3.getSelectedItem().toString() == "Day"){
							return false;
						}if(siblingYearComboBox3.getSelectedItem().toString() == "Year"){
							return false;
						}if(siblingGradeFTF3.getText().contains("#")){
							return false;
						}if(siblingSchoolTF3.getText().isEmpty()){
							return false;
						}
					}
				}
			}if(rdbtnGifted.isSelected() == false && rdbtnSpediep.isSelected() == false && rdbtnSpeechiep.isSelected() == false && rdbtnEll.isSelected() == false && rdbtnNone.isSelected() == false){
				return false;
			}else if(emergencyContactNameTF.getText().isEmpty()){
				return false;
			}else if(emergencyContactRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
				return false;
			}else if(emergencyPhoneFTF.getText().contains("#")){
				return false;
			}else if(emergencyContactNameTF2.getText().isEmpty()){
				return false;
			}else if(emergencyContactRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
				return false;
			}else if(emergencyPhoneFTF2.getText().contains("#")){
				return false;
			}
			else if(rdbtnEmergencyYes.isSelected() == false && rdbtnEmergencyNo.isSelected() == false){
				return false;
			}
		}
		else if(siblingComboBox.getSelectedItem().toString() == "0"){
			if(rdbtnGifted.isSelected() == false && rdbtnSpediep.isSelected() == false && rdbtnSpeechiep.isSelected() == false && rdbtnEll.isSelected() == false && rdbtnNone.isSelected() == false){
				return false;
			}else if(emergencyContactNameTF.getText().isEmpty()){
				return false;
			}else if(emergencyContactRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
				return false;
			}else if(emergencyPhoneFTF.getText().contains("#")){
				return false;
			}else if(emergencyContactNameTF2.getText().isEmpty()){
				return false;
			}else if(emergencyContactRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
				return false;
			}else if(emergencyPhoneFTF2.getText().contains("#")){
				return false;
			}
			else if(rdbtnEmergencyYes.isSelected() == false && rdbtnEmergencyNo.isSelected() == false){
				return false;
			}
		}
		return true;
	}
	
	//If any of the fields aren't filled out in any of the preceding tabs, you are not allowed to click the FinancialInformation tab
	//You are allowed to go back to the ParentInformation tab from the FinancialTab, but you are not allowed to go forward without
	//filling out the StudentInformation tab, and the FinancialInformation tab
	protected void do_FinancialInformation_focusGained(FocusEvent arg0) {
		if(findEmptyStudentInformationFields() == false){
			tabbedPane.setSelectedIndex(0);
			labelChangerStudentInformationFields();
			JOptionPane.showMessageDialog(this, "Fill out the Student Information Fields!", "Missing Values", 0);
		}else if(findEmptyParentInformationFields() == false){
			tabbedPane.setSelectedIndex(1);
			labelChangerParentInformationFields();
			JOptionPane.showMessageDialog(this, "Fill out the Parent Information Fields!", "Missing Values", 0);
		}else{
			labelChangerStudentInformationFields();
			labelChangerParentInformationFields();
			freeLunchComboBox.grabFocus();
		}
	}
	
	//Enables the sibling text fields based on how many siblings you have chosen to have
	//Also changes the labels to have ** if siblings are selected
	//Also turns the sibling fields to empty if you delete them
	protected void do_siblingComboBox_itemStateChanged(ItemEvent arg0) {
		siblingNameLabel.setText("Name:");
		siblingDateOfBirthLabel.setText("D.O.B:");
		siblingGradeLabel.setText("Grade:");
		siblingSchoolLabel.setText("School:");

		siblingNameLabel2.setText("Name:");
		siblingDateOfBirthLabel2.setText("D.O.B:");
		siblingGradeLabel2.setText("Grade:");
		siblingSchoolLabel2.setText("School:");

		siblingNameLabel3.setText("Name:");
		siblingDateOfBirthLabel3.setText("D.O.B:");
		siblingGradeLabel3.setText("Grade:");
		siblingSchoolLabel3.setText("School:");
		
		siblingNameTF.setEditable(false);
		siblingMonthComboBox.setEnabled(false);
		siblingDayComboBox.setEnabled(false);
		siblingYearComboBox.setEnabled(false);
		siblingGradeFTF.setEditable(false);
		siblingSchoolTF.setEditable(false);
		
		siblingNameTF2.setEditable(false);
		siblingMonthComboBox2.setEnabled(false);
		siblingDayComboBox2.setEnabled(false);
		siblingYearComboBox2.setEnabled(false);
		siblingGradeFTF2.setEditable(false);
		siblingSchoolTF2.setEditable(false);
		
		siblingNameTF3.setEditable(false);
		siblingMonthComboBox3.setEnabled(false);
		siblingDayComboBox3.setEnabled(false);
		siblingYearComboBox3.setEnabled(false);
		siblingGradeFTF3.setEditable(false);
		siblingSchoolTF3.setEditable(false);
		
		if(siblingComboBox.getSelectedItem().toString() == "#"){
			siblingNameLabel.setForeground(Color.black);
			siblingDateOfBirthLabel.setForeground(Color.black);
			siblingGradeLabel.setForeground(Color.black);
			siblingSchoolLabel.setForeground(Color.black);
			
			siblingNameTF.setText("");
			siblingMonthComboBox.setSelectedIndex(0);
			siblingDayComboBox.setSelectedIndex(0);
			siblingYearComboBox.setSelectedIndex(0);
			gradeMask2.install(siblingGradeFTF);
			siblingSchoolTF.setText("");
			
			siblingNameTF2.setText("");
			siblingMonthComboBox2.setSelectedIndex(0);
			siblingDayComboBox2.setSelectedIndex(0);
			siblingYearComboBox2.setSelectedIndex(0);
			gradeMask3.install(siblingGradeFTF2);
			siblingSchoolTF2.setText("");
			
			siblingNameTF3.setText("");
			siblingMonthComboBox3.setSelectedIndex(0);
			siblingDayComboBox3.setSelectedIndex(0);
			siblingYearComboBox3.setSelectedIndex(0);
			gradeMask4.install(siblingGradeFTF3);
			siblingSchoolTF3.setText("");
		}
		
		if(siblingComboBox.getSelectedItem().toString() == "0"){
			siblingNameLabel.setForeground(Color.black);
			siblingDateOfBirthLabel.setForeground(Color.black);
			siblingGradeLabel.setForeground(Color.black);
			siblingSchoolLabel.setForeground(Color.black);
			
			siblingNameTF.setText("");
			siblingMonthComboBox.setSelectedIndex(0);
			siblingDayComboBox.setSelectedIndex(0);
			siblingYearComboBox.setSelectedIndex(0);
			gradeMask2.install(siblingGradeFTF);
			siblingSchoolTF.setText("");
			
			siblingNameTF2.setText("");
			siblingMonthComboBox2.setSelectedIndex(0);
			siblingDayComboBox2.setSelectedIndex(0);
			siblingYearComboBox2.setSelectedIndex(0);
			gradeMask3.install(siblingGradeFTF2);
			siblingSchoolTF2.setText("");
			
			siblingNameTF3.setText("");
			siblingMonthComboBox3.setSelectedIndex(0);
			siblingDayComboBox3.setSelectedIndex(0);
			siblingYearComboBox3.setSelectedIndex(0);
			gradeMask4.install(siblingGradeFTF3);
			siblingSchoolTF3.setText("");
		}		
		
		if(siblingComboBox.getSelectedItem().toString() == "1"){
			if(lastNameParentTF2.isEditable()){
				setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, lastNameParentTF2, firstNameParentTF2, middleInitialParentTF2, homePhoneNumberFTF2, workPhoneNumberFTF2, cellNumberFTF2,  rdbtnYes2, rdbtnNo2, parentAddressTF2, employmentTF2, occupationTF2, emailAddressTF2, rdbtnMother2, rdbtnFather2, rdbtnOther2, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
			}else{
				setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
			}
			siblingNameTF.grabFocus();
			
			siblingNameTF2.setText("");
			siblingMonthComboBox2.setSelectedIndex(0);
			siblingDayComboBox2.setSelectedIndex(0);
			siblingYearComboBox2.setSelectedIndex(0);
			gradeMask3.install(siblingGradeFTF2);
			siblingSchoolTF2.setText("");
			
			siblingNameTF3.setText("");
			siblingMonthComboBox3.setSelectedIndex(0);
			siblingDayComboBox3.setSelectedIndex(0);
			siblingYearComboBox3.setSelectedIndex(0);
			gradeMask4.install(siblingGradeFTF3);
			siblingSchoolTF3.setText("");
			
			siblingNameLabel.setText("*Name:");
			siblingDateOfBirthLabel.setText("*D.O.B:");
			siblingGradeLabel.setText("*Grade:");
			siblingSchoolLabel.setText("*School:");
			
			siblingNameTF.setEditable(true);
			siblingMonthComboBox.setEnabled(true);
			siblingDayComboBox.setEnabled(true);
			siblingYearComboBox.setEnabled(true);
			siblingGradeFTF.setEditable(true);
			siblingSchoolTF.setEditable(true);
			
			siblingNameLabel2.setForeground(Color.black);
			siblingDateOfBirthLabel2.setForeground(Color.black);
			siblingGradeLabel2.setForeground(Color.black);
			siblingSchoolLabel2.setForeground(Color.black);
			
			siblingNameLabel3.setForeground(Color.black);
			siblingDateOfBirthLabel3.setForeground(Color.black);
			siblingGradeLabel3.setForeground(Color.black);
			siblingSchoolLabel3.setForeground(Color.black);
		}
		
		if(siblingComboBox.getSelectedItem().toString() == "2"){
			if(lastNameParentTF2.isEditable()){
				setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, lastNameParentTF2, firstNameParentTF2, middleInitialParentTF2, homePhoneNumberFTF2, workPhoneNumberFTF2, cellNumberFTF2,  rdbtnYes2, rdbtnNo2, parentAddressTF2, employmentTF2, occupationTF2, emailAddressTF2, rdbtnMother2, rdbtnFather2, rdbtnOther2, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
			}else{
				setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
			}
			siblingNameTF.grabFocus();
			
			siblingNameTF3.setText("");
			siblingMonthComboBox3.setSelectedIndex(0);
			siblingDayComboBox3.setSelectedIndex(0);
			siblingYearComboBox3.setSelectedIndex(0);
			gradeMask4.install(siblingGradeFTF3);
			siblingSchoolTF3.setText("");
			
			siblingNameLabel.setText("*Name:");
			siblingDateOfBirthLabel.setText("*D.O.B:");
			siblingGradeLabel.setText("*Grade:");
			siblingSchoolLabel.setText("*School:");

			siblingNameLabel2.setText("*Name:");
			siblingDateOfBirthLabel2.setText("*D.O.B:");
			siblingGradeLabel2.setText("*Grade:");
			siblingSchoolLabel2.setText("*School:");

			siblingNameTF.setEditable(true);
			siblingMonthComboBox.setEnabled(true);
			siblingDayComboBox.setEnabled(true);
			siblingYearComboBox.setEnabled(true);
			siblingGradeFTF.setEditable(true);
			siblingSchoolTF.setEditable(true);
			
			siblingNameTF2.setEditable(true);
			siblingMonthComboBox2.setEnabled(true);
			siblingDayComboBox2.setEnabled(true);
			siblingYearComboBox2.setEnabled(true);
			siblingGradeFTF2.setEditable(true);
			siblingSchoolTF2.setEditable(true);
			
			siblingNameLabel3.setForeground(Color.black);
			siblingDateOfBirthLabel3.setForeground(Color.black);
			siblingGradeLabel3.setForeground(Color.black);
			siblingSchoolLabel3.setForeground(Color.black);
		}
		
		if(siblingComboBox.getSelectedItem().toString() == "3"){
			if(lastNameParentTF2.isEditable()){
				setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, lastNameParentTF2, firstNameParentTF2, middleInitialParentTF2, homePhoneNumberFTF2, workPhoneNumberFTF2, cellNumberFTF2,  rdbtnYes2, rdbtnNo2, parentAddressTF2, employmentTF2, occupationTF2, emailAddressTF2, rdbtnMother2, rdbtnFather2, rdbtnOther2, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, siblingNameTF3, siblingMonthComboBox3, siblingDayComboBox3, siblingYearComboBox3, siblingGradeFTF3, siblingSchoolTF3, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
			}else{
				setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, siblingNameTF, siblingMonthComboBox, siblingDayComboBox, siblingYearComboBox, siblingGradeFTF, siblingSchoolTF, siblingNameTF2, siblingMonthComboBox2, siblingDayComboBox2, siblingYearComboBox2, siblingGradeFTF2, siblingSchoolTF2, siblingNameTF3, siblingMonthComboBox3, siblingDayComboBox3, siblingYearComboBox3, siblingGradeFTF3, siblingSchoolTF3, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo}));
			}
			siblingNameTF.grabFocus();
			
			siblingNameLabel.setText("*Name:");
			siblingDateOfBirthLabel.setText("*D.O.B:");
			siblingGradeLabel.setText("*Grade:");
			siblingSchoolLabel.setText("*School:");

			siblingNameLabel2.setText("*Name:");
			siblingDateOfBirthLabel2.setText("*D.O.B:");
			siblingGradeLabel2.setText("*Grade:");
			siblingSchoolLabel2.setText("*School:");

			siblingNameLabel3.setText("*Name:");
			siblingDateOfBirthLabel3.setText("*D.O.B:");
			siblingGradeLabel3.setText("*Grade:");
			siblingSchoolLabel3.setText("*School:");
			
			siblingNameTF.setEditable(true);
			siblingMonthComboBox.setEnabled(true);
			siblingDayComboBox.setEnabled(true);
			siblingYearComboBox.setEnabled(true);
			siblingGradeFTF.setEditable(true);
			siblingSchoolTF.setEditable(true);
			
			siblingNameTF2.setEditable(true);
			siblingMonthComboBox2.setEnabled(true);
			siblingDayComboBox2.setEnabled(true);
			siblingYearComboBox2.setEnabled(true);
			siblingGradeFTF2.setEditable(true);
			siblingSchoolTF2.setEditable(true);
			
			siblingNameTF3.setEditable(true);
			siblingMonthComboBox3.setEnabled(true);
			siblingDayComboBox3.setEnabled(true);
			siblingYearComboBox3.setEnabled(true);
			siblingGradeFTF3.setEditable(true);
			siblingSchoolTF3.setEditable(true);
		}
	}
	
	//Changes the amount of days in February for Sibling Month Combo Box
	protected void do_siblingMonthComboBox_itemStateChanged(ItemEvent arg0) {
		if(siblingMonthComboBox.getSelectedItem().toString() == "2"){
			siblingDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
		}else{
			siblingDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		}
	}
	
	//Changes the amount of days in February for Sibling Month Combo Box
	protected void do_siblingMonthComboBox2_itemStateChanged(ItemEvent arg0) {
		if(siblingMonthComboBox2.getSelectedItem().toString() == "2"){
			siblingDayComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
		}else{
			siblingDayComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		}
	}
	
	//Changes the amount of days in February for Sibling Month Combo Box 
	protected void do_siblingMonthComboBox3_itemStateChanged(ItemEvent arg0) {
		if(siblingMonthComboBox3.getSelectedItem().toString() == "2"){
			siblingDayComboBox3.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
		}else{
			siblingDayComboBox3.setModel(new DefaultComboBoxModel(new String[] {"Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		}
	}
	
	//Changes the state of whether or not the FTF's are editable, and resets the values
	//Also changes the tabbing sequence based on whether or not you choose to request free lunch
	protected void do_freeLunchComboBox_itemStateChanged(ItemEvent arg0) {
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox}));
		if(freeLunchComboBox.getSelectedItem().toString() == "Yes"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
			
			peopleCountComboBox.setEnabled(true);
			salaryFTF.setEditable(true);
			socialSecurityFTF.setEditable(true);
			utilityFTF.setEditable(true);
			unemploymentFTF.setEditable(true);
			disabilityFTF.setEditable(true);
			foodStampsFTF.setEditable(true);
			tanfFTF.setEditable(true);
			childSupportFTF.setEditable(true);
			otherFTF.setEditable(true);
			totalIncomeFTF.setEditable(true);


			rentFTF.setEditable(true);
			lightBillFTF.setEditable(true);
			cableFTF.setEditable(true);
			phoneBillFTF.setEditable(true);
			carPaymentFTF.setEditable(true);
			doctorFTF.setEditable(true);
			gasFTF.setEditable(true);
			appliancesFTF.setEditable(true);
			otherFTF2.setEditable(true);
			totalExpensesFTF.setEditable(true);
			netIncomeFTF.setEditable(true);
			
		}else{
			peopleCountComboBox.setSelectedIndex(0);
			peopleCountComboBox.setEnabled(false);
			
			salaryFTF.setEditable(false);
			socialSecurityFTF.setEditable(false);
			utilityFTF.setEditable(false);
			unemploymentFTF.setEditable(false);
			disabilityFTF.setEditable(false);
			foodStampsFTF.setEditable(false);
			tanfFTF.setEditable(false);
			childSupportFTF.setEditable(false);
			otherFTF.setEditable(false);
			totalIncomeFTF.setEditable(false);

			rentFTF.setEditable(false);
			lightBillFTF.setEditable(false);
			cableFTF.setEditable(false);
			phoneBillFTF.setEditable(false);
			carPaymentFTF.setEditable(false);
			doctorFTF.setEditable(false);
			gasFTF.setEditable(false);
			appliancesFTF.setEditable(false);
			otherFTF2.setEditable(false);
			totalExpensesFTF.setEditable(false);
			netIncomeFTF.setEditable(false);
			
			salaryFTF.setValue(0.0);
			socialSecurityFTF.setValue(0.0);
			utilityFTF.setValue(0.0);
			unemploymentFTF.setValue(0.0);
			disabilityFTF.setValue(0.0);
			foodStampsFTF.setValue(0.0);
			tanfFTF.setValue(0.0);
			childSupportFTF.setValue(0.0);
			otherFTF.setValue(0.0);
			totalIncomeFTF.setValue(0.0);

			rentFTF.setValue(0.0);
			lightBillFTF.setValue(0.0);
			cableFTF.setValue(0.0);
			phoneBillFTF.setValue(0.0);
			carPaymentFTF.setValue(0.0);
			doctorFTF.setValue(0.0);
			gasFTF.setValue(0.0);
			appliancesFTF.setValue(0.0);
			otherFTF2.setValue(0.0);
			totalExpensesFTF.setValue(0.0);
			netIncomeFTF.setValue(0.0);
		}
	}
	
	//Allows house mate text fields to be editable based on whether or not you have any
	//Also changes the labels to have * if selected
	//Lastly changes the tabbing sequence based on if you choose that you have house mates or not
	protected void do_peopleCountComboBox_itemStateChanged(ItemEvent arg0) {
		householdNameTF.setEditable(false);
		householdRelationshipComboBox.setEnabled(false);
		householdAgeFTF.setEditable(false);
		ssFTF.setEditable(false);
		
		householdNameTF2.setEditable(false);
		householdRelationshipComboBox2.setEnabled(false);
		householdAgeFTF2.setEditable(false);
		ssFTF2.setEditable(false);
		
		householdNameTF3.setEditable(false);
		householdRelationshipComboBox3.setEnabled(false);
		householdAgeFTF3.setEditable(false);
		ssFTF3.setEditable(false);
		
		householdNameTF4.setEditable(false);
		householdRelationshipComboBox4.setEnabled(false);
		householdAgeFTF4.setEditable(false);
		ssFTF4.setEditable(false);
		
		householdNameTF5.setEditable(false);
		householdRelationshipComboBox5.setEnabled(false);
		householdAgeFTF5.setEditable(false);
		ssFTF5.setEditable(false);
		
		householdNameLabel.setText("Name:");
		householdRelationshipLabel.setText("Relationship:");
		householdAgeLabel.setText("Age:");
		householdSSLabel.setText("SS#:");

		householdNameLabel2.setText("Name:");
		householdRelationshipLabel2.setText("Relationship:");
		householdAgeLabel2.setText("Age:");
		householdSSLabel2.setText("SS#:");

		householdNameLabel3.setText("Name:");
		householdRelationshipLabel3.setText("Relationship:");
		householdAgeLabel3.setText("Age:");
		householdSSLabel3.setText("SS#:");

		householdNameLabel4.setText("Name:");
		householdRelationshipLabel4.setText("Relationship:");
		householdAgeLabel4.setText("Age:");
		householdSSLabel4.setText("SS#:");

		householdNameLabel5.setText("Name:");
		householdRelationshipLabel5.setText("Relationship:");
		householdAgeLabel5.setText("Age:");
		householdSSLabel5.setText("SS#:");
		
		if(peopleCountComboBox.getSelectedItem().toString() == "#"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
			
			householdNameTF.setEditable(false);
			householdRelationshipComboBox.setEnabled(false);
			householdAgeFTF.setEditable(false);
			ssFTF.setEditable(false);
			
			householdNameTF2.setEditable(false);
			householdRelationshipComboBox2.setEnabled(false);
			householdAgeFTF2.setEditable(false);
			ssFTF2.setEditable(false);
			
			householdNameTF3.setEditable(false);
			householdRelationshipComboBox3.setEnabled(false);
			householdAgeFTF3.setEditable(false);
			ssFTF3.setEditable(false);
			
			householdNameTF4.setEditable(false);
			householdRelationshipComboBox4.setEnabled(false);
			householdAgeFTF4.setEditable(false);
			ssFTF4.setEditable(false);
			
			householdNameTF5.setEditable(false);
			householdRelationshipComboBox5.setEnabled(false);
			householdAgeFTF5.setEditable(false);
			ssFTF5.setEditable(false);
			
			householdNameTF.setText("");
			householdRelationshipComboBox.setSelectedItem(0);
			ageMask.install(householdAgeFTF);
			ssdMask.install(ssFTF);
			
			householdNameTF2.setText("");
			householdRelationshipComboBox2.setSelectedItem(0);
			ageMask2.install(householdAgeFTF2);
			ssdMask2.install(ssFTF2);
			
			householdNameTF3.setText("");
			householdRelationshipComboBox3.setSelectedItem(0);
			ageMask3.install(householdAgeFTF3);
			ssdMask3.install(ssFTF3);
			
			householdNameTF4.setText("");
			householdRelationshipComboBox4.setSelectedItem(0);
			ageMask4.install(householdAgeFTF4);
			ssdMask4.install(ssFTF4);
			
			householdNameTF5.setText("");
			householdRelationshipComboBox5.setSelectedItem(0);
			ageMask5.install(householdAgeFTF5);
			ssdMask5.install(ssFTF5);
			
			householdNameLabel.setForeground(Color.black);
			householdRelationshipLabel.setForeground(Color.black);
			householdAgeLabel.setForeground(Color.black);
			householdSSLabel.setForeground(Color.black);

			householdNameLabel2.setForeground(Color.black);
			householdRelationshipLabel2.setForeground(Color.black);
			householdAgeLabel2.setForeground(Color.black);
			householdSSLabel2.setForeground(Color.black);

			householdNameLabel3.setForeground(Color.black);
			householdRelationshipLabel3.setForeground(Color.black);
			householdAgeLabel3.setForeground(Color.black);
			householdSSLabel3.setForeground(Color.black);

			householdNameLabel4.setForeground(Color.black);
			householdRelationshipLabel4.setForeground(Color.black);
			householdAgeLabel4.setForeground(Color.black);
			householdSSLabel4.setForeground(Color.black);

			householdNameLabel5.setForeground(Color.black);
			householdRelationshipLabel5.setForeground(Color.black);
			householdAgeLabel5.setForeground(Color.black);
			householdSSLabel5.setForeground(Color.black);
		}
		if(peopleCountComboBox.getSelectedItem().toString() == "0"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
			
			householdNameTF.setEditable(false);
			householdRelationshipComboBox.setEnabled(false);
			householdAgeFTF.setEditable(false);
			ssFTF.setEditable(false);
			
			householdNameTF2.setEditable(false);
			householdRelationshipComboBox2.setEnabled(false);
			householdAgeFTF2.setEditable(false);
			ssFTF2.setEditable(false);
			
			householdNameTF3.setEditable(false);
			householdRelationshipComboBox3.setEnabled(false);
			householdAgeFTF3.setEditable(false);
			ssFTF3.setEditable(false);
			
			householdNameTF4.setEditable(false);
			householdRelationshipComboBox4.setEnabled(false);
			householdAgeFTF4.setEditable(false);
			ssFTF4.setEditable(false);
			
			householdNameTF5.setEditable(false);
			householdRelationshipComboBox5.setEnabled(false);
			householdAgeFTF5.setEditable(false);
			ssFTF5.setEditable(false);
			
			householdNameTF.setText("");
			householdRelationshipComboBox.setSelectedItem(0);
			ageMask.install(householdAgeFTF);
			ssdMask.install(ssFTF);
			
			householdNameTF2.setText("");
			householdRelationshipComboBox2.setSelectedItem(0);
			ageMask2.install(householdAgeFTF2);
			ssdMask2.install(ssFTF2);
			
			householdNameTF3.setText("");
			householdRelationshipComboBox3.setSelectedItem(0);
			ageMask3.install(householdAgeFTF3);
			ssdMask3.install(ssFTF3);
			
			householdNameTF4.setText("");
			householdRelationshipComboBox4.setSelectedItem(0);
			ageMask4.install(householdAgeFTF4);
			ssdMask4.install(ssFTF4);
			
			householdNameTF5.setText("");
			householdRelationshipComboBox5.setSelectedItem(0);
			ageMask5.install(householdAgeFTF5);
			ssdMask5.install(ssFTF5);
			
			householdNameLabel.setForeground(Color.black);
			householdRelationshipLabel.setForeground(Color.black);
			householdAgeLabel.setForeground(Color.black);
			householdSSLabel.setForeground(Color.black);

			householdNameLabel2.setForeground(Color.black);
			householdRelationshipLabel2.setForeground(Color.black);
			householdAgeLabel2.setForeground(Color.black);
			householdSSLabel2.setForeground(Color.black);

			householdNameLabel3.setForeground(Color.black);
			householdRelationshipLabel3.setForeground(Color.black);
			householdAgeLabel3.setForeground(Color.black);
			householdSSLabel3.setForeground(Color.black);

			householdNameLabel4.setForeground(Color.black);
			householdRelationshipLabel4.setForeground(Color.black);
			householdAgeLabel4.setForeground(Color.black);
			householdSSLabel4.setForeground(Color.black);

			householdNameLabel5.setForeground(Color.black);
			householdRelationshipLabel5.setForeground(Color.black);
			householdAgeLabel5.setForeground(Color.black);
			householdSSLabel5.setForeground(Color.black);
		}if(peopleCountComboBox.getSelectedItem().toString() == "1"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, householdNameTF, householdRelationshipComboBox, householdAgeFTF, ssFTF, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
			
			householdNameTF.setEditable(true);
			householdRelationshipComboBox.setEnabled(true);
			householdAgeFTF.setEditable(true);
			ssFTF.setEditable(true);
			
			householdNameLabel.setText("*Name:");
			householdRelationshipLabel.setText("*Relationship:");
			householdAgeLabel.setText("*Age:");
			householdSSLabel.setText("*SS#:");
			
			householdNameTF2.setText("");
			householdRelationshipComboBox2.setSelectedItem(0);
			ageMask2.install(householdAgeFTF2);
			ssdMask2.install(ssFTF2);
			
			householdNameTF3.setText("");
			householdRelationshipComboBox3.setSelectedItem(0);
			ageMask3.install(householdAgeFTF3);
			ssdMask3.install(ssFTF3);
			
			householdNameTF4.setText("");
			householdRelationshipComboBox4.setSelectedItem(0);
			ageMask4.install(householdAgeFTF4);
			ssdMask4.install(ssFTF4);
			
			householdNameTF5.setText("");
			householdRelationshipComboBox5.setSelectedItem(0);
			ageMask5.install(householdAgeFTF5);
			ssdMask5.install(ssFTF5);
			
			householdNameLabel2.setForeground(Color.black);
			householdRelationshipLabel2.setForeground(Color.black);
			householdAgeLabel2.setForeground(Color.black);
			householdSSLabel2.setForeground(Color.black);

			householdNameLabel3.setForeground(Color.black);
			householdRelationshipLabel3.setForeground(Color.black);
			householdAgeLabel3.setForeground(Color.black);
			householdSSLabel3.setForeground(Color.black);

			householdNameLabel4.setForeground(Color.black);
			householdRelationshipLabel4.setForeground(Color.black);
			householdAgeLabel4.setForeground(Color.black);
			householdSSLabel4.setForeground(Color.black);

			householdNameLabel5.setForeground(Color.black);
			householdRelationshipLabel5.setForeground(Color.black);
			householdAgeLabel5.setForeground(Color.black);
			householdSSLabel5.setForeground(Color.black);
		}if(peopleCountComboBox.getSelectedItem().toString() == "2"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, householdNameTF, householdRelationshipComboBox, householdAgeFTF, ssFTF, householdNameTF2, householdRelationshipComboBox2, householdAgeFTF2, ssFTF2, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
			
			householdNameTF.setEditable(true);
			householdRelationshipComboBox.setEnabled(true);
			householdAgeFTF.setEditable(true);
			ssFTF.setEditable(true);
			
			householdNameTF2.setEditable(true);
			householdRelationshipComboBox2.setEnabled(true);
			householdAgeFTF2.setEditable(true);
			ssFTF2.setEditable(true);
			
			householdNameLabel.setText("*Name:");
			householdRelationshipLabel.setText("*Relationship:");
			householdAgeLabel.setText("*Age:");
			householdSSLabel.setText("*SS#:");

			householdNameLabel2.setText("*Name:");
			householdRelationshipLabel2.setText("*Relationship:");
			householdAgeLabel2.setText("*Age:");
			householdSSLabel2.setText("*SS#:");
			
			householdNameTF3.setText("");
			householdRelationshipComboBox3.setSelectedItem(0);
			ageMask3.install(householdAgeFTF3);
			ssdMask3.install(ssFTF3);
			
			householdNameTF4.setText("");
			householdRelationshipComboBox4.setSelectedItem(0);
			ageMask4.install(householdAgeFTF4);
			ssdMask4.install(ssFTF4);
			
			householdNameTF5.setText("");
			householdRelationshipComboBox5.setSelectedItem(0);
			ageMask5.install(householdAgeFTF5);
			ssdMask5.install(ssFTF5);
			
			householdNameLabel3.setForeground(Color.black);
			householdRelationshipLabel3.setForeground(Color.black);
			householdAgeLabel3.setForeground(Color.black);
			householdSSLabel3.setForeground(Color.black);

			householdNameLabel4.setForeground(Color.black);
			householdRelationshipLabel4.setForeground(Color.black);
			householdAgeLabel4.setForeground(Color.black);
			householdSSLabel4.setForeground(Color.black);

			householdNameLabel5.setForeground(Color.black);
			householdRelationshipLabel5.setForeground(Color.black);
			householdAgeLabel5.setForeground(Color.black);
			householdSSLabel5.setForeground(Color.black);
		}if(peopleCountComboBox.getSelectedItem().toString() == "3"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, householdNameTF, householdRelationshipComboBox, householdAgeFTF, ssFTF, householdNameTF2, householdRelationshipComboBox2, householdAgeFTF2, ssFTF2, householdNameTF3, householdRelationshipComboBox3, householdAgeFTF3, ssFTF3, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
						
			householdNameTF.setEditable(true);
			householdRelationshipComboBox.setEnabled(true);
			householdAgeFTF.setEditable(true);
			ssFTF.setEditable(true);
			
			householdNameTF2.setEditable(true);
			householdRelationshipComboBox2.setEnabled(true);
			householdAgeFTF2.setEditable(true);
			ssFTF2.setEditable(true);
			
			householdNameTF3.setEditable(true);
			householdRelationshipComboBox3.setEnabled(true);
			householdAgeFTF3.setEditable(true);
			ssFTF3.setEditable(true);
			
			householdNameLabel.setText("*Name:");
			householdRelationshipLabel.setText("*Relationship:");
			householdAgeLabel.setText("*Age:");
			householdSSLabel.setText("*SS#:");

			householdNameLabel2.setText("*Name:");
			householdRelationshipLabel2.setText("*Relationship:");
			householdAgeLabel2.setText("*Age:");
			householdSSLabel2.setText("*SS#:");

			householdNameLabel3.setText("*Name:");
			householdRelationshipLabel3.setText("*Relationship:");
			householdAgeLabel3.setText("*Age:");
			householdSSLabel3.setText("*SS#:");
			
			householdNameTF4.setText("");
			householdRelationshipComboBox4.setSelectedItem(0);
			ageMask4.install(householdAgeFTF4);
			ssdMask4.install(ssFTF4);
			
			householdNameTF5.setText("");
			householdRelationshipComboBox5.setSelectedItem(0);
			ageMask5.install(householdAgeFTF5);
			ssdMask5.install(ssFTF5);
			
			householdNameLabel4.setForeground(Color.black);
			householdRelationshipLabel4.setForeground(Color.black);
			householdAgeLabel4.setForeground(Color.black);
			householdSSLabel4.setForeground(Color.black);

			householdNameLabel5.setForeground(Color.black);
			householdRelationshipLabel5.setForeground(Color.black);
			householdAgeLabel5.setForeground(Color.black);
			householdSSLabel5.setForeground(Color.black);
		}
		if(peopleCountComboBox.getSelectedItem().toString() == "4"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, householdNameTF, householdRelationshipComboBox, householdAgeFTF, ssFTF, householdNameTF2, householdRelationshipComboBox2, householdAgeFTF2, ssFTF2, householdNameTF3, householdRelationshipComboBox3, householdAgeFTF3, ssFTF3, householdNameTF4, householdRelationshipComboBox4, householdAgeFTF4, ssFTF4, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
			
			householdNameTF.setEditable(true);
			householdRelationshipComboBox.setEnabled(true);
			householdAgeFTF.setEditable(true);
			ssFTF.setEditable(true);
			
			householdNameTF2.setEditable(true);
			householdRelationshipComboBox2.setEnabled(true);
			householdAgeFTF2.setEditable(true);
			ssFTF2.setEditable(true);
			
			householdNameTF3.setEditable(true);
			householdRelationshipComboBox3.setEnabled(true);
			householdAgeFTF3.setEditable(true);
			ssFTF3.setEditable(true);
			
			householdNameTF4.setEditable(true);
			householdRelationshipComboBox4.setEnabled(true);
			householdAgeFTF4.setEditable(true);
			ssFTF4.setEditable(true);
			
			householdNameLabel.setText("*Name:");
			householdRelationshipLabel.setText("*Relationship:");
			householdAgeLabel.setText("*Age:");
			householdSSLabel.setText("*SS#:");

			householdNameLabel2.setText("*Name:");
			householdRelationshipLabel2.setText("*Relationship:");
			householdAgeLabel2.setText("*Age:");
			householdSSLabel2.setText("*SS#:");

			householdNameLabel3.setText("*Name:");
			householdRelationshipLabel3.setText("*Relationship:");
			householdAgeLabel3.setText("*Age:");
			householdSSLabel3.setText("*SS#:");

			householdNameLabel4.setText("*Name:");
			householdRelationshipLabel4.setText("*Relationship:");
			householdAgeLabel4.setText("*Age:");
			householdSSLabel4.setText("*SS#:");
			
			householdNameTF5.setText("");
			householdRelationshipComboBox5.setSelectedItem(0);
			ageMask5.install(householdAgeFTF5);
			ssdMask5.install(ssFTF5);
			
			householdNameLabel5.setForeground(Color.black);
			householdRelationshipLabel5.setForeground(Color.black);
			householdAgeLabel5.setForeground(Color.black);
			householdSSLabel5.setForeground(Color.black);
		}if(peopleCountComboBox.getSelectedItem().toString() == "5"){
			setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox, peopleCountComboBox, householdNameTF, householdRelationshipComboBox, householdAgeFTF, ssFTF, householdNameTF2, householdRelationshipComboBox2, householdAgeFTF2, ssFTF2, householdNameTF3, householdRelationshipComboBox3, householdAgeFTF3, ssFTF3, householdNameTF4, householdRelationshipComboBox4, householdAgeFTF4, ssFTF4, householdNameTF5, householdRelationshipComboBox5, householdAgeFTF5, ssFTF5, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherFTF, totalIncomeFTF, rentFTF, lightBillFTF, cableFTF, phoneBillFTF, carPaymentFTF, doctorFTF, gasFTF, appliancesFTF, otherFTF2, totalExpensesFTF, netIncomeFTF}));
			
			householdNameTF.setEditable(true);
			householdRelationshipComboBox.setEnabled(true);
			householdAgeFTF.setEditable(true);
			ssFTF.setEditable(true);
			
			householdNameTF2.setEditable(true);
			householdRelationshipComboBox2.setEnabled(true);
			householdAgeFTF2.setEditable(true);
			ssFTF2.setEditable(true);
			
			householdNameTF3.setEditable(true);
			householdRelationshipComboBox3.setEnabled(true);
			householdAgeFTF3.setEditable(true);
			ssFTF3.setEditable(true);
			
			householdNameTF4.setEditable(true);
			householdRelationshipComboBox4.setEnabled(true);
			householdAgeFTF4.setEditable(true);
			ssFTF4.setEditable(true);
			
			householdNameTF5.setEditable(true);
			householdRelationshipComboBox5.setEnabled(true);
			householdAgeFTF5.setEditable(true);
			ssFTF5.setEditable(true);
			
			householdNameLabel.setText("*Name:");
			householdRelationshipLabel.setText("*Relationship:");
			householdAgeLabel.setText("*Age:");
			householdSSLabel.setText("*SS#:");

			householdNameLabel2.setText("*Name:");
			householdRelationshipLabel2.setText("*Relationship:");
			householdAgeLabel2.setText("*Age:");
			householdSSLabel2.setText("*SS#:");

			householdNameLabel3.setText("*Name:");
			householdRelationshipLabel3.setText("*Relationship:");
			householdAgeLabel3.setText("*Age:");
			householdSSLabel3.setText("*SS#:");

			householdNameLabel4.setText("*Name:");
			householdRelationshipLabel4.setText("*Relationship:");
			householdAgeLabel4.setText("*Age:");
			householdSSLabel4.setText("*SS#:");

			householdNameLabel5.setText("*Name:");
			householdRelationshipLabel5.setText("*Relationship:");
			householdAgeLabel5.setText("*Age:");
			householdSSLabel5.setText("*SS#:");
		}
	}
	
	//Calculates the income and expenses
	public void Calculate(){
		num = ((Number)salaryFTF.getValue()).doubleValue() + ((Number)socialSecurityFTF.getValue()).doubleValue() + ((Number)utilityFTF.getValue()).doubleValue() + ((Number)unemploymentFTF.getValue()).doubleValue() + ((Number)disabilityFTF.getValue()).doubleValue() + ((Number)foodStampsFTF.getValue()).doubleValue() + ((Number)tanfFTF.getValue()).doubleValue() + ((Number)childSupportFTF.getValue()).doubleValue() + ((Number)otherFTF.getValue()).doubleValue();
		totalIncomeFTF.setValue(num);
		
		num = ((Number)rentFTF.getValue()).doubleValue() + ((Number)lightBillFTF.getValue()).doubleValue() + ((Number)cableFTF.getValue()).doubleValue() + ((Number)phoneBillFTF.getValue()).doubleValue() + ((Number)carPaymentFTF.getValue()).doubleValue() + ((Number)doctorFTF.getValue()).doubleValue() + ((Number)gasFTF.getValue()).doubleValue() + ((Number)otherFTF2.getValue()).doubleValue();
		totalExpensesFTF.setValue(num);
		
		num = ((Number)totalIncomeFTF.getValue()).doubleValue() - ((Number)totalExpensesFTF.getValue()).doubleValue();
		
		if(num < 0.0){
			netIncomeFTF.setValue(num);
			netIncomeFTF.setForeground(Color.red);
		}else{
			netIncomeFTF.setValue(num);
			netIncomeFTF.setForeground(Color.black);
		}
	}
	
	
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_salaryFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_socialSecurityFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_utilityFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_unemploymentFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_disabilityFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_foodStampsFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_tanfFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_childSupportFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_otherFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_totalIncomeFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_rentFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_lightBillFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_cableFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_phoneBillFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_carPaymentFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_doctorFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_gasFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_appliancesFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_otherFTF2_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_totalExpensesFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	//ALL THE FINANCIAL PROPERTY CHANGES RUN THE CALCULATE METHOD ABOVE TO FIND THE INCOME AND EXPENSE
	protected void do_netIncomeFTF_propertyChange(PropertyChangeEvent arg0) {
		Calculate();
	}
	
	//Changes the label color under the financial information tab based on whether the information is filled out or not
	public void financialInformationLabelChanger(){
		requestLunchLabel.setForeground(Color.black);
		
		peopleCountLabel.setForeground(Color.black);
		
		householdNameLabel.setForeground(Color.black);
		householdRelationshipLabel.setForeground(Color.black);
		householdAgeLabel.setForeground(Color.black);
		householdSSLabel.setForeground(Color.black);
		
		householdNameLabel2.setForeground(Color.black);
		householdRelationshipLabel2.setForeground(Color.black);
		householdAgeLabel2.setForeground(Color.black);
		householdSSLabel2.setForeground(Color.black);
		
		householdNameLabel3.setForeground(Color.black);
		householdRelationshipLabel3.setForeground(Color.black);
		householdAgeLabel3.setForeground(Color.black);
		householdSSLabel3.setForeground(Color.black);
		
		householdNameLabel4.setForeground(Color.black);
		householdRelationshipLabel4.setForeground(Color.black);
		householdAgeLabel4.setForeground(Color.black);
		householdSSLabel4.setForeground(Color.black);
		
		householdNameLabel5.setForeground(Color.black);
		householdRelationshipLabel5.setForeground(Color.black);
		householdAgeLabel5.setForeground(Color.black);
		householdSSLabel5.setForeground(Color.black);
		if(freeLunchComboBox.getSelectedItem().toString() == "N/A"){
			requestLunchLabel.setForeground(Color.red);
		}else if(freeLunchComboBox.getSelectedItem().toString() == "Yes"){
			if(peopleCountComboBox.getSelectedItem().toString() == "#"){
				peopleCountLabel.setForeground(Color.red);
			}else if(peopleCountComboBox.getSelectedItem().toString() == "1"){			
				if(householdNameTF.getText().isEmpty()){
					householdNameLabel.setForeground(Color.red);
				}if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel.setForeground(Color.red);
				}if(householdAgeFTF.getText().contains("#")){
					householdAgeLabel.setForeground(Color.red);
				}if(ssFTF.getText().contains("#")){
					householdSSLabel.setForeground(Color.red);
				}
			}else if(peopleCountComboBox.getSelectedItem().toString() == "2"){			
				if(householdNameTF.getText().isEmpty()){
					householdNameLabel.setForeground(Color.red);
				}if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel.setForeground(Color.red);
				}if(householdAgeFTF.getText().contains("#")){
					householdAgeLabel.setForeground(Color.red);
				}if(ssFTF.getText().contains("#")){
					householdSSLabel.setForeground(Color.red);
				}
				
				if(householdNameTF2.getText().isEmpty()){
					householdNameLabel2.setForeground(Color.red);
				}if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel2.setForeground(Color.red);
				}if(householdAgeFTF2.getText().contains("#")){
					householdAgeLabel2.setForeground(Color.red);
				}if(ssFTF2.getText().contains("#")){
					householdSSLabel2.setForeground(Color.red);
				}
			}else if(peopleCountComboBox.getSelectedItem().toString() == "3"){			
				if(householdNameTF.getText().isEmpty()){
					householdNameLabel.setForeground(Color.red);
				}if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel.setForeground(Color.red);
				}if(householdAgeFTF.getText().contains("#")){
					householdAgeLabel.setForeground(Color.red);
				}if(ssFTF.getText().contains("#")){
					householdSSLabel.setForeground(Color.red);
				}
				
				if(householdNameTF2.getText().isEmpty()){
					householdNameLabel2.setForeground(Color.red);
				}if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel2.setForeground(Color.red);
				}if(householdAgeFTF2.getText().contains("#")){
					householdAgeLabel2.setForeground(Color.red);
				}if(ssFTF2.getText().contains("#")){
					householdSSLabel2.setForeground(Color.red);
				}
				
				if(householdNameTF3.getText().isEmpty()){
					householdNameLabel3.setForeground(Color.red);
				}if(householdRelationshipComboBox3.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel3.setForeground(Color.red);
				}if(householdAgeFTF3.getText().contains("#")){
					householdAgeLabel3.setForeground(Color.red);
				}if(ssFTF3.getText().contains("#")){
					householdSSLabel3.setForeground(Color.red);
				}
			}else if(peopleCountComboBox.getSelectedItem().toString() == "4"){			
				if(householdNameTF.getText().isEmpty()){
					householdNameLabel.setForeground(Color.red);
				}if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel.setForeground(Color.red);
				}if(householdAgeFTF.getText().contains("#")){
					householdAgeLabel.setForeground(Color.red);
				}if(ssFTF.getText().contains("#")){
					householdSSLabel.setForeground(Color.red);
				}
				
				if(householdNameTF2.getText().isEmpty()){
					householdNameLabel2.setForeground(Color.red);
				}if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel2.setForeground(Color.red);
				}if(householdAgeFTF2.getText().contains("#")){
					householdAgeLabel2.setForeground(Color.red);
				}if(ssFTF2.getText().contains("#")){
					householdSSLabel2.setForeground(Color.red);
				}
				
				if(householdNameTF3.getText().isEmpty()){
					householdNameLabel3.setForeground(Color.red);
				}if(householdRelationshipComboBox3.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel3.setForeground(Color.red);
				}if(householdAgeFTF3.getText().contains("#")){
					householdAgeLabel3.setForeground(Color.red);
				}if(ssFTF3.getText().contains("#")){
					householdSSLabel3.setForeground(Color.red);
				}
				
				if(householdNameTF4.getText().isEmpty()){
					householdNameLabel4.setForeground(Color.red);
				}if(householdRelationshipComboBox4.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel4.setForeground(Color.red);
				}if(householdAgeFTF4.getText().contains("#")){
					householdAgeLabel4.setForeground(Color.red);
				}if(ssFTF4.getText().contains("#")){
					householdSSLabel4.setForeground(Color.red);
				}
			}else if(peopleCountComboBox.getSelectedItem().toString() == "5"){			
				if(householdNameTF.getText().isEmpty()){
					householdNameLabel.setForeground(Color.red);
				}if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel.setForeground(Color.red);
				}if(householdAgeFTF.getText().contains("#")){
					householdAgeLabel.setForeground(Color.red);
				}if(ssFTF.getText().contains("#")){
					householdSSLabel.setForeground(Color.red);
				}
				
				if(householdNameTF2.getText().isEmpty()){
					householdNameLabel2.setForeground(Color.red);
				}if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel2.setForeground(Color.red);
				}if(householdAgeFTF2.getText().contains("#")){
					householdAgeLabel2.setForeground(Color.red);
				}if(ssFTF2.getText().contains("#")){
					householdSSLabel2.setForeground(Color.red);
				}
				
				if(householdNameTF3.getText().isEmpty()){
					householdNameLabel3.setForeground(Color.red);
				}if(householdRelationshipComboBox3.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel3.setForeground(Color.red);
				}if(householdAgeFTF3.getText().contains("#")){
					householdAgeLabel3.setForeground(Color.red);
				}if(ssFTF3.getText().contains("#")){
					householdSSLabel3.setForeground(Color.red);
				}
				
				if(householdNameTF4.getText().isEmpty()){
					householdNameLabel4.setForeground(Color.red);
				}if(householdRelationshipComboBox4.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel4.setForeground(Color.red);
				}if(householdAgeFTF4.getText().contains("#")){
					householdAgeLabel4.setForeground(Color.red);
				}if(ssFTF4.getText().contains("#")){
					householdSSLabel4.setForeground(Color.red);
				}
				
				if(householdNameTF5.getText().isEmpty()){
					householdNameLabel5.setForeground(Color.red);
				}if(householdRelationshipComboBox5.getSelectedItem().toString() == "Relationship"){
					householdRelationshipLabel5.setForeground(Color.red);
				}if(householdAgeFTF5.getText().contains("#")){
					householdAgeLabel5.setForeground(Color.red);
				}if(ssFTF5.getText().contains("#")){
					householdSSLabel5.setForeground(Color.red);
				}
			}
		}
	}
		
	
	//Returns a boolean if any of the required financial information fields are empty
	public boolean findEmptyFinancialInformationFields(){
		if(freeLunchComboBox.getSelectedItem().toString() == "N/A"){
			return false;
		}else if(freeLunchComboBox.getSelectedItem().toString() == "Yes"){
				if(peopleCountComboBox.getSelectedItem().toString() == "#"){
					return false;
				}else if(peopleCountComboBox.getSelectedItem().toString() == "1"){			
					if(householdNameTF.getText().isEmpty()){
						return false;
					}else if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
						return false;
					}else if(householdAgeFTF.getText().contains("#")){
						return false;
					}else if(ssFTF.getText().contains("#")){
						return false;
					}
				}else if(peopleCountComboBox.getSelectedItem().toString() == "2"){			
					if(householdNameTF.getText().isEmpty()){
						return false;
					}else if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
						return false;
					}else if(householdAgeFTF.getText().contains("#")){
						return false;
					}else if(ssFTF.getText().contains("#")){
						return false;
					}
					
					else if(householdNameTF2.getText().isEmpty()){
						return false;
					}else if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
						return false;
					}else if(householdAgeFTF2.getText().contains("#")){
						return false;
					}else if(ssFTF2.getText().contains("#")){
						return false;
					}
				}else if(peopleCountComboBox.getSelectedItem().toString() == "3"){			
					if(householdNameTF.getText().isEmpty()){
						return false;
					}else if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
						return false;
					}else if(householdAgeFTF.getText().contains("#")){
						return false;
					}else if(ssFTF.getText().contains("#")){
						return false;
					}
					
					else if(householdNameTF2.getText().isEmpty()){
						return false;
					}else if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
						return false;
					}else if(householdAgeFTF2.getText().contains("#")){
						return false;
					}else if(ssFTF2.getText().contains("#")){
						return false;
					}
					
					else if(householdNameTF3.getText().isEmpty()){
						return false;
					}else if(householdRelationshipComboBox3.getSelectedItem().toString() == "Relationship"){
						return false;
					}else if(householdAgeFTF3.getText().contains("#")){
						return false;
					}else if(ssFTF3.getText().contains("#")){
						return false;
					}
			}else if(peopleCountComboBox.getSelectedItem().toString() == "4"){			
				if(householdNameTF.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF.getText().contains("#")){
					return false;
				}else if(ssFTF.getText().contains("#")){
					return false;
				}
				
				else if(householdNameTF2.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF2.getText().contains("#")){
					return false;
				}else if(ssFTF2.getText().contains("#")){
					return false;
				}
				
				else if(householdNameTF3.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox3.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF3.getText().contains("#")){
					return false;
				}else if(ssFTF3.getText().contains("#")){
					return false;
				}
				
				else if(householdNameTF4.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox4.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF4.getText().contains("#")){
					return false;
				}else if(ssFTF4.getText().contains("#")){
					return false;
				}
			}else if(peopleCountComboBox.getSelectedItem().toString() == "5"){			
				if(householdNameTF.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF.getText().contains("#")){
					return false;
				}else if(ssFTF.getText().contains("#")){
					return false;
				}
				
				else if(householdNameTF2.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox2.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF2.getText().contains("#")){
					return false;
				}else if(ssFTF2.getText().contains("#")){
					return false;
				}
				
				else if(householdNameTF3.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox3.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF3.getText().contains("#")){
					return false;
				}else if(ssFTF3.getText().contains("#")){
					return false;
				}
				
				else if(householdNameTF4.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox4.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF4.getText().contains("#")){
					return false;
				}else if(ssFTF4.getText().contains("#")){
					return false;
				}
				
				else if(householdNameTF5.getText().isEmpty()){
					return false;
				}else if(householdRelationshipComboBox5.getSelectedItem().toString() == "Relationship"){
					return false;
				}else if(householdAgeFTF5.getText().contains("#")){
					return false;
				}else if(ssFTF5.getText().contains("#")){
					return false;
				}
			}
			return true;
		}
	return true;
}
	
	//Submits the form checking if all the fields are filled out under the financial information tab
	protected void do_btnSubmit_actionPerformed(ActionEvent arg0) {
		if(findEmptyFinancialInformationFields() == false){
			financialInformationLabelChanger();
			JOptionPane.showMessageDialog(this, "Fill out the Financial Information Fields!", "Missing Values", 0);
		}else{
			financialInformationLabelChanger();
			JOptionPane.showMessageDialog(this, "Submitted Application!", "Submission Notice", 1);
		}
	}
	
	//Opens a new help frame for the student tab
	protected void do_mntmStudentHelp_actionPerformed(ActionEvent arg0) {
		EllouganiMSCRHelpStudentFrame helpFrame = new EllouganiMSCRHelpStudentFrame();
		helpFrame.setVisible(true);
	}
	
	//Opens a new help frame for the family tab
	protected void do_mntmFamilyHelp_actionPerformed(ActionEvent arg0) {
		EllouganiMSCRHelpParentFrame helpFrame = new EllouganiMSCRHelpParentFrame();
		helpFrame.setVisible(true);
	}
	
	//Opens a new help frame for the financial tab
	protected void do_mntmFinancialHelp_actionPerformed(ActionEvent arg0) {
		EllouganiMSCRHelpFinancialFrame helpFrame = new EllouganiMSCRHelpFinancialFrame();
		helpFrame.setVisible(true);
	}
	
	//Disable the least expiration date combo boxes if clicked
	//Also sets the values back to its default
	//Changes the tabbing sequence as well
	protected void do_rdbtnOwn_actionPerformed(ActionEvent arg0) {
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox}));
		leaseMonthComboBox.setEnabled(false);
		leaseDayComboBox.setEnabled(false);
		leaseYearComboBox.setEnabled(false);
		leaseMonthComboBox.setSelectedIndex(0);
		leaseDayComboBox.setSelectedIndex(0);
		leaseYearComboBox.setSelectedIndex(0);
		leaseExpirationLabel.setForeground(Color.black);
		leaseExpirationLabel.setText("Lease Expiration:");
	}
	
	//Enables the least expiration date combo boxes if clicked
	//Changes the tabbing sequence as well
	protected void do_rdbtnLease_actionPerformed(ActionEvent arg0) {
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lastNameTF, firstNameTF, middleInitialTF, preferredNameTF, rdbtnHispanicOrLatino, rdbtnNotHispanicOr, chckbxAmericanIndian, chckbxAsian, chckbxBlackOrAfrican, chckbxNativeHawaiian, chckbxWhite, chckbxOther, rdbtnMale, rdbtnFemale, dobMonthComboBox, dobDayComboBox, dobYearComboBox, gradeFTF, streetAddressTF, cityTF, zipFTF, homePhoneFTF, subdivisionTF, rdbtnOwn, rdbtnLease, leaseMonthComboBox, leaseDayComboBox, leaseYearComboBox, lastNameParentTF, firstNameParentTF, middleInitialParentTF, homePhoneNumberFTF, workPhoneNumberFTF, cellNumberFTF, rdbtnYes, rdbtnNo, parentAddressTF, employmentTF, occupationTF, emailAddressTF, rdbtnMother, rdbtnFather, rdbtnOther, siblingComboBox, rdbtnGifted, rdbtnSpediep, rdbtnSpeechiep, rdbtnEll, rdbtnNone, allergyTF, emergencyContactNameTF, emergencyContactRelationshipComboBox, emergencyPhoneFTF, emergencyContactNameTF2, emergencyContactRelationshipComboBox2, emergencyPhoneFTF2, rdbtnEmergencyYes, rdbtnEmergencyNo, freeLunchComboBox}));
		leaseMonthComboBox.setEnabled(true);
		leaseDayComboBox.setEnabled(true);
		leaseYearComboBox.setEnabled(true);
		leaseExpirationLabel.setText("*Lease Expiration:");
	}
}

