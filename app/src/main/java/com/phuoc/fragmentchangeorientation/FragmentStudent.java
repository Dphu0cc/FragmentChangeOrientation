package com.phuoc.fragmentchangeorientation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class FragmentStudent extends ListFragment {
    TruyenSinhVien truyenSV;
    ArrayList<SinhVien> arraySinhVien;
    StudentAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        truyenSV = (TruyenSinhVien) getActivity();
        arraySinhVien = new ArrayList<>();
        AddArraySV();
        adapter = new StudentAdapter(getActivity(), R.layout.row_student, arraySinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list, container, false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSV.DataStudent(arraySinhVien.get(position));
    }

    private void AddArraySV() {
        arraySinhVien.add(new SinhVien("Nguyễn Văn A", 1999, "Hà Nội", "nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn S", 1999, "Hà Nội", "nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn D", 1999, "Hà Nội", "nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn F", 1999, "Hà Nội", "nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn G", 1999, "Hà Nội", "nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn H", 1999, "Hà Nội", "nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn J", 1999, "Hà Nội", "nva@gmail.com"));
    }
}
