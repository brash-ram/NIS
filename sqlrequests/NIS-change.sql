--�����������
INSERT INTO USERS VALUES (?, '?', '?', '?', '?');
INSERT INTO ROLES VALUES (?, '?');

--�����������
INSERT INTO SESSIONS VALUES (?, ?, ?, ?);

--�������� ������������
DELETE
FROM USERS
WHERE user_id = ?;

--�������������� ������ ������������
UPDATE USERS
SET login = '?', password = '?', user_status = '?', first_name = '?', last_name = '?'
WHERE user_id = ?;

--������������ � ��������������� ������������
UPDATE USERS
SET is_blocked = '?'
WHERE user_id = ?;

--�������� �������� ������������
DELETE
FROM REQUESTS
WHERE passernger_id = ?;

--�������� �������
INSERT INTO TRIPS VALUES (?, '?', '?', '?', ?);



