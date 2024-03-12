package metoder;

public class Konto {

	static double ränta =5.0;   // klassvariabel
	
	double saldo =1000;         // instansvariabel
	
	public Konto(int amount) {
		
		saldo+=amount;
		
	}
	
	
	public void deposit(int amount) {
		
		saldo+=amount;
		
	}
	public void withdraw(int amount) {
		
		saldo-=amount;
		
	}
	public double getSaldo() {
		
		return saldo;
	}
	public static void changeIntrest(int nyRänta) {
		
		ränta=nyRänta;
		
	}
	public void setIntrest() {
		
		    saldo*=((ränta*0.01)+1);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Konto[] kund=new Konto[3];
		
		
		kund[0] = new Konto(-1000);
		
		Konto.changeIntrest(6);
		
		
		
		System.out.println(kund[0].getSaldo());
		
		kund[1] = new Konto(1);
		
		System.out.println(kund[1].getSaldo());
		
		kund[0].deposit(500);
		System.out.println(kund[0].getSaldo());
		
		
		System.out.println(kund[0].getSaldo());
		
		
		for (int i = 0; i < kund.length; i++) {

			kund[i].setIntrest();
			
		}
		
		
	}
	
	
	
	
	
}
