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

driver.get("http://demo.automationtesting.in/Windows.html")


driver.find_element_by_xpath("//*[text()='    click   ']").click()

handles=driver.window_handles

size=len(handles)

for x in range(size):
    driver.switch_to.window(handles[x])
    print(driver.title)

time.sleep(5)
driver.quit()