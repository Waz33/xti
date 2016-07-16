package xti.heranca;

public class Quadrado implements AreaCalculavel {
	double area;
	
	public Quadrado(double area){
		this.area = area;
	}
	
	public double calculaArea(){
		return area*area;
	}
	
}
