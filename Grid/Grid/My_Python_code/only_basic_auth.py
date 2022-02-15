from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
import logging 
# enable browser logging
#d = DesiredCapabilities.CHROME
#d['goog:loggingPrefs'] = { 'browser':'ALL' }

driver = webdriver.Remote(
   command_executor='http://192.168.0.104:4444/wd/hub',
desired_capabilities={'browserName': 'chrome', 'javascriptEnabled': True})

# load the desired webpage
driver.get('http://foo:bar@httpbin.org/basic-auth/foo/bar')

driver.quit()



