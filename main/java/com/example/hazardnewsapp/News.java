package com.example.hazardnewsapp;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
    public class News {

        @SerializedName("Title")
        @Expose
        private String title;
        @SerializedName("Content")
        @Expose
        private String content;
        @SerializedName("Date")
        @Expose
        private String date;

        /**
         * No args constructor for use in serialization
         *
         */
        public News() {
            String date;
            String title;
            String content;
        }

        /**
         *
         * @param date
         * @param title
         * @param content
         */
        public News(String title, String content, String date) {
            super();
            this.title = title;
            this.content = content;
            this.date = date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

    }