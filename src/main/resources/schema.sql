CREATE TABLE devices (
  id VARCHAR(255),
  name VARCHAR(255),
  PRIMARY KEY (id)
  );

  CREATE SEQUENCE devices_seq
  START WITH 1      -- The initial value of the sequence
  INCREMENT BY 1    -- The step for each increment
  NO MINVALUE       -- Do not specify a minimum value (default is 1 for ascending sequences)
  NO MAXVALUE       -- Do not specify a maximum value
  CACHE 1;          -- Cache size for performance
