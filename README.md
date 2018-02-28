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
    - ChromeDriver version `2.35.528157`
    - Use Chrome headless with `ChromeOptions`
    - Use local Chrome Driver with **System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");**
    - Use `DriverFactory` and `Driver` to manage all Driver behave

## Tips

If you want to use this in CI, eg.Jenkins. Please make sure
- CI User is not `root` user
- or set `ChromeOptions` argument `--no-sandbox`

Otherwise, your test can't run in CI well.




