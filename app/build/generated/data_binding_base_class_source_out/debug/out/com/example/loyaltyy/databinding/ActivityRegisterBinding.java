// Generated by view binder compiler. Do not edit!
package com.example.loyaltyy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.loyaltyy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button mBtnRegister;

  @NonNull
  public final EditText mEdtEmail;

  @NonNull
  public final EditText mEdtFirstName;

  @NonNull
  public final EditText mEdtPassword;

  @NonNull
  public final EditText mEdtPhone;

  @NonNull
  public final EditText mEdtSecondName;

  @NonNull
  public final TextView mTvRegisterText;

  @NonNull
  public final TextView mTvSignInLink;

  private ActivityRegisterBinding(@NonNull LinearLayout rootView, @NonNull Button mBtnRegister,
      @NonNull EditText mEdtEmail, @NonNull EditText mEdtFirstName, @NonNull EditText mEdtPassword,
      @NonNull EditText mEdtPhone, @NonNull EditText mEdtSecondName,
      @NonNull TextView mTvRegisterText, @NonNull TextView mTvSignInLink) {
    this.rootView = rootView;
    this.mBtnRegister = mBtnRegister;
    this.mEdtEmail = mEdtEmail;
    this.mEdtFirstName = mEdtFirstName;
    this.mEdtPassword = mEdtPassword;
    this.mEdtPhone = mEdtPhone;
    this.mEdtSecondName = mEdtSecondName;
    this.mTvRegisterText = mTvRegisterText;
    this.mTvSignInLink = mTvSignInLink;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBtnRegister;
      Button mBtnRegister = ViewBindings.findChildViewById(rootView, id);
      if (mBtnRegister == null) {
        break missingId;
      }

      id = R.id.mEdtEmail;
      EditText mEdtEmail = ViewBindings.findChildViewById(rootView, id);
      if (mEdtEmail == null) {
        break missingId;
      }

      id = R.id.mEdtFirstName;
      EditText mEdtFirstName = ViewBindings.findChildViewById(rootView, id);
      if (mEdtFirstName == null) {
        break missingId;
      }

      id = R.id.mEdtPassword;
      EditText mEdtPassword = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPassword == null) {
        break missingId;
      }

      id = R.id.mEdtPhone;
      EditText mEdtPhone = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPhone == null) {
        break missingId;
      }

      id = R.id.mEdtSecondName;
      EditText mEdtSecondName = ViewBindings.findChildViewById(rootView, id);
      if (mEdtSecondName == null) {
        break missingId;
      }

      id = R.id.mTvRegisterText;
      TextView mTvRegisterText = ViewBindings.findChildViewById(rootView, id);
      if (mTvRegisterText == null) {
        break missingId;
      }

      id = R.id.mTvSignInLink;
      TextView mTvSignInLink = ViewBindings.findChildViewById(rootView, id);
      if (mTvSignInLink == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((LinearLayout) rootView, mBtnRegister, mEdtEmail,
          mEdtFirstName, mEdtPassword, mEdtPhone, mEdtSecondName, mTvRegisterText, mTvSignInLink);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}