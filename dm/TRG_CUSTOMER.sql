CREATE OR REPLACE TRIGGER TRG_CUSTOMER
BEFORE INSERT OR UPDATE ON CUSTOMER
FOR EACH ROW
DECLARE
BEGIN
	IF (:NEW.CREDITS < 0) THEN
		RAISE_APPLICATION_ERROR (-20999, 'The credits have to be at least 0!');
	END IF;
	
	IF (:NEW.BIRTHDATE >= sysdate) THEN
		RAISE_APPLICATION_ERROR (-20998, 'The birthdate has to be below the current date!');
	END IF;

	IF (UPDATING) THEN
		:NEW.BIRTHDATE := :OLD.BIRTHDATE;
	END IF;

	IF NOT REGEXP_LIKE (:NEW.EMAIL, '^[a-z]+@[a-z]+\.[a-z]+$') THEN
		RAISE_APPLICATION_ERROR (-20997, 'The email address has to include @!');
	END IF;
END TRG_CUSTOMER;