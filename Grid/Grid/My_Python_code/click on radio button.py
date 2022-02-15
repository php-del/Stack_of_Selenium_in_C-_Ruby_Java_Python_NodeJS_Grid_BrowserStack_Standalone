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

driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml")

g=driver.find_elements_by_xpath("//*[@type='radio' and @name='software']")

g[0].click()

time.sleep(5)

driver.quit()