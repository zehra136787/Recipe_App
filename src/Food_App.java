import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Food_App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food_App frame = new Food_App();
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
	public Food_App() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(251, 247, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setBorder(new LineBorder(new Color(138, 109, 79), 5));
		
		ImageIcon original = new ImageIcon(getClass().getResource("/tarij_img.png"));
		Image originalImage = original.getImage();
		Image editImage = originalImage.getScaledInstance(264, 563, Image.SCALE_SMOOTH);
		ImageIcon ıcon = new ImageIcon(editImage);
		lbl_logo.setIcon(ıcon);
		
		lbl_logo.setBounds(0, 0, 264, 526);
		contentPane.add(lbl_logo);
		
		JLabel lbl_baslık = new JLabel("Tarif Defteri");
		lbl_baslık.setForeground(new Color(138, 109, 79));
		lbl_baslık.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_baslık.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 34));
		lbl_baslık.setBounds(311, 72, 236, 66);
		contentPane.add(lbl_baslık);
		
		JButton btn_bul = new JButton("Tarif Bul");
		btn_bul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_bul.setBackground(new Color(138, 109, 79));
		btn_bul.setForeground(new Color(255, 255, 255));
		btn_bul.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 28));
		btn_bul.setBounds(350, 166, 173, 66);
		contentPane.add(btn_bul);
		
		JButton btn_ekle = new JButton("Tarif Ekle");
		btn_ekle.setForeground(Color.WHITE);
		btn_ekle.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 28));
		btn_ekle.setBackground(new Color(138, 109, 79));
		btn_ekle.setBounds(350, 256, 173, 66);
		contentPane.add(btn_ekle);
		
		JButton btn_favoriler = new JButton("Favoriler");
		btn_favoriler.setForeground(Color.WHITE);
		btn_favoriler.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 28));
		btn_favoriler.setBackground(new Color(138, 109, 79));
		btn_favoriler.setBounds(350, 343, 173, 66);
		contentPane.add(btn_favoriler);
	}
}
