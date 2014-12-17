
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel.*;
import javax.swing.JFrame.*;

public class MainClient extends WindowAdapter implements ActionListener
{
	// Variables declaration - do not modify
	private JFrame mainFrame;
	private BackEndHandler back;
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration
	private MainClient()
	{
		mainFrame= new JFrame(" : BY GAURAV WALIA & HIMALAYA MONGA");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.addWindowListener(this);

		// Create a menu bar
		
		
		// Add action listeners for other menu items
		

		
		jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setTitle(" : BY GAURAV WALIA & HIMALAYA MONGA");
        mainFrame.setMinimumSize(new java.awt.Dimension(900, 700));
        mainFrame.setResizable(false);
        mainFrame.getContentPane().setLayout(null);

       // jButton1.setBackground(new java.awt.Color(0, 0, 240));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jButton1.setText("Embed Message");
        jButton1.addActionListener(this);
        mainFrame.getContentPane().add(jButton1);
        jButton1.setBounds(30, 260, 160, 60);

       // jButton2.setBackground(new java.awt.Color(240, 0, 0));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jButton2.setText("Retrieve Message");
        jButton2.setMaximumSize(new java.awt.Dimension(139, 29));
        jButton2.setMinimumSize(new java.awt.Dimension(139, 29));
        jButton2.addActionListener(this);
        mainFrame.getContentPane().add(jButton2);
        jButton2.setBounds(250, 260, 160, 60);

      //  jButton3.setBackground(new java.awt.Color(240, 0, 0));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jButton3.setText("Embed File");
        jButton3.setMaximumSize(new java.awt.Dimension(139, 29));
        jButton3.setMinimumSize(new java.awt.Dimension(139, 29));
        jButton3.setPreferredSize(new java.awt.Dimension(139, 29));
        jButton3.addActionListener(this);
        mainFrame.getContentPane().add(jButton3);
        jButton3.setBounds(510, 260, 160, 60);

      //  jButton4.setBackground(new java.awt.Color(0, 0, 240));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jButton4.setText("Retrieve File");
        jButton4.setMaximumSize(new java.awt.Dimension(139, 29));
        jButton4.setMinimumSize(new java.awt.Dimension(139, 29));
        jButton4.setPreferredSize(new java.awt.Dimension(139, 29));
        jButton4.addActionListener(this);
        mainFrame.getContentPane().add(jButton4);
        jButton4.setBounds(710, 260, 160, 60);

       // jButton5.setBackground(new java.awt.Color(176, 88, 0));
        jButton5.setText("Help");
        jButton5.addActionListener(this);
        mainFrame.getContentPane().add(jButton5);
        jButton5.setBounds(780, 10, 110, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shank.png"))); // NOI18N
        mainFrame.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -40, 180, 290);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/concealment1.png"))); // NOI18N
        mainFrame.getContentPane().add(jLabel5);
        jLabel5.setBounds(170, -30, 730, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled3.png"))); // NOI18N
        mainFrame.getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 230, 450, 420);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 700));
        mainFrame.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 230, 440, 420);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackpng.png"))); // NOI18N
        mainFrame.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 210, 900, 500);

        jMenu1.setText("Task");
        jMenu1.setActionCommand("Task");

        jMenuItem1.setText("Embed Message");
        jMenu1.add(jMenuItem1);
        jMenuItem1.addActionListener(this);
        jMenuItem2.setText("Retrieve Message");
        jMenu1.add(jMenuItem2);
        jMenuItem2.addActionListener(this);
        jMenuItem3.setText("Embed File");
        jMenu1.add(jMenuItem3);
        jMenuItem3.addActionListener(this);
        jMenuItem4.setText("Retrieve File");
        jMenu1.add(jMenuItem4);
        jMenuItem4.addActionListener(this);
        jMenuItem5.setText("Exit");
        jMenu1.add(jMenuItem5);
        jMenuItem5.addActionListener(this);
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem6.setText("Help");
        jMenu2.add(jMenuItem6);
        jMenuItem6.addActionListener(this);
        jMenuBar1.add(jMenu2);

        mainFrame.setJMenuBar(jMenuBar1);

        mainFrame.pack();
		//Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
		mainFrame.setSize(900, 700);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	}
	 
	// Listener methods
	public void actionPerformed(ActionEvent e)
	{
		Object source= e.getSource();

		// Embed message operation
		if(source== jButton1 || source==  jMenuItem1)
		{
			back= new BackEndHandler(this, BackEndHandler.EMBED_MESSAGE);
			back.start();
		}

		// Retrieve message operation
		if(source== jButton2 || source== jMenuItem2)
		{
			back= new BackEndHandler(this, BackEndHandler.RETRIEVE_MESSAGE);
			back.start();
		}

		// Embed file operation
		if(source== jButton3 || source== jMenuItem3 )
		{
			back= new BackEndHandler(this, BackEndHandler.EMBED_FILE);
			back.start();
		}

		// Retrieve file operation
		if(source== jButton4 || source== jMenuItem4)
		{
			back= new BackEndHandler(this, BackEndHandler.RETRIEVE_FILE);
			back.start();
		}

		// Modify Master file operation
		/*if(source== mnuModifyMaster)
		{
			back= new BackEndHandler(this, BackEndHandler.EDIT_MASTER);
			back.start();
		} */

		if(source== jButton5 || source==jMenuItem6)
			Steganograph.showHelpDialog();

		//if(source== mnuAbout || source== btnAbout)
		//	Steganograph.showAboutDialog();

		if(source== jMenuItem5)
		{
			int result= JOptionPane.showConfirmDialog(mainFrame, "Are you sure that you want to close Steganograph.", "Confirm Exit", JOptionPane.YES_NO_OPTION);
			if(result== JOptionPane.YES_OPTION)
			{
				
				System.exit(0);
			}
		}
	}

	// Main method
	public static void main(String args[])
	{
		new MainClient();
	}
}