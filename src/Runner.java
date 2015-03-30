import org.junit.Assert;
import org.junit.Test;


public class Runner {
    @Test
    public void test() {
        final Hello h = new Hello();
        final String message = h.getMessage(0);
        Assert.assertEquals("", message);
    }

    @Test
    public void test2() {
        final Hello h = new Hello();
        final String message = h.getMessage(5);
        Assert.assertEquals("msgmsgmsgmsgmsg", message);
    }

}
