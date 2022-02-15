// const { Timeouts } = require('selenium-webdriver/lib/capabilities');
// var assrt=require('assert');
// const { assert } = require('console');
// const { resolve } = require('path');
// const { rejects } = require('assert');
// var webdriver = require('selenium-webdriver'),
// By=webdriver.By,
// JavaScriptExecutor = webdriver.JavaScriptExecutor,
// until = webdriver.until;

// var driver = new webdriver.Builder().forBrowser('safari').build();

// driver.get("https://www.ironspider.ca/forms/checkradio.htm").then(function(){
//     driver.findElement(By.xpath("//*[@value='red']")).click()
// }).then(function(){
// driver.executeScript("window.scrollBy(0,2000)")  
// })

const {Builder, By, Key, until} = require('selenium-webdriver');

const delay = (ms) => new Promise((resolve) => setTimeout(resolve, ms));

async function main(){
    let driver = await new Builder()
    .forBrowser('safari')
    .build();
    await driver.get("https://www.ironspider.ca/forms/checkradio.htm")
    await delay(5000)
    await driver.findElement(By.xpath("//*[@value='red']")).click()

    await delay(5000)
    await driver.executeScript("window.scrollBy(0,2000)")  
    await delay(5000)
    await driver.quit()


}

main()