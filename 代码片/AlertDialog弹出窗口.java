@Override
public void onClick(View v) {
    switch (v.getId()){
        case R.id.btnSta:
            AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("this is a title");
			//标题栏
            dialog.setMessage("something inportant");
			//文字栏
            dialog.setCancelable(false);
            dialog.setPositiveButton("OK",new DatePickerDialog.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn.setTextSize(60);
                }
            });
            dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    btn.setTextSize(25);
                }
            });

            dialog.show();
            break;

        default:
            break;
    }
}

