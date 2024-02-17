CREATE TABLE doctor (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    contact VARCHAR(255),
    is_online_bookable BOOLEAN,
    description TEXT,
    rating DECIMAL(3, 2)
);



CREATE TABLE degrees(
    id SERIAL PRIMARY KEY,
    degree_name VARCHAR(255) NOT NULL
);


CREATE TABLE doctor_degrees(
    doctor_id INT NOT NULL,
    degree_id INT NOT NULL,
    PRIMARY KEY (doctor_id, degree_id),
    FOREIGN KEY (doctor_id) REFERENCES doctor(id),
    FOREIGN KEY (degree_id) REFERENCES degrees(id)
);


CREATE TABLE diagnostic_centers(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    latitude DOUBLE PRECISION NOT NULL,
    description TEXT
);


CREATE TABLE availability(
    id SERIAL PRIMARY KEY,
    day_of_week VARCHAR(255) NOT NULL,
    start_time VARCHAR(255) NOT NULL,
    end_time VARCHAR(255) NOT NULL
);

CREATE TABLE doctor_diagnostic_centers(
    doctor_id INT NOT NULL,
    diagnostic_center_id INT NOT NULL,
    availability INT NOT NULL,
    PRIMARY KEY (doctor_id, diagnostic_center_id),
    FOREIGN KEY (doctor_id) REFERENCES doctor(id),
    FOREIGN KEY (diagnostic_center_id) REFERENCES diagnostic_centers(id),
    FOREIGN KEY (availability) REFERENCES availability(id)
);



)