package primitives;

import org.openqa.selenium.By;

import static Reporter.report;


public class TextView extends BaseElement {

    public TextView(By selector, String description){
        super(selector, description);
    }

    public String getText() throws InterruptedException {
        String text = get().getText();
        report("Get text: "+text+" from "+description);
        return text;
    }

}