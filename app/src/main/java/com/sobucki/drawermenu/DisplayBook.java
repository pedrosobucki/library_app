package com.sobucki.drawermenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayBook extends AppCompatActivity {
    private ImageView cover;
    private TextView title;
    private TextView author;
    private TextView year;
    private TextView publisher;
    private TextView description;
    private TextView pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_book);

        Intent intent = getIntent();
        BookItem book = intent.getParcelableExtra("book");

        cover = findViewById(R.id.displayImage);
        title = findViewById(R.id.displayTitle);
        author = findViewById(R.id.displayAuthor);
        year = findViewById(R.id.displayYearInf);
        publisher = findViewById(R.id.displayPublisherInf);
        description = findViewById(R.id.description);
        pages = findViewById(R.id.displayPagesInf);

        //set cover
        cover.setImageResource(book.getCover());

        //set tile
        title.setText(book.getBookTitle());

        //set author
        author.setText(book.getAuthor());

        //set year
        if(book.getYear() == 0){
            year.setText("Not available!");
        }else {
            year.setText(Integer.toString(book.getYear()));
        }

        //set publisher
        if(book.getPublisher() == null){
            publisher.setText("Not available!");
        }else{
            publisher.setText(book.getPublisher());
        }

        //set description
        if(book.getDescription() == null){
            description.setText("No description available!");
        }else {
            description.setText("\t\t" + book.getDescription());
        }

        //set pages
        if(book.getPages() == 0){
            pages.setText("Not available!");
        }else{
            pages.setText(Integer.toString(book.getPages()));
        }
    }
}
