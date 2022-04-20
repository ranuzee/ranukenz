package com.example.ranuputra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChatFragment extends Fragment{
    public ChatFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancedState) {
        View ChatFragment = inflater.inflate(R.layout.fragment_chat, container, false);
        String[]menuItems={"Pisang","Jeruk","Apel","Semangka","Pisang","jeruk","Apel","Semangka","Pisang","Jeruk","Apel","Semangka","Pisang","jeruk","Apel","Semangka"};

        ListView listView = (ListView) ChatFragment.findViewById(R.id.list_item);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );
        listView.setAdapter(listViewAdapter);
        return ChatFragment;
    }
}