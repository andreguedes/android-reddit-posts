package br.com.reddit.posts.model

data class Post(
    val title: String,
    val date: String,
    val timeCreation: String
)

object PostMock {

    fun getList() = listOf(
        Post("Title 1", "01/01/2021", "10h21"),
        Post("Title 2", "02/01/2021", "10h21"),
        Post("Title 3", "03/01/2021", "10h21"),
        Post("Title 4", "06/01/2021", "10h21"),
    )

}
