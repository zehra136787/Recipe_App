import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Recipe_Tap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_baslık;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Recipe_Tap frame = new Add_Recipe_Tap();
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
	public Add_Recipe_Tap() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(90, 68, 48));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_e_baslık = new JLabel("Başlık :");
		lbl_e_baslık.setForeground(new Color(253, 247, 235));
		lbl_e_baslık.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 27));
		lbl_e_baslık.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_e_baslık.setBounds(72, 56, 132, 35);
		contentPane.add(lbl_e_baslık);
		
		txt_baslık = new JTextField();
		txt_baslık.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		txt_baslık.setBackground(new Color(253, 247, 235));
		txt_baslık.setForeground(new Color(0, 0, 0));
		txt_baslık.setBounds(172, 56, 183, 40);
		contentPane.add(txt_baslık);
		txt_baslık.setColumns(10);

		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(72, 130, 460, 430);
		contentPane.add(scrollPane1);
		
		JTextArea txt_area_tarif = new JTextArea();
		scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		scrollPane1.setViewportView(txt_area_tarif);
		txt_area_tarif.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		txt_area_tarif.setForeground(new Color(0, 0, 0));
		txt_area_tarif.setBackground(new Color(253, 247, 235));
		txt_area_tarif.setLineWrap(true);
		txt_area_tarif.setWrapStyleWord(true);
		
		JButton btn_menü_dön = new JButton("Ana Menüye Dön");
		btn_menü_dön.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Food_App food_frame = new Food_App();
				food_frame.setVisible(true);
				
			}
		});
		btn_menü_dön.setForeground(new Color(0, 0, 0));
		btn_menü_dön.setBackground(new Color(253, 247, 235));
		btn_menü_dön.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn_menü_dön.setBounds(323, 576, 209, 41);
		contentPane.add(btn_menü_dön);
		
		JButton btn_listeye_ekle = new JButton("Listeye Ekle");
		btn_listeye_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tarif = "Başlık: " + txt_baslık.getText() + "\n" + txt_area_tarif.getText();
				Recipe_List recipe_list_frame = new Recipe_List();
				recipe_list_frame.setRecpie(tarif);
				
				Find_Recipe_Tab find_Recipe_frame = new Find_Recipe_Tab();
				find_Recipe_frame.updateTextArea(tarif);
			}
		});
		btn_listeye_ekle.setForeground(Color.BLACK);
		btn_listeye_ekle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn_listeye_ekle.setBackground(new Color(253, 247, 235));
		btn_listeye_ekle.setBounds(72, 576, 215, 41);
		contentPane.add(btn_listeye_ekle);
		
	
	}
}
