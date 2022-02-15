require 'rubygems'
require 'Selenium-webdriver'

#driver=Selenium::WebDriver.for :chrome

caps = Selenium::WebDriver::Remote::Capabilities.new
caps['browser'] = 'Chrome'
caps["javascriptEnabled"]='true'


driver = Selenium::WebDriver.for(:remote,
  :url => "http://192.168.0.104:4444/wd/hub",
  :desired_capabilities => caps)


driver.navigate.to "http://automationpractice.com"

driver.find_element(:xpath, "//*[@placeholder='Search']").send_keys "T-SHIRTS"

driver.find_element(:xpath, "//*[@name='submit_search']").click

s=driver.find_element(:xpath, "//*[@class='lighter']").text

puts s

if(s=='"T-SHIRTS"')
	puts "OK Passed"
else
	puts "Failed"
end



d=driver.find_element(:xpath, "//*[@id='selectProductSort']")
puts "dropdown selection processing"
select=Selenium::WebDriver::Support::Select.new(d)
puts "dp down"
select.select_by(:text, "Price: Lowest first")


sl=driver.find_elements(:xpath, "//*[@title='Women']")

puts sl.length
sl[0].click


driver.find_element(:xpath, "//*[@value=4]").click



sleep 5

driver.navigate.to "https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml"

slb=driver.find_elements(:xpath, "//*[@type='radio' and @name='software']")

slb[0].click 

sleep 5



driver.navigate.to "http://foo:bar@httpbin.org/basic-auth/foo/bar"

sleep 5

driver.navigate.to "https://www.browserstack.com/"

driver.execute_script("window.scrollTo(0,document.body.scrollHeight);")

sleep 5

driver.navigate.to "https://swisnl.github.io/jQuery-contextMenu/demo.html"


elem=driver.find_element(:xpath, "//*[text()='right click me']")

driver.action.move_to(elem).click.context_click.perform

sleep 5

driver.navigate.to "https://codepen.io/GBora/pen/VLYyzY"

driver.switch_to.frame driver.find_element(:name, "CodePen")
driver.switch_to.frame driver.find_element(:xpath, "//*[@frameborder=0]")



driver.find_element(:xpath, "//*[text()='HOME']").click

sleep 5

driver.navigate.to "http://demo.automationtesting.in/Windows.html"

driver.find_element(:xpath, "//*[text()='    click   ']").click

windowhandles = driver.window_handles



#Switch to second window.

driver.switch_to.window windowhandles[1]
sleep 5
driver.switch_to.window windowhandles[0]



sleep 5

puts "Done"