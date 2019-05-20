package primitives;

import org.openqa.selenium.By;


public class Button extends TextView {

    public Button( By selector, String description){
        super(selector, description);
    }

    public void click() throws InterruptedException {
        get().click();
        System.out.println("Click to "+description);
    }


}
