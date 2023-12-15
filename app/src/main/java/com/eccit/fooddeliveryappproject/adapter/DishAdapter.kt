package com.eccit.fooddeliveryappproject.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.eccit.fooddeliveryappproject.R
import com.eccit.fooddeliveryappproject.models.Dish


class DishAdapter(private val mList: List<Dish>) : RecyclerView.Adapter<DishAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_detail, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = mList[position]
        holder.setupView(dataModel.title, dataModel.description, dataModel.image)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title : TextView
        var description : TextView
        var image : ImageView

        init {
            title = view.findViewById(R.id.txt_title)
            description = view.findViewById(R.id.txt_description)
            image = view.findViewById(R.id.imageview)
        }

        fun setupView(titleData: String, descriptionData: String, imageData : Int) {
            title.text = titleData
            description.text = descriptionData
            image.setImageResource(imageData)

            itemView.setOnClickListener {
                Toast.makeText(it.context, "Kamu memilih ${titleData}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}