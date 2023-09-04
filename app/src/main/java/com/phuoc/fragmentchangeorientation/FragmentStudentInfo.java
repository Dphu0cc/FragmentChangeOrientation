package com.phuoc.fragmentchangeorientation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentStudentInfo extends Fragment {
    TextView txtHoTen, txtNamSinh, txtDiaChi, txtEmail;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info, container, false);
        AnhXa();
        return view;
    }


    public void SetInfo(SinhVien sv) {
        txtHoTen.setText(sv.getHoTen());
        txtNamSinh.setText(String.valueOf(sv.getNamSinh()));
        txtDiaChi.setText(sv.getDiaChi());
        txtEmail.setText(sv.getEmail());
    }

    private void AnhXa() {
        txtHoTen = view.findViewById(R.id.textviewName);
        txtNamSinh = view.findViewById(R.id.textviewNamSinh);
        txtDiaChi = view.findViewById(R.id.textviewDiaChi);
        txtEmail = view.findViewById(R.id.textviewGmail);
    }
}
