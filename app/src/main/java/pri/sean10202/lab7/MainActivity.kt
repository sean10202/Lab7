package pri.sean10202.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = ArrayList<Item>()
        val img_array = resources.obtainTypedArray(R.array.resourceList)
        val name_list =
            listOf("日歷",
                "相機",
                "訊息",
                "代辦清單",
                "鬧鐘",
                "聯絡人",
                "檔案管理",
                "定位",
                "信箱",
                "記事本",
                "設定")
        for(i in 0 until img_array.length()) {
            item.add(Item(img_array.getResourceId(i, 0), "功能${i}"))
        }
        img_array.recycle()

        spinner.adapter = MyAdapter(R.layout.adapter_horizontal, item)

        gridview.numColumns = 3
        gridview.adapter = MyAdapter(R.layout.adapter_vertical, item)

        listview.adapter = ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,
            arrayListOf("項目1",
                "項目2",
                "項目3",
                "項目4",
                "項目5",
                "項目6",
                "項目7",
                "項目8",
                "項目9",
                "項目10",
                "項目11")
        )
    }
}

data class Item (
    val photo: Int,
    val name: String
)
