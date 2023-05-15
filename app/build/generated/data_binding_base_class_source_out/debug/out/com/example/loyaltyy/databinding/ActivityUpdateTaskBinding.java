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

public final class ActivityUpdateTaskBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button mBtnDeleteTask;

  @NonNull
  public final Button mBtnUpdateTask;

  @NonNull
  public final EditText mEdtUpdateTaskDetails;

  @NonNull
  public final EditText mEdtUpdateTaskPriority;

  @NonNull
  public final TextView mTvUpdateTask;

  private ActivityUpdateTaskBinding(@NonNull LinearLayout rootView, @NonNull Button mBtnDeleteTask,
      @NonNull Button mBtnUpdateTask, @NonNull EditText mEdtUpdateTaskDetails,
      @NonNull EditText mEdtUpdateTaskPriority, @NonNull TextView mTvUpdateTask) {
    this.rootView = rootView;
    this.mBtnDeleteTask = mBtnDeleteTask;
    this.mBtnUpdateTask = mBtnUpdateTask;
    this.mEdtUpdateTaskDetails = mEdtUpdateTaskDetails;
    this.mEdtUpdateTaskPriority = mEdtUpdateTaskPriority;
    this.mTvUpdateTask = mTvUpdateTask;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdateTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdateTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdateTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBtnDeleteTask;
      Button mBtnDeleteTask = ViewBindings.findChildViewById(rootView, id);
      if (mBtnDeleteTask == null) {
        break missingId;
      }

      id = R.id.mBtnUpdateTask;
      Button mBtnUpdateTask = ViewBindings.findChildViewById(rootView, id);
      if (mBtnUpdateTask == null) {
        break missingId;
      }

      id = R.id.mEdtUpdateTaskDetails;
      EditText mEdtUpdateTaskDetails = ViewBindings.findChildViewById(rootView, id);
      if (mEdtUpdateTaskDetails == null) {
        break missingId;
      }

      id = R.id.mEdtUpdateTaskPriority;
      EditText mEdtUpdateTaskPriority = ViewBindings.findChildViewById(rootView, id);
      if (mEdtUpdateTaskPriority == null) {
        break missingId;
      }

      id = R.id.mTvUpdateTask;
      TextView mTvUpdateTask = ViewBindings.findChildViewById(rootView, id);
      if (mTvUpdateTask == null) {
        break missingId;
      }

      return new ActivityUpdateTaskBinding((LinearLayout) rootView, mBtnDeleteTask, mBtnUpdateTask,
          mEdtUpdateTaskDetails, mEdtUpdateTaskPriority, mTvUpdateTask);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
