package com.hitglynorthz.dontstarve;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class NewsFragment extends Fragment {
	
    private String[] news = { "New Item 1", "New Item 2", "New Item 3", "New Item 4", "New Item 5", "New ITem 6", "New Item 7", "New Item 8", "New Item 9", "New Item 10" };
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

	@Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {       
        View view = inflater.inflate(R.layout.news, container,false);

        // Find the ListView resource. 
        mainListView = (ListView) view.findViewById( R.id.mainListView );

        // Create and populate a List of planet names.
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                                          "Jupiter", "Saturn", "Uranus", "Neptune"};  
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll( Arrays.asList(planets) );
        
        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, news);
        
        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );  
        mainListView.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position,long id){
            	Toast.makeText(getActivity(), "Ha pulsado " + news[position], Toast.LENGTH_SHORT).show();                
            }
        });
        
        return view;
    }
	
}