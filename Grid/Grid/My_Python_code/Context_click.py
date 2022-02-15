from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service
from selenium.webdriver.common.action_chains import ActionChains

from selenium.webdriver.support.ui import WebDriverWait as Wait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait

driver = webdriver.Remote(
   command_executor='http://192.168.0.101:4444/wd/hub',
desired_capabilities={'browserName': 'chrome', 'javascriptEnabled': True})
driver.maximize_window()

driver.get("http://demo.guru99.com/test/simple_context_menu.html")

#ele=driver.find_element_by_xpath("//*[@class='context-menu-one btn btn-neutral']")



action = ActionChains(driver)

element = WebDriverWait(driver, 10).until(
EC.visibility_of_element_located((By.XPATH, "//*[text()='right click me']")))
action.context_click(element).perform()

  


print("right click success")
time.sleep(5)
driver.quit()