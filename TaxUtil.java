package task1;

/* public class TaxUtil {
	   double rate = 0.15;

	   public double calculateTax(double amount) {
	       return amount * rate;
	   }
} */ //NOT A PURE FUNCTION. Reason: It uses a non-final instance variable (rate). 

// CONVERTED PURE FUNCTION
public class TaxUtil {
	   public double calculateTax(double amount, double rate) {
	       return amount * rate;
	   }
}
