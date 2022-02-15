require 'rubygems'
require 'Selenium-webdriver'

driver=Selenium::WebDriver.for :chrome


driver.navigate.to "http://foo.com"

console_logs = driver.manage.logs.get(:browser) 

puts console_logs