INSERT INTO tProgrammingLanguage (name) VALUES('Java');
INSERT INTO tProgrammingLanguage (name) VALUES('JavaScript');
INSERT INTO tProgrammingLanguage (name) VALUES('C#');

INSERT INTO tLanguage (name) VALUES('english');
INSERT INTO tLanguage (name) VALUES('spanish');
INSERT INTO tLanguage (name) VALUES('mandarin');

INSERT INTO tMember (firstname, lastname) VALUES('John', 'Doe');
INSERT INTO tMember (firstname, lastname) VALUES('Jane', 'Doe');
INSERT INTO tMember (firstname, lastname) VALUES('John', 'Smith');

INSERT INTO tProgrammingLanguage_Member (memberId, programmingLanguageId, yearsOfExperience, knowledgeLevel)
    VALUES(1, 2, 2, 'basic');
INSERT INTO tProgrammingLanguage_Member (memberId, programmingLanguageId, yearsOfExperience, knowledgeLevel)
    VALUES(1, 3, 4, 'intermediate');

INSERT INTO tLanguage_Member (memberId, languageId, knowledgeLevel)
    VALUES(1, 2, 'C2');
INSERT INTO tLanguage_Member (memberId, languageId, knowledgeLevel)
    VALUES(1, 3, 'A1');