### Ordenar por representacion binaria
___

#### Desarrolar un microservicio en java, que dada una lista de numeros enteros, devuelva como resultado dicha lista ordenada según la representación binaria de cada número en orden ascendente. Para dos numeros con el mismo numero de unos se utilizará el ordinal para establecer el orden.
Ejemplo:

Para la lista {7, 2, 1, 9, 5, 3, 8, 25, 42}, el resultado será {1, 2, 8, 3, 5, 9, 7, 25, 42}

Curl para testear:

curl --location 'http://localhost:8080/api/v1/sort/binary' \
--header 'Content-Type: application/json' \
--data '[7, 2, 1, 9, 5, 3, 8, 25, 42]'
