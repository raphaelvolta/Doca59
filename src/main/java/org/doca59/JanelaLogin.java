package org.doca59;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JanelaLogin {
	Color backgroundColor = Color.BLACK;
	JFrame jFrame = new JFrame("Doca59 - Agendamento");
	
	public JanelaLogin() {
		CustomFileLoader customFileLoader = new CustomFileLoader();
		Font sizedFont = customFileLoader.loadFont("PRODUCT_SANS_REGULAR.TTF").deriveFont(14f);				
		JLabel loginLogo = customFileLoader.loadImage("logo.png", 220, 220);
		loginLogo.setBounds(15, 125, 220, 220);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setFont(sizedFont);
		loginLabel.setBounds(20, 350, 80, 40);
		
		JTextField loginTextField = new RoundField();
		loginTextField.setFont(sizedFont);
		loginTextField.setBounds(10, 380, 230, 30);
		loginTextField.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(sizedFont);
		senhaLabel.setBounds(20, 450, 80, 40);
		
		JPasswordField senhaTextField = new RoundPassword();
		senhaTextField.setFont(sizedFont);
		senhaTextField.setBounds(10, 480, 230, 30);
		senhaTextField.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel esqueceuSenha = new JLabel("Esqueci minha senha...");
		esqueceuSenha.setFont(sizedFont);
		esqueceuSenha.setBounds(20, 530, 150, 40);
		
		JButton entrar = new JButton();
		
				
		JPanel jPanel = new JPanel();
		jPanel.setBounds(375, 0, 250, 671);		
		jPanel.setBackground(backgroundColor);
		jPanel.setLayout(null);

		jPanel.add(loginLogo);
		jPanel.add(loginLabel);
		jPanel.add(loginTextField);
		jPanel.add(senhaLabel);
		jPanel.add(senhaTextField);
		jPanel.add(esqueceuSenha);
		
		this.jFrame.setVisible(true);
		this.jFrame.setSize(1000, 700);
		this.jFrame.getContentPane().setLayout(null);
		this.jFrame.getContentPane().setBackground(backgroundColor);
		this.jFrame.setBackground(backgroundColor);
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jFrame.setResizable(false);
		this.jFrame.getContentPane().add(jPanel);
	}

}
