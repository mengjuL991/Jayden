import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BankTest {

    @Test
    public void depositToString() {
        Date currentDate = new Date();
        Deposit testDeposit = new Deposit(2000, currentDate, "Checking");
        String expectedString = "Deposit of: $2000.0 Date: " + currentDate + "into account: Checking";
        String actualString = testDeposit.toString();
        assertEquals(expectedString, actualString);

        Deposit moreDeposit = new Deposit(5000.25, currentDate, "Savings");
        expectedString = "Deposit of: $5000.25 Date: " + currentDate + "into account: Savings";
        actualString = moreDeposit.toString();
        assertEquals(expectedString, actualString);
    }

    @Test
    public void withdrawToString(){
        Date currentDate = new Date();
        Withdraw testwithdraw = new Withdraw (1000, currentDate, "Checking");
        String expectedString = "Withdrawal of: $1000.0 Date: " + currentDate + "into account: Checking";
        String actualString = testwithdraw.toString();
        assertEquals(expectedString, actualString);

        Withdraw largeWithdraw = new Withdraw (10009, currentDate, "Checking");
        expectedString = "Withdrawal of: $10009.0 Date: " + currentDate + "into account: Checking";
        actualString = largeWithdraw.toString();
        assertEquals(expectedString, actualString);
    }

    @Test
    public void CustomerDeposit(){
        Date currrentDate = new Date();
        Deposit testDeposit = new Deposit(50, currrentDate, Customer.CHECKING);

        Customer testCustomer = new Customer("Jayden", 1234, 500, 20);
        assertFalse(testCustomer.getDeposits().contains(testDeposit));
        assertEquals(500, testCustomer.getCheckBalance(), 0.0001);

        testCustomer.deposit(50, currrentDate, Customer.CHECKING);

        assertEquals(550, testCustomer.getCheckBalance(), 0.0001);
        assertTrue(testCustomer.getDeposits().contains(testDeposit));
    }

    @Test
    public void CustomerWithdrawal(){
        Date currentDate = new Date();
        Withdraw testWithdraw = new Withdraw(60, currentDate, Customer.SAVING);

        Customer testCustomer = new Customer("Jayden", 1234, 500, 100);
        assertFalse(testCustomer.getWithdraws().contains(testWithdraw));
        assertEquals(100, testCustomer.getSavingBalance(), 0.0001);

        testCustomer.withdraw(60, currentDate, Customer.SAVING);

        assertEquals(40, testCustomer.getSavingBalance(), 0.0001);
        assertTrue(testCustomer.getWithdraws().contains(testWithdraw));
    }

    @Test
    public void CustomerOverdraftWithdrawal(){
        Date currentDate = new Date();
        Withdraw testWithdraw = new Withdraw(60, currentDate, Customer.SAVING);

        Customer testCustomer = new Customer("Jayden", 1234, 500, 20);
        assertFalse(testCustomer.getWithdraws().contains(testWithdraw));
        assertEquals(20, testCustomer.getSavingBalance(), 0.0001);

        testCustomer.withdraw(50, currentDate, Customer.SAVING);

        assertEquals(20, testCustomer.getSavingBalance(), 0.0001);
        assertFalse(testCustomer.getWithdraws().contains(testWithdraw));
    }

}

