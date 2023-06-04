package com.example.slavicgods;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GodAdapter extends RecyclerView.Adapter<GodAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<God> gods;


    public GodAdapter(Context context, List<God> gods) {
        this.inflater = LayoutInflater.from(context);
        this.gods = gods;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту God
    @Override
    public GodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту God по определенной позиции
    @Override
    public void onBindViewHolder(GodAdapter.ViewHolder holder, int position) {
        God god = gods.get(position);
        holder.godView.setImageResource(god.getGodResource());
        holder.nameView.setText(god.getName());
        holder.godDescriptionView.setText(god.getGodDescription());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return gods.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView godView;
        final TextView nameView, godDescriptionView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            godView = view.findViewById(R.id.godResource);
            nameView = view.findViewById(R.id.name);
            godDescriptionView = view.findViewById(R.id.godDescription);
        }
    }
}
