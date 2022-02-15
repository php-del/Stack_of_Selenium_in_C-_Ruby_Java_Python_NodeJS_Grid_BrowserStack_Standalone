using System;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Remote;

namespace File_Upload_remote_Selenium
{
    class Program
    {
        [Obsolete]
        static void Main(string[] args)
        {
            IWebDriver driver;
            ChromeOptions capability = new ChromeOptions();
            capability.AddAdditionalCapability("os", "Windows", true);
            capability.AddAdditionalCapability("os_version", "11", true);
            capability.AddAdditionalCapability("browser", "Chrome", true);
            capability.AddAdditionalCapability("browser_version", "95.0", true);
            capability.AddAdditionalCapability("browserstack.local", "false", true);
            capability.AddAdditionalCapability("browserstack.selenium_version", "3.14.0", true);
            capability.AddAdditionalCapability("browserstack.user", "pratikpathare_oMjcIz", true);
            capability.AddAdditionalCapability("browserstack.key", "EeUYtZMrb6bLzmGQoszr", true);
            capability.AddAdditionalCapability("name", "PHP test C# file Upload", true);



            Thread.Sleep(5000);
            driver = new RemoteWebDriver(new Uri("https://pratikpathare_oMjcIz:EeUYtZMrb6bLzmGQoszr@hub-cloud.browserstack.com/wd/hub/"), capability);
            driver.Navigate().GoToUrl("http://www.fileconvoy.com");
            Console.WriteLine("Done 1");
            Thread.Sleep(10000);
            IWebElement uploadFile = driver.FindElement(By.Name("upfile_0"));
            Console.WriteLine("Done 2");

            String path = "//Users//pratikhemantpathare//Desktop//Demo.txt";
            LocalFileDetector detector = new LocalFileDetector();
            var allowsDetection = driver as IAllowsFileDetection;
            if (allowsDetection != null)
            {
                allowsDetection.FileDetector = detector;
            }
            

            uploadFile.SendKeys(path);
            Console.WriteLine("File found");
            driver.FindElement(By.Id("readTermsOfUse")).Click();
            driver.FindElement(By.Id("upload_button")).Click();

            Thread.Sleep(10000);
            driver.Quit();
            Console.WriteLine("Success");

        }
    }
}