$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("carSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Cars search in London",
  "description": "",
  "id": "cars-search-in-london",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open Google and perform a search for \u0027Cars in London\u0027",
  "description": "",
  "id": "cars-search-in-london;open-google-and-perform-a-search-for-\u0027cars-in-london\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open Google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I perform a search for cars in London",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see GumTree results on Google page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on a GumTree page link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the page link will be correctly displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CarsSearchInLondonStepDefinition.I_open_google_search_page()"
});
formatter.result({
  "duration": 4764573466,
  "status": "passed"
});
formatter.match({
  "location": "CarsSearchInLondonStepDefinition.I_perform_a_search_for_cars_in_London()"
});
formatter.result({
  "duration": 2560002761,
  "status": "passed"
});
formatter.match({
  "location": "CarsSearchInLondonStepDefinition.I_see_GumTree_results_on_Google_page()"
});
formatter.result({
  "duration": 65002297,
  "status": "passed"
});
formatter.match({
  "location": "CarsSearchInLondonStepDefinition.I_click_on_a_GumTree_page_link()"
});
formatter.result({
  "duration": 597168308,
  "status": "passed"
});
formatter.match({
  "location": "CarsSearchInLondonStepDefinition.the_page_link_will_be_correctly_displayed()"
});
formatter.result({
  "duration": 636945730,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[3]/div/div[4]/section/main/div[1]/div/div/header/div[2]/h1\"}\n  (Session info: chrome\u003d80.0.3987.116)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027Shizas-MacBook\u0027, ip: \u00272a02:c7f:c61b:1500:7c7f:b229:f56d:5165%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.2\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.116, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /var/folders/v9/363s5w1j1b7...}, goog:chromeOptions: {debuggerAddress: localhost:52714}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 325fd93ad44298e1d7966212a1c86921\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[3]/div/div[4]/section/main/div[1]/div/div/header/div[2]/h1}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\n\tat stepDefinition.CarsSearchInLondonStepDefinition.the_page_link_will_be_correctly_displayed(CarsSearchInLondonStepDefinition.java:47)\n\tat ✽.Then the page link will be correctly displayed(carSearch.feature:11)\n",
  "status": "failed"
});
});