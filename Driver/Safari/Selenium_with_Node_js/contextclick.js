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

driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html").then(()=>{
    



    driver.actions().contextClick(driver.findElement(By.xpath("//*[text()='right click me']"))).perform()
    
})