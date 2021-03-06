package com.putrash.kumparantask.base

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    abstract fun onBind(context: Context, item: T, onClickListener: (T) -> Unit)
}