package com.example.employee.utils

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import com.example.employee.R


    fun simplePositiveDialogBox(
        mContext: Context,
        title: String,
        message: String?,
        positiveText: String
    ) {
        message?.let {
            val builder: AlertDialog.Builder =
                AlertDialog.Builder(mContext)
            builder.setTitle(title)
            builder.setMessage(message)
            builder.setPositiveButton(positiveText) { dialogInterface, _ ->
                dialogInterface.dismiss()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
            val positiveButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
            positiveButton?.setTextColor(Color.parseColor("#EE3332"))
        }
    }

