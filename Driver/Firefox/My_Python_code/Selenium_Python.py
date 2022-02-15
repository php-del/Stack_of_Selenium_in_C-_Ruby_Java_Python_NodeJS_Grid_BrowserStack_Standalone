from selenium import webdriver
import time
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.alert import Alert
driver  = webdriver.Chrome("/opt/homebrew/bin/chromedriver")
driver.maximize_window()

driver.get("http://automationpractice.com")

element1=driver.find_element_by_xpath("//*[@placeholder='Search']")

#send keys implemented
element1.send_keys("T-SHIRTS")


#click implemented
driver.find_element_by_xpath("//*[@name='submit_search']").click()



p = driver.find_element_by_xpath("//*[@class='lighter']").text

print(p)

#verify implemented
assert p=='"T-SHIRTS"'

time.sleep(5)

print("Verified the text")

#select values from dropdown
drpdown=Select(driver.find_element_by_xpath("//*[@id='selectProductSort']"))


drpdown.select_by_index(1)

#click on checkbox implemented

t=driver.find_elements_by_xpath("//*[@title='Women']")

t[0].click()




driver.find_element_by_xpath("//*[@value=4]").click()

time.sleep(5)


driver.quit()


 

 



    