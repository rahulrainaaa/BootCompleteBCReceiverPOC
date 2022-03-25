package com.example.bootcompletebcreceiverpoc

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        context?.toast("BootReceiver::onReceive() --- called")
        log("BootReceiver::onReceive() --- called")

        context?.run {
            val count = getPref().getInt("count", 0) + 1
            getPref().edit().putInt("count", count).commit()
            log("count --------------------------------------- $count")
        }
    }
}

fun Context.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
fun log(msg: String) = Log.d("aaaaaaaaa", msg)
fun Context.getPref() = getSharedPreferences("pref", Context.MODE_PRIVATE)