Reflection 1
Clean Code:
Penggunaan nama yang jelas seperti edit dan delete
Setiap fungsi memiliki Single Responsibility
Fungsi pendek, hanya untuk satu fungsi
Secure Coding:
Ada input validation (Jika tidak ditemukan product, tidak dijalankan)

Reflection 2
1
How many unit tests should be made in a class?
-as many as necessary
how to make sure that our unit tests are enough to verify our program?
-when every possibility in the code has already been tested
if you have 100% code coverage, does that mean your code has no bugs or errors?
-100% code coverage means that every single code you write works, logic errors may still happen
2
if the new code has the same setup procedures and instance variables, it doesnt obey the "Don't Repeat Yourself"
you should make a base class for the setup and inherit the setup for the test classes
