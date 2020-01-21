package pri.sean10202.lab7

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.adapter_horizontal.view.*


class MyAdapter constructor(private val layout: Int, private val data: ArrayList<Item>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = View.inflate(parent?.context, layout, null)
        view.img_photo.setImageResource(data[position].photo)
        view.tv_name.text = data[position].name
        return view
    }

    override fun getItem(position: Int) = data[position]

    override fun getItemId(position: Int) = 0L

    override fun getCount() = data.size
}