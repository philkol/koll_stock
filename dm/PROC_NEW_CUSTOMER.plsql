create or replace PROCEDURE
PROC_NEW_CUSTOMER      (CUSTOMER_ID OUT INTEGER,
			EMAIL       IN  VARCHAR2,
			FIRSTNAME   IN  VARCHAR2,
			LASTNAME    IN  VARCHAR2,
			GENDER      IN  VARCHAR2,
			BIRTHDATE   IN  DATE, 
			CREDITS IN OUT  DECIMAL) IS

BEGIN
	CUSTOMER_ID := SEQ_CUSTOMER_ID.nextval;

	IF CREDITS is NULL THEN
		CREDITS := 10;
	END IF;

	INSERT INTO CUSTOMER VALUES (CUSTOMER_ID, EMAIL, FIRSTNAME, LASTNAME, GENDER, BIRTHDATE, CREDITS);  
END PROC_NEW_CUSTOMER;