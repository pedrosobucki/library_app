package com.sobucki.drawermenu;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.SearchView;

public class BookItem implements Parcelable {
    private int mCover;
    private String mBookTitle;
    private String mAuthor;
    private int mYear;
    private String mPublisher;
    private String mDescription;
    private int mPages;

    public BookItem(int imageResource, String bookTitle, String author, int year, String publisher, String description, int pages){
        mCover = imageResource;
        mBookTitle = bookTitle;
        mAuthor = author;
        mYear = year;
        mPublisher = publisher;
        mDescription = description;
        mPages = pages;
    }

    public BookItem(int imageResource, String bookTitle, String author){
        mCover = imageResource;
        mBookTitle = bookTitle;
        mAuthor = author;
    }

    public BookItem(String bookTitle, String author){
        mBookTitle = bookTitle;
        mAuthor = author;
    }

    protected BookItem(Parcel in) {
        mCover = in.readInt();
        mBookTitle = in.readString();
        mAuthor = in.readString();
        mYear = in.readInt();
        mPublisher = in.readString();
        mDescription = in.readString();
        mPages = in.readInt();
    }

    public static final Creator<BookItem> CREATOR = new Creator<BookItem>() {
        @Override
        public BookItem createFromParcel(Parcel in) {
            return new BookItem(in);
        }

        @Override
        public BookItem[] newArray(int size) {
            return new BookItem[size];
        }
    };

    public int getCover() {
        return mCover;
    }

    public String getBookTitle() {
        return mBookTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public int getYear() {
        return mYear;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getPages() {
        return mPages;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mCover);
        dest.writeString(mBookTitle);
        dest.writeString(mAuthor);
        dest.writeInt(mYear);
        dest.writeString(mPublisher);
        dest.writeString(mDescription);
        dest.writeInt(mPages);
    }
}
