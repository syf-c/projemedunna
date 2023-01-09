package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaPage {

    //1-49 Mert
    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@data-icon='user']") public WebElement userIcon;
    @FindBy (xpath = "//*[@id='ssn']") public WebElement registrationSSN;
    @FindBy (xpath = "//*[text()='Registration']") public WebElement registrationPage;
    @FindBy (xpath = "//*[text()='Register']") public WebElement RegisterButton;
    @FindBy (xpath = "//*[text()='Your SSN is required.']") public WebElement ssnRequiredWarning;
    @FindBy (xpath = "//*[text()='Your FirstName is required.']") public WebElement firstNameRequiredWarning;
    @FindBy (xpath = "//*[text()='Your LastName is required.']") public WebElement lastNameRequiredWarning;
    @FindBy (xpath = "//*[text()='Your username is required.']") public WebElement userNameRequiredWarning;
    @FindBy (xpath = "//*[text()='Your email is required.']") public WebElement emailRequiredWarning;
    @FindBy (xpath = "//*[text()='This field is invalid']") public WebElement emailInvalidWarning;

    @FindBy (xpath = "//*[@id='firstName']") public WebElement registrationFirstName;
    @FindBy (xpath = "//*[@id='lastName']") public WebElement registrationLastName;
    @FindBy (xpath = "//*[@id='username']") public WebElement registrationUserName;
    @FindBy (xpath = "//*[@id='email']") public WebElement registrationEmail;
    @FindBy (xpath = "//*[@id='firstPassword']") public WebElement registrationFirstPassword;
    @FindBy (xpath = "//div[@class='invalid-feedback']") public WebElement ssnInvalidwarning;
    @FindBy(xpath = "//*[text()='Sign in']") public  WebElement mainPageSignIn;
    @FindBy(xpath = "//*[@id='username']") public WebElement loginUsername;
    @FindBy(xpath = "//*[@id='password']") public WebElement loginPassword;
    @FindBy(xpath = "//button[@type='submit']") public  WebElement loginSignIn;
    @FindBy(xpath = "//h1") public WebElement welcomePage;
    @FindBy(xpath = "//*[text()='MY PAGES']") public WebElement myPages;
    @FindBy(xpath = "//*[text()='Search Patient']") public WebElement searchPatient;
    @FindBy (xpath = "//input[@name='ssn']") public WebElement ssnBox;
    @FindBy (xpath = "(//span[text()='Show Appointments'])[1]") public WebElement showAppointments;
    @FindBy (xpath = "(//*[@data-icon='money-bill'])[1]") public WebElement paymentInvoiceButton;
    @FindBy (xpath = "//a[text()=' Create Invoice']") public WebElement createInvoice;
    @FindBy (xpath = "(//thead//tr/th)[1]") public WebElement invoicePage;
    @FindBy (xpath = "//tbody//tr") public List<WebElement> testPrices;
    @FindBy (xpath = "(//thead//tr)[5]") public WebElement examPrice;
    @FindBy (xpath = "//a[@class='btn btn-success btn-sm']") public WebElement showInvoice;
    @FindBy (xpath = "(//a[@class='page-link'])[4]") public WebElement page2;
    @FindBy (xpath = "(//*[text()='Show Appointments'])[4]") public WebElement showAppointments2;
    //50-99 Ahmet
    @FindBy (xpath = "(//a[@href='/physician-appointment'])[2]") public WebElement myAppointments;
    @FindBy (xpath = "//input[@id='fromDate']") public WebElement dateSelectFrom;
    @FindBy (xpath = "//input[@id='toDate']") public WebElement dateSelectTo;
    @FindBy (xpath = "(//a[@class='btn btn-primary btn-sm'])[1]") public WebElement appointmentsFirstEdit;
    @FindBy (xpath = "//a[@href='/tests/appointment/309383']") public WebElement showTestResults;
    @FindBy (xpath = "(//a[@class='btn btn-info btn-sm'])[4]") public WebElement testsViewResults4;
    @FindBy (xpath = "//tr//td[1]") public List<WebElement> testResultsColumn1List;
    @FindBy (xpath = "//tr//td[2]") public List<WebElement> testResultsColumn2List;
    @FindBy (xpath = "//tr//td[3]") public List<WebElement> testResultsColumn3List;
    @FindBy (xpath = "//tr//td[4]") public List<WebElement> testResultsColumn4List;
    @FindBy (xpath = "//tr//td[5]") public List<WebElement> testResultsColumn5List;
    @FindBy (xpath = "//tr//td[6]") public List<WebElement> testResultsColumn6List;
    @FindBy (xpath = "//tr//td[7]") public List<WebElement> testResultsColumn7List;
    @FindBy (xpath = "//tr//td[8]") public List<WebElement> testResultsColumn8List;
    @FindBy (xpath = "//input[@id='appointment-id']") public WebElement EditAnAppointmentIdTextBox;
    @FindBy (xpath = "//button[@class='btn btn-warning btn-sm']") public WebElement EditAnAppointmentRequestInpatientButton;
    @FindBy (xpath = "(//a[@href='/ps-in-patient'])[2]") public WebElement myInPatients;
    @FindBy (xpath = "//tr//td[8]") public List<WebElement> inPatientsAppointmentList;
    @FindBy (xpath = "//th") public List<WebElement> inPatientsThead;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']") public WebElement toastifyCountryMessage;
    @FindBy (xpath = "(//a[@href='/country'])[2]") public WebElement countryLink;
    @FindBy (xpath = "(//a[@href='/c-state'])[2]") public WebElement stateCityLink;
    @FindBy (id = "jh-create-entity") public WebElement createANewCountry;
    @FindBy (xpath = "//input[@id=\"country-name\"]") public WebElement nameTextBoxCreateOrEditANewCountry;
    @FindBy (id = "save-entity") public WebElement saveButon;
    @FindBy (xpath = "//tr//td[1]") public List<WebElement> countriesIdList;
    @FindBy (id = "jhi-confirm-delete-country") public WebElement countriesDeleteConfirmButon;
    @FindBy (id = "hospitalmsappfrontendApp.country.delete.question") public WebElement countriesDeleteButonConfirmMessage;
    @FindBy (id = "jh-create-entity") public WebElement createANewStateCity;
    @FindBy (xpath = "//input[@id='c-state-name']") public WebElement createOrEditStateCityNameTextBox;



















    //100-149 Aybuke
    @FindBy (xpath = "//*[@class='appointment-btn scrollto']") public WebElement agMakeAnAppointment;
    @FindBy(xpath = "//*[text()='Your FirstName is required.']") public WebElement agFirstNameRequired;
    @FindBy(xpath = "//*[text()='Your LastName is required.']") public  WebElement agLastNameRequired;
    @FindBy(xpath = "//*[text()='Your SSN is required.']") public  WebElement agSsnRequired;
    @FindBy(xpath = "//*[text()='Your email is required.']") public  WebElement agEmailRequired;
    @FindBy(xpath = "//*[text()='Phone number is required.']") public  WebElement agPhoneRequired;
    @FindBy(xpath = "//input[@id='firstName']") public WebElement agFirstName;
    @FindBy(xpath = "//input[@id='lastName']") public WebElement agLastName;
    @FindBy(xpath = "//input[@id='ssn']") public WebElement agSsn;
    @FindBy(xpath = "//input[@id='email']") public WebElement agEmail;
    @FindBy(xpath = "//input[@id='phone']") public WebElement agPhone;
    @FindBy(id = "register-form") public WebElement agRegisterForm;
    @FindBy(xpath = "//*[text()='Send an Appointment Request']") public WebElement agSendAnAppointmentRequest;
    @FindBy(xpath = "//div[@class='Toastify']//span[1]") public WebElement agBasariliYazisi;
    @FindBy(xpath = "//*[@id='account-menu']") public WebElement agUserIconu;
    @FindBy(xpath = "//*[@id='login-item']") public WebElement agIlkSignIn;
    @FindBy(xpath = "//*[@id='username']") public WebElement agUsername;
    @FindBy(xpath = "//*[@id='password']") public WebElement agPassword;
    @FindBy(xpath = "//*[@class='btn btn-primary']") public WebElement agSignInButton;
    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']") public WebElement agMyPagesButton;
    @FindBy(xpath = "(//*[text()='My Appointments'])[1]") public WebElement agMyAppointmentsButton;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div") public WebElement agMyAppointmentsPage;
    @FindBy(xpath = "(//*[text()='Make an Appointment'])[1]") public WebElement agMakeAppointmentDropDown;
    @FindBy(xpath = "//input[@id='appoDate']") public WebElement agDateBox;
    @FindBy(xpath = "//*[text()='Appointment date can not be past date!']") public WebElement agGirilemezUyarisi;
    @FindBy(xpath = "(//*[text()='Ceyda Gürbüz'])[1]") public WebElement agProfilSekmesi;
    @FindBy(xpath = "(//*[text()='26/11/22 03:00'])[1]") public WebElement agAppointmentPageDate;
    @FindBy(xpath = "//span[normalize-space()='CONTACT']") public WebElement agContactButton;

    @FindBy(xpath = "//input[@id='name']") public WebElement agNameTextbox;

    @FindBy(xpath = "//*[@id='email']") public WebElement agEmailTextbox;

    @FindBy(xpath = "//*[@id='subject']") public WebElement agSubjectTextbox;

    @FindBy(xpath = "//*[@id='message']") public WebElement agMessageTextbox;

    @FindBy(xpath = "//*[text()='Send']") public WebElement agSendButton;

    @FindBy(xpath = "//div[@role='alert']") public WebElement agYourMessageHasBeenReceived;

    @FindBy(xpath = "//*[text()='Name is required.']") public WebElement agNameRequired;

    @FindBy(xpath = "//*[text()='Your email is required.']") public WebElement agEmailRequired2;
    @FindBy(xpath = "//*[text()='This field is required.']") public  WebElement agSubjectRequired;
    @FindBy(xpath = "//*[@id='contact']") public WebElement agSayfaResmi;



    //150-249 Caner

    @FindBy (xpath = "//*[@data-icon='user']") public WebElement userIconMck;
    @FindBy (xpath = "(//*[text()='Sign in'])[1]") public WebElement signInMck;
    @FindBy (xpath = "//*[@name='username']") public WebElement userNameMck;
    @FindBy (xpath = "//*[@name='password']") public WebElement passwordMck;
    @FindBy (xpath = "(//*[text()='Sign in'])[3]") public WebElement signInButtonMck;
    @FindBy (xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']") public WebElement userNameIconMck;
    @FindBy (xpath = "//*[text()='Password']") public WebElement passwordButtonMck;
    @FindBy (xpath = "//*[text()='Sign out']") public WebElement signOutButtonMck;
    @FindBy (xpath = "//*[@name='currentPassword']") public WebElement currentPasswordBoxMck;
    @FindBy (xpath = "//*[@name='newPassword']") public WebElement newPasswordBoxMck;
    @FindBy (xpath = "//*[@name='confirmPassword']") public WebElement confirmPasswordBoxMck;
    @FindBy (xpath = "//*[text()='Save']") public WebElement saveButtonMck;
    @FindBy (xpath = "//*[@class='text-danger form-group']") public WebElement passwordConfirmationBoxMck;
    @FindBy (xpath = "//*[text()='The password and its confirmation do not match!']") public WebElement passwordNotMatchAlertMck;
    @FindBy (xpath = "//*[@style='background-color: rgb(221, 221, 221);']") public WebElement passwordStrength5GreytMck;
    @FindBy (xpath = "(//*[@style='background-color: rgb(0, 255, 0);'])[5]") public WebElement passwordStrength5GreentMck;
    @FindBy (xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[4]") public WebElement passwordStrength4GreentMck;
    @FindBy (xpath = "//*[@style='background-color: rgb(255, 0, 0);']") public WebElement passwordStrength1RedMck;
    @FindBy (xpath = "//*[@class='alert alert-danger fade show']") public WebElement failedToSignInAlerttMck;
    @FindBy (xpath = "//*[text()='MY PAGES(PATIENT)']") public WebElement myPagesButtonMck;
    @FindBy (xpath = "(//*[text()='My Appointments'])[1]") public WebElement myAppointmentsButtonMck;
    @FindBy (xpath = "(//*[@id='fromDate']") public WebElement fromDateMck;
    @FindBy (xpath = "(//*[@id='toDate']") public WebElement toDateMck;
    @FindBy (xpath = "//*[text()='Show Tests']") public WebElement showTestsButtonMck;
    @FindBy (xpath = "//*[@class='d-none d-md-inline']") public WebElement viewResultButtonMck;
    @FindBy (xpath = "//*[text()='ID']") public WebElement testIdMck;
    @FindBy (xpath = "//*[text()='Name']") public WebElement testNameMck;
    @FindBy (xpath = "//*[text()='Result']") public WebElement testResultMck;
    @FindBy (xpath = "//*[text()='Default Min. Value']") public WebElement testDefaultMinValueMck;
    @FindBy (xpath = "//*[text()='Default Max. Value']") public WebElement testDefaultMaxValueMck;
    @FindBy (xpath = "//*[text()='Test']") public WebElement testTestMck;
    @FindBy (xpath = "//*[text()='Description']") public WebElement testDescriptionMck;
    @FindBy (xpath = "//*[text()='Date']") public WebElement testDateMck;
    @FindBy (xpath = "//*[@class='btn btn-warning btn-sm']") public WebElement showInvoiceButtonMck;
    @FindBy (xpath = "//*[text()='CASH']") public WebElement cashInvoiceMck;
    @FindBy (xpath = "//*[@name='username']") public WebElement userNameTwoMck;






























































    //250-299 Esra
    @FindBy(xpath = "//*[@data-prefix='fas']") public WebElement PhysiciankisiIconu;
    @FindBy(xpath = "//*[.='Sign in']") public WebElement PhysiciansignIn;
    @FindBy(xpath = "//*[@name='username']") public WebElement PhysicianuserName;
    @FindBy(xpath = "//*[@name='password']") public WebElement Physicianpassword;
    @FindBy(xpath = "(//span[.='Sign in'])[3]") public WebElement PhysiciansignInButton;
    @FindBy(xpath = "//*[text()='MY PAGES']") public WebElement PhysicianMyPages;
    @FindBy(xpath = " (//*[text()='My Appointments'])[1]") public WebElement PhysicianMyAppointments;
    @FindBy(id = "fromDate") public WebElement PhysicianMyAppointmentsFrom;
    @FindBy(id = "toDate") public WebElement PhysicianMyAppointmentsTo;
    @FindBy(xpath = "//span[.='ID']") public WebElement PhysicianMyAppointmentsId;
    @FindBy(xpath = "//span[.='Start DateTime']") public WebElement PhysicianMyAppointmentsStartDateTime;
    @FindBy(xpath = "//span[.='End DateTime']") public WebElement PhysicianMyAppointmentsEndDateTime;
    @FindBy(xpath = "//span[.='Status']") public WebElement PhysicianMyAppointmentsStatus;
    @FindBy(xpath = "//span[text()='No Appointments found']") public WebElement PhysicianRandevuUyariMesaji;
    @FindBy(xpath = "//div[contains(text(),'Days between begin date and end date must be max 15 days')]") public WebElement PhysicianHataMesaji;
    @FindBy(xpath = "//span[text()='Search Patient']") public WebElement StaffSearchPatient;
    @FindBy(xpath = "//input[@name='ssn']") public WebElement StaffPatientSSN;
    @FindBy(xpath = "//span[text()='Show Appointments']") public WebElement StaffShowAppointments;
    @FindBy(css= "select[name=status]>option") public List<WebElement> StaffStatus;
    @FindBy(css="#appointment-anamnesis") public WebElement StaffAnamnesis;
    @FindBy(css ="#appointment-treatment") public WebElement StaffTreatment;
    @FindBy(css ="#appointment-diagnosis") public WebElement StaffDiagnosis;
    @FindBy(css ="#appointment-physician") public WebElement StaffPhysician;
    @FindBy(css="#save-entity") public WebElement StaffSave;
    @FindBy(css="a[href='/tests/appointment/306280']") public WebElement StaffShowTests;
    @FindBy(css="a[href='/testresult/test/357589']") public WebElement StaffTestResult;
    @FindBy(xpath="//a[contains(@href,'/c-test-result-update/362290')]") public WebElement StaffTestEdit;
    @FindBy(xpath="//td[text()='Potassium']") public WebElement StaffPotassium;
    @FindBy(css="#appointment-status") public WebElement StaffDropDown;
    @FindBy(css="a[href='/appointment-update/306280']") public WebElement StaffEdit;
    @FindBy(xpath = "//span[text()='Create or Edit an Appointment']") public WebElement StaffUpdate;
    @FindBy (xpath = "//table[@class='table']//th") public List<WebElement> hastayaAitBilgiler;
    @FindBy (xpath = "//div[contains(text(),'The Appointment is updated with identifier 306280')]") public WebElement appointmentUpdatedMesaj;
    @FindBy (xpath = "//*[@id='c-test-result-result']") public WebElement resultTest;
    @FindBy (xpath = "//input[@id='c-test-result-description']") public WebElement descriptionTest;
    @FindBy (xpath = "//*[@href='/c-test-result-update/362289']") public WebElement potasyumTestEdit;
    @FindBy (xpath = "//*[@id='appointment-status']") public WebElement appointmentstatus;
    @FindBy (xpath = "(//span[text()='Edit'])[3]") public WebElement appointmentsEditButton;











    //300-399 Fatma

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")    public WebElement login;
    @FindBy(xpath = "//*[@id='login-item']")    public WebElement logSignin9;
    @FindBy(xpath = "//*[@name='username']")    public WebElement signinUsername9;
    @FindBy(xpath = "//*[@name='password']")    public WebElement signinPassword9;
    @FindBy(xpath = "(//span[text()='Sign in'])[3]")    public WebElement signInButton9;
    @FindBy(xpath = "//span[text()='MY PAGES']")    public WebElement dropDownMyPages9;
    @FindBy(xpath = "//span[text()='Search Patient']")    public WebElement dropDownMyPagesSearchPatient9;
    @FindBy(xpath = "//input[@name='ssn']")    public WebElement patientSSNBox9;
    @FindBy(xpath = "//span[text()='View']")    public WebElement patientView9;
    @FindBy(xpath = "//span[text()='Patients']")    public WebElement patientViewTrue9;
    @FindBy(xpath = "//span[text()='Edit']")    public WebElement patientEdit9;
    @FindBy(xpath = "//span[text()='Show Appointments']")    public WebElement patientShowAppointments9;
    @FindBy(xpath = "//h2[text()='Appointments']")    public WebElement patientShowAppointmentsTrue9;
    @FindBy(xpath = "//span[text()='Save']")    public WebElement patientEditSave9;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")    public WebElement patientEditSaveBasarili9;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement patientEditFirstname9;
    @FindBy(xpath = "//input[@name='email']")    public WebElement patientEditEmail9;
    @FindBy(xpath = "//input[@name='phone']")    public WebElement patientEditPhone9;
    @FindBy(xpath = "//span[text()='Items&Titles']")    public WebElement itemTitles15;
    @FindBy(xpath = "//span[text()='Patient']")    public WebElement patient15;
    @FindBy(xpath = "//span[text()='Create a new Patient']")    public WebElement createANewPatient15;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-patient']")    public WebElement deleteSure15;
    @FindBy(xpath = "//span[text()='Create or edit a Patient']")    public WebElement createOrEditText15;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement createFirstname15;
    @FindBy(xpath = "//input[@name='lastName']")    public WebElement createLastname15;
    @FindBy(xpath = "//input[@name='birthDate']")    public WebElement createBirthDate15;
    @FindBy(xpath = "//input[@name='email']")    public WebElement createEmail15;
    @FindBy(xpath = "//input[@name='phone']")    public WebElement createPhone15;
    @FindBy(xpath = "//select[@name='gender']")    public WebElement createGender15;
    @FindBy(xpath = "//select[@name='bloodGroup']")    public WebElement createBloodGroup15;
    @FindBy(xpath = "//input[@name='adress']")    public WebElement createAdress15;
    @FindBy(xpath = "//textarea[@name='description']")    public WebElement createDescription15;
    @FindBy(xpath = "//select[@name='country.id']")    public WebElement createCountry15;
    @FindBy(xpath = "//select[@name='cstate.id']")    public WebElement createState15;
    @FindBy(xpath = "//*[text()='Save']")    public WebElement createSave15;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")    public WebElement createSaveBasarili15;
    @FindBy(xpath = "//*[text()='542-59-8193']/following-sibling::td[14]/div/a[2]")    public WebElement edit15;
    @FindBy(xpath = "//*[text()='647-52-4303']/following-sibling::td[14]/div/a[3]")    public WebElement delete15;
    @FindBy(xpath = "//thead/tr/th")    public List<WebElement> basliklar15;
    @FindBy(xpath = "(//*[text()='Room'])[1]")    public WebElement room16;
    @FindBy(xpath = "//*[text()='17352']/following-sibling::td[6]/div/a[3]")    public WebElement delete16;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-room']")    public WebElement deleteSure16;
    @FindBy(xpath = "//*[text()='274137']/following-sibling::td[6]/div/a[2]")    public WebElement edit16;
    @FindBy(xpath = "//span[text()='Create a new Room']")    public WebElement createANewRoom16;
    @FindBy(xpath = "//input[@name='roomNumber']")    public WebElement roomNumber16;
    @FindBy(xpath = "//*[@name='roomType']")    public WebElement roomType16;
    @FindBy(xpath = "//*[@name='status']")    public WebElement status16;
    @FindBy(xpath = "//*[@name='price']")    public WebElement price16;
    @FindBy(xpath = "//*[@id='room-description']")    public WebElement roomDescription16;
    @FindBy(xpath = "//*[@id='room-createdDate']")    public WebElement roomCreateDate16;
    @FindBy(xpath = "//span[text()='Save']")    public WebElement roomSave16;
    @FindBy(xpath = "(//div[text()='This field is required.'])[1]")    public WebElement bosBirakilamaz16;
    @FindBy(xpath = "//*[text()='Room Type']")    public WebElement tabloRoomtype16;
    @FindBy(xpath = "(//tbody/tr/td[3])[1]")    public WebElement tabloRoomtypeIlk16;
    @FindBy(xpath = "//tbody/tr/td[3]")    public List<WebElement> tabloRoomtypeAyniList16;











































    //400-499 Yahya
    @FindBy(xpath = "//span[contains(text(),'Sign in')]") public WebElement yysign;
    @FindBy(xpath = "//*[@name='username']") public WebElement yyusurname;
    @FindBy(xpath = "//*[@name='password']") public WebElement yypassword;
    @FindBy(xpath = "//*[@class='btn btn-primary']") public WebElement yysign2;
    @FindBy(xpath = "//span[contains(text(),'Settings')]") public WebElement yyseetings;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']") public WebElement yymertDemirci;
    @FindBy(xpath = "//span[contains(text(),'Remember me')]") public WebElement yyremember;
    @FindBy(xpath = "(//*[@class='alert alert-warning fade show'])[1]") public WebElement yydidYouForgetPass;
    @FindBy(xpath = "(//*[@class='alert alert-warning fade show'])[2]") public WebElement yyregistirnewAccount;
    @FindBy(xpath = "//html") public WebElement yyekranresmi;
    @FindBy(xpath = "//*[@id='firstName']") public WebElement yySettingsfirstName;
    @FindBy(xpath = "//*[@id='lastName']") public WebElement yySettingslastName;
    @FindBy(xpath = "//*[@id='email']") public WebElement yySettingsemail;
    @FindBy(xpath = "//button[@type='submit']") public WebElement yysave;
    @FindBy(xpath = "//strong[contains(text(),'Settings saved!')]") public WebElement yyseettingsSaved;
    @FindBy(xpath ="//*[contains(text(),'Authentication information not correct.')]") public WebElement yyhataliGirisUyarisi;
    @FindBy(xpath = "//span[contains(text(),'Cancel')]") public WebElement yycancel;
    @FindBy(xpath = "//*[@id='save-entity']") public WebElement yysaveButonu;
    @FindBy(xpath = "//*[text()='Items&Titles']") public WebElement itemsTitlesYY;
    @FindBy(xpath = "//*[@data-icon='user-nurse']") public WebElement staffButtonYY;
    @FindBy(xpath = "//*[text()='»»']") public WebElement enSonaGitYY;
    @FindBy(xpath = "//*[@name='ssn']") public WebElement ssnYY;
    @FindBy(xpath = "//*[text()='Administration']") public WebElement administrationYY;
    @FindBy(xpath = "//*[text()='User management']") public WebElement userManagementYY;
    @FindBy(xpath = "//*[text()='ROLE_STAFF']") public WebElement roleStaffYY;
    @FindBy(xpath = "//*[text()='ROLE_ADMIN']") public WebElement roleAdminYY;
    @FindBy(xpath = "//*[text()='ROLE_USER']") public WebElement roleUserYY;
    @FindBy(xpath = "//*[text()='ROLE_PATIENT']") public WebElement rolePatientYY;
    @FindBy(xpath = "//*[text()='ROLE_PHYSICIAN']") public WebElement rolePhysicianYY;
    @FindBy(xpath = "//*[text()='Save']") public WebElement staffSaveButonuYY;
    @FindBy(xpath = "//*[text()='Create a new Staff']") public WebElement createANewStaffYY;
    @FindBy(xpath = "//*[@id='useSSNSearch']") public WebElement useSearchCheckBoxYY;
    @FindBy(xpath = "//*[@id='searchSSN']") public WebElement ssnSearchBoxYY;
    @FindBy(xpath = "//*[text()='Search User']") public WebElement searchUserYY;
    @FindBy(xpath = "//*[@id='staff-phone']") public WebElement staffPhoneYY;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']") public WebElement staffSilindiBasariMesajiYY;
    @FindBy(xpath = "//*[starts-with(text(), 'A new Staff is created with identifier')]") public WebElement staffOlusturulduMesajiYY;
    @FindBy(xpath = "//*[text()='Create a new user']") public WebElement createANewUserYY;
    @FindBy(xpath = "//*[@name='login']") public WebElement userLoginYY;
    @FindBy(xpath = "//*[@class='btn btn-danger']") public WebElement deleteConfirmYY;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']") public WebElement userFoundBasariMesajiYY;
    @FindBy(xpath = "//*[@name='firstName']") public WebElement firstNameyy;
    @FindBy(xpath = "//*[@name='lastName']") public WebElement lastNameyy;
    @FindBy(xpath = "//*[@name='phone']") public WebElement phoneYY;
    @FindBy(xpath = "//*[@name='adress']") public WebElement addressYY;
    @FindBy(xpath = "//*[@id='staff-description']") public WebElement descriptionYY;
    @FindBy(xpath = "//*[@name='country.id']") public WebElement countryYY;
    @FindBy(xpath = "//*[@name='cstate.id']") public WebElement stateCityYY;
    @FindBy(xpath = "(//*[@class='btn btn-info btn-sm'])[1]") public WebElement viewButtonYY;
    @FindBy(xpath = "//*[text()='User']") public WebElement userBilgisiYY;
    @FindBy(xpath = "//*[text()='Save']") public WebElement saveYY;
    @FindBy(xpath = "//*[starts-with(text(), 'Internal')]") public WebElement internalServerYY;
    @FindBy(xpath = "//*[@value='Giusepped']") public WebElement value1YY;
    @FindBy(xpath = "//*[@value='Reilly']") public WebElement value2YY;
    @FindBy(xpath = "//*[@value='anton.quigley@testmail.com']") public WebElement value3YY;
    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]") public WebElement editYY;
    @FindBy(xpath = "(//th[@class='hand'])[1]") public WebElement userManagementIDYY;
    @FindBy(xpath = "//*[text()='532-11-3333']/following-sibling::td[8]/div/a[3]") public WebElement userManagementDeleteyy;
    @FindBy(xpath = "(//span[text()='Delete'])[21]") public WebElement comfirmDeleteyy;








































    //500-549 Zeynep
    @FindBy (xpath = "//button[@id='save-entity']")  public WebElement createOrEditAppointmentsSave;
    @FindBy (xpath = "//tr//th[1]") public WebElement idAppointments;
    @FindBy (xpath = "//tr//th[2]") public WebElement startDateTimeAppointments;
    @FindBy (xpath = "//tr//th[3]") public WebElement endDataTimeAppointments;
    @FindBy (xpath = "//tr//th[4]") public WebElement statusAppointments;
    @FindBy (xpath = "//tr//th[11]") public WebElement physicianAppointments;
    @FindBy (xpath = "//tr//th[12]") public WebElement patientAppointments;
    @FindBy (xpath = "//*[@id='appointment-anamnesis']") public WebElement anamnesisBoxZSG;
    @FindBy (xpath = "//*[@id='appointment-treatment']") public WebElement treatmentBoxZSG;
    @FindBy (xpath = "//*[@id='appointment-diagnosis']") public WebElement diagnosisBoxZSG;
    @FindBy (xpath = "//*[@id='appointment-prescription']") public WebElement prescriptionBoxZSG;
    @FindBy (xpath = "//*[@id='appointment-description']") public WebElement descriptionBoxZSG;
    @FindBy(xpath = "//option[@value='PENDING']") public WebElement pendingSelect;
    @FindBy (xpath = "//*[@class='btn btn-success btn-sm']") public WebElement requestATestZSG;
    @FindBy (xpath = "//*[@id='appointment-status']") public WebElement completedBoxZSG;
    @FindBy (xpath = "(//*[@class='hand'])[1]") public WebElement idBoxZSG;
    @FindBy (xpath = "//*[@class='d-none d-md-inline']") public List<WebElement> viewResultBoxListZSG;
    @FindBy (xpath = "//*[@class='btn btn-link btn-sm']") public List<WebElement> idResultBoxListZSG;
    @FindBy (xpath = "//*[@class='btn btn-danger btn-sm']") public WebElement showResultTestZSG;
    @FindBy (xpath = "//*[@id='132751']") public WebElement glucoseTestClick;
    @FindBy (xpath = "//*[@id='1402']") public WebElement ureaTestClick;
    @FindBy (xpath = "//*[@id='132793']") public WebElement creatinineTestClick;
    @FindBy (xpath = "//*[@id='74693']") public WebElement sodiumTestClick;
    @FindBy (xpath = "//*[@id='132795']") public WebElement potassiumTestClick;
    @FindBy (xpath = "//*[@id='132796']") public WebElement totalProteinTestClick;
    @FindBy (xpath = "//*[@id='132797']") public WebElement albuminTestClick;
    @FindBy (xpath = "//*[@id='132799']") public WebElement hemoglobinTestClick;
    @FindBy (xpath = "//li[@id='entity-menu']") public WebElement itemTitlesMenuZSG;
    @FindBy (xpath = "//span[text()='Messages']") public WebElement messagesButtonZSG;
    @FindBy (xpath = "//tbody/tr[1]/td[5]") public WebElement mesajPortalMesajSutunZSG;
    @FindBy (xpath = "//tbody/tr[1]/td[2]") public WebElement mesajPortalIsimSutunZSG;
    @FindBy (xpath = "//tbody/tr[1]/td[5]") public WebElement mesajPortalEmailSutunZSG;
    @FindBy (xpath = "//a[@id='jh-create-entity']") public WebElement createANewMessageButtonZSG;
    @FindBy (xpath = "//input[@id='c-message-name']") public WebElement adminMessageNameBoxZSG;
    @FindBy (xpath = "//input[@id='c-message-email']") public WebElement adminMessageEmailBoxZSG;
    @FindBy (xpath = "//input[@id='c-message-subject']") public WebElement adminMessageSubjectBoxZSG;
    @FindBy (xpath = "//input[@id='c-message-message']") public WebElement adminMessageYazBoxZSG;
    @FindBy (xpath = "//button[@id='save-entity']") public WebElement messageSavedButtonZSG;
    @FindBy (xpath = "//div[@role='alert']") public WebElement mesajCreatedTextZSG;
    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-sort fa-w-10 '])[1]") public WebElement idOkBoxZSG;
    @FindBy (xpath = "(//*[@class='btn btn-primary btn-sm'])[1]") public WebElement mesajEditBoxZSG;
    @FindBy (xpath = "//div[@role='alert']") public WebElement mesajUpdatedTextZSG;
    @FindBy (xpath = "(//*[@class='btn btn-danger btn-sm'])[1]") public WebElement mesajDeleteBoxZSG;
    @FindBy (xpath = "//button[@id='jhi-confirm-delete-cMessage']") public WebElement deleteButtonOnayZSG;
    @FindBy (xpath = "//div[@role='alert']") public WebElement mesajDeletedTextZSG;




    //550- Musa
    @FindBy (xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[4]") public WebElement passwordStrength5Gri;
    @FindBy (xpath = "//li[@style='background-color: rgb(221, 221, 221);']") public WebElement passwordStrength5Gri1;
    @FindBy (xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[5]") public WebElement passwordStrength5Green;
    @FindBy(xpath = "//*[@data-icon='user']") public WebElement profilButonu;
    @FindBy(xpath = "//*[text()='Sign in']") public WebElement SignIn1;
    @FindBy(xpath = "//input[@id='username']") public WebElement userNameSign;
    @FindBy(xpath = "//input[@id='password']") public WebElement passwordSign;
    @FindBy(xpath = "//div//button[@class='btn btn-primary']") public WebElement SignIn2;
    @FindBy(xpath = "//*[text()='Items&Titles']") public WebElement itemsTitles;
    @FindBy(xpath = "//*[text()='Test Item']") public WebElement testItem;
    @FindBy(xpath = "//*[text()='Create a new Test Item']") public WebElement createNewTestItem;
    @FindBy(xpath = "//input[@name='name']") public WebElement Name;
    @FindBy (xpath = "//input[@name='description']") public WebElement Description;
    @FindBy(xpath = "//input[@name='price']") public WebElement Price;
    @FindBy(xpath = "//input[@name='defaultValMin']") public WebElement defaultValMin;
    @FindBy(xpath = "//input[@name='defaultValMax']") public WebElement defaultValMax;
    @FindBy(xpath = "//input[@name='createdDate']") public WebElement createdDate;
    @FindBy(xpath = "//*[@id='save-entity']") public WebElement SaveButonu;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement TestItemCreated;
    @FindBy(xpath = "(//td//div//a[@class='btn btn-primary btn-sm'])[1]") public WebElement firstClassfirstEdit;
    @FindBy(xpath = "//*[@name='name']") public WebElement nameUpdate;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement testItemUpdated;
    @FindBy(xpath = "(//td//div//a[@class='btn btn-info btn-sm'])[1]") public WebElement firstClassfirstView;
    @FindBy(xpath = "//h2//b[text()='1401']") public WebElement id1401View;
    @FindBy(xpath = "//*[text()='1401']") public WebElement id1401TestItem;
    @FindBy(xpath = "//ul//li//a[text()='98']") public WebElement sayfaDoksansekiz;
    @FindBy(xpath = "(//td//div//a[@class='btn btn-danger btn-sm'])[4]") public WebElement sayfaDoksansekizDorduncuDelete;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement testItemDeleted;
    @FindBy(xpath = "(//*[text()='Physician'])[1]") public WebElement physician;
    @FindBy(xpath = "//tbody//tr") public List<WebElement> firstTable;
    @FindBy(xpath = "//*[text()='Create a new Physician']") public WebElement createANewPhysician;
    @FindBy(xpath = "//*[@id='useSSNSearch']") public WebElement userSearch;
    @FindBy(xpath = "//*[@id='searchSSN']") public WebElement searchSsnText;


    @FindBy(xpath = "(//td//div//a[@class='btn btn-primary btn-sm'])[1]") public WebElement firstDoctorfirstEdit;
    @FindBy(xpath = "(//*[@class='btn btn-link btn-sm'])[1]") public WebElement firstDoctorId;
    @FindBy(xpath = "//div//a//span[text()='Edit']") public WebElement doctorEdit;
    @FindBy(xpath = "//*[@id='physician-firstName']") public WebElement editFirstName;
    @FindBy(xpath = "//*[@id='physician-lastName']") public WebElement editLastName;
    @FindBy(xpath = "//*[@id='physician1-birthDate']") public WebElement editBirthDate;
    @FindBy(xpath = "//*[@id='physician-phone']") public WebElement editPhone;
    @FindBy(xpath = "//*[@id='physician-adress']") public WebElement editAdress;
    @FindBy(xpath = "//*[@id='physician-gender']") public WebElement editGenderDdm;
    @FindBy(xpath = "//*[@id='physician-speciality']") public WebElement editSpecialityDdm;
    @FindBy(xpath = "//*[@id='physician-bloodGroup']") public WebElement editBloodGroupDdm;
    @FindBy(xpath = "//*[@id='physician-description']") public WebElement editDescriptions;
    @FindBy(xpath = "//input[@id='file_image']") public WebElement editDosyaSecButton;
    @FindBy(xpath = "//*[@id='physician-examFee']") public WebElement editExamFee;
    @FindBy(xpath = "//select[@name='user.id']") public WebElement editUserDdm;
    @FindBy(xpath = "//div//select[@name='user.id']") public WebElement doctorUserDdm1;
    @FindBy(xpath = "//*[@id='physician-country']") public WebElement editCountryDdm;
    @FindBy(xpath = "//*[@name='cstate.id']") public WebElement editCityDdm;
    @FindBy(xpath = "//*[@id='save-entity']") public WebElement editSave;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement editDoctorUpdated;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement physicianCreated;
    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagement;
    @FindBy(xpath = "//*[text()='Create a new user']")
    public WebElement createANewUser;
    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginTextBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement roleDdm;
    @FindBy(xpath = "(//*[text()='Medunna'])[1]")
    public WebElement medunnaText;

    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUser;
    @FindBy(xpath = "//input[@id='searchSSN']")
    public WebElement searchSSN;
    @FindBy(xpath = "//div[text()='User found with search SSN']") public WebElement userFoundWithSearchSSN;
    @FindBy(xpath = "//*[text()='Save']") public WebElement saveButton;
    @FindBy(xpath = "//span[text()='38 631 bytes']") public WebElement doktorImage;
    @FindBy(xpath = "//*[text()='»»']") public WebElement doktorSonSayfa;
    @FindBy(xpath = "//td[3]") public List<WebElement> doktorSonSayfaSSNList;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-physician']") public WebElement deleteButton2;
    @FindBy(xpath = "//*[text()='A Physician is deleted with identifier']") public WebElement deleteDogrulamaMesaji;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement deleteDogrulamaMesaji1;
    @FindBy(xpath = "//a[@class='btn btn-link btn-sm']") public WebElement secilenDoktor;
    @FindBy(xpath = "//*[text()='An unexpected error has occurred.']") public WebElement secilenDoktorHataMesaji;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-cTestItem']") public WebElement tekrarDeleteButonu;
}
