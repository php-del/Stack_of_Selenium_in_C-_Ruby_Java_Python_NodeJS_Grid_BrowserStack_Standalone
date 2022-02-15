const { Timeouts } = require('selenium-webdriver/lib/capabilities');
var assrt=require('assert');
const { assert } = require('console');
const { resolve } = require('path');
const { rejects } = require('assert');
var webdriver = require('selenium-webdriver'),
By=webdriver.By,
JavaScriptExecutor = webdriver.JavaScriptExecutor,
until = webdriver.until;

var driver = new webdriver.Builder().forBrowser('safari').build();

driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/").then(()=>{
    driver.findElement(By.xpath("//*[@class='ui-btn ui-corner-all ui-btn-inherit ui-btn-icon-left ui-radio-off']")).click()
})










