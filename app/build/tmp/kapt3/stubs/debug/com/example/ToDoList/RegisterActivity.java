package com.example.ToDoList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,\u00a8\u00064"}, d2 = {"Lcom/example/ToDoList/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnRegister", "Landroid/widget/Button;", "getBtnRegister", "()Landroid/widget/Button;", "setBtnRegister", "(Landroid/widget/Button;)V", "edtEmail", "Landroid/widget/EditText;", "getEdtEmail", "()Landroid/widget/EditText;", "setEdtEmail", "(Landroid/widget/EditText;)V", "edtFirstName", "getEdtFirstName", "setEdtFirstName", "edtPassword", "getEdtPassword", "setEdtPassword", "edtPhone", "getEdtPhone", "setEdtPhone", "edtSecondName", "getEdtSecondName", "setEdtSecondName", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getMAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setMAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "progress", "Landroid/app/ProgressDialog;", "getProgress", "()Landroid/app/ProgressDialog;", "setProgress", "(Landroid/app/ProgressDialog;)V", "registerText", "Landroid/widget/TextView;", "getRegisterText", "()Landroid/widget/TextView;", "setRegisterText", "(Landroid/widget/TextView;)V", "tvSignIn", "getTvSignIn", "setTvSignIn", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.TextView registerText;
    public android.widget.EditText edtFirstName;
    public android.widget.EditText edtSecondName;
    public android.widget.EditText edtEmail;
    public android.widget.EditText edtPhone;
    public android.widget.EditText edtPassword;
    public android.widget.Button btnRegister;
    public android.widget.TextView tvSignIn;
    public android.app.ProgressDialog progress;
    public com.google.firebase.auth.FirebaseAuth mAuth;
    
    public RegisterActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getRegisterText() {
        return null;
    }
    
    public final void setRegisterText(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtFirstName() {
        return null;
    }
    
    public final void setEdtFirstName(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtSecondName() {
        return null;
    }
    
    public final void setEdtSecondName(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtEmail() {
        return null;
    }
    
    public final void setEdtEmail(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtPhone() {
        return null;
    }
    
    public final void setEdtPhone(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtPassword() {
        return null;
    }
    
    public final void setEdtPassword(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtnRegister() {
        return null;
    }
    
    public final void setBtnRegister(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTvSignIn() {
        return null;
    }
    
    public final void setTvSignIn(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.ProgressDialog getProgress() {
        return null;
    }
    
    public final void setProgress(@org.jetbrains.annotations.NotNull
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth getMAuth() {
        return null;
    }
    
    public final void setMAuth(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}