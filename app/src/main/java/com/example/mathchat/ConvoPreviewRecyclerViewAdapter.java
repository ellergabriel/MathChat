package com.example.mathchat;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mathchat.placeholder.Conversation;
import com.example.mathchat.databinding.FragmentItemPreviewBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Conversation}.
 * TODO: Replace the implementation with code for your data type.
 */
public class ConvoPreviewRecyclerViewAdapter extends RecyclerView.Adapter<ConvoPreviewRecyclerViewAdapter.ViewHolder> {

    private final List<Conversation> mValues;

    public ConvoPreviewRecyclerViewAdapter(List<Conversation.ConversationItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemPreviewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).content);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final TextView mContentView;
        public Conversation mItem;

        public ViewHolder(FragmentItemPreviewBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}