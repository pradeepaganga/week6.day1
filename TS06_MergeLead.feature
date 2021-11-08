Feature: Merge functionality
Scenario Outline: Merge two leads by firstname

Given Get the first Lead as <first>
And Get the second lead as <second>
Then Merge both leads
And verify resulting lead ID with first lead ID 


Examples:

|first|second|
|'Hari'|'Babu'|

		
		
		