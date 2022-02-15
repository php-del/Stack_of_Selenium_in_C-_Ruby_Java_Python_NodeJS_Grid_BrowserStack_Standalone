using System;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Diagnostics;
using OpenQA.Selenium.Support.UI;


using System.Collections;
using OpenQA.Selenium.Safari;
using System.Collections.Generic;

namespace Selenium_Test
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            
            WebDriver driver = new SafariDriver();
            driver.Navigate().GoToUrl("http://automationpractice.com/index.php");
            driver.Manage().Window.Maximize();
            //send keys implemented
            driver.FindElement(By.XPath("//*[@placeholder='Search']")).SendKeys("T-SHIRTS");
            //click implemented
            driver.FindElement(By.XPath("//*[@name='submit_search']")).Click();
            Thread.Sleep(10000);
            String s = driver.FindElement(By.XPath("//*[@class='lighter']")).Text;
            Console.WriteLine(s);
            //verification implemented
            bool sp = driver.Title.Equals("Search - My Store");
            Console.WriteLine(sp);
            if (sp == true)
            {
                Console.WriteLine("Title verified");

            }
            else{
                Console.WriteLine("Test fail");
            }

            //handle drop down implemented
            SelectElement selectval = new SelectElement(driver.FindElement(By.XPath("//*[@id='selectProductSort']")));
            selectval.SelectByIndex(1);

            //click on checkbox and radio button implemented



            System.Collections.Generic.IList<IWebElement> dp =  driver.FindElements(By.XPath("//*[@title='Women']"));
            dp[0].Click();
            Thread.Sleep(15000);
            driver.FindElement(By.XPath("//*[@value=4]")).Click();

            //








            Thread.Sleep(5000);
            driver.Navigate().GoToUrl("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
            System.Collections.Generic.IList<IWebElement> dpr = driver.FindElements(By.XPath("//*[@type='radio' and @name='software']"));
            dpr[0].Click();
            Thread.Sleep(5000);

            
            

            driver.Navigate().GoToUrl("https://swisnl.github.io/jQuery-contextMenu/demo.html");
            //Thread.Sleep(5000);
            WebElement ele = (WebElement)driver.FindElement(By.XPath("//*[text()='right click me']"));
            OpenQA.Selenium.Interactions.Actions act = new OpenQA.Selenium.Interactions.Actions(driver);
            act.ContextClick(ele);
            act.Perform();
            Thread.Sleep(5000);

            driver.Navigate().GoToUrl("file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Complete_assignment_web_page.html");
           // driver.SwitchTo().Frame("CodePen");
            driver.SwitchTo().Frame(driver.FindElement(By.XPath("//iframe[@width=500 and @src='file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Form_User_Name_Password.html']")));
            System.Collections.Generic.IList<IWebElement> dpl = driver.FindElements(By.XPath("//*[@name='User Name']"));
            dpl[0].SendKeys("rer");
            Thread.Sleep(5000);

            driver.Navigate().GoToUrl("https://www.browserstack.com/");
            IJavaScriptExecutor js = (IJavaScriptExecutor)driver;
            js.ExecuteScript("window.scrollTo(0,document.body.scrollHeight);");
            Thread.Sleep(5000);

            driver.Navigate().GoToUrl("http://demo.automationtesting.in/Windows.html");

            driver.FindElement(By.XPath("//*[text()='    click   ']")).Click();

            var ssp= driver.SwitchTo().Window(driver.WindowHandles[1]).Title;
            Console.WriteLine(ssp);
            var ssp2 = driver.SwitchTo().Window(driver.WindowHandles[0]).Title;
            Console.WriteLine(ssp2);



            Thread.Sleep(5000);

     
            //Print browser console log
            //driver.Navigate().GoToUrl("http://foo.com");

            //var entries = driver.Manage().Logs.GetLog(LogType.Browser);
            //foreach (var entry in entries)
            //{
            //    Console.WriteLine(entry.ToString());
            //}

            //Thread.Sleep(5000);

            driver.Quit();

           



        }
    }
}
