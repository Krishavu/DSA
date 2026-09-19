# Write your MySQL query statement below
-- select s.user_id, 
-- round(Coalesce(avg(case when c.action='confirmed' then 1.0 else 0.0 end),0),2) as confirmation_rate
-- from Signups s
-- left join Confirmations c on s.user_id = c.user_id
-- group by c.user_id

SELECT 
    s.user_id, 
    ROUND(COALESCE(AVG(CASE WHEN c.action = 'confirmed' THEN 1.0 ELSE 0.0 END), 0), 2) AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c ON s.user_id = c.user_id
GROUP BY s.user_id;