package pip.com.apkmuslimquran.ui.dzikir

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.dzikir_rv_layout.view.*
import pip.com.apkmuslimquran.R
import pip.com.apkmuslimquran.model.Dzikir

class DzikirAdapter(val context: Context?, private val dzikir :ArrayList<Dzikir>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.dzikir_rv_layout, parent, false)

        return  ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return dzikir.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        //Now we gonna bind view & data's here..
        Picasso.get().load(dzikir[position].url).into(holder.itemView.dzikirImage)

        //Kenburns Animation here
        holder.itemView.dzikirImage.resume()

        holder.itemView.tv_title.text = dzikir[position].title
        holder.itemView.tv_repeat.text = dzikir[position].repeat
        holder.itemView.tv_dzikir.text = dzikir[position].dzikir
        holder.itemView.tv_latin.text = dzikir[position].latin
        holder.itemView.tv_translate.text = dzikir[position].translate
        holder.itemView.tv_faedah.text = dzikir[position].faedah
    }

    //cretate ViewHolder Class
    class ViewHolder(v: View?): RecyclerView.ViewHolder(v!!), View.OnClickListener{
        override fun onClick(v: View?) {
        }

        init {
            itemView.setOnClickListener(this)
        }


    }

}