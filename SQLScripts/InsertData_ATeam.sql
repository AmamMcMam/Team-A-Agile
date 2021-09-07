use Kainos_A;


INSERT INTO band(bandName, bandExpectations)
VALUES ("Apprentice", ""), ("Trainee", ""), ("Associate", ""),("Senior Associate", ""), ("Consultant", ""), ("Manager",""), ("Principle", ""), ("Leadership Community", "");

insert into capability (capability) VALUES(("Engineering"),("Platforms"));

INSERT INTO roles (`roleName`, `roleDesc`, `datePosted`, `hours`, `location`, `bandID`, `capabilityID`, `link`)
VALUES ("Product Principal", "As a Product Principal you'll be responsible for directing and leading significant consulting assignments and delivering business solutions that meet client needs.
Work closely with the Sales team to develop and deliver a strategy for adding value to the clients, ensuring that expectations are managed proactively and any issues arising are dealt with promptly and appropriately.
Initiate & build trusted relationships with clients at senior/Board level, based upon personal credibility and a sound understanding of business & industry sector dynamics.
Manage and motivate assignment teams and projects, ensuring that all have clear objectives, receive regular feedback on performance, and have timely, honest project appraisals completed.", "2021-07-13", "Full Time", "Birmingham", 1, 1, ""),
        ("Solutions Architect",
         "As a Solution Architect (Manager) in Kainos, you’ll be responsible for leading multi-skilled agile teams to design and deliver high quality solutions which delight our customers and impact the lives of users worldwide. You’ll work with customer architects to agree functional and non-functional designs, advising customers and managers on the estimated effort, technical implications and complexity surrounding your designs.",
          "2021-06-20", "Full Time", "Derry-Londonderry", 1, 1, "https://kainossoftwareltd.sharepoint.com/people/Job%20Specifications/Forms/AllItems.aspx?id=%2Fpeople%2FJob%20Specifications%2FEngineering%2FJob%20Profile%20%2D%20Solution%20Architect%20%28Manager%29%2Epdf&parent=%2Fpeople%2FJob%20Specifications%2FEngineering&p=true&originalPath=aHR0cHM6Ly9rYWlub3Nzb2Z0d2FyZWx0ZC5zaGFyZXBvaW50LmNvbS86YjovZy9wZW9wbGUvRVNwcDU2Zlp5cmhLaTZ1Q3V3cHNoRHdCM25tbzFCTWtiUUtZRFhiTkhDaV9zdz9ydGltZT1tcHlFbzJSczJVZw"),
        ("Market Intelligence Analyst", "As a Market Intelligence Analyst (Senior Associate) at Kainos, you will proactively develop initiatives for gathering and analysing market and competitor data, as well as responding to specific research requests, to deliver actionable intelligence which will drive the growth of the business. You will work at times autonomously, but often as part of a team, to produce strategic intelligence reports using creative research methodologies to identify insights and deliver strategic recommendations. You will spot trends and look for new markets and accounts to target based on our offerings and potential new offerings.", "2021-08-24", "Full Time", "London", 1, 1, ""),
        ("Market Intelligence Analyst", "As a Market Intelligence Analyst (Senior Associate) at Kainos, you will proactively develop initiatives for gathering and analysing market and competitor data, as well as responding to specific research requests, to deliver actionable intelligence which will drive the growth of the business. You will work at times autonomously, but often as part of a team, to produce strategic intelligence reports using creative research methodologies to identify insights and deliver strategic recommendations. You will spot trends and look for new markets and accounts to target based on our offerings and potential new offerings.", "2021-01-24", "Full Time", "Birmingham", 2, 2, "");



INSERT INTO responsibility (`responsibilityId`, `responsibility`)
VALUES (1,"Has successfully delivered software designs for multi-tiered modern software applications."),
	   (2,"Understands whole solution architecture concepts and can communicate and negotiate these with customer architects."),
	   (3,"Can prioritise non-functional concerns for customers and has experience incorporating these into the application design."),
	   (4,"Able to simply and clearly communicate technical design in conversation and presentations.");



INSERT INTO role_responsibility (`roleId`, `responsibilityId`)
VALUES (1, 1),
	   (1, 4),
	   (2, 2),
	   (2, 3),
	   (3, 2),
	   (3, 4),
	   (4, 1),
	   (4, 3);



INSERT INTO competency(competencyName, competencyDescription)
VALUES ("Personal Performance", "Effective leadership requires individuals to draw upon values, strengths, and abilities to deliver high standards of service. Demonstrating effectiveself-awareness, self-management, continued personal development and acting with integrity."),
("Working with others", "Effective leadership requires individuals to work with others in teams and networks to deliver and improve services.  Mobilising people in an inclusive way to drive continuous business improvement."),
("Setting Direction, Development and Accountability", "Effective leadership requires individuals to contribute to the aspirations of Kainos and act in a manner consistent with our values. Demonstrating effectiveness in identifying the contexts for change, applying knowledge, making decisions, and promoting accountability through effective self-management.");
--("Supporting and Delivering the Strategy", "Effective leadership requires the support, contribution, and delivery ofthe strategic vision by developing and agreeing strategic plans that place Kainos values at the heart of the service and ensuring that these are translated into achievable operational plans. Demonstrating effectiveness in supporting, framing, developing, implementing, and embedding the strategy."),
--("Commerciality and Risk", "Effective leadershiprequires individuals to demonstrate effectiveness within commerciality and risk and support efficiencies and profitability by maintaining an economic, long term focus in all activities.This includes identifying economic, market and customer issues and using these topromote innovative business models, commercial partnerships, and agreements to deliver greatest value –ensuring tight commercial controls of finance, assets and contracts to meet strategic priorities."),
--("Communicating and Influence", "Effective leadership requires individuals to be exceptional and confident communicators.  Showing an ability to adapt own style to suit various audiences.  Captivating and engaging others to promote and influence the Kainos vision.  Investing time in others to develop connections and role model our Kainos values.");



-- Apprentice
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 1, "Understands own strengths and areas of development. Self-aware of own well-being and seeks support where appropriate."),
(1, "Managing yourself", 1, "Works with People Manager to sets and achieve goals by monitoring progress regularly against performance."),
(1, "Continuing personal development", 1, "Flexible and willingness to learn on the job while proactively keeping up to date with the knowledge and skills needed."),
(1, "Acting with integrity", 1, "Understands the company values and applies this to own principles. Is open and honest and acts respectfully with others and customers."),
(2, "Mobilises self and others to drive self-improvement", 1, "Understand how to respond constructively to developmental feedback from a diverse range of people and implement changes as a result."),
(2, "Champions continuous improvement", 1, "Displays high levels of enthusiasm, energy and pace to achieve performance and results."),
(3, "Effective time management", 1, "Understands role, tasks and deadlines and work towards these, escalating any issues where appropriate to People/Project Manager.");



