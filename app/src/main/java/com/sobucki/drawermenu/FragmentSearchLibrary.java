package com.sobucki.drawermenu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentSearchLibrary extends Fragment {
    RecyclerView recycler;
    MyAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<BookItem> bookList;
    SearchView searchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_search_library, container, false);

        //populate list of books
        bookList = new FillBookList().getArray();

        //search view
        searchView = fragment.findViewById(R.id.searchBar);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        //recycler view starts
        layoutManager = new LinearLayoutManager(container.getContext());
        adapter = new MyAdapter(bookList);

        recycler = fragment.findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true); //makes recyclerView size unchanging regardless of quantity of view to be shown inside
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);

        //set card click listener
        adapter.setOnItemClickListener(new MyAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position) {
                BookItem book = bookList.get(position);
                Toast.makeText(container.getContext(), "You clicked "+book.getBookTitle(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(container.getContext(), DisplayBook.class);
                intent.putExtra("book", book);
                startActivity(intent);
            }
        });
        return fragment;
    }
}
