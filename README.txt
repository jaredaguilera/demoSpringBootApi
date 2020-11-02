- Instalar Jdk 1.8, url de descarga: https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.html
- Agregar en Variables de entorno JAVA_HOME y la ruta donde tenemos instalado el jdk8
- Ejecutar dentro de la carpeta raiz del proyecto en CMD el siguiente comando: .\mvnw.cmd package
- Luego, ejecutar dentro de la carpeta raiz del proyecto en CMD el siguiente comando: java -jar .\target\demo-0.0.1-SNAPSHOT.jar
- Apuntar en PostMan a traves de metodo POST a la siguiente URL: http://localhost:8888/
- Body de ejemplo:
	{
		"firstName" : "jared",
		"secondName" : "alberto",
		"surname" : "aguilera",
		"secondSurname" : "zamora",
		"birthDate": "1993-02-26"
	}
- Enjoy...