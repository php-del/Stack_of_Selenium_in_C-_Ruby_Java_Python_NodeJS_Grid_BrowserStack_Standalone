const webdriver = require("selenium-webdriver");
const remote = require("selenium-webdriver/remote");

// Input capabilities
const capabilities = {
  "browserName": "Internet Explorer",
  "browser_version": "11.0",
  "os": "Windows",
  "os_version": "10",
  "name": "Bstack-[NodeJS] Upload Test",
  "browserstack.sendKeys": "true",
  "browserstack.debug": "true",
  "browserstack.user": "pratikpathare_oMjcIz",
  "browserstack.key": "EeUYtZMrb6bLzmGQoszr"
};

const driver = new webdriver.Builder()
  .usingServer("https://hub-cloud.browserstack.com/wd/hub")
  .withCapabilities(capabilities)
  .build();

//This will detect your local file
driver.setFileDetector(new remote.FileDetector());

(async () => {
  await driver.get("http://www.fileconvoy.com");

  const filePathElement = await driver.findElement(webdriver.By.id("upfile_0"));
  await filePathElement.sendKeys("/Users/pratikhemantpathare/Desktop/Demo.txt");

  await (await driver.findElement(webdriver.By.id("readTermsOfUse"))).click();
  await (await driver.findElement(webdriver.By.name("upload_button"))).click();
  
  await driver.quit();
})();
