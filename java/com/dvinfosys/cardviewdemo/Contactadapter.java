package com.dvinfosys.cardviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
   ArrayList<Contact> contact=new ArrayList<Contact>();
    Context ctx;
    public ContactAdapter(ArrayList<Contact> contacts, Context ctx)
    {
        this.contact=contacts;
        this.ctx=ctx;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        ContactViewHolder contactViewHolder=new ContactViewHolder(view,ctx,contact);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        Contact CON=contact.get(position);
        holder.imageView.setImageResource(CON.getImg());
        holder.name.setText(CON.getName());
        holder.desc.setText(CON.getDesc());
    }

    @Override
    public int getItemCount() {
        return contact.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView imageView;
        TextView name,desc;
        ArrayList<Contact> contacts=new ArrayList<Contact>();
        Context ctx;
        public ContactViewHolder(View view,Context ctx,ArrayList<Contact>contacts)
        {
            super(view);
            this.contacts=contacts;
            this.ctx=ctx;
            view.setOnClickListener(this);
            imageView=view.findViewById(R.id.image);
            name=view.findViewById(R.id.name);
            desc=view.findViewById(R.id.desc);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            Contact contact=this.contacts.get(position);
            Intent intent=new Intent(this.ctx,View_details.class);
            intent.putExtra("image_id",contact.getImg());
            intent.putExtra("name",contact.getName());
            intent.putExtra("desc",contact.getDesc());
            this.ctx.startActivity(intent);
           // Toast.makeText(ctx, position, Toast.LENGTH_SHORT).show();
        }
    }
}
