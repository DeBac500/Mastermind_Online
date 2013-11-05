package test;

import java.sql.SQLException;
import java.util.ArrayList;

public class Row {
	private String feld1, feld2, feld3, feld4;
	
	public Row(){
		feld1 = null;
		feld2 = null;
		feld3 = null;
		feld4 = null;
	}
	
	public Row(String feld1, String feld2, String feld3, String feld4){
		this.feld1 = feld1;
		this.feld2 = feld2;
		this.feld3 = feld3;
		this.feld4 = feld4;
	}

	public String getFeld1() {
		return feld1;
	}

	public void setFeld1(String feld1) {
		this.feld1 = feld1;
	}

	public String getFeld2() {
		return feld2;
	}

	public void setFeld2(String feld2) {
		this.feld2 = feld2;
	}

	public String getFeld3() {
		return feld3;
	}

	public void setFeld3(String feld3) {
		this.feld3 = feld3;
	}

	public String getFeld4() {
		return feld4;
	}

	public void setFeld4(String feld4) {
		this.feld4 = feld4;
	}
	
	public void setFeld1(int i){
		switch(i){
		case 1:
			setFeld1("blau");break;
		case 2:
			setFeld1("gelb");break;
		case 3:
			setFeld1("green");break;
		case 4:
			setFeld1("lila");break;
		case 5:
			setFeld1("orange");break;
		case 6:
			setFeld1("rot");break;
		}
	}
	public void setFeld2(int i){
		switch(i){
		case 1:
			setFeld2("blau");break;
		case 2:
			setFeld2("gelb");break;
		case 3:
			setFeld2("green");break;
		case 4:
			setFeld2("lila");break;
		case 5:
			setFeld2("orange");break;
		case 6:
			setFeld2("rot");break;
		}
	}
	public void setFeld3(int i){
		switch(i){
		case 1:
			setFeld3("blau");break;
		case 2:
			setFeld3("gelb");break;
		case 3:
			setFeld3("green");break;
		case 4:
			setFeld3("lila");break;
		case 5:
			setFeld3("orange");break;
		case 6:
			setFeld3("rot");break;
		}
	}
	public void setFeld4(int i){
		switch(i){
		case 1:
			setFeld4("blau");break;
		case 2:
			setFeld4("gelb");break;
		case 3:
			setFeld4("green");break;
		case 4:
			setFeld4("lila");break;
		case 5:
			setFeld4("orange");break;
		case 6:
			setFeld4("rot");break;
		}
	}
	public String comp(Row r){
		ArrayList<Boolean> b = new ArrayList<Boolean>();
		b.add(this.feld1.equals(r.getFeld1()));
		b.add(this.feld2.equals(r.getFeld2()));
		b.add(this.feld3.equals(r.getFeld3()));
		b.add(this.feld4.equals(r.getFeld4()));
		
		b.add(this.feld1.equals(r.getFeld2()));
		b.add(this.feld1.equals(r.getFeld3()));
		b.add(this.feld1.equals(r.getFeld4()));
		
		b.add(this.feld2.equals(r.getFeld1()));
		b.add(this.feld2.equals(r.getFeld3()));
		b.add(this.feld2.equals(r.getFeld4()));
		
		b.add(this.feld3.equals(r.getFeld1()));
		b.add(this.feld3.equals(r.getFeld2()));
		b.add(this.feld3.equals(r.getFeld4()));
		
		b.add(this.feld4.equals(r.getFeld1()));
		b.add(this.feld4.equals(r.getFeld2()));
		b.add(this.feld4.equals(r.getFeld3()));
		
		int farben = 0, posi = 0;
		for(int i= 0;i < b.size();i++){
			if(b.get(i)){
				if(i < 4)
					posi ++;
				farben ++;
			}
		}
		return "Richtige Farben: " + farben + " | Richtige Position: " + posi;
	}
	public boolean win(Row r){
		return this.feld1.equals(r.getFeld1()) &&
				this.feld2.equals(r.getFeld2()) &&
				this.feld3.equals(r.getFeld3()) &&
				this.feld4.equals(r.getFeld4());
	}
}
