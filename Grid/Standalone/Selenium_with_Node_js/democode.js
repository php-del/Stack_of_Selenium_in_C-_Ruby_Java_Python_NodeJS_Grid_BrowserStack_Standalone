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




driver.get("http://automationpractice.com").then(function()
{driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("T-SHIRTS").then(function(){
    driver.findElement(By.xpath("//*[@name='submit_search']")).click().then(function(){
        var promise = driver.getTitle();
        promise.then(function(title) 

        {
        
        console.log(title);
        if(title==='Search - My Store') console.log("OK")
        else console.log("Invalid")
        
        });
    }).then(function(){
        driver.findElement(By.id("selectProductSort")).click()
    }).then(function(){
        driver.findElement(By.xpath("//*[text()='Price: Lowest first']")).click()
    })
})});



// //driver.quit();








