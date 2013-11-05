package test;

import java.util.ArrayList;

public class Mastermind {
	private int maxV= 0, aktV = 0;
	private ArrayList<Row> r;
	private Row  erg;
	
	public Mastermind(int anzahl){
		this.maxV = anzahl;
		this.aktV = 0;
		erg = new Row();
		r = new ArrayList<Row>();
		genErg();
	}
	private void genErg(){
		for(int i = 0; i < 4;i++){
			int i1 = (int) (Math.random()*6+1);
			switch(i){
			case 1:erg.setFeld1(i1);break;
			case 2:erg.setFeld2(i1);break;
			case 3:erg.setFeld3(i1);break;
			case 4:erg.setFeld4(i1);break;
			}
		}
	}
	public boolean checkwin(){
		for(int i = 0; i < r.size();i++){
			if(erg.win(r.get(i))){
				return true;
			}
		}
		return false;
	}
	public String getErg(int i){
		return erg.comp(r.get(i));
	}
	public Row getRow(int i){
		return r.get(i);
	}
}