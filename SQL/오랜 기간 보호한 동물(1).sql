SELECT *
FROM(SELECT A.NAME, A.DATETIME FROM ANIMAL_INS A, ANIMAL_OUTS B
     WHERE A.ANIMAL_ID=B.ANIMAL_ID(+) AND B.ANIMAL_ID IS NULL
     ORDER BY A.DATETIME ASC)
WHERE ROWNUM <= 3
