import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.CoinPage;
import pages.DicePage;
import support.TestContext;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ButtonClicker {

    private int repetitions = 10;

    @BeforeAll
    public static void setUp() {
        TestContext.initContext();
    }

    @Test
    public void helloWorld() {
        System.out.println("Hello, world!");
    }

    @Test
    public void rollIt() {
        DicePage scr = new DicePage();

        for(int i = 0; i < this.repetitions; i++) {
            scr.doRoll();
            System.out.println("Content description: " + scr.getImgTooltip() +
                    " Roll results: " + scr.getTossResultText());
            assertEquals(scr.getImgTooltip(), scr.getTossResultText());
        }

    }

    @Test
    public void tossIt() {
        CoinPage scr = new CoinPage();

        for(int i = 0; i < this.repetitions; i++) {
            scr.doToss();
            System.out.println("Content description: " + scr.getImgTooltip() +
                    " Toss results: " + scr.getTossResultText());
            assertEquals(scr.getImgTooltip(), scr.getTossResultText(), "Wrong results somehow?");
        }
    }

    @AfterAll
    public static void tearDown() {

    }
}

