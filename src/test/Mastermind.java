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
		for(int i = 1; i <= 4;i++){
			int i1 = (int) (Math.random()*6+1);
			System.out.println(i1);
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
	public String getErg(Row re){
		return this.erg.comp(re);
	}
	public Row getRow(int i){
		return r.get(i);
	}
	public String addR(Row r){
		this.r.add(r);
		String s ="<tr>";
		s+="<td>";
		s+="<img src='image/" + r.getFeld1()+".png' alt='"+ r.getFeld1()+"'>";
		s+="</td>";
		s+="<td>";
		s+="<img src='image/" + r.getFeld2()+".png' alt='"+ r.getFeld2()+"'>";
		s+="</td>";
		s+="<td>";
		s+="<img src='image/" + r.getFeld3()+".png' alt='"+ r.getFeld3()+"'>";
		s+="</td>";
		s+="<td>";
		s+="<img src='image/" + r.getFeld4()+".png' alt='"+ r.getFeld4()+"'>";
		s+="</td>";
		return s;
	}
}