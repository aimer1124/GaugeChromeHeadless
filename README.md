# GaugeChromeHeadless[![Build Status](https://travis-ci.org/aimer1124/GaugeChromeHeadless.svg?branch=master)](https://travis-ci.org/aimer1124/GaugeChromeHeadless)

Use [Gauge](https://gauge.org/index.html) with local headless chrome.

## Usage

- Command line

```
./gradlew clean gauge
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
- CI - Agent Prepare
    - Install Java
    - Install Gauge
    - Install Gauge Java Plugin
    - Install Chrome


## Tips

- ChromeDriver is for linux,If you want to run in other OS,please replace chromedriver in `BrowserDriver` folder.
- If you want to use this in CI, eg.Jenkins. Please make sure: CI User is not `root` user





