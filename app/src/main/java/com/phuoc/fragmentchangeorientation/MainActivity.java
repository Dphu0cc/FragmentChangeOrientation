package com.phuoc.fragmentchangeorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TruyenSinhVien{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(SinhVien sinhVien) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentInfo);

        Configuration configuration = getResources().getConfiguration();
        // fragmentStudentInfo.isInLayout()
        if (fragmentStudentInfo!=null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentStudentInfo.SetInfo(sinhVien);
        } else {
            Intent intent = new Intent(MainActivity.this, StudentInfomation.class);
            intent.putExtra("thongTinSinhVien", sinhVien);
            startActivity(intent);
        }

    }
}