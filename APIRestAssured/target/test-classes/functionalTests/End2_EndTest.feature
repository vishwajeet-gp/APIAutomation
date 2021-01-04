Feature: End to End test for book store API

Description: The purpose of these tests are to cover End to End happy flows for customers.
Book Store Swagger URL: http://bookstore.toolsqa.com/swagger/index.html

Background: User generate Token for Authorisation
Given I am an authorized user

Scenario: Authorised user is able to add and remove a book

Given A list of books are available
When I add a book to my reading list
Then The book is added
When I remove a book from my reading list
Then The book is removed

