package nyc.c4q.recyclerview2.model;

/**
 * Created by c4q on 11/11/17.
 */

public class Seasons {
    private int sznImageView;
    private String sznName;
    private String dates;

    public Seasons(int sznImageView, String sznName, String dates) {
        this.sznImageView = sznImageView;
        this.sznName = sznName;
        this.dates = dates;

    }

    public int getSznImageView() {
        return sznImageView;
    }

    public String getSznName() {
        return sznName;
    }

    public String getDates() {
        return dates;
    }
}
