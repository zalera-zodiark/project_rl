
data class Song(
    val name: String,
    val interpreter: String,
    val album: String,
    val year: Int
)

val librarySongs = listOf(
    Song("El alma al aire", "Alejandro Sanz", "El alma al aire", 2000),
    Song("A la primera persona", "Alejandro Sanz", "El tren de los momentos", 2008),
    Song("Si hay Dios", "Alejandro Sanz", "Más", 1997),
    
)