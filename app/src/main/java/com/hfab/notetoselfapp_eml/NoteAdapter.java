package com.hfab.notetoselfapp_eml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.MyViewHolder> {

    public NoteAdapter() {notes = NoteDatabase.getNotes();}

    private ArrayList<Note> notes;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_row_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Note n = notes.get(position);
        holder.setData(n, position);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imvDelete;
        TextView title;
        TextView status;
        TextView description;

        private int currentPositionInList = -1;
        Note currentDest = null;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imvDelete = itemView.findViewById(R.id.img_delete);
            title = itemView.findViewById(R.id.txt_title);
            status = itemView.findViewById(R.id.txt_status);
            description = itemView.findViewById(R.id.txt_text);

            imvDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    notes.remove(currentPositionInList);

                    notifyItemRemoved(currentPositionInList);
                    notifyItemRangeChanged(currentPositionInList, notes.size());

                }
            });
        }

        public void setData(Note n, int position)
        {
         title.setText(n.getTitle());
         status.setText(n.getStatus());
         description.setText(n.getDescription());

         currentPositionInList = position;
         currentDest = n;

        }

    }

}
