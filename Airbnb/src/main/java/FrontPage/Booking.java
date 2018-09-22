package FrontPage;

import Elements.FrontPage;
import org.openqa.selenium.Keys;

public class Booking extends FrontPage {

    public void selectCheckingDate(){
        checkingDate.sendKeys("09/29/2018", Keys.ENTER);
    }
    public void selectChekoutDate(){
        checkoutDate.sendKeys("10/02/2018", Keys.ENTER);
    }
    public void searchclick(){
        searchClick.click();
    }
}