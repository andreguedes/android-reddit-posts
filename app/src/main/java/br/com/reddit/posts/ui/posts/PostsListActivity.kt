package br.com.reddit.posts.ui.posts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.reddit.posts.R
import kotlinx.android.synthetic.main.activity_posts_list.*

class PostsListActivity : AppCompatActivity() {

    private lateinit var postsListAdapter: PostsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts_list)
    }

    override fun onResume() {
        super.onResume()

        initViews()
    }

    private fun initViews() {
        postsListAdapter = PostsListAdapter()

        rv_posts.apply {
            layoutManager = LinearLayoutManager(this@PostsListActivity)
            adapter = postsListAdapter
        }
    }

}
