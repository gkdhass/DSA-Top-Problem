# Write your MySQL query statement below
WITH FilteredStadium AS (
    SELECT id, visit_date, people,
           id - ROW_NUMBER() OVER (ORDER BY id) AS diff
    FROM Stadium
    WHERE people >= 100
)
SELECT id, visit_date, people
FROM FilteredStadium
WHERE diff IN (
    SELECT diff
    FROM FilteredStadium
    GROUP BY diff
    HAVING COUNT(*) >= 3
)
ORDER BY visit_date ASC;