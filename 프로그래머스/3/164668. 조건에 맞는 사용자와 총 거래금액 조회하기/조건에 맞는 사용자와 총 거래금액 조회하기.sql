SELECT U.USER_ID,U.NICKNAME,W.TOTAL_SALES
FROM  
(
SELECT WRITER_ID ,SUM(PRICE) AS 'TOTAL_SALES'
FROM USED_GOODS_BOARD
WHERE STATUS='DONE'
GROUP BY WRITER_ID
HAVING SUM(PRICE)>=700000
) W
JOIN
USED_GOODS_USER U
ON W.WRITER_ID=U.USER_ID
ORDER BY TOTAL_SALES
;
