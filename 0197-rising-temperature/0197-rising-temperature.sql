SELECT w1.id AS id
FROM Weather w1 JOIN Weather w
ON DATEDIFF(w1.recordDate, w.recordDate) = 1
AND w1.temperature > w.temperature