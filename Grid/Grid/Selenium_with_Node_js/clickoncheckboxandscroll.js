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

driver.get("https://www.ironspider.ca/forms/checkradio.htm").then(function(){
    driver.findElement(By.xpath("//*[@value='red']")).click()
}).then(function(){
driver.executeScript("window.scrollBy(0,2000)")  
})