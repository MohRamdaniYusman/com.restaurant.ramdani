package com.example.comrestaurantramdani.utils;

import android.app.ProgressDialog;
import android.content.Context;

import com.example.comrestaurantramdani.auth.RegisterActivity;

public class DialogUtils {
    public static ProgressDialog progressDialog;
    public static void openDialog(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading . . . ");
        progressDialog.show();
    }
    public static void closeDialog() {
        progressDialog.dismiss();
    }

    public static void openDialog(RegisterActivity registerActivity) {
    }
}
