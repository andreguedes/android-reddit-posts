package br.com.reddit.posts.ui.posts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.reddit.posts.R
import br.com.reddit.posts.model.Post
import br.com.reddit.posts.model.PostMock
import kotlinx.android.synthetic.main.post_item_list.view.*

class PostsListAdapter : RecyclerView.Adapter<PostsListAdapter.PostsListViewHolder>() {

    private val postsList = PostMock.getList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.post_item_list, parent, false)
        return PostsListViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostsListViewHolder, position: Int) {
        holder.onBind(postsList[position])
    }

    override fun getItemCount() = postsList.size

    inner class PostsListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(post: Post) {
            with(itemView) {
                txt_post_title.text = post.title
                txt_post_date.text = post.date
                txt_post_time_creation.text = post.timeCreation
            }
        }

    }

}
