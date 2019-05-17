INSERT INTO CUSTOMER VALUES(1, 'der@fritz.com', 'Fritz', 'Konrad', 'm', TO_DATE('1991-08-20', 'YYYY-MM-DD'), 4);

Select * 
FROM CUSTOMER;

INSERT INTO CUSTOMER VALUES(2, 'die@angela.com', 'Angela', 'Konrad', 'w', TO_DATE('1992-06-05', 'YYYY-MM-DD'), -1);

INSERT INTO CUSTOMER VALUES(3, 'dos@bom.com', 'Herbert', 'Maus', 'm', sysdate, 3);

UPDATE CUSTOMER
SET BIRTHDATE = TO_DATE('1985-08-20', 'YYYY-MM-DD')
WHERE CUSTOMER_ID = 1;

Select * 
FROM CUSTOMER;

UPDATE CUSTOMER
SET CREDITS = -3
WHERE CUSTOMER_ID = 1;

INSERT INTO CUSTOMER VALUES(2, 'dosbom.com', 'Herbert', 'Maus', 'm', TO_DATE('1991-08-20', 'YYYY-MM-DD'), 3);
