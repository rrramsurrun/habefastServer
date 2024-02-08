DROP TABLE IF EXISTS workout;
CREATE TABLE workout (
  workout_id INT AUTO_INCREMENT PRIMARY KEY,
  name varchar(100),
  start_time TIMESTAMP,
  end_time TIMESTAMP
);

DROP TABLE IF EXISTS exercise_template;
CREATE TABLE exercise_template (
  ex_template_id INT AUTO_INCREMENT PRIMARY KEY,
  name varchar(100),
  type varchar(20),
  body_part varchar(20)
);

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username varchar(50),
  password varchar(100)
)