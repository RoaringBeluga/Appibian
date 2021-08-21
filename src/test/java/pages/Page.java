package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import support.TestContext;

public class Page {
    @AndroidFindBy(id = "coinDicePic")
    AndroidElement imgView;

    @AndroidFindBy(id = "tossed_results")
    AndroidElement tossResults;

    @AndroidFindBy(id = "switch_is_coin")
    AndroidElement switchCoin;

    @AndroidFindBy(id = "btn_roll")
    AndroidElement buttonRoll;

    Page() {
        PageFactory.initElements(new AppiumFieldDecorator(TestContext.getDriver()),
                this
        );
    }

    public AndroidElement getImgView() {
        return this.imgView;
    }

    public AndroidElement getTossResults() {
        return this.tossResults;
    }

    public String getTossResultText() {
        return this.tossResults.getText();
    }

    public AndroidElement getButtonRoll() {
        return this.buttonRoll;
    }

    public String getButtonText() {
        return this.buttonRoll.getText();
    }

    public AndroidElement getSwitch() {
        return this.switchCoin;
    }

    public String isCoin() {
        return this.switchCoin.getAttribute("checked");
    }
}
