drop table if exists tProgrammingLanguage;

CREATE TABLE tProgrammingLanguage (
    id BIGINT auto_increment,
    name VARCHAR(32),
    cr_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE tProgrammingLanguage ADD PRIMARY KEY(id);

drop table if exists tLanguage;

CREATE TABLE tLanguage (
    id BIGINT auto_increment,
    name VARCHAR(32),
    cr_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE tLanguage ADD PRIMARY KEY(id);

-- tMember START
drop table if exists tMember;

CREATE TABLE tMember (
    id BIGINT auto_increment,
    firstname VARCHAR(32),
    lastname VARCHAR(64),
    crDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE tMember ADD PRIMARY KEY(id);
-- tMember END

drop table if exists tProgrammingLanguage_Member;

CREATE TABLE tProgrammingLanguage_Member (
    id BIGINT auto_increment,
    memberId BIGINT,
    programmingLanguageId BIGINT,
    yearsOfExperience TINYINT,
    knowledgeLevel VARCHAR(16),
    crDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE tProgrammingLanguage_Member ADD PRIMARY KEY(id);
ALTER TABLE tProgrammingLanguage_Member ADD UNIQUE KEY (memberId, programmingLanguageId);
ALTER TABLE tProgrammingLanguage_Member ADD FOREIGN KEY(memberId)
    REFERENCES tMember(id);
ALTER TABLE tProgrammingLanguage_Member ADD FOREIGN KEY(programmingLanguageId)
    REFERENCES tProgrammingLanguage(id);
ALTER TABLE tProgrammingLanguage_Member ADD CONSTRAINT ct1_ProgrammingLanguage_Member
    CHECK (knowledgeLevel IN ('basic', 'intermediate', 'advanced', 'guru'));

drop table if exists tLanguage_Member;

CREATE TABLE tLanguage_Member (
    id BIGINT auto_increment,
    memberId BIGINT,
    languageId BIGINT,
    knowledgeLevel VARCHAR(16),
    crDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE tLanguage_Member ADD PRIMARY KEY(id);
ALTER TABLE tLanguage_Member ADD UNIQUE KEY (memberId, languageId);
ALTER TABLE tLanguage_Member ADD FOREIGN KEY(memberId)
    REFERENCES tMember(id);
ALTER TABLE tLanguage_Member ADD FOREIGN KEY(languageId)
    REFERENCES tLanguage(id);
ALTER TABLE tLanguage_Member ADD CONSTRAINT ct1_Language_Member
    CHECK (knowledgeLevel IN ('A1', 'A2', 'B1', 'B2', 'C1', 'C2'));