# Write your MySQL query statement below
with cte as(
    select * 
    from Students
    cross join Subjects
),

cte2 as(
    select student_id, subject_name, count(subject_name) as cnt
    from Examinations
    group by student_id, subject_name
)

select cte.student_id, cte.student_name, cte.subject_name, case when cnt is not null then cnt else 0 end as attended_exams
from cte
left join cte2 on cte.student_id=cte2.student_id and cte.subject_name=cte2.subject_name
order by cte.student_id, cte.subject_name;