const { Timeouts } = require('selenium-webdriver/lib/capabilities');
var assrt=require('assert');
const { assert } = require('console');
const { resolve } = require('path');
const { rejects } = require('assert');
var webdriver = require('selenium-webdriver'),
By=webdriver.By,
JavaScriptExecutor = webdriver.JavaScriptExecutor,
until = webdriver.until;

var driver = new webdriver.Builder().forBrowser('chrome').build();

driver.get("https://www.w3schools.com/howto/howto_js_element_iframe.asp").then(()=>{
    driver.switchTo().frame(driver.findElement(By.id("myFrame")))
}).then(()=>{
    driver.wait(until.elementLocated(By.xpath("//*[@href='/html/default.asp' and @class='w3-button tut-button']"))).click()
    
})