package com.sobucki.drawermenu;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> implements Filterable {
    private ArrayList<BookItem> mBookItems;
    private ArrayList<BookItem> mBookItemsComplete;
    private onItemClickListener mListener;

    public interface onItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        mListener = listener;
    }

    public MyAdapter(ArrayList<BookItem> bookList){
        mBookItems = bookList;
        mBookItemsComplete = new ArrayList<BookItem>(bookList);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view, mListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        BookItem item = mBookItems.get(position);
        holder.mImageView.setImageResource(item.getCover());
        holder.mBookTitle.setText(item.getBookTitle());
        holder.mAuthor.setText(item.getAuthor());
        holder.mYear.setText(Integer.toString(item.getYear()));
    }

    @Override
    public int getItemCount() {
        return mBookItems.size();
    }

    //personalized ViewHolder class
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;
        private TextView mBookTitle;
        private TextView mAuthor;
        private TextView mYear;


        public MyViewHolder(@NonNull final View itemView, final onItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.cover);
            mBookTitle = itemView.findViewById(R.id.bookTitle);
            mAuthor = itemView.findViewById(R.id.bookAuthor);
            mYear = itemView.findViewById(R.id.bookPublishYear);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        listener.onItemClick(getAdapterPosition());
                    }
                }
            });
        }
    }

    @Override
    public Filter getFilter() {
        return myFilter;
    }

    private Filter myFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<BookItem> filteredList = new ArrayList<>();
            if(constraint == null || constraint.length() == 0){
                filteredList.addAll(mBookItemsComplete);
            }else{
                String filterPatern = constraint.toString().toLowerCase().trim();

                for(BookItem book : mBookItemsComplete){
                    if(book.getBookTitle().toLowerCase().contains(filterPatern)){
                        filteredList.add(book);
                    }
                }
            }

            FilterResults result = new FilterResults();
            result.values = filteredList;

            return result;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mBookItems.clear();
            mBookItems.addAll((ArrayList<BookItem>) results.values);
            notifyDataSetChanged();

        }
    };
}
