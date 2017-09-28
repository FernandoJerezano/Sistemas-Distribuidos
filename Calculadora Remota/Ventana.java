import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class Ventana extends JFrame{
	
	CalculoRemoto cr;

	JPanel panel;
	JLabel etiquetaCuadrado;
	JTextField textoCuadrado;
	JButton botonCuadrado;
	
	JLabel etiquetaPotencia,etiquetaPotenciaA,etiquetaPotenciaB;
	JTextField textoPotenciaA,textoPotenciaB;
	JButton botonPotencia;
	
	JLabel resultado;
	JTextField textoResultado;
	
	Ventana(){
		try{
			cr = new CalculoRemoto();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		init();
	}
	
	public void init(){
		
		panel = new JPanel();
		
		etiquetaCuadrado = new JLabel("Cuadrado: ");
		textoCuadrado = new JTextField(10);
		botonCuadrado = new JButton("Cuadrado");
		
		panel.add(etiquetaCuadrado);
		panel.add(textoCuadrado);
		panel.add(botonCuadrado);
		
		etiquetaPotencia = new JLabel("Potencia: ");
		etiquetaPotenciaA = new JLabel("A: ");
		etiquetaPotenciaB = new JLabel("B: ");
		textoPotenciaA = new JTextField(5);
		textoPotenciaB = new JTextField(5);
		botonPotencia = new JButton("Potencia");
		
		panel.add(etiquetaPotencia);
		panel.add(etiquetaPotenciaA);
		panel.add(textoPotenciaA);
		panel.add(etiquetaPotenciaB);
		panel.add(textoPotenciaB);
		panel.add(botonPotencia);
		
		resultado = new JLabel("Resultado");
		textoResultado = new JTextField(10);
		panel.add(resultado);
		panel.add(textoResultado);
		
		// Cuadrado
		botonCuadrado.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					String s;
					int r;
					s = textoCuadrado.getText();
					r = cr.calculaCuadrado(s);
					textoResultado.setText(r+"");
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		
		// Potencia
		botonPotencia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					String a,b;
					int r;
					a = textoPotenciaA.getText();
					b = textoPotenciaB.getText();
					r = cr.calculaPotencia(a,b);
					textoResultado.setText(r+"");
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		
				
		this.add(panel);
		this.setDefaultCloseOperation(3);
		this.setSize(360,100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);		
	}
	public static void main(String[]args)throws Exception{
		
		new Ventana();
		
	}
	
	
	
}
