from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service
from selenium.webdriver.common.action_chains import ActionChains



driver  = webdriver.Chrome("/opt/homebrew/bin/chromedriver")
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