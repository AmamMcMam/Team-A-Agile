use Kainos_A;

insert into band (bandName, bandExpectations)  VALUES(("Apprentice", "Understands own strengths and areas of development. Self-aware of own wellbeingand seeks support where appropriate."));

insert into capability (capability) VALUES(("Engineering"), 
											("Platforms"));

INSERT INTO roles (`roleName`, `roleDesc`, `datePosted`, `hours`, `location`, `bandID`, `capabilityID`)
VALUES ("Product Principal", "PlaceHolder", "2021-07-13", "Full Time", "Birmingham", 1, 1),
		("Solutions Architect",
		 "As a Solution Architect (Manager) in Kainos, you’ll be responsible for leading multi-skilled agile teams to design and deliver high quality solutions which delight our customers and impact the lives of users worldwide. You’ll work with customer architects to agree functional and non-functional designs, advising customers and managers on the estimated effort, technical implications and complexity surrounding your designs.",
		  "2021-06-20", "Full Time", "Derry-Londonderry", 1, 1),
        ("Market Intelligence Analyst", "PlaceHolder", "2021-08-24", "Full Time", "London", 1, 1), 
        ("Market Intelligence Analyst", "PlaceHolder", "2021-01-24", "Full Time", "Birmingham", 2, 2);