package com.example.reddead2cardview.RedDeadAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.reddead2cardview.R
import com.example.reddead2cardview.RedDeadModel.RedDeadAtributos
import kotlinx.android.synthetic.main.reddead_character_list.view.*
import java.util.zip.Inflater

class RedDeadAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {


      private var itens:List<RedDeadAtributos> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.reddead_character_list,parent,false))

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){

            is MyViewHolder->{

                holder.bind(itens.get(position))

            }
        }

    }

    override fun getItemCount(): Int {
        return itens.size
    }


    fun submitList(lista:List<RedDeadAtributos>){

        itens=lista

    }


    class MyViewHolder constructor(

        view:View

    ):RecyclerView.ViewHolder(view){

        val itemNome = view.textNome
        val itemImagem = view.imageView
        val itemFrase = view.textfrase

        fun bind(atributos:RedDeadAtributos){

            itemNome.setText(atributos.nome)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)


            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(atributos.imagem)
                .into(itemImagem)
            

            itemFrase.setText(atributos.frase)

        }


    }



}