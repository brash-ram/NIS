--�������������, ��������� - �������� ������ ��������������� ������������� (� ���������� �������)
SELECT first_name, last_name, user_status
FROM USERS
WHERE user_status = 'is_blocked'
ORDER BY last_name;

--�������������, ��������� - �������� ������ ������������� (� ���������� �������)
SELECT first_name, last_name, user_status
FROM USERS
ORDER BY last_name;

--�������������, ��������� - �������� ������ �������������� ������������� (� ���������� �������)
SELECT DISTINCT first_name, last_name, user_status
FROM USERS JOIN SESSIONS 
ON USERS.user_id = SESSIONS.user_id
WHERE SESSIONS.active_until > (SELECT current_timestamp
                               FROM DUAL)
ORDER BY last_name;                             

--��������� - �������� ������ ���� ����������
SELECT trip_id, start_point, final_point, trip_date, request_status, user_id, first_name, last_name
FROM REQUESTS JOIN USERS ON REQUESTS.passenger_id = USERS.user_id
JOIN TRIPS ON REQUESTS.trip_id = TRIPS.trip_id;

--��������� - �������� ���������� � ���� ��������
SELECT trip_id, start_point, final_point, trip_date, price, trip_status, user_id, first_name, last_name
FROM TRIPS JOIN USERS ON TRIPS.driver_id = USERS.user_id;

--�������� - �������� ���������� � ��������
SELECT trip_id, start_point, final_point, trip_date, price, trip_status, user_id, first_name, last_name
FROM TRIPS JOIN USERS ON TRIPS.driver_id = USERS.user_id
WHERE driver_id = ?;

--�������� - �������� ������ �� ���������� �������
SELECT final_point, trip_date, first_name, last_name
FROM TRIPS JOIN REQUESTS ON TRIPS.trip_id = REQUESTS.trip_id
JOIN USERS ON REQUESTS.passenger_id = USERS.user_id
WHERE (start_point = '?') AND (final_point = '?') AND (trip_date = '?');

--�������� - �������� ������ �� ����������
SELECT from_user, mark, trip_id, final_point, trip_date
FROM MARKS JOIN USERS ON MARKS.from_user = USERS.user_id
JOIN REQUESTS ON USERS.user_id = REQUESTS.passenger_id 
JOIN TRIPS ON REQUESTS.trip_id = TRIPS.trip_id;

--�������� - �������� ������ �� �������
SELECT trip_id, start_point, final_point, trip_date, request_status, user_id, first_name, last_name
FROM REQUESTS JOIN USERS ON REQUESTS.passenger_id = USERS.user_id
JOIN TRIPS ON REQUESTS.trip_id = TRIPS.trip_id
WHERE passenger_id = ?;

--�������� - �������� ������ ���������� �� ���������� �������
SELECT final_point, trip_date, first_name, last_name, request_status
FROM TRIPS JOIN REQUESTS ON TRIPS.trip_id = REQUESTS.trip_id
JOIN USERS ON REQUESTS.passenger_id = USERS.user_id
WHERE (final_point = '?') AND (trip_date = '?');

--�������� - �������� ������ �� ���������
SELECT from_user, mark, trip_id, final_point, trip_date
FROM MARKS JOIN USERS ON MARKS.from_user = USERS.user_id
JOIN TRIPS ON USERS.user_id = TRIPS.driver_id;

