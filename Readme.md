# Factory Design Pattern
Following a couple of blog posts about developing 
a Factory pattern. 

## What is the Factory Pattern
Is an way for us to create different products, that has
the same base such as (Dogs, Pokemons, Cars), 
yet divided into types.

## Benefits 
* **Loose Coupling between classes** **(Very Important)**

* The creation of an object precludes its reuse without significant duplication of code.

*  The creation of an object requires access to information or resources that should not be contained within the composing class.

*  The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.

* A factory method can return an already created object, 
unlike a constructor, which always creates a new instance.

## Dog Factory
A Loosely design Dog factory, which creates three
different type of Dogs. Poodle, Rottweiler, and Husky.

### Notes from Dog post
You define a base class type 
(or in this case an interface), and 
then have any number of subclasses 
which implement the contract defined by the base class.


## Car


#### Shout Out 
**Alvin Alexander && Lokesh Gupta**