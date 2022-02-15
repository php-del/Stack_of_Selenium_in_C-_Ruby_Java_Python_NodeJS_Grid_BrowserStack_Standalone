require 'rubygems'
require 'selenium-webdriver'

# Input capabilities
caps = Selenium::WebDriver::Remote::Capabilities.new
caps['browser'] = 'Chrome'
caps['browser_version'] = '95.0'
caps['os'] = 'Windows'
caps['os_version'] = '10'
caps['name'] = 'File upload PHP'
caps['browserstack.sendKeys'] = 'true'
caps['browserstack.debug'] = 'true'
caps["javascriptEnabled"]='true' 

driver = Selenium::WebDriver.for(:remote,
  :url => "http://pratikpathare_oMjcIz:EeUYtZMrb6bLzmGQoszr@hub-cloud.browserstack.com/wd/hub",
  :desired_capabilities => caps)
driver.file_detector = lambda do |args|
  str = args.first.to_s
  str if File.exist?(str)
end

driver.navigate.to "http://www.fileconvoy.com"
driver.find_element(:id, "upfile_0").send_keys("/Users/pratikhemantpathare/Desktop/Demo.txt")
driver.execute_script('document.getElementById("readTermsOfUse").click();')
driver.find_element(:name, "upload_button").submit
sleep(5)
driver.quit
