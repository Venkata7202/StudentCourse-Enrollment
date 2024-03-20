
POST http://localhost:8086/courses
Content-Type: application/json

{
  "title": "Spring Boot Micro Services",
  "instructor": "Mahesh",
  "credits": 3
}

POST http://localhost:8087/students
Content-Type: application/json

{
  "name": "Mahesh Kasala",
  "email": "mahesh7202@gmail.com",
  "dateOfBirth": "2002-02-07"
}


GET http://localhost:8087/enrollments/1
Accept: application/json

POST http://localhost:8087/enrollments
Content-Type: application/json

{
  "student": {
    "studentId": 3
  },
  "course": {
    "courseId": 2
  },
  "enrollmentDate": "2024-03-18"
}

