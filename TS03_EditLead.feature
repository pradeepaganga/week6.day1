Feature: Edit Lead Functionality

Scenario Outline: Edit Lead

When Click find leads
And Click on phone
Given Send phone number as <phno>
When Find Leads
Given update company name as <company>
When Submit Edit Details
Then Verify Edited Title Page

Examples:
|phno|company|
|'98'|'prad'|

