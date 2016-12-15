package tulv.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSongs;
    private SongAdapter mSongAdapter;
    private List<Song> mSongs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSongs = (RecyclerView)findViewById(R.id.rv_songs);

        //create song data
        mSongs = new ArrayList<>();
        mSongs.add(new Song("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu một tình yêu Là lúc anh tự thay", "Trịnh Đình Quang"));
        mSongs.add(new Song("60701", "NGỐC", "Có rất nhiều những câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        mSongs.add(new Song("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        mSongs.add(new Song("60610", "CHUỖI NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));

        mSongAdapter = new SongAdapter(this,  mSongs);
        rvSongs.setAdapter(mSongAdapter);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvSongs.setLayoutManager(linearLayoutManager);
    }
}