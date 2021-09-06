use Kainos_A;

insert into band (bandName, bandExpectations)  VALUES(("Apprentice", "Understands own strengths and areas of development. Self-aware of own wellbeingand seeks support where appropriate."));

insert into capability (capability) VALUES(("Engineering"), 
											("Platforms"));

INSERT INTO roles (`roleName`, `roleDesc`, `datePosted`, `hours`, `location`, `bandID`, `capabilityID`, `link`)
VALUES ("Product Principal", "PlaceHolder", "2021-07-13", "Full Time", "Birmingham", 1, 1, ""),
		("Solutions Architect",
		 "As a Solution Architect (Manager) in Kainos, you’ll be responsible for leading multi-skilled agile teams to design and deliver high quality solutions which delight our customers and impact the lives of users worldwide. You’ll work with customer architects to agree functional and non-functional designs, advising customers and managers on the estimated effort, technical implications and complexity surrounding your designs.",
		  "2021-06-20", "Full Time", "Derry-Londonderry", 1, 1, "https://kainossoftwareltd.sharepoint.com/people/Job%20Specifications/Forms/AllItems.aspx?id=%2Fpeople%2FJob%20Specifications%2FEngineering%2FJob%20Profile%20%2D%20Solution%20Architect%20%28Manager%29%2Epdf&parent=%2Fpeople%2FJob%20Specifications%2FEngineering&p=true&originalPath=aHR0cHM6Ly9rYWlub3Nzb2Z0d2FyZWx0ZC5zaGFyZXBvaW50LmNvbS86YjovZy9wZW9wbGUvRVNwcDU2Zlp5cmhLaTZ1Q3V3cHNoRHdCM25tbzFCTWtiUUtZRFhiTkhDaV9zdz9ydGltZT1tcHlFbzJSczJVZw"),
        ("Market Intelligence Analyst", "PlaceHolder", "2021-08-24", "Full Time", "London", 1, 1, ""), 
        ("Market Intelligence Analyst", "PlaceHolder", "2021-01-24", "Full Time", "Birmingham", 2, 2, "");

INSERT INTO responsibilities (`responsibilityId`, `responsibility`)
VALUES (1,"Has successfully delivered software designs for multi-tiered modern software applications."),
		(2,"Understands whole solution architecture concepts and can communicate and negotiate these with customer architects."),
		(3,"Can prioritise non-functional concerns for customers and has experience incorporating these into the application design."),
		(4,"Able to simply and clearly communicate technical design in conversation and presentations.");

INSERT INTO role_responsibilities (`roleId`, `responsibilityId`)
VALUES (1, 1),
	   (1, 4),
	   (2, 2),
	   (2, 3),
	   (3, 2),
	   (3, 4),
	   (4, 1),
	   (4, 3);