use Kainos_A;

insert into band (bandName, bandExpectations)  VALUES(("Apprentice", "Understands own strengths and areas of development. Self-aware of own wellbeingand seeks support where appropriate."));

insert into capability (capability) VALUES(("Engineering"), 
											("Platforms"));

INSERT INTO roles (`roleName`, `roleDesc`, `datePosted`, `hours`, `location`, `bandID`, `capabilityID`)
VALUES ("Product Principal", "PlaceHolder", STR_TO_DATE('06-01-2019', '%m-%d-%Y'), "Full Time", "Birmingham", 1, 1),
		("Solutions Architect", "PlaceHolder", STR_TO_DATE('2021-06-20', '%m-%d-%Y'), "Full Time", "Derry-Londonderry", 1, 1),
        ("Market Intelligence Analyst", "PlaceHolder", STR_TO_DATE('2021-08-25', '%m-%d-%Y'), "Full Time", "London", 1, 1), 
        ("Market Intelligence Analyst", "PlaceHolder", STR_TO_DATE('2021-01-04', '%m-%d-%Y'), "Full Time", "Birmingham", 1, 2);