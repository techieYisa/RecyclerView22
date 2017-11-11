package nyc.c4q.recyclerview2.controller;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.recyclerview2.R;
import nyc.c4q.recyclerview2.model.Seasons;
import nyc.c4q.recyclerview2.view.SeasonViewHolder;

/**
 * Created by c4q on 11/11/17.
 */

public class SeasonAdapter extends RecyclerView.Adapter<SeasonViewHolder>{
    private List<Seasons> seasonsList;

    public SeasonAdapter(List<Seasons> seasonsList) {
        this.seasonsList = seasonsList;
    }

    @Override
    public SeasonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.season_itemview, parent, false);
        return new SeasonViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(SeasonViewHolder holder, int position) {
        Seasons seasons = seasonsList.get(position);

        holder.onBind(seasons);
    }

    @Override
    public int getItemCount() {
        return seasonsList.size();
    }
}
