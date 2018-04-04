import com.thoughtworks.gauge.Step;
import utils.Driver;

public class detail {
    @Step("Open Zhihu")
    public void openZhihuHomePage() throws InterruptedException {
        Driver.webDriver.get("https://www.zhihu.com");
        Thread.sleep(1000);
    }
}
