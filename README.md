## dependency inversion principle lab

this project shows how to refactor code using the dependency inversion principle.

## what was wrong with the original design?

in the original version UserService directly used a specific database class.  
this made the code tightly coupled and hard to change or test.  
for example, switching from mysql to another database would require changing the service code.

## how the new design follows dip

in the new version, i introduced an interface called UserRepository.  
now UserService depends on this interface instead of a конкретной database.  
different implementations like mysql, mongo, mock and postgres can be used without changing the service.

this makes the code more flexible and easier to maintain
