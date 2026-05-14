package pages;
public class PaginaFundamentosTesting extends BasePage {
    private String introduccionTestingLink = "//*[@id=\"page_section_91433148\"]/div/section/div/section/div[2]/section/div[2]/div/div/a";
    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clickIntroduccionTestingLink() {
        clickElement(introduccionTestingLink);
    

        }
}