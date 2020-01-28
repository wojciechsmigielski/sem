# USE CASE: 1 Produce a Report on the Salary of Employees in a department

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want to *add a new employee's details* so that *I can ensure the new employee is paid.*
### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains current employee salary data.

### Success End Condition

A new employees details are added to the database.

### Failed End Condition

The new employee is not added to the database

### Primary Actor

HR Advisor 

### Trigger

A request for for a new employee to be added is sent to the HR Advisor.

## MAIN SUCCESS SCENARIO

1. A request for new employee to be added is initiated.
2. HR Advisor captures employee details.
3. HR Advisor inputs employee details.

## EXTENSIONS

2. **Employee details are missing in full**:
    1. HR Advisor informs requestee the employee details are not sufficient.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
