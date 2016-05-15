public class MainActivity extends AppCompatActivity {

    private Button button;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.btnTj);
        radioButton= (RadioButton) findViewById(R.id.radioButtond);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //如果radioButton是被选择的状态
                if(radioButton.isChecked()){
                    Toast.makeText(MainActivity.this,"恭喜你答对了",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"妈的不知道不要乱答题",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}