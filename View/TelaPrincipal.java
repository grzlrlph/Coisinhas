package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TelaPrincipal extends JFrame {
	private JPanel panelTitulo, panelDadosFunc, panelDadosLivro, panelTable;
	private JTable tabela;
	private String [] colunas = {"N° Exemplar", "Nome", "Editora", "Ano"};
	private static Object [][] dados = {{"N° Exemplar", "Nome", "Editora", "Ano"}};
	private JLabel lbTitulo, lbAdvocacia, lbEmprestar, lbData, 
	lbDadosFuncTitulo, lbMatricula, lbOAB, lbNomeFunc, 
	lbDadosLivroTitulo, lbNumeroExemplarLivro;
	private JButton btPesquisar, btSalvar, btPesquisarFunc, btLimparAreaFunc;
	private JTextField TCodLivro, TMatricula, TOAB, TNome;
	private ImageIcon imgPesquisar, imgLimpar, imgSalvar;
	
	public TelaPrincipal(){
		//inicialização  dos paineis 
		panelTitulo = new JPanel();
		panelDadosFunc = new JPanel();
		panelDadosLivro = new JPanel();
		panelTable = new JPanel();
		
		
		//configurações do container
				Container cont = getContentPane();
			    cont.setBackground(new Color(0, 0, 0));
				setVisible(true);
				setSize(1000, 880);
				setLayout(null);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//configuraçao do label "Dados do Funcionário"
		lbDadosFuncTitulo = new JLabel ("Dados do Funcionário");
		cont.add(lbDadosFuncTitulo);	
		lbDadosFuncTitulo.setFont(new Font("Helvética", Font.BOLD, 25)); 
		lbDadosFuncTitulo.setForeground(new Color(66, 201, 32));
		lbDadosFuncTitulo.setBounds(10, 145, 500, 30);
		
		//configuraçao do label "Dados dos Livros"
		lbDadosLivroTitulo = new JLabel ("Dados dos Livros");
		cont.add(lbDadosLivroTitulo);
		lbDadosLivroTitulo.setFont(new Font("Helvética", Font.BOLD, 25)); 
		lbDadosLivroTitulo.setForeground(new Color(66, 201, 32));
		lbDadosLivroTitulo.setBounds(10, 290, 500, 30);
		
		//configuraçao do botao salvar
		imgSalvar = new ImageIcon (getClass().getResource("Salvar.png"));
		btSalvar = new JButton (imgSalvar);
		btSalvar.setFocusable(false);
		btSalvar.setBounds(460, 660, 75, 20);
		cont.add(btSalvar);
		
		//adições dos paineis etc
		cont.add(panelTitulo);
		cont.add(panelDadosFunc);
		cont.add(panelDadosLivro);
		cont.add(panelTable);
		
		
		//métodds de configuração
		configPanelTitulo();
		configPanelDadosFunc();
		configPanelDadosLivro();
		configPanelTable();
		configBtLimparAreaFunc();
		configBtSalvar();
		}
	
	public void configPanelTitulo() {
		//inicialização
		lbTitulo = new JLabel ("Sistema para Controle de Biblioteca");
		lbAdvocacia = new JLabel ("BWS Advocacia");
		lbEmprestar = new JLabel ("Emprestar Livros");
		lbData = new JLabel ("13/10/2022    13:15");
		
		//mudando fonte e tamanho
		lbTitulo.setFont( new Font("Helvética", Font.BOLD, 35)); 
		lbAdvocacia.setFont( new Font("Helvética", Font.BOLD, 15));
		lbEmprestar.setFont( new Font("Helvética", Font.BOLD, 15));
		lbData.setFont( new Font("Helvética", Font.BOLD, 15));
		
		//redimensionamento
		panelTitulo.setLayout(null);
		panelTitulo.setBounds(10, 10, 960, 120);
		lbTitulo.setBounds(150, 35, 600, 40);
		lbAdvocacia.setBounds(10, 10, 200, 20);
		lbEmprestar.setBounds(10, 85, 200, 20);
		lbData.setBounds(800, 85, 200, 20);
		
		//mudando cores
		panelTitulo.setBackground(new Color(44, 44, 46)); //muda cor do painel
		lbTitulo.setForeground(new Color(66, 201, 32)); //muda cor da fonte
		lbAdvocacia.setForeground(new Color(66, 201, 32));
		lbEmprestar.setForeground(new Color(66, 201, 32));
		lbData.setForeground(new Color(66, 201, 32));
		
		//adições
		panelTitulo.add(lbTitulo);
		panelTitulo.add(lbAdvocacia);
		panelTitulo.add(lbEmprestar);
		panelTitulo.add(lbData);
		}
	
	public void configPanelDadosFunc() {
		// inicialização
			imgPesquisar = new ImageIcon (getClass().getResource("Pesquisar.png"));
			imgLimpar = new ImageIcon (getClass().getResource("Limpar.png"));
			lbMatricula = new JLabel ("Matrícula");
			lbOAB = new JLabel ("Número OAB");
			lbNomeFunc = new JLabel ("Nome");
			TMatricula = new JTextField();
			TOAB = new JTextField();
			TNome = new JTextField();
			btLimparAreaFunc = new JButton("Limpar");
			
			//configurações Bt Pesquisar
			btPesquisarFunc = new JButton (imgPesquisar);
			btPesquisarFunc.setFocusable(false);
			
			//configurações Bt Limpar
			btLimparAreaFunc = new JButton (imgLimpar);
			btLimparAreaFunc.setFocusable(false);
		
		//configuração do painel
				panelDadosFunc.setLayout(null);
				panelDadosFunc.setVisible(true);
				
		//Cor
				panelDadosFunc.setBackground(new Color(44, 44, 46)); 
				lbMatricula.setForeground(new Color(66, 201, 32));
				TMatricula.setBorder(new LineBorder(new Color(66, 201, 32)));
				TMatricula.setBackground(new Color(123, 121, 122)); 
				lbOAB.setForeground(new Color(66, 201, 32));
				TOAB.setBorder(new LineBorder(new Color(66, 201, 32)));
				TOAB.setBackground(new Color(123, 121, 122)); 
				lbNomeFunc.setForeground(new Color(66, 201, 32));
				TNome.setBorder(new LineBorder(new Color(66, 201, 32)));
				TNome.setBackground(new Color(123, 121, 122)); 
				
		//Redimensionamento
				panelDadosFunc.setBounds(10, 190, 960, 80);
				lbMatricula.setBounds(10, -25, 100, 100);
				TMatricula.setBounds(10, 40, 150, 20);
				btPesquisarFunc.setBounds(165, 40, 75, 20);
				lbOAB.setBounds(350, -25, 100, 100);
				TOAB.setBounds(350, 40, 150, 20);
				lbNomeFunc.setBounds(650, -25, 100, 100);
				TNome.setBounds(650, 40, 150, 20);
				btLimparAreaFunc.setBounds (805, 40, 75, 20);
		
		//Fonte
			lbMatricula.setFont(new Font("Helvética", Font.BOLD, 15));
			lbOAB.setFont(new Font("Helvética", Font.BOLD, 15));
			lbNomeFunc.setFont(new Font("Helvética", Font.BOLD, 15));
			
		//adicionando no painel
			panelDadosFunc.add(lbMatricula);
			panelDadosFunc.add(TMatricula);
			panelDadosFunc.add(btPesquisarFunc);
			panelDadosFunc.add(lbOAB);
			panelDadosFunc.add(TOAB);
			panelDadosFunc.add(lbNomeFunc);
			panelDadosFunc.add(TNome);
			panelDadosFunc.add(btLimparAreaFunc);
		}
	
	public void configBtLimparAreaFunc() {
		btLimparAreaFunc.addActionListener (new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TMatricula.setText("");
				TOAB.setText("");
				TNome.setText("");
				}	
		});
	}
	
	public void configPanelDadosLivro() {
		//inicializaçao
		lbNumeroExemplarLivro = new JLabel ("N° Exemplar");
		TCodLivro = new JTextField ();
		
		//configuração do painel
		panelDadosLivro.setLayout(null);
		panelDadosLivro.setVisible(true);
		
		//fonte
		lbNumeroExemplarLivro.setFont(new Font("Helvética", Font.BOLD, 15));
		
		//botao pesquisar
		btPesquisar = new JButton (imgPesquisar);
		btPesquisar.setFocusable(false);
		
		//set Bounds
		panelDadosLivro.setBounds(10, 335, 960, 80);
		lbNumeroExemplarLivro.setBounds(10, -25, 100, 100);
		TCodLivro.setBounds(10, 40, 150, 20);
		btPesquisar.setBounds(165, 40, 75, 20);
		
		//cor
		panelDadosLivro.setBackground(new Color(44, 44, 46)); 
		lbNumeroExemplarLivro.setForeground(new Color(66, 201, 32));
		TCodLivro.setBorder(new LineBorder(new Color(66, 201, 32)));
		TCodLivro.setBackground(new Color(123, 121, 122)); 
		
		//adições
		panelDadosLivro.add(lbNumeroExemplarLivro);
		panelDadosLivro.add(TCodLivro);
		panelDadosLivro.add(btPesquisar);
	}
	
	public void configPanelTable() {
		panelTable.setVisible(true);
		panelTable.setLayout (null);
		tabela = new JTable (dados, colunas);
		
		//set Bounds
		panelTable.setBounds(10, 420, 960, 230);
		tabela.setBounds(20, 15, 920, 200);
		
		//cor
		panelTable.setBackground(new Color(44, 44, 46)); 
		tabela.setForeground(new Color(66, 201, 32));
		tabela.setBackground(new Color(123, 121, 122)); 
		tabela.setBorder(new LineBorder(new Color(66, 201, 32)));
		
		panelTable.add(tabela);
	}
	
	public void configBtSalvar() {
		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
			
		});
	}
	public static void main(String[] args) {
		new TelaPrincipal();
	}	
}
