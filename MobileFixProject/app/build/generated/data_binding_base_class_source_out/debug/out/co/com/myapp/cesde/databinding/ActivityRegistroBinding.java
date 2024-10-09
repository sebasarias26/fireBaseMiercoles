// Generated by view binder compiler. Do not edit!
package co.com.myapp.cesde.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityRegistroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegistrar;

  @NonNull
  public final Button btnVolverReg;

  @NonNull
  public final EditText inputUserEmail;

  @NonNull
  public final EditText inputUserId;

  @NonNull
  public final EditText inputUserLastname;

  @NonNull
  public final EditText inputUserName;

  @NonNull
  public final EditText inputUserPassword;

  @NonNull
  public final EditText inputUserPhone;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView tagRegistro;

  private ActivityRegistroBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnRegistrar,
      @NonNull Button btnVolverReg, @NonNull EditText inputUserEmail, @NonNull EditText inputUserId,
      @NonNull EditText inputUserLastname, @NonNull EditText inputUserName,
      @NonNull EditText inputUserPassword, @NonNull EditText inputUserPhone,
      @NonNull ConstraintLayout main, @NonNull TextView tagRegistro) {
    this.rootView = rootView;
    this.btnRegistrar = btnRegistrar;
    this.btnVolverReg = btnVolverReg;
    this.inputUserEmail = inputUserEmail;
    this.inputUserId = inputUserId;
    this.inputUserLastname = inputUserLastname;
    this.inputUserName = inputUserName;
    this.inputUserPassword = inputUserPassword;
    this.inputUserPhone = inputUserPhone;
    this.main = main;
    this.tagRegistro = tagRegistro;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_registrar;
      Button btnRegistrar = ViewBindings.findChildViewById(rootView, id);
      if (btnRegistrar == null) {
        break missingId;
      }

      id = R.id.btn_volver_reg;
      Button btnVolverReg = ViewBindings.findChildViewById(rootView, id);
      if (btnVolverReg == null) {
        break missingId;
      }

      id = R.id.input_user_email;
      EditText inputUserEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputUserEmail == null) {
        break missingId;
      }

      id = R.id.input_user_id;
      EditText inputUserId = ViewBindings.findChildViewById(rootView, id);
      if (inputUserId == null) {
        break missingId;
      }

      id = R.id.input_user_lastname;
      EditText inputUserLastname = ViewBindings.findChildViewById(rootView, id);
      if (inputUserLastname == null) {
        break missingId;
      }

      id = R.id.input_user_name;
      EditText inputUserName = ViewBindings.findChildViewById(rootView, id);
      if (inputUserName == null) {
        break missingId;
      }

      id = R.id.input_user_password;
      EditText inputUserPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputUserPassword == null) {
        break missingId;
      }

      id = R.id.input_user_phone;
      EditText inputUserPhone = ViewBindings.findChildViewById(rootView, id);
      if (inputUserPhone == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.tag_registro;
      TextView tagRegistro = ViewBindings.findChildViewById(rootView, id);
      if (tagRegistro == null) {
        break missingId;
      }

      return new ActivityRegistroBinding((ConstraintLayout) rootView, btnRegistrar, btnVolverReg,
          inputUserEmail, inputUserId, inputUserLastname, inputUserName, inputUserPassword,
          inputUserPhone, main, tagRegistro);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}