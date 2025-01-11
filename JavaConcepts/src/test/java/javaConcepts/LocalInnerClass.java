package javaConcepts;


/* Local Inner Class should be defined inside the method of outer class
 * scope is limited to the outer class method
 * Object is created before the method ends
 * In Main class -> Create Outer Class Object -> access the outer-class method 
 * once method is called -> control goes to outer-class method  
 * then control goes to the object of local inner class 
 * it calls the method of local inner class and the scope ends */

class LocalInnerClass {
    void calculateLoanInterest(String customerType) {
        class LoanInterest {
            void displayInterestRate() {
                if (customerType.equals("Regular")) {
                    System.out.println("Interest rate: 7%");
                } else {
                    System.out.println("Interest rate: 5%");
                }
            }
        }
        LoanInterest loanInterest = new LoanInterest();
        loanInterest.displayInterestRate();
    }

    public static void main(String[] args) {
        LocalInnerClass bank = new LocalInnerClass();
        bank.calculateLoanInterest("Premium");
    }
}
