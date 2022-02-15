from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service
from selenium.webdriver.common.action_chains import ActionChains



driver  = webdriver.Chrome("/opt/homebrew/bin/chromedriver")
driver.maximize_window()

driver.get("https://codepen.io/GBora/pen/VLYyzY")

driver.switch_to.frame("CodePen")
driver.switch_to.frame(driver.find_element_by_xpath("//*[@frameborder=0]"))

driver.find_element_by_xpath("//*[text()='HOME']").click()
print("frame reached and clicked on home")

time.sleep(5)

driver.quit()

