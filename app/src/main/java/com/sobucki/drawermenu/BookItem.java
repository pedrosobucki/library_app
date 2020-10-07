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

    public BookItem(int cover, String title, String author, int year, String publisher, String description, int pages){
        mCover = cover;
        mBookTitle = title;
        mAuthor = author;
        mYear = year;
        mPublisher = publisher;
        mDescription = description;
        mPages = pages;
    }

    public BookItem(int cover, String bookTitle, String author){
        mCover = cover;
        mBookTitle = bookTitle;
        mAuthor = author;
    }

    public BookItem(String bookTitle, String author){
        mBookTitle = bookTitle;
        mAuthor = author;
        mCover = R.drawable.image_unavailable;
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

    public void setCover(int mCover) {
        this.mCover = mCover;
    }

    public void setBookTitle(String mBookTitle) {
        this.mBookTitle = mBookTitle;
    }

    public void setAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public void setYear(int mYear) {
        this.mYear = mYear;
    }

    public void setPublisher(String mPublisher) {
        this.mPublisher = mPublisher;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setPages(int mPages) {
        this.mPages = mPages;
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
