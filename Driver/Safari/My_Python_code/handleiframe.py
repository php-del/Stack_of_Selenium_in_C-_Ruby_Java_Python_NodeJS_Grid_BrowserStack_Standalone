from selenium import webdriver
import time
from selenium.webdriver.common import alert
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.safari.service import Service
from selenium.webdriver.common.action_chains import ActionChains



driver  = webdriver.Safari(executable_path='/usr/bin/safaridriver')

driver.maximize_window()

driver.get("file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Complete_assignment_web_page.html")

driver.switch_to.frame(driver.find_element_by_xpath("//iframe[@width=500 and @src='file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Form_User_Name_Password.html']"))
#driver.switch_to.frame(driver.find_element_by_xpath("//*[@frameborder=0]"))

sbr=driver.find_elements_by_xpath("//*[@name='User Name']")
sbr[0].send_keys("ter")
print("frame reached and clicked on home")

time.sleep(5)

driver.quit()

