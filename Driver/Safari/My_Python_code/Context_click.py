from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service
from selenium.webdriver.common.action_chains import ActionChains



driver  = webdriver.Safari(executable_path='/usr/bin/safaridriver')

driver.maximize_window()

driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html")

ele=driver.find_element_by_xpath("//*[text()='right click me']")



action = ActionChains(driver)
  
# context click the item
action.context_click(on_element=ele)
action.perform()
print("right click success")
time.sleep(5)
driver.quit()