PATH=C:\Program Files\Java\jdk1.7.0_07\bin

:: Domain 
javac -d universidad/WEB-INF/classes src/domain/Profesor.java src/domain/ProfesorFactory.java src/domain/ProfesorRepository.java src/domain/Grupo.java src/domain/GrupoFactory.java src/domain/GrupoRepository.java 

:: Display
javac -cp "universidad/WEB-INF/classes";"universidad/WEB-INF/lib/*" -d universidad/WEB-INF/classes src/display/PageController.java src/display/ActualizarProfesor.java src/display/DetalleProfesor.java src/display/ListaProfesores.java src/util/ProfesorAssembler.java src/util/ProfesorDTO.java src/display/AgregarProfesor.java src/display/EliminarProfesor.java src/util/GrupoAssembler.java src/util/GrupoDTO.java src/display/ListaGrupos.java src/display/NuevoGrupo.java src/display/AgregarGrupo.java src/display/DetalleGrupo.java src/display/ActualizarGrupo.java src/display/EliminarGrupo.java

:: Data
javac -cp "universidad/WEB-INF/classes";"universidad/WEB-INF/lib/*" -d universidad/WEB-INF/classes src/data/ProfesorRepositoryDAOImpl.java src/data/ProfesorDAO.java src/data/GrupoRepositoryDAOImpl.java src/data/GrupoDAO.java

:: Dialect
javac -cp "universidad/WEB-INF/classes";"universidad/WEB-INF/lib/*" -d universidad/WEB-INF/classes src/dialect/SQLiteDialect.java

pause







