package com.example.ToDoList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/example/ToDoList/DataObject;", "", "()V", "listdata", "", "Lcom/example/ToDoList/CardInfo;", "getListdata", "()Ljava/util/List;", "setListdata", "(Ljava/util/List;)V", "deleteAll", "", "deleteData", "pos", "", "getAllData", "", "getData", "setData", "title", "", "priority", "updateData", "app_debug"})
public final class DataObject {
    @org.jetbrains.annotations.NotNull
    public static final com.example.ToDoList.DataObject INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.example.ToDoList.CardInfo> listdata;
    
    private DataObject() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.ToDoList.CardInfo> getListdata() {
        return null;
    }
    
    public final void setListdata(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.ToDoList.CardInfo> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String priority) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.ToDoList.CardInfo> getAllData() {
        return null;
    }
    
    public final void deleteAll() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.ToDoList.CardInfo getData(int pos) {
        return null;
    }
    
    public final void deleteData(int pos) {
    }
    
    public final void updateData(int pos, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String priority) {
    }
}