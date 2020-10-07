package com.sobucki.drawermenu;

import java.util.ArrayList;

public class FillBookList {

    public ArrayList<BookItem> getArray(){
        ArrayList<BookItem> bookList = new ArrayList<>();
        BookItem lotr = new BookItem(R.drawable.lotr_book_cover,"Lord of the Rings", "J.R.R.Tolkien", 1954, "Harper Collins",  "The Lord of the Rings, fantasy novel by J.R.R. Tolkien initially published in three parts as The Fellowship of the Ring (1954), The Two Towers (1955), and The Return of the King (1955). The novel, set in the Third Age of Middle-earth, formed a sequel to Tolkien’s The Hobbit (1937) and was succeeded by his posthumous The Silmarillion (1977). The Lord of the Rings is the saga of a group of sometimes reluctant heroes who set forth to save their world from consummate evil. Its many worlds and creatures were drawn from Tolkien’s extensive knowledge of philology and folklore.", 603);
        bookList.add(lotr);
        BookItem animal = new BookItem(R.drawable.animal_farm_book_cover,"Animal Farm", "George Orwell",1945, "Library", "Animal Farm is an allegorical novella by George Orwell, first published in England on 17 August 1945.[1][2] The book tells the story of a group of farm animals who rebel against their human farmer, hoping to create a society where the animals can be equal, free, and happy. Ultimately, however, the rebellion is betrayed, and the farm ends up in a state as bad as it was before, under the dictatorship of a pig named Napoleon." , 112 );
        bookList.add(animal);
        BookItem sandman = new BookItem(R.drawable.sandman_cover,"Sandman", "Neil Gaiman", 1989, "DC Comics", "The Sandman is a story about stories and how Morpheus, the Lord of Dreams, is captured and subsequently learns that sometimes change is inevitable.[2] The Sandman was Vertigo's flagship title, and is available as a series of ten trade paperbacks, a recolored five-volume Absolute hardcover edition with slipcase, in a black-and-white Annotated edition, and is available for digital download.",115);
        bookList.add(sandman);
        BookItem potter = new BookItem(R.drawable.potter_cover,"Harry Potter", "J.K.Rowling", 1997, "UK Publisher", "Harry Potter and the Philosopher's Stone is a fantasy novel written by British author J. K. Rowling. The first novel in the Harry Potter series and Rowling's debut novel, it follows Harry Potter, a young wizard who discovers his magical heritage on his eleventh birthday, when he receives a letter of acceptance to Hogwarts School of Witchcraft and Wizardry. Harry makes close friends and a few enemies during his first year at the school, and with the help of his friends, Harry faces an attempted comeback by the dark wizard Lord Voldemort, who killed Harry's parents, but failed to kill Harry when he was just 15 months old.", 320);
        bookList.add(potter);
        BookItem dune = new BookItem(R.drawable.dune_cover,"Dune", "Frank Herbert", 1965, "Amazon Books", "Here is the novel that will be forever considered a triumph of the imagination. Set on the desert planet Arrakis, Dune is the story of the boy Paul Atreides, who would become the mysterious man known as Muad'Dib. He would avenge the traitorous plot against his noble family--and would bring to fruition humankind's most ancient and unattainable dream.", 780);
        bookList.add(dune);
        BookItem berserk = new BookItem(R.drawable.berserk_cover,"Berserk", "Kentaro Miura", 1989, "Panini Comics", "Guts, a former mercenary now known as the \"Black Swordsman,\" is out for revenge. After a tumultuous childhood, he finally finds someone he respects and believes he can trust, only to have everything fall apart when this person takes away everything important to Guts for the purpose of fulfilling his own desires. Now marked for death, Guts becomes condemned to a fate in which he is relentlessly pursued by demonic beings.", 230);
        bookList.add(berserk);

        BookItem hitchhiker = new BookItem("Hitchhiker's Guide to the Galaxy", "Douglas Adams");
        hitchhiker.setPages(141);
        hitchhiker.setDescription("The Hitchhiker's Guide to the Galaxy is the first of six books in the Hitchhiker's Guide to the Galaxy comedy science fiction \"trilogy\" by Douglas Adams. The novel is an adaptation of the first four parts of Adams's radio series of the same name. The novel was first published in London on 12 October 1979.[2] It sold 250,000 copies in the first three months.\n" + "\t\tThe namesake of the novel is The Hitchhiker's Guide to the Galaxy, a fictional guide book for hitchhikers (inspired by the Hitch-hiker's Guide to Europe) written in the form of an encyclopaedia.");
        bookList.add(hitchhiker);

        BookItem nineteen = new BookItem("1984", "George Orwell");
        nineteen.setPublisher("Penguin Books");
        nineteen.setYear(1945);
        bookList.add(nineteen);

        BookItem cthulhu = new BookItem(R.drawable.cthulhu_cover, "The Call of Cthulhu", "H.P.Lovecraft");
        bookList.add(cthulhu);


        return bookList;
    }

}
