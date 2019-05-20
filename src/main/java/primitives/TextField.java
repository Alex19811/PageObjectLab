package primitives;

import org.openqa.selenium.By;

public class TextField extends TextView{


    public TextField(By selector, String description){
        super(selector, description);
    }

    public void setText(String text) throws InterruptedException {
        get().sendKeys(text);
        System.out.println("Set text: "+text+" to "+description);
    }

}
