from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service


driver = webdriver.Remote(
   command_executor='http://192.168.0.104:4444/wd/hub',
desired_capabilities={'browserName': 'chrome', 'javascriptEnabled': True})
driver.maximize_window()

driver.get("https://www.browserstack.com/")

driver.execute_script ("window.scrollTo(0,document.body.scrollHeight);")


#driver.execute_script("var res = await driver.manage().logs().get(webdriver.logging.Type.BROWSER);console.log(res);")

time.sleep(5)

driver.quit()