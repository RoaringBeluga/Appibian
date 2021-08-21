package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinPage extends Page{

    public CoinPage() {
        switch (this.isCoin()) {
            case "true":    break;
            case "false":   this.switchCoin.click();
                            break;
            default:        assertEquals("true", this.isCoin(), "Something's fishy here!");
        }
    }

    public void doToss() {
        System.out.println("Coin state: " + this.isCoin());
        this.buttonRoll.click();
    }
    
    public String getImgTooltip() {
        return "Tossed: " + this.imgView.getAttribute("content-desc");
    }
}
