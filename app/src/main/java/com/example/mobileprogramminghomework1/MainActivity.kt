package com.example.mobileprogramminghomework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.lang.System.exit
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private var switch_status:Boolean = false
    private var TAG="TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        startSwitch.setOnClickListener{ //시작함 switch를 클릭시 처리하는 이벤트이며 switch의 값에 따라
                                        // radio button을 사용자에게 보여지거나 보여지지 않는다.
            //switch_status = !switch_status; //switch 의 클릭 상태를 의미
            if(startSwitch.isChecked)
                linearLaout.visibility = View.VISIBLE //radio 인터페이스를 보여준다
            else
                linearLaout.visibility = View.GONE//radio 인터페이스를 보여주지 않는다.
        }

        radioGroup.setOnCheckedChangeListener{
            radioGroup, i ->when(i){
            R.id.nuguRadioBtn -> imageView.setImageResource(R.drawable.ic_nugaimage) //누가 radio를 눌렀을 경우 이미지 설정
            R.id.oreoRadioBtn -> imageView.setImageResource(R.drawable.ic_oreoimage)//오레오 radio를 눌렀을 경우 이미지 설정
            R.id.pieRadioBtn -> imageView.setImageResource(R.drawable.ic_pieimage)//파이 radio를 눌렀을 경우 이미지 설정
        }
        }


        exitBtn.setOnClickListener{//종료 버튼을 클릭하였을 경우 해당 엑티비티가 종료된다.
            finish()
        }
        resetBtn.setOnClickListener{
            /*var intent = Intent(this,MainActivity::class.java) //MainActivity로 이동이 되면서 현재 엑티비티 종료
                                                            // 아래에 주석문 처리한 코드롤 진행하고자 하였지만 switch 상태값을 초기화
                                                            //할수가 없어 intent를 사용하였음.
            startActivity(intent)
            finish()*/

            startSwitch.setChecked(false)
            if(startSwitch.isChecked)
                linearLaout.visibility = View.VISIBLE
            else
                linearLaout.visibility = View.GONE


            imageView.setImageBitmap(null)

        }
    }
}