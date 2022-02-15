from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

# enable browser logging
d = DesiredCapabilities.CHROME
d['loggingPrefs'] = { 'browser':'ALL' }
#driver = webdriver.Chrome(desired_capabilities=d)


driver = webdriver.Remote(
   command_executor='http://192.168.0.104:4444/wd/hub',
desired_capabilities={'browserName': 'chrome', 'javascriptEnabled': True})

# load the desired webpage
driver.get('http://foo.com')

# print messages
#for entry in driver.get_log('browser'):
#    print(entry)

print(driver.get_log('browser'))