Feature: leaftaps CreateLead functionality


Scenario Outline: CreateLead with mandatory informations

When Click on Create Lead
Given Enter company name as <company>
And Enter First name as <fname>
And Enter Last name as <lname>
And Enter phone as <phno>
When click on submitbutton
Then Verify create lead page is displayed


Examples:
|company|fname|lname|phno|
|'TestLeaf'|'Hari'|'R'|'98'|



