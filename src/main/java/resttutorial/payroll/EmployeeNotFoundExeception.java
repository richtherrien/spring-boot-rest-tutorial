package resttutorial.payroll;

class EmployeeNotFoundException extends RuntimeException {

  /**
	 * 
	 */
	private static final long serialVersionUID = -4205093154196821154L;

	EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	}
}