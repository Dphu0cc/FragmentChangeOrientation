package com.phuoc.fragmentchangeorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StudentInfomation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("thongTinSinhVien");
        FragmentStudentInfo studentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentChiTiet);
        studentInfo.SetInfo(sinhVien);
    }
}