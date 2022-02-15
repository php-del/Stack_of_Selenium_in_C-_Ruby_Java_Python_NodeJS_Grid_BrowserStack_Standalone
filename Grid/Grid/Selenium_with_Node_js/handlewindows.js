const { Timeouts } = require('selenium-webdriver/lib/capabilities');
var assrt=require('assert');
const { assert } = require('console');
const { resolve } = require('path');
const { rejects } = require('assert');
const { del } = require('selenium-webdriver/http');
var webdriver = require('selenium-webdriver'),
By=webdriver.By,
JavaScriptExecutor = webdriver.JavaScriptExecutor,
until = webdriver.until;


const delay = (ms) => new Promise((resolve) => setTimeout(resolve, ms));
const caps={
"browserName":"safari",
"platformName":"MAC"
}

const driver = new webdriver.Builder().
usingServer('http://192.168.0.104:4444').
withCapabilities(caps).build()
async function example(){
    try{
    await delay(5000)
    await driver.get("http://demo.automationtesting.in/Windows.html")
    await delay(5000)
    await driver.findElement(By.xpath("//*[text()='    click   ']")).click()
    await delay(5000)
     await driver.getAllWindowHandles().then(async (allhandles) => 
    {return await driver.switchTo().window(allhandles[allhandles.length - 2]);});
    await delay(5000)
    // let p=await driver.getAllWindowHandles();
    // await delay(5000)
    // await console.log(p.length);
    // await delay(2000)
    // await driver.switchTo().window(p[0]);
}
    finally{await driver.quit()}
// await driver.getAllWindowHandles().then(async (allhandles) => 
// {return await driver.switchTo().window(allhandles[allhandles.length - 1]);});


}

example()