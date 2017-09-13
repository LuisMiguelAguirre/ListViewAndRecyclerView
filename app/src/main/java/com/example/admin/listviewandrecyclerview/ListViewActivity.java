package com.example.admin.listviewandrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    ListView lvSimple, lvCustom, lvCustomVH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

  //      lvSimple = (ListView) findViewById(R.id.lvSimple);
        lvCustom = (ListView) findViewById(R.id.lvCustom);
   //     lvCustomVH = (ListView) findViewById(R.id.lvCustomVH);

    /*    List<String> personList = new ArrayList<>();
        personList.add("Jhon Doe");
        personList.add("Jhon Doe1");
        personList.add("Jhon Doe2");
        personList.add("Jhon Doe3");

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, personList);
        lvSimple.setAdapter(arrayAdapter);
*/

        List<Person> personListCustom = new ArrayList<>();
        personListCustom.add(new Person("Bill Clinton", 65, "Male", 167));
        personListCustom.add(new Person("Tom Cruise", 50, "Male", 167));
        personListCustom.add(new Person("Jennifer Aninston", 40, "Female", 167));

        CustomListAdapter customListAdapter = new CustomListAdapter(this, R.layout.custom_listview_item, personListCustom);
        lvCustom.setAdapter(customListAdapter);

  //      CustomVHListAdapter customVHListAdapter = new CustomVHListAdapter(this, R.layout.custom_listview_item, personListCustom);
  //      lvCustomVH.setAdapter(customVHListAdapter);

    }
}
