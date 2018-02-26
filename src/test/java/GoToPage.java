import com.thoughtworks.gauge.Step;
import utils.Driver;

public class GoToPage {

    public String APP_URL = System.getenv("APP_URL");

    @Step("Open Baidu homepage")
    public void OpenBaiduHomePage() {
        Driver.webDriver.get(APP_URL + "/");
    }
}
