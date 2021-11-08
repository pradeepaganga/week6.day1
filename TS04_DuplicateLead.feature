Feature: To test Duplicate Lead functionality

Scenario Outline: Duplicate lead creation

Given Search Leads with phone number as <phno>
When Click on Duplicate Lead
And Click on submit Duplicate Lead
Then verify Duplicate Lead

Examples:
|phno|
|'97'|



