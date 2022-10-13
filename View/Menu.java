package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Menu extends JFrame {
	private JLabel lbTitulo;
	private JPanel  panelTitulo;
	private JButton BtCadastroFunc, BtOperacoes, BtEmprestar, BtDevolver,
	BtPesquisar, BtConsultar;
	private ImageIcon imgEmprestar, imgDevolver, imgPesquisar, imgVisualizar; 
	
	public Menu(){
		super("Sistema da Biblioteca");
	
		//instancia
		panelTitulo = new JPanel();
		imgPesquisar = new ImageIcon (getClass().getResource("pesquisar.png"));
		imgEmprestar = new ImageIcon (getClass().getResource("Emprestar.png"));
		imgDevolver = new ImageIcon (getClass().getResource("devolver.png"));
		imgVisualizar = new ImageIcon (getClass().getResource("visualizar.png"));
		
		//configurações do container
		Container cont = getContentPane();
	    cont.setBackground(new Color(0, 0, 0));
		setVisible(true);
		setSize(1000, 880);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cont.add(panelTitulo);
		
		configPanelTitulo();
		configBotoes();
		
		//gustavo lima e vc tcherethetche
	}
	
	public void configPanelTitulo(){
		//configurando no painel
		panelTitulo.setLayout(null);
		panelTitulo.setVisible(true);
		
		//instancia
		lbTitulo = new JLabel ("Sistema da Biblioteca Paula Tejano");
		BtCadastroFunc = new JButton ("Cadastro");
		BtOperacoes = new JButton ("Operações");
		
		//fonte
		lbTitulo.setFont(new Font("Helvética", Font.BOLD, 35));
		BtCadastroFunc.setFont( new Font("Helvética", Font.BOLD, 15)); 
		BtOperacoes.setFont(new Font("Helvética", Font.BOLD, 15)); 
		
		//cor
		lbTitulo.setForeground(new Color(66, 201, 32));
		panelTitulo.setBackground(new Color(44, 44, 46));
		BtOperacoes.setBackground(new Color (66, 201, 32));
		BtOperacoes.setBorder(new LineBorder(new Color(66, 201, 32)));
		BtCadastroFunc.setBackground(new Color (66, 201, 32));
		BtCadastroFunc.setBorder(new LineBorder(new Color(66, 201, 32)));
		
		//configurando botao
				BtOperacoes.setFocusable(false);
				BtCadastroFunc.setFocusable(false);
				
		//dimensao e posicionamento
		panelTitulo.setBounds(15, 20, 960, 120);
		lbTitulo.setBounds(180, 25, 600, 40);
		BtOperacoes.setBounds(10, 80, 120, 30);
		BtCadastroFunc.setBounds(145, 80, 120, 30);
		
		//adicionando
		panelTitulo.add(lbTitulo);
		panelTitulo.add(BtOperacoes);
		panelTitulo.add(BtCadastroFunc);
	}
	
	public void configBotoes(){
		//instancia
		BtEmprestar = new JButton (imgEmprestar);
		BtDevolver = new JButton (imgDevolver);
		BtPesquisar = new JButton (imgPesquisar);
		BtConsultar = new JButton (imgVisualizar);
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Menu();
	}

}
