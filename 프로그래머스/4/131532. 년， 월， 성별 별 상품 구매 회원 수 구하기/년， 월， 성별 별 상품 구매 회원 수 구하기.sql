SELECT YEAR(O.SALES_DATE) AS 'YEAR' 
    ,MONTH(O.SALES_DATE) AS 'MONTH'
    ,GENDER,COUNT(DISTINCT(U.USER_ID)) AS 'USERS'
FROM USER_INFO U JOIN ONLINE_SALE O 
ON U.USER_ID=O.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR(O.SALES_DATE),MONTH(O.SALES_DATE),GENDER
ORDER BY YEAR(O.SALES_DATE),MONTH(O.SALES_DATE),GENDER;