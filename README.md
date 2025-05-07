<h1>2.1. Layered Architecture:</h1>

<h2>🔹1. Kiến trúc tổng thể Layered</h2>

![image](https://github.com/user-attachments/assets/f46de1cc-d8f5-476d-a2be-7dc5c3aec8bc)


<h2>🔹2. Cấu trúc thư mục dự án</h2>

![image](https://github.com/user-attachments/assets/a52d40cc-d949-4585-95cc-c6f9a9ffb8f8)


<h2>🔹3. Mã nguồn mẫu</h2>

``` https://github.com/thinhotwp1/Layered-Architecture ```
 
<h2>🔹4. Ưu điểm của Layered Architecture</h2>

- Dễ hiểu, dễ chia vai trò trong team

- Dễ test unit Service layer độc lập Controller và Repository

- Tích hợp tốt với Spring Boot (JPA, DI, MVC)

- Thích hợp với ứng dụng nhỏ, ít thay đổi adapter

<h2>🔹5. Nhược điểm của Layered Architecture </h2>

- Trong Layered, rất nhiều hệ thống ban đầu có Service thuần túy → dần dần team khác sửa code, inject thêm KafkaTemplate, JdbcTemplate, Scheduler,... và domain/service trở thành nơi tạp nham cả kỹ thuật lẫn nghiệp vụ. Dạng phổ biến:

![image](https://github.com/user-attachments/assets/a7d4407d-205c-4c69-a7fd-3ee0b776e94c)

- Khó unit test vì dính cả logic kỹ thuật & nghiệp vụ chung

- Khó mở rộng, khi mở rộng có thể lẫn lộn nhiều logic kỹ thuật 
