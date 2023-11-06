Feature: This is a add cart feature to verify user can add item in cart
@Reel
 Scenario: Verify user can add any item in the cart
  
  Given Open amazon application 
  Then Enter item name
  Then Click on search icon
  Then Click on select item
  And Click on add cart
  Then Verify item added in cart
 
 @Doll
Scenario: Verify user can Mouse over in Books

  Given Open amazon application 
  Then Mouse over in Books page
  And  Click on Books page 
  
  @Play
  Scenario: Print all links count
   Given Open amazon application
   Then Print all links count
 
  
 
 
 
 
 
 
 