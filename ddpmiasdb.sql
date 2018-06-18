CREATE DATABASE IF NOT EXISTS ddpmiasdb;
USE ddpmiasdb;

DROP TABLE IF EXISTS consultants;
CREATE TABLE consultants (
	trans_id INTEGER (10) AUTO_INCREMENT,
	date VARCHAR (255) NOT NULL,
	name VARCHAR (255) NOT NULL,
	tin_number VARCHAR (15),
	email VARCHAR (255) NOT NULL,
	contact_number VARCHAR (255),
	office VARCHAR (255),
	service_offered VARCHAR (255) NOT NULL,
	pf_amount INTEGER (50) NOT NULL,
	PRIMARY KEY (trans_id)
);

INSERT INTO consultants ( date, name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES ( "2017-11-15", "Prof. Rocky T. Marcelino", "309-466-601-000", "rtmarcelino@up.edu.ph", "09778508737", "UPLB", "Analytics Training for Industry", 31.5 );
INSERT INTO consultants ( date, name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES ( "2017-11-15", "Ms. Miann S. Banaag", "", "miann06@gmail.com", NULL, "ATENEO", "Analytics Training for Industry", 5 );
INSERT INTO consultants ( date, name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES ( "2017-11-15", "Prof. Rocky T. Marcelino", "309-466-601-000", "rtmarcelino@up.edu.ph", "09778508737", "UPLB", "Analytics Training for Individuals", 5 );
INSERT INTO consultants ( date, name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES ( "2018-02-23", "Prof. Ronald R. Roldan, Jr.", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 );
INSERT INTO consultants ( date, name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES ( "2018-02-23", "Prof. Marie Joy F. Lopez", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 );
INSERT INTO consultants ( date, name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES ( "2018-02-23", "Prof. Maria Salve C. Vasquez", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 );

DROP TABLE IF EXISTS clients;
CREATE TABLE clients (
	client_id INTEGER (10) AUTO_INCREMENT,
	name VARCHAR (255) NOT NULL,
	date_reg DATE NOT NULL,
	client_type VARCHAR (255) NOT NULL,
	service VARCHAR (255) NOT NULL,
	contact_no INTEGER (11) NOT NULL,
	email VARCHAR (255) NOT NULL,
	title TEXT (16777215) NOT NULL,
	general_obj TEXT (16777215) NOT NULL,
	specific_obj TEXT (16777215),
	date_target DATE NOT NULL,
	PRIMARY KEY (client_id)
);

DROP TABLE IF EXISTS trainees;
CREATE TABLE trainees (

	official_receipt INTEGER (10),
	location VARCHAR (255),
	background VARCHAR (255),
	status VARCHAR (255),
	payment_mode VARCHAR (255),
	payment_when VARCHAR (255),
	course_avail VARCHAR (255),
	why_attend VARCHAR (255)
);
