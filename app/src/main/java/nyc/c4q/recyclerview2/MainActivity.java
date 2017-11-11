package nyc.c4q.recyclerview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.recyclerview2.controller.SeasonAdapter;
import nyc.c4q.recyclerview2.model.Seasons;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView seasonRecyclerView = (RecyclerView) findViewById(R.id.season_recyclerview);

        List<Seasons> seasons = new ArrayList<>();
        seasons.add(new Seasons(R.drawable.spring, "Spring", "March 20"));
        seasons.add(new Seasons(R.drawable.summer, "Summer", "June 21"));
        seasons.add(new Seasons(R.drawable.fall, "Fall", "September 22"));
        seasons.add(new Seasons(R.drawable.winter, "Winter", "December 21"));

        SeasonAdapter seasonAdapter = new SeasonAdapter(seasons);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);
        seasonRecyclerView.setAdapter(seasonAdapter);
        seasonRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
