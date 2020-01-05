package resttutorial.payroll;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2482260996921544426L;

	OrderNotFoundException(Long id) {
    super("Could not find employee " + id);
  }

}
