from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service


driver  = webdriver.Safari(executable_path='/usr/bin/safaridriver')

driver.maximize_window()

driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml")

g=driver.find_elements_by_xpath("//*[@type='radio' and @name='software']")

g[0].click()

time.sleep(5)

driver.quit()