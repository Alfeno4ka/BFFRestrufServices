truncate table bff_restful_services.dat_users;

INSERT INTO bff_restful_services.dat_users (id, first_name, last_name, middle_name, email, phone, delivery_address)
VALUES ('d4e8a3f0-1c35-4db5-8db9-3209a3fdf3c2', 'Alice', 'Johnson', 'Marie', 'alice.johnson@example.com',
        '+15551234567', '123 Maple St, Springfield, IL');

INSERT INTO bff_restful_services.dat_users (id, first_name, last_name, middle_name, email, phone, delivery_address)
VALUES ('f28b2c11-634e-4f55-8a67-b0b80c31a0e6', 'Bob', 'Anderson', NULL, 'bob.anderson@example.net', '+15557654321',
        '456 Oak Ave, Lincoln, NE');

INSERT INTO bff_restful_services.dat_users (id, first_name, last_name, middle_name, email, phone, delivery_address)
VALUES ('a7cd2d99-50b8-4c5f-a2f6-5f63d7a8d1ff', 'Clara', 'Nguyen', 'Ann', 'clara.nguyen@example.org', '+15559871234',
        '789 Pine Rd, Madison, WI');
