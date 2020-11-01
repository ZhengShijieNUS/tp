# Developer Guide

## Design & implementation

{Describe the design and implementation of the product. Use UML diagrams and short code snippets where applicable.}


## Product scope
### Target user profile
* Is a developer, tester or member of the project team.
* prefer desktop apps over other types.
* can type fast.
* prefers typing to mouse interactions.
* is reasonably comfortable using CLI apps.


### Value proposition
manage defects faster than a typical mouse/GUI driven app. Allows the user to better manage the project issues.

## User Stories
 
|Priority| As a … | I want to … | So that I can… |
|--------|----------|---------------|------------------|
|* * * |new user|add issues into IT logger|track my issues|
|* * * |New user|view an issue that is based on the ticket number|see its progress.|
|* * * |New user|delete a defect|remove defects that are resolved or no longer required|
|* * * |New user|list all issues currently in the ITLogger|find all of the recorded issues currently in ITLogger.|
|* * |New user|I would like a given issue format|so that I can know a structured way of using the app|
|* |New user|I would like the issue I logged to be date stamped|so that I know when it was raised|
|* * * |User|be able to load defects from a text file or database|View and track all defects previously recorded in the system|
|* * * |User|Have a help guide|View the usage of the app|
|* * * |User|Update information of existing defects|Keep track of those defects that have changed|
|* * |user|Search defects based on my preference|Narrow down the search result based on what i want to look up|
|* * * |User|Automatically save my records when the defect list has been changed|progression will not be lost|
|* * |User|View my defect in a sorted order|More easily track my list of items|
|* * * |Forgetful user|Be notified of my task that are due|Not forget what i need to fix and close|
|* * * |User|Have a robust app|So that my data integrity is maintained (e.g. no deletion, cannot reopen after close)|


## Non-Functional Requirements

* Should work on any mainstream OS as long as it has Java 11 or above installed.
* Should be able to hold up to 1000 defects without a noticeable sluggishness in performance for typical usage.
* A user with above average typing speed for regular English text (i.e. not code, not system admin commands) should be able to accomplish most of the tasks faster using commands than using the mouse
* Should load from and save to from a text files


## Glossary

* *Mainstream OS:* Windows, Linux, Unix, OS-X.

## Instructions for manual testing

{Give instructions on how to do a manual product testing e.g., how to load sample data to be used for testing}
