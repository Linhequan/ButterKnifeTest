package com.example.butterknifetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnLongClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_show)
    TextView tv_show;

    /**
     * 单个控件点击事件
     */
//    @OnClick(R.id.btn_1)
//    public void click(){
//        tv_show.setText("绑定单个view事件");
//    }

    /**
     * 多个控件同一点击事件
     */
//    @OnClick({R.id.btn_1, R.id.btn_2})
//    public void click(){
//        tv_show.setText("都执行此事件");
//    }

    /**
     * 多个控件点击事件
     * @param v
     */
//    @OnClick({R.id.btn_1, R.id.btn_2})
//        public void click(View v){
//        switch (v.getId()){
//            case R.id.btn_1:
//                tv_show.setText("我是btn1");
//                break;
//            case R.id.btn_2:
//                tv_show.setText("我是btn2");
//                break;
//        }
//    }

    /**
     * 绑定控件长按事件
     * @return
     */
//    @OnLongClick(R.id.btn_1)
//    public boolean OnLongClick(){
//      tv_show.setText("is a long click");
//      return true;
//    }

//    /**
//     * //选中，选中取消
//     * @param checked
//     */
//    @OnCheckedChanged(R.id.checkbox)
//    public void onChecked(boolean checked){
//        Toast.makeText(this, checked ? "Checked!" : "Unchecked!", Toast.LENGTH_SHORT).show();
//        return true;
//    }

//    /**
//     * 软键盘的功能按键
//     * @param key
//     * @return
//     */
//    @OnEditorAction(R.id.edit)
//    public boolean onEditorAction(KeyEvent key){
//        Toast.makeText(this, "Pressed: " + key, Toast.LENGTH_SHORT).show();
//        return true;
//    }

//    /**
//     * 其他事件绑定
//     * @param text
//     */
//    @OnTextChanged(R.id.edit)
//    public void onTextChanged(CharSequence text) {
//        Toast.makeText(this, "Text changed: " + text, Toast.LENGTH_SHORT).show();
//    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
