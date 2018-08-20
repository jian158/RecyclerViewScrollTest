package wei.com.scrolltest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
  private List<String> mStringList = new ArrayList<>();
  public DataAdapter(){
    for (int i = 0; i < 10; i++) {
      mStringList.add("Item "+i);
    }
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false));
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Log.i("TAG","onBindViewHolder"+position);
    holder.mTitle.setText(mStringList.get(position));
  }

  @Override
  public int getItemCount() {
    return mStringList.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder{
    TextView mTitle;
    ViewHolder(View itemView) {
      super(itemView);
      mTitle = itemView.findViewById(R.id.content);
    }
  }
}
