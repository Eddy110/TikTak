/**
 * @(#)Step1.java
 *
 *
 * @author 
 * @version 1.00 2019/1/31
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.*;
   
 public class Step1 extends JFrame {
	private JButton obenr;
	private JButton obenm;
	private JButton obenl;
	private JButton mittel;
	private JButton mittem;
	private JButton mitter;
	private JButton untenl;
	private JButton untenm;
	private JButton untenr;
	private JButton auswert;
	private JLabel labinfo;
	private JLabel lab1;
	private JPanel AF;
	int spieler=1;
	int horizontx=0;
	int horizonto=0;
	int vertikalx=0;
	int vertikalo=0;
	int diagonalx1=0;
	int diagonalx2=0;
	int diagonalo1=0;
	int diagonalo2=0;
	String ex = "X";
	String ox = "O";
	String erg[][]={{"-","-","-"},
					{"-","-","-"},
					{"-","-","-"}};
	
	
	
    public Step1() {
    	System.out.println("png");
    	initComponents();
    	
    }
    public void initComponents(){
    	obenr =new JButton(" ");
    	obenm =new JButton(" ");
    	obenl =new JButton(" ");
    	mitter =new JButton(" ");
    	mittem =new JButton(" ");
    	mittel =new JButton(" ");
    	untenr =new JButton(" ");
    	untenm =new JButton(" ");
    	untenl =new JButton(" ");
    	auswert =new JButton("Neu");
    	lab1=new JLabel(); 
    	this.AF =new JPanel();
    	AF.setBackground (new Color(102, 0, 102));
    	lab1.setBackground (new Color(255, 0, 255));
    	lab1.setForeground (new Color(255, 0, 255));
    	obenr.setBackground (new Color(229, 204, 255));
    	obenm.setBackground (new Color(229, 204, 255));
    	obenl.setBackground (new Color(229, 204, 255));
    	mitter.setBackground (new Color(229, 204, 255));
    	mittem.setBackground (new Color(229, 204, 255));
    	mittel.setBackground (new Color(229, 204, 255));
    	untenr.setBackground (new Color(229, 204, 255));
    	untenm.setBackground (new Color(229, 204, 255));
    	untenl.setBackground (new Color(229, 204, 255));
    	auswert.setBackground (new Color(178, 102, 255));
    	this.setLayout(null);
    	this.AF.setLayout(null);
    	
    	
    	this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	this.setSize(400,400);
    	this.setResizable(false);
    	this.setVisible(true);
    	
   		this.add(AF);
   		this.AF.setBounds(0,0,400,400);
   		
   		this.AF.add(obenl);
   		this.obenl.setBounds(30,100,70,70);
   		
   		this.AF.add(obenm);
   		this.obenm.setBounds(100,100,70,70);
   		
   		this.AF.add(obenr);
   		this.obenr.setBounds(170,100,70,70);
   		
   		this.AF.add(mittel);
   		this.mittel.setBounds(30,170,70,70);
   		
   		this.AF.add(mittem);
   		this.mittem.setBounds(100,170,70,70);
   		
   		this.AF.add(mitter);
   		this.mitter.setBounds(170,170,70,70);
   		
   		this.AF.add(untenl);
   		this.untenl.setBounds(30,240,70,70);
   		
   		this.AF.add(untenm);
   		this.untenm.setBounds(100,240,70,70);
   		
   		this.AF.add(untenr);
   		this.untenr.setBounds(170,240,70,70);
   		
   		this.AF.add(auswert);
   		this.auswert.setBounds(260,100,70,210);
   		
   		this.AF.add(lab1);
   		this.lab1.setBounds(30,30,100,30);
   		this.lab1.setText("Tik Tak Toe");

   		
   		
   		
   		this.obenl.addActionListener(new meinListener());
   		this.obenm.addActionListener(new meinListener());
   		this.obenr.addActionListener(new meinListener());
   		this.mittel.addActionListener(new meinListener());
   		this.mittem.addActionListener(new meinListener());
   		this.mitter.addActionListener(new meinListener());
   		this.untenl.addActionListener(new meinListener());
    	this.untenm.addActionListener(new meinListener());
    	this.untenr.addActionListener(new meinListener());
    	this.auswert.addActionListener(new meinListener());
    	
    	
    }
    class meinListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==auswert){
				dispose();
				new Step1();
			}
			
			if((spieler==1)||(spieler==3)||(spieler==5)||(spieler==7)||(spieler==9)){
				if(e.getSource()== obenl){
					obenl.setText("X");
					obenl.setEnabled(false);
					erg[0][0]="X";
					pRuefe();
					spieler++;
					
				}
				if(e.getSource()== obenm){
					obenm.setText("X");
					obenm.setEnabled(false);
					erg[0][1]="X";
					pRuefe();
					spieler++;
					
				}
				if(e.getSource()== obenr){
					obenr.setText("X");
					obenr.setEnabled(false);
					erg[0][2]="X";
					pRuefe();
					spieler++;
					
				}
				if(e.getSource()== mittel){
					mittel.setText("X");
					mittel.setEnabled(false);
					erg[1][0]="X";
					pRuefe();
					spieler++;
					
				}
				if(e.getSource()== mittem){
					mittem.setText("X");
					mittem.setEnabled(false);
					erg[1][1]="X";
					pRuefe();
					spieler++;
					
				}
				if(e.getSource()== mitter){
					mitter.setText("X");
					mitter.setEnabled(false);
					erg[1][2]="X";
					pRuefe();
					spieler++;
					
				}
				if(e.getSource()== untenl){
					untenl.setText("X");
					untenl.setEnabled(false);
					erg[2][0]="X";
					pRuefe();
					spieler++;
					
				}
				if(e.getSource()== untenm){
					untenm.setText("X");
					untenm.setEnabled(false);
					erg[2][1]="X";
					pRuefe();
					spieler++;
					
					
				}
				if(e.getSource()== untenr){
					untenr.setText("X");
					untenr.setEnabled(false);
					erg[2][2]="X";
					pRuefe();
					spieler++;
					
				}
			}
			else{
				if(e.getSource()== obenl){
					obenl.setText("O");
					obenl.setEnabled(false);
					erg[0][0]="O";
					pRuefe();
					spieler++;
													
				}
				if(e.getSource()== obenm){
					obenm.setText("O");
					obenm.setEnabled(false);
					erg[0][1]="O";
					pRuefe();
					spieler++;
					
				}
					if(e.getSource()== obenr){
					obenr.setText("O");
					obenr.setEnabled(false);
					erg[0][2]="O";
					pRuefe();
					spieler++;
					
				}
					if(e.getSource()== mittel){
					mittel.setText("O");
					mittel.setEnabled(false);
					erg[1][0]="O";
					pRuefe();
					spieler++;
					
				}
					if(e.getSource()== mittem){
					mittem.setText("O");
					mittem.setEnabled(false);
					erg[1][1]="O";
					pRuefe();
					spieler++;
					
				}
					if(e.getSource()== mitter){
					mitter.setText("O");
					mitter.setEnabled(false);
					erg[1][2]="O";
					pRuefe();
					spieler++;
					
				}
					if(e.getSource()== untenl){
					untenl.setText("O");
					untenl.setEnabled(false);
					erg[2][0]="O";
					pRuefe();
					spieler++;
					
				}
					if(e.getSource()== untenm){
					untenm.setText("O");
					untenm.setEnabled(false);
					erg[2][1]="O";
					pRuefe();
					spieler++;
					
				}
					if(e.getSource()== untenr){
					untenr.setText("O");
					untenr.setEnabled(false);
					erg[2][2]="O";
					pRuefe();
					spieler++;
					
				}
			}
		
	}
    }
    public  void pRuefe(){
    	for(int i=0;i<erg.length;i++){
    		for(int j=0;j<erg[i].length;j++){
    			System.out.print(erg[i][j]);
    		}
    		System.out.println();
    	}
    	boolean x=false;
    	boolean o=false;
    	boolean k=false;
    	pruefeHorizont();
    	pruefeVertikal();
    	pruefeDiagonallinks();
    	pruefeDiagonalrechts();
    	if((horizontx==3)||(vertikalx==3)||(diagonalx1==3)||(diagonalx2==3)){
    		JOptionPane.showMessageDialog(null,
                                              "X hat gewonnen!",
                                              "Gewonnen",					      
					      JOptionPane.WARNING_MESSAGE);
			horizontx=0;
			vertikalx=0;
			diagonalx1=0;
			diagonalx2=0;			      
    	}
    	if((horizonto==3)||(vertikalo==3)||(diagonalo1==3)||(diagonalo2==3)){
    		JOptionPane.showMessageDialog(null,
                                              "O hat gewonnen!",
                                              "Gewonnen",					      
					      JOptionPane.WARNING_MESSAGE);
			horizonto=0;
			vertikalo=0;
			diagonalo1=0;
			diagonalo2=0;
    	}
    	
    }
    public int pruefeHorizont (){
    	for(int i=0;i<erg.length;i++){
    		for(int j=0;j<erg[i].length;j++){
    			if(ex.equals(erg[i][j])){
    				horizontx++;
    				System.out.println("horizontx = "+ horizontx);
    				if(horizontx==3){
    					return horizontx;
    				}
    			}else{
    				horizontx = 0;
    			}
    			if(ox.equals(erg[i][j])){
    				horizonto++;
    				System.out.println("horizonto = "+ horizonto);
    				if(horizonto==3){
    					return horizonto;
    				}
    			}else{
    				horizonto = 0;
    			}
    		}
    		horizontx = 0;	
    			horizonto = 0;
    	}
    	return 0;	
    }
    public int pruefeVertikal(){
    	for(int i=0;i<erg.length;i++){
    		for(int j=0;j<erg[i].length;j++){
    			if(ex.equals(erg[j][i])){
    				
    				vertikalx++;
    				System.out.println("vertikalx = "+ vertikalx);
    				if(vertikalx==3){
    					return vertikalx;
    				}
    			}else{
    				vertikalx=0;
    			}
    			if(ox.equals(erg[j][i])){
    				vertikalo++;
    				System.out.println("vertikalo = "+ vertikalo);
    				if(vertikalo==3){
    					return vertikalo;
    				}
    			}else{
    				vertikalo=0;
    			}
    			
    			
    		}
    		vertikalo=0;
    		vertikalx=0;
    	}
    	return vertikalo;	
    	}
    	public int pruefeDiagonallinks(){
    		for(int i=0;i<erg.length;i++){
    			if(ex.equals(erg[i][i])){
    				diagonalx1++;
    				System.out.println("daigonalx1 =" +diagonalx1);
    				if(diagonalx1==3){
    					return diagonalx1;
    				}	
    			}else{
    				diagonalx1=0;
    			}
    			if(ox.equals(erg[i][i])){
    				diagonalo1++;
    				System.out.println("daigonalo1 =" +diagonalo1);
    				if(diagonalo1==3){
    					return diagonalo1;
    				}
    			}else{
    				diagonalo1=0;
    			}
    			
    			
    		}
    		return diagonalx1=0;	
    	}
    	public int pruefeDiagonalrechts(){
    		int j=0;
    		for(int i=erg.length-1;i>=0;i--){
    			if(ex.equals(erg[i][j])){
    				diagonalx2++;
    				System.out.println("daigonalx2 =" +diagonalx2);
    				if(diagonalx2==3){
    					return diagonalx2;
    				}
    			}else{
    				diagonalx2=0;
    			}
    			if(ox.equals(erg[i][j])){
    				diagonalo2++;
    				System.out.println("daigonalo2 =" +diagonalo2);
    				if(diagonalo2==3){
    					return diagonalo2;
    				}
    			}else{
    				diagonalo2=0;
    			}
    			j++;
    			
    		}
    		return diagonalx2;
    	}
    }
    
    
