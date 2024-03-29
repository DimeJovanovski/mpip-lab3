// Generated by view binder compiler. Do not edit!
package com.example.moviesdbapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.moviesdbapi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemMovieBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView movieImage;

  @NonNull
  public final TextView movieTitle;

  @NonNull
  public final TextView movieYear;

  private ListItemMovieBinding(@NonNull LinearLayout rootView, @NonNull ImageView movieImage,
      @NonNull TextView movieTitle, @NonNull TextView movieYear) {
    this.rootView = rootView;
    this.movieImage = movieImage;
    this.movieTitle = movieTitle;
    this.movieYear = movieYear;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_movie, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemMovieBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.movie_image;
      ImageView movieImage = ViewBindings.findChildViewById(rootView, id);
      if (movieImage == null) {
        break missingId;
      }

      id = R.id.movie_title;
      TextView movieTitle = ViewBindings.findChildViewById(rootView, id);
      if (movieTitle == null) {
        break missingId;
      }

      id = R.id.movie_year;
      TextView movieYear = ViewBindings.findChildViewById(rootView, id);
      if (movieYear == null) {
        break missingId;
      }

      return new ListItemMovieBinding((LinearLayout) rootView, movieImage, movieTitle, movieYear);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
