--Регистрация
INSERT INTO USERS VALUES (?, '?', '?', '?', '?');
INSERT INTO ROLES VALUES (?, '?');

--Авторизация
INSERT INTO SESSIONS VALUES (?, ?, ?, ?);

--Удаление пользователя
DELETE
FROM USERS
WHERE user_id = ?;

--Редактирование данных пользователя
UPDATE USERS
SET login = '?', password = '?', user_status = '?', first_name = '?', last_name = '?'
WHERE user_id = ?;

--Блокирование и разблокирование пользователя
UPDATE USERS
SET is_blocked = '?'
WHERE user_id = ?;

--Удаление запросов пользователя
DELETE
FROM REQUESTS
WHERE passernger_id = ?;

--Создание поездки
INSERT INTO TRIPS VALUES (?, '?', '?', '?', ?);



