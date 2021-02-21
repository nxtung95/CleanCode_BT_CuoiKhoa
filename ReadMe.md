
# Nghiêm Xuân Tùng - DEV5
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. 5 mục tiêu chính của Clean Code là
   - Giúp code dễ đọc, đơn giản, tránh code thừa
   - Tăng giá trị cho phần mềm với code hiện tại
   - Bất cứ ai cũng có thể đọc và hiểu trong thời gian ngắn
   - Mục tiêu 4
   - Mục tiêu 5
2. Đáp án của tôi là team C bởi vì:
   - Lý do 1
   - Lý do 2
   - Lý do 3
3. Bạn là một team lead, khi bạn giới thiệu các quy tắc Clean Code cho các đồng đội trẻ. Có một số bạn cho rằng Clean Code chỉ làm phức tạp thêm vấn đề, và chậm lại hiệu suất làm việc của nhóm. Bạn sẽ trả lời họ thế nào?
4. Trong 4 đề xuất trên đề xuất nào là phù hợp với quy ước trong CleanCode?
5. Hãy lập trình mô hình hoá nghiệp vụ sau đây. Cụ thể là hãy bổ xung các method để hoàn thiện logic. Quan trọng hãy tuân thủ quy tắc Clean Code.
   - Mã nguồn: [https://github.com/nxtung95/CleanCode_BT_CuoiKhoa/blob/master/phan1/bai5.java]
## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
Mã nguồn: [https://github.com/nxtung95/CleanCode_BT_CuoiKhoa/tree/master/phan2/Bai1]
### 2. Composition over Inheritance và DI
Mã nguồn: [https://github.com/nxtung95/CleanCode_BT_CuoiKhoa/tree/master/phan2/Bai2]


## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả
Mã nguồn: [https://github.com/nxtung95/CleanCode_BT_CuoiKhoa/tree/master/phan3]
## Phần 4: Thiết kế RESTful API
Mã nguồn: [https://github.com/nxtung95/CleanCode_BT_CuoiKhoa/tree/master/phan4]
## Phần 5: Lập trình Restful API
Mã nguồn: [https://github.com/nxtung95/CleanCode_BT_CuoiKhoa/tree/master/phan5]
## Trắc nghiệm
1. Điều nào không đúng khi nói về Design Pattern?
   ```
   A. Là tập hợp các giải pháp có thể tái sử dụng cho các vấn đề thường xảy ra trong thiết kế phần mềm.
   B. Được xây dựng dựa trên kiến thức và kinh nghiệm của các nhà chuyên gia phát triển phần mềm.
   C. Đã được thiết kế và cài đặt ở mức chi tiết.
   C. Giúp tăng tính gắn kết (high cohesion) và giảm sự phụ thuộc (low coupling) giữa các thành phần trong phần mềm.
   ```
---
--> Đáp án C

2. Các OOP Design Pattern được chia làm mấy nhóm?
   ```
   A. 2
   B. 3
   C. 4
   D. 5
   ```
---
--> Đáp án B

3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
   ```
   A. Quan tâm đến cách các lớp và các đối tượng được tổ chức để trở thành một cấu trúc lớn hơn.
   B. Cung cấp các cơ chế khởi tạo đối tượng khác nhau, làm tăng tính linh hoạt và tái sử dụng code.
   C. Là các giải pháp để triển khai cho các hệ thống Microservice.
   D. Quan tâm đến cách giao tiếp giữa các lớp và các đối tượng.
   ```
---
--> Đáp án D

4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
   ```
   A. Builder
   B. Singleton
   C. Factory Method
   D. Strategy
   ```
---
--> Đáp án C

5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
   ```
   A. Có
   B. Không
   C. Một số trường hợp thì có, một số trường hợp thì không
   ```
---
--> Đáp án A

6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
   ```
   A. Mutable
   B. Immutable
   ```
---
--> Đáp án B

7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
   ```
   A. Không
   B. Có
   ```
---
--> Đáp án A

8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
   ```
   A. Dữ liệu không thay đổi theo context
   B. Dữ liệu thay đổi theo context
   C. Cả A và B
   ```
---
--> Đáp án A

9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay đổi tất cả các thuật toán?
   ```
   A. Strategy
   B. Template Method
   C. Flyweight
   D. Builder
   ```
---
--> Đáp án B

10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?
   ```
      A. Strategy
      B. Factory method
      C. Singleton
      D. Flyweight
   ```
---
--> Đáp án A

11. REST là gì?
   ```
      A. Ngôn ngữ lập trình
      B. Kiểu kiến trúc phần mềm
      C. Giao thức
      D. Không đáp án nào chính xác
   ```

---
--> Đáp án D

12. Đâu không phải là đặc điểm của một hệ thống RESTful?
   ```
      A. Client và server có thể xây dựng và phát triển một cách độc lập mà không ảnh hưởng đến nhau.
      B. Response của server có thể được lưu trong bộ nhớ cache để tăng hiệu năng.
      C. Server lưu trữ session và history của client.
      D. Hệ thống có thể chia thể chia thành nhiều layer.
   ```
---
--> Đáp án C

13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?
   ```
      A. PUT
      B. POST
      C. PATCH
      D. DELETE
   ```
---
--> Đáp án B

14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?
   ```
      A. GET
      B. POST
      C. PUT
      D. B và C
   ```
---
--> Đáp án B

15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?
   ```
      A. Phân trang
      B. Sắp xếp
      C. Lọc
      D. Cả 3 đáp án trên
   ```
---
--> Đáp án D

16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?
   ```
      A. Service
      B. Repository
      C. Controller
   ```
---
--> Đáp án B

17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?
   ```
      A. 1
      B. 2
      C. 3
      D. 4
   ```
---
--> Đáp án D

18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?
   ```
      A. Sử dụng @ControllerAdvice và @ExceptionHandler
      B. Chỉ sử dụng @ExceptionHandler
      C. Throw ResponseStatusException
   ```
---
--> Đáp án A

19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?
   ```
      A. INFO
      B. DEBUG
      C. ERROR
      D. WARNING
   ```
---
--> Đáp án C

20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử dụng log level nào?
   ```
      A. TRACE
      B. WARN
      C. INFO
      D. ERROR
   ```
---
--> Đáp án B

21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?
   ```
      A. Có
      B. Không
   ```

---
--> Đáp án A
22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?
   ```
      A. Cần thống kê dễ dàng.
      B. Cần lưu một danh sách các phần tử dưới dạng phân cách nhau bởi ký tự đặc biệt và không cần truy vấn từng phần tử.
      C. A và B.
      D. Không có đáp án nào chính xác.
   ```
---

23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag của một article.
   ```
      A. Tạo một bảng trung gian (join table) giữa tag và article.
      B. Lưu giá trị của các tag vào N cột trong bảng article.
      C. Tạo một bảng riêng để lưu các tag của article.
   ```
---

24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?
   ```
      A. 1
      B. 3
      C. 5
      D. 6
   ```
---

25. Tree model nào không dễ để query child node ngay dưới?
   ```
      A. Adjacency list
      B. Path enumeration
      C. Nested Set
      D. Closure table
   ```
