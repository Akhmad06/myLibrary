package com.lib.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
 @Table(name = "book", schema = "myLibrary")
     public class Book {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Basic
        @Column(name = "name")
        private String name;

        @Basic
        @Column(name = "genre")
        private String genre;

        @Basic
        @Column(name = "year")
        private int year;

        @Basic
        @Column(name = "num_of_pages")
        private int numOfPages;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getNumOfPages() {
            return numOfPages;
        }

        public void setNumOfPages(int numOfPages) {
            this.numOfPages = numOfPages;
        }

     @ManyToMany(mappedBy = "books")
     private Set<Author> authors = new HashSet<>();

     public void addAuthor(Author author){
         authors.add(author);
         author.getBooks().add(this);
     }

    public Set<Author> getAuthors() {
        return authors;
    }

    @Override
     public String toString() {
         return "Book{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", genre='" + genre + '\'' +
                 ", year=" + year +
                 ", numOfPages=" + numOfPages +
                 '}';
     }
 }
