DROP DATABASE IF EXISTS ddpmiasdb;
CREATE DATABASE IF NOT EXISTS ddpmiasdb;
USE ddpmiasdb;

DROP TABLE IF EXISTS clients;
CREATE TABLE clients (
	client_id INTEGER (10) AUTO_INCREMENT,
	client_name VARCHAR (255) NOT NULL,
	date_reg DATE NOT NULL,
	client_type VARCHAR (255) NOT NULL,
	service VARCHAR (255) NOT NULL,
	contact_number VARCHAR (255) NOT NULL,
	email VARCHAR (255) NOT NULL,
	title TEXT (16777215),
	general_obj TEXT (16777215),
	specific_obj TEXT (16777215),
	date_target DATE NOT NULL,
	location VARCHAR (255),
	background VARCHAR (255),
	career_status VARCHAR (255),
	payment_mode VARCHAR (255),
	payment_when VARCHAR (255),
	course_avail VARCHAR (255),
	why_attend VARCHAR (255),
	PRIMARY KEY (client_id)
);

DROP TABLE IF EXISTS consultants;
CREATE TABLE consultants (
	consultant_id INTEGER (10) AUTO_INCREMENT,
	consultant_name VARCHAR (255) NOT NULL,
	tin_number VARCHAR (15),
	contact_number VARCHAR (255),
	email VARCHAR (255) NOT NULL,
	address VARCHAR (255) NOT NULL,
	pf_amount DECIMAL (10, 2) NOT NULL,
	service_offered VARCHAR (255) NOT NULL,
	educ_attainment VARCHAR (255) NOT NULL,
	expertise VARCHAR (255) NOT NULL,
	PRIMARY KEY (consultant_id)
);

DROP TABLE IF EXISTS scheduler;
CREATE TABLE scheduler (
	schedule_id INTEGER (10) AUTO_INCREMENT,
	client_id INTEGER (10),
	consultant_id INTEGER (10),
	ddpm_personnel VARCHAR (255) NOT NULL,
	date_meeting DATE NOT NULL,
	time_meeting TIME NOT NULL,
	duration INTEGER (10) NOT NULL,
	location_meeting VARCHAR (255) NOT NULL,
	service  VARCHAR (255) NOT NULL,
	PRIMARY KEY (schedule_id),
	FOREIGN KEY (client_id) REFERENCES clients (client_id),
	FOREIGN KEY (consultant_id) REFERENCES consultants (consultant_id)
);

DROP TABLE IF EXISTS clientPayment;
CREATE TABLE clientPayment (
	income_trans_id INTEGER (10) AUTO_INCREMENT,
	client_id INTEGER (10) NOT NULL,
	client_number VARCHAR (255) NOT NULL,
	or_number INTEGER (10),
	date_payment DATE NOT NULL,
	location VARCHAR (255),
	amount DECIMAL (10, 2) NOT NULL,
	service VARCHAR (255) NOT NULL,
	particulars VARCHAR (255),
	PRIMARY KEY (income_trans_id),
	FOREIGN KEY (client_id) REFERENCES clients (client_id)
);

-- INSERT INTO scheduler (   )

-- INSERT INTO consultants ( date, con_name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES

-- ( "2017-11-15", "Prof. Rocky T. Marcelino", "309-466-601-000", "rtmarcelino@up.edu.ph", "09778508737", "UPLB", "Analytics Training for Industry", 31.5 ),
-- ( "2017-11-15", "Ms. Miann S. Banaag", "", "miann06@gmail.com", "", "ATENEO", "Analytics Training for Industry", 5 ),
-- ( "2017-11-15", "Prof. Rocky T. Marcelino", "309-466-601-000", "rtmarcelino@up.edu.ph", "09778508737", "UPLB", "Analytics Training for Individuals", 5 ),
-- ( "2018-02-23", "Prof. Ronald R. Roldan, Jr.", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 ),
-- ( "2018-02-23", "Prof. Marie Joy F. Lopez", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 ),
-- ( "2018-02-23", "Prof. Maria Salve C. Vasquez", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 );


-- INSERT INTO clients ( cli_name, date_reg, client_type, service, contact_no, email, title, general_obj, specific_obj, date_target, or_number ) VALUES

-- ( "Homer Cruzado", '2017-11-03', "Individual", "Analytics Training for Individuals", "09178472494", "homercruzado@yahoo.com", "2017 Series of Predictive Analytics using R Training, Marathon", "", "", '2017-12-09', 0002),
-- ( "Rufo Gil Z. Albor", '2017-11-03', "Individual", "Analytics Training for Individuals", "09178160982", "rzalbor@up.edu.ph", "2017 Series of Predictive Analytics using R Training, 1st Leg", "", "", '2017-11-09', 0004),
-- ( "Abriel Bulasag", '2017-11-03', "Individual", "Analytics Training for Individuals", "09982329667", "asbulasag@up.edu.ph", "2017 Series of Predictive Analytics using R Training, 1st Leg", "", "", '2017-11-09', 0005),
-- ( "Raponzel B. Alvarez", '2017-11-03', "Individual", "Analytics Training for Individuals", "09179719588", "raponzel.alvarez@gmail.com", "2017 Series of Predictive Analytics using R Training, 1st Leg", "", "", '2017-11-09', 0006),
-- ( "Charina P. Maneja", '2017-11-17', "Individual", "Analytics Training for Individuals", "09175442818", "cpmaneja@gmail.com", "2017 Series of Predictive Analytics using R Training, 2nd Leg", "", "", '2017-11-09', 0008);