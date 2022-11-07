SELECT c.name AS Customers
FROM Customers c 
WHERE c.id not in
( SELECT customerid FROM Orders)