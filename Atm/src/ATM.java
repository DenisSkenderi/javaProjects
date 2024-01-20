
public class ATM {

	public static void main(String[] args) {
		A obj = new A();
		if(obj.isPinValid("1234")) {
		obj.depozit(5000);
		System.out.print("\n");
		obj.tregoBalance();
		System.out.print("\n");
		obj.terheq(100);
		obj.tregoBalance();

		}else {
			System.out.println("Pini eshte gabim");
		}
	}
}
class A{
	double balance;
	String PIN = "1234";
	
	public void tregoBalance() {
		System.out.println("Ne llogarin tuaj keni " + balance + "EUR");
	}
	
	public void depozit(double shuma) {
		if(shuma < 0) {
			System.out.println("Vlera eshte jo valide");
		}else if(shuma > 10000) {
			System.out.println("Nuk mund te depozitoni ,e shume se 10000 EUR");
		}else {
			balance = balance + shuma;
		}
	}
	
	public void terheq(double shuma) {
		if(shuma < 0) {
			System.out.println("Shuma jo valide");
			return;
		}
		if(shuma > 2000) {
			System.out.println("Nuk mund te terhiqni me shume se 2000 EUR");
			return;
		}
		if(shuma > balance) {
			System.out.println("Nuk keni fonde te mjaftushme");
		}else {
			balance = balance - shuma;
		}
	}
	public boolean isPinValid(String pin) {
		if(PIN.equals(pin)) {
			return true;
		}
		return false;
	}
}