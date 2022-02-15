from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
import logging 
# enable browser logging
d = DesiredCapabilities.CHROME
d['goog:loggingPrefs'] = { 'browser':'ALL' }
driver = webdriver.Chrome(desired_capabilities=d)

# load the desired webpage
driver.get('http://foo:bar@httpbin.org/basic-auth/foo/bar')



