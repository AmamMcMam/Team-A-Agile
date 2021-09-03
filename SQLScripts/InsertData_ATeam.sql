use Kainos_A;


INSERT INTO band(bandName, bandExpectations)
VALUES ("Apprentice", ""), ("Trainee", ""), ("Associate", ""),("Senior Associate", ""), ("Consultant", ""), ("Manager",""), ("Principle", ""), ("Leadership Community", "");

insert into capability (capability) VALUES(("Engineering"),
											("Platforms"));

INSERT INTO roles (`roleName`, `roleDesc`, `datePosted`, `hours`, `location`, `bandID`, `capabilityID`, `link`)
VALUES ("Product Principal", "PlaceHolder", "13-07-2021", "Full Time", "Birmingham", 1, 1, ""),
        ("Solutions Architect",
         "As a Solution Architect (Manager) in Kainos, you’ll be responsible for leading multi-skilled agile teams to design and deliver high quality solutions which delight our customers and impact the lives of users worldwide. You’ll work with customer architects to agree functional and non-functional designs, advising customers and managers on the estimated effort, technical implications and complexity surrounding your designs.",
          "20-06-2021", "Full Time", "Derry-Londonderry", 1, 1, "https://kainossoftwareltd.sharepoint.com/people/Job%20Specifications/Forms/AllItems.aspx?id=%2Fpeople%2FJob%20Specifications%2FEngineering%2FJob%20Profile%20%2D%20Solution%20Architect%20%28Manager%29%2Epdf&parent=%2Fpeople%2FJob%20Specifications%2FEngineering&p=true&originalPath=aHR0cHM6Ly9rYWlub3Nzb2Z0d2FyZWx0ZC5zaGFyZXBvaW50LmNvbS86YjovZy9wZW9wbGUvRVNwcDU2Zlp5cmhLaTZ1Q3V3cHNoRHdCM25tbzFCTWtiUUtZRFhiTkhDaV9zdz9ydGltZT1tcHlFbzJSczJVZw"),
        ("Market Intelligence Analyst", "PlaceHolder", "24-08-2021", "Full Time", "London", 1, 1, ""),
        ("Market Intelligence Analyst", "PlaceHolder", "24-01-2021", "Full Time", "Birmingham", 2, 2, "");

INSERT INTO competency(competencyName, competencyDescription)
VALUES ("Personal Performance", "Effective leadership requires individuals to draw upon values, strengths, and abilities to deliver high standards of service. Demonstrating effectiveself-awareness, self-management, continued personal development and acting with integrity."),
("Working with others", "Effective leadership requires individuals to work with others in teams and networks to deliver and improve services.  Mobilising people in an inclusive way to drive continuous business improvement."),
("Setting Direction, Development and Accountability", "Effective leadership requires individuals to contribute to the aspirations of Kainos and act in a manner consistent with our values. Demonstrating effectiveness in identifying the contexts for change, applying knowledge, making decisions, and promoting accountability through effective self-management."),
("Supporting and Delivering the Strategy", "Effective leadership requires the support, contribution, and delivery ofthe strategic vision by developing and agreeing strategic plans that place Kainos values at the heart of the service and ensuring that these are translated into achievable operational plans. Demonstrating effectiveness in supporting, framing, developing, implementing, and embedding the strategy."),
("Commerciality and Risk", "Effective leadershiprequires individuals to demonstrate effectiveness within commerciality and risk and support efficiencies and profitability by maintaining an economic, long term focus in all activities.This includes identifying economic, market and customer issues and using these topromote innovative business models, commercial partnerships, and agreements to deliver greatest value –ensuring tight commercial controls of finance, assets and contracts to meet strategic priorities."),
("Communicating and Influence", "Effective leadership requires individuals to be exceptional and confident communicators.  Showing an ability to adapt own style to suit various audiences.  Captivating and engaging others to promote and influence the Kainos vision.  Investing time in others to develop connections and role model our Kainos values.");



-- Apprentice
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 1, "Understands own strengths and areas of development. Self-aware of own wellbeingand seeks support where appropriate."),
VALUES (1, "Managing yourself", 1, "Works with People Manager to sets and achievegoalsby monitoring progress regularly against performance."),
VALUES (1, "Continuing personal development", 1, "Flexible and willingness to learnon the jobwhile proactively keeping up to date with the knowledge and skills needed."),
VALUES (1, "Acting with integrity", 1, "Understands the company values and applies this to own principles. Is open and honest and acts respectfully with others and customers.");



-- Trainee
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 2, "Understands others strengths and areas for development. Recognisingdiversity and its value within self andteam.Proactively uses wellbeing tools to support self-regulation."),
VALUES (1, "Managing yourself", 2, "Able to identify own goals and discusses these with People Manager. Understands the need to work conscientiously to achieve tasks on schedule."),
VALUES (1, "Continuing personal development", 2, "Identifies learning gaps and seeks out opportunities to improve skills. Open to developmental feedback fromothers."),
VALUES (1, "Acting with integrity", 2, "Demonstrates positive behaviours when dealing with others and ensures application of the values while working and representing Kainos to our customers.");



-- Associate
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 3, "Seeksout new challenges and opportunitiesthat may stretchcurrentabilities.Builds on own self-awareness of overall wellbeing.Understandsand confidently articulatesown learning and developmental needs and proactively seek opportunities to gain "),
VALUES (1, "Managing yourself", 3, "Recognises the need for SMART goals, anddemonstratesa “can do” attitude, through having own internal standards of performance."),
VALUES (1, "Continuing personal development", 3, "Seeksout opportunities to improve skills beyond the role scopewhilst also seekingregular feedback."),
VALUES (1, "Acting with integrity", 3, "Encourages positive behaviours in others, while role modelling the Kainos values.");



-- Senior Associate
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 4, "Understandsand confidently articulatesown learning and developmental needs and proactively seek opportunities to gain experience.Has a strong level of self-awareness and in tune with own wellbeing needsand intuitive of others."),
VALUES (1, "Managing yourself", 4, "Seeksand respondspositively to feedback regarding own learning and development. Approachwith a willingness to take on tasks that are outside role scope."),
VALUES (1, "Continuing personal development", 4, "Looks for opportunities to take on new challenges while proactivelysupporting and encouraging others in identifying learning needs."),
VALUES (1, "Acting with integrity", 4, "Recognises inappropriate behaviours and challenges constructively while promoting the Kainos values. Adapting behaviours and actingin the most appropriate way to enable others to respond constructively.");



-- Consultant
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 5, "Understandsown personal preferences, biases and valuesdifferent cultures, backgrounds and circumstances in decision making and takes actions.Champions Kainos wellbeing offerings and provides direction to the various wellbeing guides and supportavailablefor our people."),
VALUES (1, "Managing yourself", 5, "Consistently sets own goals and manages this independently. Makingautonomousdecisions and are able to ‘get on with the job’ escalating decisions only when appropriate."),
VALUES (1, "Continuing personal development", 5, "Identifies and addressesteam or individual capability requirements and gaps to deliver current and future work. Consistently identifies and developsself and othersto support talent development."),
VALUES (1, "Acting with integrity", 5, "Demonstrates professional and organisational values through actions and behaviours. Behaves in an inclusive manner and respects equality and diversity.");
