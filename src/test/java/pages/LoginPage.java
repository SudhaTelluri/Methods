package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.After;

public class LoginPage {
	public static WebDriver driver = new ChromeDriver();

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailTextBox;

	@FindBy(id = "input-password")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//*[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[text()='Account']")
	private WebElement accountPage;

	// Method without return type
	public void loginUrl() {
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	// Method without return type
	public void enterUsername() {

		emailTextBox.sendKeys("example@email.com");
	}

	// Method with WebElement return type
	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	// Method without return type
	public void clickOnLoginButton() {
		loginButton.click();
	}

	// Method with boolean return type
	public boolean isAccountPage() {
		return accountPage.isDisplayed();
	}

	@After
	public void teardown() {
		driver.close();
	}
}
