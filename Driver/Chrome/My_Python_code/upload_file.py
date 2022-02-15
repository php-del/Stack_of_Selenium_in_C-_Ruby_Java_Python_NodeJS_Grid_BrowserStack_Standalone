from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait

desired_cap = {
 'browser': 'Chrome',
 'browser_version': '95.0',
 'os': 'Windows',
 'os_version': '10',
 'browserstack.sendKeys': 'true',
 'browserstack.debug': 'true',
 'name': 'File Upload Python PHP'
}

driver = webdriver.Remote(
    command_executor='http://pratikpathare_oMjcIz:EeUYtZMrb6bLzmGQoszr@hub.browserstack.com/wd/hub',
    desired_capabilities=desired_cap)
driver.get('http://www.fileconvoy.com')
driver.find_element_by_id('upfile_0').send_keys('/Users/pratikhemantpathare/Desktop/Demo.txt')
driver.find_element_by_id('readTermsOfUse').click()
driver.find_element_by_name('upload_button').submit()

driver.quit()
