import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.synth.SynthProgressBarUI;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class Find_Recipe_Tab extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea text_area_tarif_bul; // Sınıf alanı olarak tanımlandı
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Find_Recipe_Tab frame = new Find_Recipe_Tab();
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
    public Find_Recipe_Tab() {
    	setResizable(false);
        setTitle("Tarif Bulma Menüsü");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 617, 700);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(90, 68, 48));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane scrollPane_tarif_bul_kapsayıcı = new JScrollPane();
        scrollPane_tarif_bul_kapsayıcı.setBounds(31, 28, 532, 557);
        contentPane.add(scrollPane_tarif_bul_kapsayıcı);
        scrollPane_tarif_bul_kapsayıcı.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        // Burada sınıf alanına atama yapıldı
        text_area_tarif_bul = new JTextArea();
        ArrayList<String> recipes = Recipe_List.getRecpies();  // Tarifleri alıyoruz
        StringBuilder sb = new StringBuilder();
        
        // Tarifleri sırayla ekliyoruz
        for (String recipe : recipes) {
            sb.append(recipe).append("\n\n");  // Tarifler arası boşluk bırakılıyor
        }
        text_area_tarif_bul.setText(sb.toString());
        scrollPane_tarif_bul_kapsayıcı.setViewportView(text_area_tarif_bul);
        text_area_tarif_bul.setBackground(new Color(253, 247, 235));
        text_area_tarif_bul.setLineWrap(true);
        text_area_tarif_bul.setWrapStyleWord(true);
        
        btnNewButton = new JButton("Ana Menüye Dön");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Food_App food_frame = new Food_App();
        		food_frame.setVisible(true);
        		setVisible(false);
        	}
        });
        btnNewButton.setBackground(new Color(253, 247, 235));
        btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
        btnNewButton.setBounds(353, 606, 210, 35);
        contentPane.add(btnNewButton);
    }
    
    public void updateTextArea(String tarif) {
    	ArrayList<String> recipes = Recipe_List.getRecpies();  // Tarifleri alıyoruz
        StringBuilder sb = new StringBuilder();
        
        // Tarifleri sırayla ekliyoruz
        for (String recipe : recipes) {
            sb.append(recipe).append("\n\n");  // Tarifler arası boşluk bırakılıyor
        }

        // Eğer tarif mevcutsa, yenisini ekliyoruz
        if (!tarif.isEmpty()) {
            sb.append(tarif);  // Yeni tarif ekleniyor
        }

        // Güncellenmiş metni text area'ya yazdırıyoruz
        text_area_tarif_bul.setText(sb.toString());
    } 
    	
        
    }

