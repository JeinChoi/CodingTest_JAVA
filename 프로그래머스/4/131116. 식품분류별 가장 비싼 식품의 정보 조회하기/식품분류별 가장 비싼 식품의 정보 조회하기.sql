SELECT A.CATEGORY, B.MAX_PRICE, A.PRODUCT_NAME
FROM FOOD_PRODUCT A 
JOIN (
SELECT MAX(PRICE) AS 'MAX_PRICE'
FROM FOOD_PRODUCT
GROUP BY CATEGORY) B
ON 
A.PRICE=B.MAX_PRICE
WHERE CATEGORY IN ('과자','국','김치','식용유')
GROUP BY CATEGORY
ORDER BY PRICE DESC;