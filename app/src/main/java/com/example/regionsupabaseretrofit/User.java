package com.example.regionsupabaseretrofit;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("age")
    @Expose
    public Integer age;
    @SerializedName("email")
    @Expose
    public Object email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createdAt='" + createdAt + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email=" + email +
                '}';
    }
}
