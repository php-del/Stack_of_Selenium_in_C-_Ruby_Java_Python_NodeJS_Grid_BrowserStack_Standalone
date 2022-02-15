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


async function example(){
await driver.get("http://demo.automationtesting.in/Windows.html")
await driver.findElement(By.xpath("//*[text()='    click   ']")).click()
await driver.getAllWindowHandles().then(async (allhandles) => 
{return await driver.switchTo().window(allhandles[allhandles.length - 2]);});

// await driver.getAllWindowHandles().then(async (allhandles) => 
// {return await driver.switchTo().window(allhandles[allhandles.length - 1]);});


}

example()