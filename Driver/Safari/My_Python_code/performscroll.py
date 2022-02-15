from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service

driver  = webdriver.Safari(executable_path='/usr/bin/safaridriver')
driver.maximize_window()

driver.get("https://www.browserstack.com/")

driver.execute_script ("window.scrollTo(0,document.body.scrollHeight);")


#driver.execute_script("var res = await driver.manage().logs().get(webdriver.logging.Type.BROWSER);console.log(res);")

time.sleep(5)

driver.quit()