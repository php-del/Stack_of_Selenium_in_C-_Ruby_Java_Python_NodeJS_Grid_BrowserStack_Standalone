require 'rubygems'
require 'Selenium-webdriver'

driver=Selenium::WebDriver.for :safari
driver.manage.window.maximize

driver.navigate.to "http://automationpractice.com"
sleep 10
driver.find_element(:xpath, "//*[@placeholder='Search']").send_keys "T-SHIRTS"
sleep 10
driver.find_element(:xpath, "//*[@name='submit_search']").click
sleep 10
s=driver.find_element(:xpath, "//*[@class='heading-counter']").text

puts s
sleep 5
if(driver.find_element(:xpath, "//*[@class='heading-counter']").displayed?)
	puts "OK Passed"
else
	puts "Failed"
end

sleep 5

d=driver.find_element(:xpath, "//*[@id='selectProductSort']")
puts "dropdown selection processing"
select=Selenium::WebDriver::Support::Select.new(d)
puts "dp down"
sleep 5
select.select_by(:text, "Price: Lowest first")
sleep 10

driver.navigate.to "https://www.dyn-web.com/tutorials/forms/examples/pizza.php"



driver.find_element(:xpath,"//*[@type='radio' and @value=8]").click

driver.find_element(:xpath,"//*[@name='onions']").click

# sl=driver.find_elements(:xpath, "//*[@title='Women']")

# puts sl.length
# sl[0].click


# driver.find_element(:xpath, "//*[@value=4]").click



# sleep 5

# driver.navigate.to "https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml"

# slb=driver.find_elements(:xpath, "//*[@type='radio' and @name='software']")

# slb[0].click 

sleep 5



#driver.navigate.to "http://foo:bar@httpbin.org/basic-auth/foo/bar"

#sleep 5

driver.navigate.to "https://www.browserstack.com/"

driver.execute_script("window.scrollTo(0,document.body.scrollHeight);")

sleep 5

driver.navigate.to "https://swisnl.github.io/jQuery-contextMenu/demo.html"


elem=driver.find_element(:xpath, "//*[text()='right click me']")

driver.action.move_to(elem).click.context_click.perform

sleep 5

driver.navigate.to "file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Complete_assignment_web_page.html"
sleep 10
driver.switch_to.frame driver.find_element(:xpath, "//iframe[@width=500 and @src='file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Form_User_Name_Password.html']")
#driver.switch_to.frame driver.find_element(:xpath, "//*[@frameborder=0]")
slb=driver.find_elements(:xpath,"//*[@name='User Name']")
slb[0].send_keys "ter"



#driver.find_element(:xpath, "//*[text()='HOME']").click

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