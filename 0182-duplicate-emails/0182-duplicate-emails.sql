SELECT email AS Email
FROM Person
GROUP BY email HAVING count(Email)>1