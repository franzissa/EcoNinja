package com.example.econinja.ui.reward;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.econinja.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class RewardFragment extends Fragment {

    private RewardViewModel rewardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rewardViewModel =
                ViewModelProviders.of(this).get(RewardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reward, container, false);
        final TextView textView = root.findViewById(R.id.text_reward);
        rewardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}