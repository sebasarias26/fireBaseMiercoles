// Generated by view binder compiler. Do not edit!
package co.com.myapp.cesde.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import co.com.myapp.cesde.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView appTittle;

  @NonNull
  public final Button btnInicio;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ConstraintLayout main;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull TextView appTittle,
      @NonNull Button btnInicio, @NonNull ImageView imageView2, @NonNull ConstraintLayout main) {
    this.rootView = rootView;
    this.appTittle = appTittle;
    this.btnInicio = btnInicio;
    this.imageView2 = imageView2;
    this.main = main;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_tittle;
      TextView appTittle = ViewBindings.findChildViewById(rootView, id);
      if (appTittle == null) {
        break missingId;
      }

      id = R.id.btn_inicio;
      Button btnInicio = ViewBindings.findChildViewById(rootView, id);
      if (btnInicio == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      return new ActivityMainBinding((ConstraintLayout) rootView, appTittle, btnInicio, imageView2,
          main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}