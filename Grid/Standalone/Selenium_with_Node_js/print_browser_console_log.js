const { Timeouts } = require('selenium-webdriver/lib/capabilities');
var assrt=require('assert');
const { assert } = require('console');
const { resolve } = require('path');
const { rejects } = require('assert');
var webdriver = require('selenium-webdriver'),
By=webdriver.By,
JavaScriptExecutor = webdriver.JavaScriptExecutor,
logging = webdriver.logging,
until = webdriver.until;

var driver = new webdriver.Builder().forBrowser('chrome').build();

driver.get("http://foo.com").then(()=>{
    driver.manage().logs().get(logging.Type.BROWSER)
    .then(function(entries) {
        entries.forEach(function(entry) {
          console.log('[%s] %s', entry.level.name, entry.message);
        });
     });
})

