 INSERT INTO users(id, name, email, password) VALUES
 (1, 'Alice', 'nx@gmail.com', 'Test1234'),
 (2, 'Blice', 'nx1@gmail.com', 'Test123456');
 
INSERT INTO students(student_id, year) VALUES
 (1, 3);
 
 INSERT INTO teachers(teacher_id, phone, experiences) VALUES
 (2, '01245464576', 5);
 
 INSERT INTO courses(id, teacher_id, name, description, location, opened) VALUES
 (1, 2, 'Spring _Boot Fundamental', 'Description 1', 'Hanoi CS1', '2021-02-15'),
 (2, 2, 'Spring Boot Microservice', 'Description 2', 'Hanoi CS1', '2021-02-16');