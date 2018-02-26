# GaugeChromeHeadless

Use [Gauge](https://gauge.org/index.html) with local headless chrome.

## Usage

- Command line

```
./gradlew gauge
```

- Test Scenario
    - Open Baidu Homepage
    - Input 123
    - Click SearchBtn
    - Check first result

- Tech
    - Use Chrome headless with `ChromeOptions`
    - Use local Chrome Driver with **System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");**
    - Use `DriverFactory` and `Driver` to manage all Driver behave



