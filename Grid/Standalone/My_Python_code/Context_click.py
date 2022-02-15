from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service
from selenium.webdriver.common.action_chains import ActionChains




driver = webdriver.Remote(
   command_executor='http://192.168.0.104:4444/wd/hub',
desired_capabilities={'browserName': 'chrome', 'javascriptEnabled': True})
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