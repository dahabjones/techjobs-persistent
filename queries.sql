## Part 1: Test it with SQL
SHOW columns FROM job;
## Part 2: Test it with SQL
SELECT name FROM employer
WHERE 'St Louis';
## Part 3: Test it with SQL
DROP TABLE job;
## Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER JOIN job_skills ON skills_id = job_skills.skills_id
WHERE job_skills.job_id is not null
ORDER BY name;