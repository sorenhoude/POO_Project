/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author grand
 */
public class Game {
    
    private JFrame window;
    private Container container;
    private JPanel titleNamePanel, startButtonPanel, mainTextPanel, textPanel;
    private JLabel titleName;
    private JButton startButton;
    private JTextArea mainTextArea;
    private JTextField text;
    private final Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    private final Font regularFont = new Font("Times New Roman", Font.PLAIN, 30);
    
    public Game(){
        this.window = new JFrame();
        this.window.setSize(800, 600);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.getContentPane().setBackground(Color.black);
        this.window.setLayout(null);
        this.container = this.window.getContentPane();
        this.window.setLocationRelativeTo(null);
        
        this.titleNamePanel = new JPanel();
        this.titleNamePanel.setBounds(100, 100, 600, 150);
        this.titleNamePanel.setBackground(Color.black);
        this.titleName = new JLabel("COOL GAME");
        this.titleName.setForeground(Color.white);
        titleName.setFont(titleFont);
        
        this.startButtonPanel = new JPanel();
        this.startButtonPanel.setBounds(300, 400, 200, 100);
        this.startButtonPanel.setBackground(Color.black);
        
        this.startButton = new JButton("START");
        this.startButton.setBackground(Color.black);
        this.startButton.setForeground(Color.white);
        this.startButton.setFont(regularFont);
        this.startButton.addActionListener((e)-> createGameScreen());
        
        this.titleNamePanel.add(titleName);
        this.startButtonPanel.add(startButton);
        
        this.container.add(this.titleNamePanel);
        this.container.add(this.startButtonPanel);
        
        this.window.setVisible(true);
    }
    
    
    public void createGameScreen(){
        this.titleNamePanel.setVisible(false);
        this.startButtonPanel.setVisible(false);
        
        this.mainTextPanel = new JPanel();
        this.mainTextPanel.setBounds(100, 100, 600, 250);
        this.mainTextPanel.setBackground(Color.black);
        
        container.add(this.mainTextPanel);
        
        this.mainTextArea = new JTextArea("Greetings Adventurer! What's your name?");
        this.mainTextArea.setBounds(100, 100, 600, 250);
        this.mainTextArea.setBackground(Color.black);
        this.mainTextArea.setForeground(Color.white);
        this.mainTextArea.setFont(regularFont);
        this.mainTextArea.setLineWrap(true);
        this.mainTextPanel.add(this.mainTextArea);
        
        this.textPanel = new JPanel();
        this.textPanel.setBounds(100, 350, 600, 100);
        this.textPanel.setBackground(Color.black);
        this.text = new JTextField();
        this.text.setPreferredSize(new Dimension(600, 50));
        this.text.setBackground(Color.black);
        this.text.setFont(regularFont);
        this.text.setForeground(Color.white);
       // this.text.setBounds(300, 400, 300, 100);
        this.textPanel.add(this.text);
        container.add(this.textPanel);
    }
    
}
