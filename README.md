# qa-technical-assessment

**Task# 1**

**Feature**: Age calculator web application 

**Background**:

Given web application accepts dd/mm/yyyy date format

**Scenario 1**: *Verify age calculator accepts valid date format*

When I enter my date of birth in valid format\
Then the age number is correctly displayed 

**Scenario 2**: *Verify age calculator does not accept two digit year date format*

When I enter my date of birth in dd/mm/yy format\
Then the age number is not displayed 

**Scenario 3**: *Verify age calculator does not accept different date format*

When I enter my date of birth in mm/dd/yyyy date format\
Then the age number is not displayed 

**Scenario 4**: *Verify age calculator does not accept period(.) separator*

When I enter my date of birth in dd.mm.yyyy date format\
Then the age number is not displayed

**Scenario 5**: *Verify age calculator does not accept hyphen(-) separator*

When I enter my date of birth in dd-mm-yyyy date format\
Then the age number is not displayed

**Scenario 6**: *Verify age calculator does not accept blank input*

When I enter my date of birth in dd/ /yyyy date format\
Then the age number is not displayed

**Scenario 7**:  *Verify age calculator does not accept space as input* 

When I enter spaces between numbers\
Then the age number is not displayed 

**Scenario 8**: *Verify age calculator does not accept letters*

When I enter letters\
Then the age number is not displayed

**Scenario 9**: *Verify age calculator does not accept special characters*

When I enter special characters\
Then the age number is not displayed 

**Scenario 10**: *Verify age calculator does not accept date of birth in future* 

When I enter my date of birth in future\
Then the age number is not displayed 

**Scenario 11**: *Verify age calculator does not accept single digit as input*

When I enter my birth month as 0\
Then the age number is not displayed 

**Scenario 12**: *Verify age calculator does not accept 00 as input*

When I enter my birthday as 00\
Then the age number is not displayed 

**Scenario 13**: *Verify age calculator does not accept Feb 30th input*

When I enter my birthday as 30 Feb\
Then the age number is not displayed 

**Scenario 14**: *Verify age calculator does not accept 32nd day as input*

When I enter my birthday as 32\
Then the age  number is not displayed 

**Scenario 15**: *Verify age calculator does not accept single digit as month input*

When I enter month of my birth as 0\
Then the age number is not displayed 

**Scenario 16**: *Verify age calculator does not accept 00 as birth month input*

When I enter month of my birth as 00\
Then the age number is not displayed 

**Scenario 17**: *Verify age calculator does not accept 13 as birth month input*

When I enter month of my birth as 13\
Then the age number is not displayed 

**Scenario 18**: *Verify age calculator does not accept single digit as birth year input*

When I enter my birth year as 0\
Then the age number is not displayed 

**Scenario 19**: *Verify age calculator does not accept 0000 as birth year input*

When I enter my birth year as 0000\
Then the age number is not displayed 

**Scenario 20**: *Verify age calculator does not accept negative numbers as birthday input* 

When I enter negative numbers\
Then the age number is not displayed
