Feature: Web Actions ACT 31
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Alerts_1
@uid1608309869
@set21
@test001
@Register
Scenario Outline: Register
Given I have access to application
When I scroll and check Hockey_CB in alerts register
And I scroll and enter text Confirm password_tb in alerts register as '<Confirm password_tb1>'
Then verify placeholder first name_ta in alerts register as '<first name_ta2>'
When I take screenshot tb test in alerts register as '<tb test3>'
Then verify placeholder first name_tb in alerts register as '<first name_tb4>'
When I scroll and enter text first name_ta in alerts register as '<first name_ta5>'
And I scroll and clear enter text Confirm password_tb in alerts register as '<Confirm password_tb6>'
And I scroll and clear enter text first name_ta in alerts register as '<first name_ta7>'
And I scroll and uncheck Hockey_CB in alerts register
And I scroll and click language button in alerts register
And I scroll and click last name_RB in alerts register
And I scroll and click refresh link in alerts register
And I scroll and click Address img in alerts register
And I scroll and click countries label in alerts register
And I scroll wait and click Address img in alerts register
And I scroll wait and click refresh link in alerts register
And I scroll wait and click language button in alerts register
And I scroll to the element Confirm password_tb in alerts register as '<Confirm password_tb8>'
And I open new tab and navigate Opn nw tab and nav_tb in alerts register as '<Opn nw tab and nav_tb>'
And I scroll down ui element_scroll in alerts register as '5'
And I open new tab and navigate Opn nw tab and nav_pg in alerts register as 'https://the-internet.herokuapp.com/infinite_scroll'
And I scroll down ui element_tb in alerts register as '<ui element_tb>'
And I open new tab and navigate Opn nw tab and nav_nt in alerts register as '<Opn nw tab and nav_nt>'
And I scroll down ui element_scroll in alerts register as '5'
And I open new browser browser_tb in alerts register as '<browser_tb>'
Then verify text Intinite scroll_tb in alerts register
And verify text Infinite scroll button in alerts register
When I open new browser browser_pg in alerts register as 'https://the-internet.herokuapp.com/infinite_scroll'
Then verify text Infinite scroll link in alerts register
And verify text Infinite scroll label in alerts register
When I close tab close page in form authentication
Then '<page>' is displayed with '<content>'

Examples:
|SlNo.|Confirm password_tb1|first name_ta2|tb test3|first name_tb4|first name_ta5|Confirm password_tb6|first name_ta7|Confirm password_tb8|Opn nw tab and nav_tb|ui element_tb|Opn nw tab and nav_nt|browser_tb|page|content|
|1|fake password|First Name|register|First Name|fake name ta|fake password tb 2|fake name ta 2|1|https://the-internet.herokuapp.com/infinite_scroll|7|https://the-internet.herokuapp.com/infinite_scroll|https://the-internet.herokuapp.com/infinite_scroll|NA|NA|

#Total No. of Test Cases : 1

