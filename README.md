# Library

### Description:
The local library wants to switch to digital accounting of books. Task is to implement a web application for them. Librarians should be able to register readers, issue them books and release books (when reader returns book back to the library).



### Functionality:
1. Pages for adding, editing and deleting a person.
2. Pages for adding, editing, and deleting a book.
3. Page with a list of all people (people are clickable - when clicked, go to person's page).
4. Page with a list of all books (books are clickable - when clicked, go to the page of the book).
5. A person's page showing the values of his fields and a list of the books he has took. If the person did not take any books, instead of the list should be the text "person haven't borrowed any books yet".
6. Page of a book showing the values of the fields of that book and the person's name, who took this book. If this book has not been taken by anyone, the text "This the book is free".
7. On the page of the book, if the book is taken by a person, next to his name there should be a button "Release book". This button is pressed by the librarian when the reader returns this book back to the library. After pressing this button the book again becomes free and disappears from the list of the person's books.
8. On the book page, if the book is free, there should be a drop-down list with all people and the "Assign Book" button. This button is pressed by the librarian when reader wants to take this book home. After pressing this button, book must belong to the selected person and must appear in his list of books.

### Stack used:
Spring MVC, JDBC Template, Thymeleaf, PostgreSQL

