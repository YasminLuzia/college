package tagGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Tela extends JFrame {

	protected static TelaMorador telaMorador;
	protected static TelaConvidado telaConvidado;
	protected static TelaInicio telaInicio;
	private static Tela janela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					janela = new Tela();
					
					janela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela() {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 350);
	
		telaMorador = new TelaMorador();
		telaConvidado = new TelaConvidado();
		telaInicio = new TelaInicio();
		
		telaMorador.setBorder(new EmptyBorder(5, 5, 5, 5));
		telaConvidado.setBorder(new EmptyBorder(5, 5, 5, 5));
		telaInicio.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		telaMorador.setLayout(new BorderLayout(0, 0));
		telaConvidado.setLayout(new BorderLayout(0, 0));
		telaInicio.setLayout(new BorderLayout(0, 0));
		
		telaMorador.setLocation(0, 0);
		telaConvidado.setLocation(0, 0);
		telaInicio.setLocation(0, 0);
		
		telaMorador.setSize(450, 300);
		telaConvidado.setSize(450, 300);
		telaInicio.setSize(450, 300);
		
		this.getContentPane().add(telaMorador);
		this.getContentPane().add(telaConvidado);
		
		telaMorador.setVisible(false);
		telaConvidado.setVisible(false);
		this.getContentPane().add(telaInicio);
		telaInicio.setVisible(true);
	}

}
