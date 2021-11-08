Feature: To test Delete Lead Functionality

Scenario Outline:  Delete Lead

Given Search by Phone number as <phno>
Then Delete the Lead
Given Send Lead ID Deleted
Then Verify No Records to be displayed


Examples:
|phno|
|'96'|

	