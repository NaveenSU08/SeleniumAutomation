package com.sgtesting.pomassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}

	//UserName text field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password text field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//ClickLogin Button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getloginButton()
	{
		return oLogin;
	}
	
	//Clicklogout Button field
	private WebElement logoutLink;
	public WebElement getlogoutButton()
	{
		return logoutLink;
	}
	
	
	//ClickUser Button field
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement clickUser;
	public WebElement getclickUserButton()
	{
		return clickUser;
	}
		
	//AddUser Button field
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUser;
	public WebElement getaddUserButton()
	{
		return addUser;
	}
				
	//Firstname text field
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}			
	
	//Lastname text field
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	//Email text field
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
		
	//Username text field
	private WebElement userDataLightBox_usernameField;
	public WebElement getUsername()
	{
		return userDataLightBox_usernameField;
	}
	
	//Password text field
	private WebElement userDataLightBox_passwordField;
	public WebElement getuserPassword()
	{
		return userDataLightBox_passwordField;
	}
		
	//Retypepassword text field
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getretypepassword()
	{
		return userDataLightBox_passwordCopyField;
	}
		
	//CreateUser field
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUser;
	public WebElement getcreateUser()
	{
		return createUser;
	}
	
	//ClickDemoUser Button field
    @FindBy(xpath="//span[text()='User, Demo']")
	private WebElement demouserbutton;
	public WebElement getdemouserbutton()
	{
		return demouserbutton;
	}
	
	//DeleteUser button field
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//SaveChanges button field
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement savechanges;
	public WebElement getSaveChanges()
	{
		return savechanges;
	}
	
	//ClickTask button field
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement clickTask;
	public WebElement getTaskButton()
	{
		return clickTask;
	}
	
	//AddNew button field
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement clickAddNew;
	public WebElement getAddNew()
	{
	    return clickAddNew;
	}
	
	//ClickTask button field
	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement newCustomer;
	public WebElement getNewCustomer()
	{
		return newCustomer;
	}
			
	//EnterCustomerName text field
	private WebElement customerLightBox_nameField;
	public WebElement getEnterCustomerName()
	{
		return customerLightBox_nameField;
	}
	
	//CreateCustomer button field
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomer;
	public WebElement getCreateCustomer()
	{
		return createCustomer;
	}
	
	//NewCustomer Setting button field
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement ncSettingbutton;
	public WebElement getNCSettingButton()
	{
		return ncSettingbutton;
	}
	
	//Actions button field
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement actionCButton;
	public WebElement getActionCButton()
	{
		return actionCButton;
	}
	
	//DeleteCustomer button field
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deleteCustomer;
	public WebElement getdeleteCustomer()
	{
		return deleteCustomer;
	}
	
	//DeleteCustomerPermently button field
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getdeleteCPermently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}	
	
	//ModifyCustomerclick button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement modifyCclick;
	public WebElement getmodifyCustomerclick()
	{
		return modifyCclick;
	}
	
	//ModifyCustomerInput button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement modifyCInput;
	public WebElement getmodifyCustomerInput()
	{
		return modifyCInput;
	}
	
	//NewProject button field
	@FindBy(xpath="/html/body/div[12]/div[2]")
	private WebElement newProject;
	public WebElement getnewProject()
	{
		return newProject;
	}
	
	//EnterProjectName text field
	private WebElement projectPopup_projectNameField;
	public WebElement getEnterProjectName()
	{
		return projectPopup_projectNameField;
	}
	
	//CreateProject button field
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProject;
	public WebElement getCreateProject()
	{
		return createProject;
	}
	
	//NewProject Setting button field
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement npSettingbutton;
	public WebElement getNPSettingButton()
	{
		return npSettingbutton;
	}
	
	//Actions button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement actionPButton;
	public WebElement getActionPButton()
	{
		return actionPButton;
	}
	
	//DeleteProject button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteProject;
	public WebElement getdeleteProject()
	{
		return deleteProject;
	}
	
	//DeleteProjectPermently button field
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getdeletePPermently()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//ModifyProjectclick button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement modifyPclick;
	public WebElement getmodifyProjectclick()
	{
		return modifyPclick;
	}
	
	//ModifyProjectInput button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement modifyPInput;
	public WebElement getmodifyProjectInput()
	{
		return modifyPInput;
	}
	
	//AddNewTask button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addNewTask;
	public WebElement getAddNewTask()
	{
		return addNewTask;
	}
	
	//CreateNewTask button field
	@FindBy(xpath="/html/body/div[11]/div[1]")
	private WebElement createNewTasks;
	public WebElement getCreateNewTasks()
	{
		return createNewTasks;
	}
	
	//EnterTaskName button field
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
	private WebElement enterTaskName;
	public WebElement getEnterTaskName()
	{
		return enterTaskName;
	}
	
	//CreateTask button field
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createTask;
	public WebElement getCreateTask()
	{
		return createTask;
	}
	
	//TaskCheckbox button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
	private WebElement taskCheckbox;
	public WebElement getTaskCheckbox()
	{
		return taskCheckbox;
	}
	
	//DeleteTask button field
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]/span")
	private WebElement deleteTask;
	public WebElement getDeleteTask()
	{
		return deleteTask;
	}
		
	//DeleteTaskPermentaly button field
	private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
	public WebElement getdeleteTaskPermentaly()
	{
		return deleteTaskPopup_deleteConfirm_submitTitle;
	}
	
	//ClickDemoUser1 button field
	@FindBy(xpath="//span[text()='User1, Demo']")
	private WebElement clickDemoUser1;
	public WebElement getClickDemoUser1()
	{
		return clickDemoUser1;
	}
	
	//ClickDemoUser2 button field
	@FindBy(xpath="//span[text()='User2, Demo']")
	private WebElement clickDemoUser2;
	public WebElement getClickDemoUser2()
	{
		return clickDemoUser2;
	}
		
	//ClickDemoUser3 button field
	@FindBy(xpath="//span[text()='User3, Demo']")
	private WebElement clickDemoUser3;
	public WebElement getClickDemoUser3()
	{
		return clickDemoUser3;
	}
	
	//ExploreactiTime button field
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement exploreactiTime;
	public WebElement getexploreactiTime()
	{
		return exploreactiTime;
	}
}


