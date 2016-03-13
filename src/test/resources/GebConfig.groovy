/*
    This is the Geb configuration file.

    See: http://www.gebish.org/manual/current/#configuration
*/
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
  timeout = 2
}
driver = { new FirefoxDriver() }