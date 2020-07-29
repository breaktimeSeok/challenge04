package com.example.challenge04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        editText.addTextChangedListener(new TextWatcher() {
            // TextWatcher 인터페이스는 아래 3개의 메서드를 필수로 한다.

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // 입력하기 전에 동작


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                /*
                editText에 변화가 있는경우 동작
                start는 editText 범위에 벗어났을 당시의 마지막 위치를 담고있다.
                빈 editText일때는 0이지만
                "브레이크타임" 6글자를 입력하고 editText를 벗어나고 다시 오면 6이다.


                 */
                textView.setText((i + i1 + 1 ) + " / "+ 80 + " 바이트");

            }

            @Override
            public void afterTextChanged(Editable editable) {

                //입력이 끝났을 떄 호출

            }
        });


    }

    public void onBtn1Clicked(View v){

        sendToast();

    }

    private void sendToast(){
        Toast.makeText(this, editText.getText(), Toast.LENGTH_LONG).show();
    }
}