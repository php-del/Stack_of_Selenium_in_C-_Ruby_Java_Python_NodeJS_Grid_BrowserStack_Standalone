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

driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar")