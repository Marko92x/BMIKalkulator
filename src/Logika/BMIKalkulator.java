package Logika;

import java.text.DecimalFormat;

public class BMIKalkulator {
	
	public double bmi(double tezina, double visina){
		double bmi = (tezina)/((visina/100)*(visina/100));
		return bmi;
	}
	
	public String ispisi(double bmi){
		DecimalFormat d = new DecimalFormat("#.##");
	    String b = d.format(bmi);
		if (bmi < 18.5){
			return "Vi ste neuhranjeni, bmi vam iznosi " + b;
		}else if (18.5 <= bmi && bmi <= 24.9){
			return "Vasa masa je idealna, bmi vam iznosi " + b;
		}else if (24.9 <= bmi && bmi <= 29.9){
			return "Vasa masa je prekomerna, bmi vam iznosi " + b;
		}else if (29.9 <= bmi && bmi <= 34.9){
			return "Vi ste blago gojazni, bmi vam iznosi " + b;
		}else if (34.9 <= bmi && bmi <= 39.9){
			return "Vi ste tesko gojazni, bmi vam iznosi " + b;
		}else{
			return "Vi ste ekstremno gojazni, bmi vam iznosi " +b;
		}
	}
}