-- Trainee
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 2, "Understands others strengths and areas for development. Recognising diversity and its value within self and team. Proactively uses well-being tools to support self-regulation."),
(1, "Managing yourself", 2, "Able to identify own goals and discusses these with People Manager. Understands the need to work conscientiously to achieve tasks on schedule."),
(1, "Continuing personal development", 2, "Identifies learning gaps and seeks out opportunities to improve skills. Open to developmental feedback from others."),
(1, "Acting with integrity", 2, "Demonstrates positive behaviours when dealing with others and ensures application of the values while working and representing Kainos to our customers."),
(2, "Mobilises self and others to drive self-improvement", 2, "Shares learning with the team and other colleagues, contributing to the team’s understanding."),
(2, "Champions continuous improvement", 2, "Maintains consistent performance, challenging self and others to be positive and focused on achieving results,despite setbacks. Support others to work in a way that is mutually supportive");



-- Associate
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 3, "Seeks out new challenges and opportunities that may stretch current abilities. Builds on own self-awareness of overall well-being. Understands and confidently articulates own learning and developmental needs and proactively seek opportunities to gain "),
(1, "Managing yourself", 3, "Recognises the need for SMART goals, and demonstrates a “can do” attitude, through having own internal standards of performance."),
(1, "Continuing personal development", 3, "Seeks out opportunities to improve skills beyond the role scope whilst also seeking regular feedback."),
(1, "Acting with integrity", 3, "Encourages positive behaviours in others, while role modelling the Kainos values."),
(2, "Mobilises self and others to drive self-improvement", 3, "Actively take opportunities to learn from a diverse range of people, to maximise performance and mentor/coach more junior colleagues."),
(2, "Champions continuous improvement", 3, "Is creative in finding ways to learn and personally improve results, suggesting new approaches to benefit self and the team. Review progress against goals making necessary adjustments to deliver successfully.");



-- Senior Associate
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 4, "Understands and confidently articulates own learning and developmental needs and proactively seek opportunities to gain experience. Has a strong level of self-awareness and in tune with own wellbeing needs and intuitive of others."),
(1, "Managing yourself", 4, "Seeks and responds positively to feedback regarding own learning and development. Approach with a willingness to take on tasks that are outside role scope."),
(1, "Continuing personal development", 4, "Looks for opportunities to take on new challenges while proactively supporting and encouraging others in identifying learning needs."),
(1, "Acting with integrity", 4, "Recognises inappropriate behaviours and challenges constructively while promoting the Kainos values. Adapting behaviours and acting in the most appropriate way to enable others to respond constructively."),
(2, "Mobilises self and others to drive self-improvement", 4, "Proactively supports the development of other team members while identifying opportunities to increase innovation to achieve team’s objectives"),
(2, "Champions continuous improvement", 4, "Encourages both formal and informal learning opportunities, ensuring others take responsibility for own learning and share this to increase organisational capability. Support and stretches self and others to deliver agreed goals and objectives");



-- Consultant
INSERT INTO competency_element(competencyID, elementName, bandID, elementDescription)
VALUES (1, "Developing self-awareness", 5, "Understands own personal preferences, biases and values different cultures, backgrounds and circumstances in decision making and takes actions.Champions Kainos wellbeing offerings and provides direction to the various well-being guides and support available for our people."),
(1, "Managing yourself", 5, "Consistently sets own goals and manages this independently. Making autonomous decisions and are able to ‘get on with the job’ escalating decisions only when appropriate."),
(1, "Continuing personal development", 5, "Identifies and addresses team or individual capability requirements and gaps to deliver current and future work. Consistently identifies and develops self and others to support talent development."),
(1, "Acting with integrity", 5, "Demonstrates professional and organisational values through actions and behaviours. Behaves in an inclusive manner and respects equality and diversity."),
(2, "Mobilises self and others to drive self-improvement", 5, "Support and empower team members through a range of activities to include coaching and mentoring. Demonstrate that leadership and technical skills are equally valued"),
(2, "Champions continuous improvement", 5, "Role model continuous learning and self-development, evaluating own effectiveness and growth. Motivate others to achieve through challenging times. Regularly monitor and discuss own and team’s performance expectations defined within the performance management system.");
