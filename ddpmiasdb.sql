CREATE DATABASE IF NOT EXISTS ddpmiasdb;
USE ddpmiasdb;

DROP TABLE IF EXISTS consultants;
CREATE TABLE consultants (
	consultant_id INTEGER (10) AUTO_INCREMENT,
	date VARCHAR (255) NOT NULL,
	con_name VARCHAR (255) NOT NULL,
	tin_number VARCHAR (15),
	email VARCHAR (255) NOT NULL,
	contact_number VARCHAR (255),
	office VARCHAR (255),
	service_offered VARCHAR (255) NOT NULL,
	pf_amount DECIMAL (10, 2) NOT NULL,
	PRIMARY KEY (consultant_id)
);

DROP TABLE IF EXISTS clients;
CREATE TABLE clients (
	client_id INTEGER (10) AUTO_INCREMENT,
	cli_name VARCHAR (255) NOT NULL,
	date_reg DATE NOT NULL,
	client_type VARCHAR (255) NOT NULL,
	service VARCHAR (255) NOT NULL,
	contact_no VARCHAR (255) NOT NULL,
	email VARCHAR (255) NOT NULL,
	title TEXT (16777215) NOT NULL,
	general_obj TEXT (16777215) NOT NULL,
	specific_obj TEXT (16777215),
	date_target DATE NOT NULL,
	or_number INTEGER NOT NULL,
	PRIMARY KEY (client_id)
);

INSERT INTO consultants ( date, con_name, tin_number, email, contact_number, office, service_offered, pf_amount ) VALUES

( "2017-11-15", "Prof. Rocky T. Marcelino", "309-466-601-000", "rtmarcelino@up.edu.ph", "09778508737", "UPLB", "Analytics Training for Industry", 31.5 ),
( "2017-11-15", "Ms. Miann S. Banaag", "", "miann06@gmail.com", NULL, "ATENEO", "Analytics Training for Industry", 5 ),
( "2017-11-15", "Prof. Rocky T. Marcelino", "309-466-601-000", "rtmarcelino@up.edu.ph", "09778508737", "UPLB", "Analytics Training for Individuals", 5 ),
( "2018-02-23", "Prof. Ronald R. Roldan, Jr.", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 ),
( "2018-02-23", "Prof. Marie Joy F. Lopez", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 ),
( "2018-02-23", "Prof. Maria Salve C. Vasquez", "", "", "", "UPLB", "Thesis/Dissertation Consultation", 1 );


INSERT INTO clients ( cli_name, date_reg, client_type, service, contact_no, email, title, general_obj, specific_obj, date_target, or_number ) VALUES

( "Homer Cruzado", '2017-11-03', "Individual", "Analytics Training for Individuals", "09178472494", "homercruzado@yahoo.com", "2017 Series of Predictive Analytics using R Training, Marathon", "", "", '2017-12-09', 0002),
( "Rufo Gil Z. Albor", '2017-11-03', "Individual", "Analytics Training for Individuals", "09178160982", "rzalbor@up.edu.ph", "2017 Series of Predictive Analytics using R Training, 1st Leg", "", "", '2017-11-09', 0004),
( "Abriel Bulasag", '2017-11-03', "Individual", "Analytics Training for Individuals", "09982329667", "asbulasag@up.edu.ph", "2017 Series of Predictive Analytics using R Training, 1st Leg", "", "", '2017-11-09', 0005),
( "Raponzel B. Alvarez", '2017-11-03', "Individual", "Analytics Training for Individuals", "09179719588", "raponzel.alvarez@gmail.com", "2017 Series of Predictive Analytics using R Training, 1st Leg", "", "", '2017-11-09', 0006),
( "Charina P. Maneja", '2017-11-17', "Individual", "Analytics Training for Individuals", "09175442818", "cpmaneja@gmail.com", "2017 Series of Predictive Analytics using R Training, 2nd Leg", "", "", '2017-11-09', 0008);

DROP TABLE IF EXISTS scheduler;
CREATE TABLE scheduler (
	trans_id INTEGER (10) AUTO_INCREMENT,
	client VARCHAR (255) NOT NULL,
	-- FOREIGN KEY (client) REFERENCES clients(cli_name),
	consultant VARCHAR (255) NOT NULL,
	-- FOREIGN KEY (consultant) REFERENCES consultants(con_name),
	date_meeting DATE NOT NULL,
	location_meeting TEXT NOT NULL,
	PRIMARY KEY (trans_id)
);

-- INSERT INTO scheduler (   )

DROP TABLE IF EXISTS participants;
CREATE TABLE participants (
	official_receipt INTEGER (10),
	location VARCHAR (255),
	background VARCHAR (255),
	status VARCHAR (255),
	payment_mode VARCHAR (255),
	payment_when VARCHAR (255),
	course_avail VARCHAR (255),
	why_attend VARCHAR (255)
);
