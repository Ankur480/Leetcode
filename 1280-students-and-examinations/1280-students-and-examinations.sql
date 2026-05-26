# Write your MySQL query statement below
SELECT
    s.student_id,
    s.student_name,
    sub.subject_name,
    (
        select count(1) from examinations
        where student_id = s.student_id
        and subject_name = sub.subject_name
    )
    as attended_exams
    from students s
    join subjects sub
    order by s.student_id, sub.subject_name;