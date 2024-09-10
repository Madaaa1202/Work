package PaginaListaMedici;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicalfriend.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Medici> list;

    public MyAdapter(Context context, ArrayList<Medici> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Medici medici =list.get(position);
        holder.nume.setText(medici.getNume());
        holder.prenume.setText(medici.getPrenume());
        holder.specializare.setText(medici.getSpecializare());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        TextView nume,prenume,specializare;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                nume=itemView.findViewById(R.id.numeMedic);
                prenume=itemView.findViewById(R.id.prenumeMedic);
                specializare=itemView.findViewById(R.id.specializareMedic);
            }
        }


}
