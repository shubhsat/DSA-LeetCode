CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    set N= N-1;
  RETURN (
      SELECT Salary
      FROM Employee
      GROUP BY Salary
      ORDER BY Salary DESC
      LIMIT 1 OFFSET N
      
  );
END