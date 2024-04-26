import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BaseTest {
    WebDriver driver = new ChromeDriver();


    @Before
    public void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}