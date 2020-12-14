package com.dwiyanstudio.retrofittutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_layout.view.*

class AdapterCharacter(private val listCharacter: List<Character>) : RecyclerView.Adapter<AdapterCharacter.CharacterViewHolder>() {
    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(character: Character){
            with(itemView){
                character_name.text = character.name
                birthday_character.text = character.birthday
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterCharacter.CharacterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false)
        return CharacterViewHolder(view)
    }

    override fun getItemCount(): Int = listCharacter.size

    override fun onBindViewHolder(holder: AdapterCharacter.CharacterViewHolder, position: Int){
        holder.bind(listCharacter[position])
    }
}