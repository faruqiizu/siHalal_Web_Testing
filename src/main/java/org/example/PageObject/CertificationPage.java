package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificationPage {
    public static WebDriver webDriver;
    public CertificationPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[contains(.,'Sertifikasi')]")
    public static WebElement btnCertif;
    @FindBy(xpath = "//h6[.='Sertifikasi']")
    public static WebElement popupCertifMenu;
    @FindBy(xpath = "(//a[contains(@class,'collapse-item')])[1]") //xpath with index
    public static WebElement clickbtnPelakuUsaha;
    @FindBy(xpath = "//h4[@class='mb-4 text-gray-800']")
    public static WebElement pagePelakuUsaha;
    @FindBy(xpath = "//input[@class='btn btn-primary btn-sm mb-2']")
    public static WebElement btnEdit;
    @FindBy(xpath = "//h4[@class=' mb-4 text-gray-800']")
    public static WebElement pageEditPelakuUsaha;
    @FindBy(xpath = "//div[13]/div[@class='col-md-12 col-xl-3 col-form-label ']")
    public static WebElement titleNamePj;
    @FindBy(xpath = "//div[13]//input[@class='form-control form-control-sm']")
    public static WebElement textboxNamePJ;

    //------------------------------------------------
    public void clickButtonCertification() {
        btnCertif.click();
    }

    public boolean verifyPopupCertification(){
        return popupCertifMenu.isDisplayed();
    }

    //pelaku usaha
    public void clickPelakuUsaha() {
        clickbtnPelakuUsaha.click();
    }

    public boolean verifyPagePelakuUsaha(){
        return pagePelakuUsaha.isDisplayed();
    }

    public void clickButtonEdit() {
        btnEdit.click();
    }

    public boolean verifyPageEditPelakuUsaha(){
        return pageEditPelakuUsaha.isDisplayed();
    }

    public void clickTextBoxName() {
        textboxNamePJ.click();
    }

    public void setName(String nme) {
        textboxNamePJ.clear();
        textboxNamePJ.sendKeys(nme);
    }

    public boolean namePjDisplayed() {
        return titleNamePj.isDisplayed();
    }
}
