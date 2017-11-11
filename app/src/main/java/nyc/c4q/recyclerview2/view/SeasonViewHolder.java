package nyc.c4q.recyclerview2.view;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.recyclerview2.R;
import nyc.c4q.recyclerview2.model.Seasons;

/**
 * Created by c4q on 11/11/17.
 */

public class SeasonViewHolder extends RecyclerView.ViewHolder{

    private ImageView sznImageView;
    private TextView sznName;
    private TextView dates;

    public SeasonViewHolder(View itemView) {
        super(itemView);
        this.sznImageView = (ImageView) itemView.findViewById(R.id.season_sznimage_imageview);
        this.sznName = (TextView) itemView.findViewById(R.id.season_sznName_textview);
        this.dates = (TextView) itemView.findViewById(R.id.season_dates_textview);

    }

    public void onBind (Seasons seasons) {
        sznImageView.setImageResource(seasons.getSznImageView());
        sznName.setText(seasons.getSznName());
        dates.setText(seasons.getDates());
    }

}
