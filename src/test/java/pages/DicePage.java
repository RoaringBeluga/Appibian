package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DicePage extends Page{

    public DicePage() {
        switch (this.isCoin()) {
            case "false":    break;
            case "true":   this.switchCoin.click();
                break;
            default:        assertEquals("true", this.isCoin(), "Something's fishy here!");
        }
    }

    public void doRoll() {
        System.out.println("Coin state: " + this.isCoin());
        this.buttonRoll.click();
    }

    public String getImgTooltip() {
        return "Rolled: " + this.imgView.getAttribute("content-desc");
    }
}
