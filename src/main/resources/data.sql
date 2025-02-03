CREATE TABLE users  (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  date_of_birth DATE NOT NULL
);


CREATE TABLE availability (
  id  INT PRIMARY KEY,
  user_id INT,
  day_of_week VARCHAR(10) NOT NULL,
  start_time TIME NOT NULL,
  end_time TIME NOT NULL
);

INSERT INTO users (first_name, last_name, date_of_birth) VALUES ('Alice', 'Smith', '1990-01-01');
INSERT INTO users (first_name, last_name, date_of_birth) VALUES ('Bob', 'Johnson', '1985-05-15');