select s.std_no, s.std_name, s.std_score, m.major_name, s.gender
from student s join major m on s.major_no = m.major_no;

SELECT * FROM (SELECT RANK() OVER(ORDER BY S.STD_SCORE DESC) AS STD_RANK, S.* FROM STUDENT S) WHERE STD_RANK <= 10;